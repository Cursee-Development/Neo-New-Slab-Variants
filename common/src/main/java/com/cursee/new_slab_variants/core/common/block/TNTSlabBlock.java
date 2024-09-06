package com.cursee.new_slab_variants.core.common.block;

import com.cursee.new_slab_variants.core.common.entity.PrimedTNTSlab;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.*;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import javax.annotation.Nullable;

public class TNTSlabBlock extends Block implements SimpleWaterloggedBlock {

    public static final BooleanProperty UNSTABLE = BlockStateProperties.UNSTABLE;

    public static final EnumProperty<SlabType> TYPE = BlockStateProperties.SLAB_TYPE;
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    protected static final VoxelShape BOTTOM_AABB = Block.box(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
    protected static final VoxelShape TOP_AABB = Block.box(0.0, 8.0, 0.0, 16.0, 16.0, 16.0);

    public TNTSlabBlock(Properties $$0) {
        super($$0);
        this.registerDefaultState(this.defaultBlockState().setValue(UNSTABLE, false).setValue(TYPE, SlabType.BOTTOM).setValue(WATERLOGGED, false));
    }

    @Override
    public boolean useShapeForLightOcclusion(BlockState $$0) {
        return $$0.getValue(TYPE) != SlabType.DOUBLE;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> $$0) {
        $$0.add(new Property[]{UNSTABLE, TYPE, WATERLOGGED});
    }

    @Override
    public VoxelShape getShape(BlockState $$0, BlockGetter $$1, BlockPos $$2, CollisionContext $$3) {
        SlabType $$4 = (SlabType)$$0.getValue(TYPE);
        switch ($$4) {
            case DOUBLE -> {
                return Shapes.block();
            }
            case TOP -> {
                return TOP_AABB;
            }
            default -> {
                return BOTTOM_AABB;
            }
        }
    }

    @Override
    public @Nullable BlockState getStateForPlacement(BlockPlaceContext $$0) {
        BlockPos $$1 = $$0.getClickedPos();
        BlockState $$2 = $$0.getLevel().getBlockState($$1);
        if ($$2.is(this)) {
            return (BlockState)((BlockState)$$2.setValue(TYPE, SlabType.DOUBLE)).setValue(WATERLOGGED, false);
        } else {
            FluidState $$3 = $$0.getLevel().getFluidState($$1);
            BlockState $$4 = (BlockState)((BlockState)this.defaultBlockState().setValue(TYPE, SlabType.BOTTOM)).setValue(WATERLOGGED, $$3.getType() == Fluids.WATER);
            Direction $$5 = $$0.getClickedFace();
            return $$5 != Direction.DOWN && ($$5 == Direction.UP || !($$0.getClickLocation().y - (double)$$1.getY() > 0.5)) ? $$4 : (BlockState)$$4.setValue(TYPE, SlabType.TOP);
        }
    }

    @Override
    public boolean canBeReplaced(BlockState $$0, BlockPlaceContext $$1) {
        ItemStack $$2 = $$1.getItemInHand();
        SlabType $$3 = (SlabType)$$0.getValue(TYPE);
        if ($$3 != SlabType.DOUBLE && $$2.is(this.asItem())) {
            if ($$1.replacingClickedOnBlock()) {
                boolean $$4 = $$1.getClickLocation().y - (double)$$1.getClickedPos().getY() > 0.5;
                Direction $$5 = $$1.getClickedFace();
                if ($$3 == SlabType.BOTTOM) {
                    return $$5 == Direction.UP || $$4 && $$5.getAxis().isHorizontal();
                } else {
                    return $$5 == Direction.DOWN || !$$4 && $$5.getAxis().isHorizontal();
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    @Override
    public FluidState getFluidState(BlockState $$0) {
        return (Boolean)$$0.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState($$0);
    }

    @Override
    public boolean placeLiquid(LevelAccessor $$0, BlockPos $$1, BlockState $$2, FluidState $$3) {
        return $$2.getValue(TYPE) != SlabType.DOUBLE ? SimpleWaterloggedBlock.super.placeLiquid($$0, $$1, $$2, $$3) : false;
    }

    @Override
    public boolean canPlaceLiquid(BlockGetter $$0, BlockPos $$1, BlockState $$2, Fluid $$3) {
        return $$2.getValue(TYPE) != SlabType.DOUBLE ? SimpleWaterloggedBlock.super.canPlaceLiquid($$0, $$1, $$2, $$3) : false;
    }

    @Override
    public BlockState updateShape(BlockState $$0, Direction $$1, BlockState $$2, LevelAccessor $$3, BlockPos $$4, BlockPos $$5) {
        if ((Boolean)$$0.getValue(WATERLOGGED)) {
            $$3.scheduleTick($$4, Fluids.WATER, Fluids.WATER.getTickDelay($$3));
        }

        return super.updateShape($$0, $$1, $$2, $$3, $$4, $$5);
    }

    @Override
    public boolean isPathfindable(BlockState $$0, BlockGetter $$1, BlockPos $$2, PathComputationType $$3) {
        switch ($$3) {
            case LAND -> {
                return false;
            }
            case WATER -> {
                return $$1.getFluidState($$2).is(FluidTags.WATER);
            }
            case AIR -> {
                return false;
            }
            default -> {
                return false;
            }
        }
    }

    /* Tnt related methods */

    @Override
    public void onPlace(BlockState $$0, Level $$1, BlockPos $$2, BlockState $$3, boolean $$4) {
        if (!$$3.is($$0.getBlock())) {
            if ($$1.hasNeighborSignal($$2)) {
                explode($$1, $$2);
                $$1.removeBlock($$2, false);
            }

        }
    }

    @Override
    public void neighborChanged(BlockState $$0, Level $$1, BlockPos $$2, Block $$3, BlockPos $$4, boolean $$5) {
        if ($$1.hasNeighborSignal($$2)) {
            explode($$1, $$2);
            $$1.removeBlock($$2, false);
        }

    }

    @Override
    public void playerWillDestroy(Level $$0, BlockPos $$1, BlockState $$2, Player $$3) {
        if (!$$0.isClientSide() && !$$3.isCreative() && (Boolean)$$2.getValue(UNSTABLE)) {
            explode($$0, $$1);
        }

        super.playerWillDestroy($$0, $$1, $$2, $$3);
    }

    /** Used in TNTSlabBlock.playerWillDestroy(Level, BlockPos, BlockState, Player) */
    public static void explode(Level $$0, BlockPos $$1) {
        explode($$0, $$1, (LivingEntity)null);
    }

    /** Used in TNTSlabBlock.explode(Level, BlockPos) */
    private static void explode(Level $$0, BlockPos $$1, @Nullable LivingEntity $$2) {
        if (!$$0.isClientSide) {
            PrimedTNTSlab $$3 = new PrimedTNTSlab($$0, (double)$$1.getX() + 0.5, (double)$$1.getY(), (double)$$1.getZ() + 0.5, $$2, $$0.getBlockState($$1).getValue(BlockStateProperties.SLAB_TYPE));
            $$0.addFreshEntity($$3);
            $$0.playSound((Player)null, $$3.getX(), $$3.getY(), $$3.getZ(), SoundEvents.TNT_PRIMED, SoundSource.BLOCKS, 1.0F, 1.0F);
            $$0.gameEvent($$2, GameEvent.PRIME_FUSE, $$1);
        }
    }

    @Override
    public void wasExploded(Level $$0, BlockPos $$1, Explosion $$2) {
        if (!$$0.isClientSide) {

            if ($$0.getBlockState($$1).getBlock() instanceof TNTSlabBlock) {
                PrimedTNTSlab $$3 = new PrimedTNTSlab($$0, (double)$$1.getX(), (double)$$1.getY(), (double)$$1.getZ(), $$2.getIndirectSourceEntity(), $$0.getBlockState($$1).getValue(BlockStateProperties.SLAB_TYPE));
                int $$4 = $$3.getFuse();
                $$3.setFuse((short)($$0.random.nextInt($$4 / 4) + $$4 / 8));
                $$0.addFreshEntity($$3);

                return;
            }

            PrimedTNTSlab $$3 = new PrimedTNTSlab($$0, (double)$$1.getX(), (double)$$1.getY(), (double)$$1.getZ(), $$2.getIndirectSourceEntity(), SlabType.BOTTOM);
            int $$4 = $$3.getFuse();
            $$3.setFuse((short)($$0.random.nextInt($$4 / 4) + $$4 / 8));
            $$0.addFreshEntity($$3);
        }
    }

    @Override
    public InteractionResult use(BlockState $$0, Level $$1, BlockPos $$2, Player $$3, InteractionHand $$4, BlockHitResult $$5) {
        ItemStack $$6 = $$3.getItemInHand($$4);
        if (!$$6.is(Items.FLINT_AND_STEEL) && !$$6.is(Items.FIRE_CHARGE)) {
            return super.use($$0, $$1, $$2, $$3, $$4, $$5);
        } else {
            explode($$1, $$2, $$3);
            $$1.setBlock($$2, Blocks.AIR.defaultBlockState(), 11);
            Item $$7 = $$6.getItem();
            if (!$$3.isCreative()) {
                if ($$6.is(Items.FLINT_AND_STEEL)) {
                    $$6.hurtAndBreak(1, $$3, ($$1x) -> {
                        $$1x.broadcastBreakEvent($$4);
                    });
                } else {
                    $$6.shrink(1);
                }
            }

            $$3.awardStat(Stats.ITEM_USED.get($$7));
            return InteractionResult.sidedSuccess($$1.isClientSide);
        }
    }

    @Override
    public void onProjectileHit(Level $$0, BlockState $$1, BlockHitResult $$2, Projectile $$3) {
        if (!$$0.isClientSide) {
            BlockPos $$4 = $$2.getBlockPos();
            Entity $$5 = $$3.getOwner();
            if ($$3.isOnFire() && $$3.mayInteract($$0, $$4)) {
                explode($$0, $$4, $$5 instanceof LivingEntity ? (LivingEntity)$$5 : null);
                $$0.removeBlock($$4, false);
            }
        }

    }

    @Override
    public boolean dropFromExplosion(Explosion $$0) {
        return false;
    }

//    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> $$0) {
//        $$0.add(new Property[]{UNSTABLE});
//    }
}
