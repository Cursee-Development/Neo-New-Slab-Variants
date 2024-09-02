package com.cursee.new_slab_variants.core.common.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.ParticleUtils;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.*;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.common.IForgeShearable;

import javax.annotation.Nullable;
import java.util.OptionalInt;

public class LeavesSlabBlock extends LeavesBlock implements SimpleWaterloggedBlock, IForgeShearable {

    public static final EnumProperty<SlabType> TYPE = BlockStateProperties.SLAB_TYPE;
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    protected static final VoxelShape BOTTOM_AABB = Block.box(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
    protected static final VoxelShape TOP_AABB = Block.box(0.0, 8.0, 0.0, 16.0, 16.0, 16.0);

    public static final int DECAY_DISTANCE = 7;
    public static final IntegerProperty DISTANCE = BlockStateProperties.DISTANCE;
    public static final BooleanProperty PERSISTENT = BlockStateProperties.PERSISTENT;
    private static final int TICK_DELAY = 1;

    public LeavesSlabBlock(BlockBehaviour.Properties $$0) {
        super($$0);
        this.registerDefaultState((BlockState)((BlockState)this.defaultBlockState().setValue(DISTANCE, Integer.valueOf(7)).setValue(PERSISTENT, Boolean.valueOf(false)).setValue(TYPE, SlabType.BOTTOM)).setValue(WATERLOGGED, false));
    }

    public boolean useShapeForLightOcclusion(BlockState $$0) {
        return $$0.getValue(TYPE) != SlabType.DOUBLE;
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> $$0) {
        $$0.add(new Property[]{DISTANCE, PERSISTENT, TYPE, WATERLOGGED});
    }

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

    @Nullable
    public BlockState getStateForPlacement(BlockPlaceContext $$0) {
        BlockPos $$1 = $$0.getClickedPos();
        BlockState $$2 = $$0.getLevel().getBlockState($$1);
        if ($$2.is(this)) {
            return (BlockState)((BlockState)$$2.setValue(TYPE, SlabType.DOUBLE)).setValue(WATERLOGGED, false);
        } else {
            FluidState $$3 = $$0.getLevel().getFluidState($$1);
            BlockState $$4 = (BlockState)((BlockState)this.defaultBlockState().setValue(PERSISTENT, Boolean.valueOf(true)).setValue(TYPE, SlabType.BOTTOM)).setValue(WATERLOGGED, $$3.getType() == Fluids.WATER);
            Direction $$5 = $$0.getClickedFace();
            return $$5 != Direction.DOWN && ($$5 == Direction.UP || !($$0.getClickLocation().y - (double)$$1.getY() > 0.5)) ? updateDistance($$4, $$0.getLevel(), $$0.getClickedPos()) : updateDistance((BlockState)$$4.setValue(TYPE, SlabType.TOP), $$0.getLevel(), $$0.getClickedPos());
        }
    }

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

    public FluidState getFluidState(BlockState $$0) {
        return (Boolean)$$0.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState($$0);
    }

    public boolean placeLiquid(LevelAccessor $$0, BlockPos $$1, BlockState $$2, FluidState $$3) {
        return $$2.getValue(TYPE) != SlabType.DOUBLE ? super.placeLiquid($$0, $$1, $$2, $$3) : false;
    }

    public boolean canPlaceLiquid(BlockGetter $$0, BlockPos $$1, BlockState $$2, Fluid $$3) {
        return $$2.getValue(TYPE) != SlabType.DOUBLE ? super.canPlaceLiquid($$0, $$1, $$2, $$3) : false;
    }

    public BlockState updateShape(BlockState p_54440_, Direction p_54441_, BlockState p_54442_, LevelAccessor p_54443_, BlockPos p_54444_, BlockPos p_54445_) {
        if (p_54440_.getValue(WATERLOGGED)) {
            p_54443_.scheduleTick(p_54444_, Fluids.WATER, Fluids.WATER.getTickDelay(p_54443_));
        }

        int i = getDistanceAt(p_54442_) + 1;
        if (i != 1 || p_54440_.getValue(DISTANCE) != i) {
            p_54443_.scheduleTick(p_54444_, this, 1);
        }

        return p_54440_;
    }

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

    public VoxelShape getBlockSupportShape(BlockState p_54456_, BlockGetter p_54457_, BlockPos p_54458_) {
        return Shapes.empty();
    }

    public boolean isRandomlyTicking(BlockState p_54449_) {
        return p_54449_.getValue(DISTANCE) == 7 && !p_54449_.getValue(PERSISTENT);
    }

    public void randomTick(BlockState p_221379_, ServerLevel p_221380_, BlockPos p_221381_, RandomSource p_221382_) {
        if (this.decaying(p_221379_)) {
            dropResources(p_221379_, p_221380_, p_221381_);
            p_221380_.removeBlock(p_221381_, false);
        }

    }

    protected boolean decaying(BlockState p_221386_) {
        return !p_221386_.getValue(PERSISTENT) && p_221386_.getValue(DISTANCE) == 7;
    }

    public void tick(BlockState p_221369_, ServerLevel p_221370_, BlockPos p_221371_, RandomSource p_221372_) {
        p_221370_.setBlock(p_221371_, updateDistance(p_221369_, p_221370_, p_221371_), 3);
    }

    public int getLightBlock(BlockState p_54460_, BlockGetter p_54461_, BlockPos p_54462_) {
        return 1;
    }

    private static BlockState updateDistance(BlockState p_54436_, LevelAccessor p_54437_, BlockPos p_54438_) {
        int i = 7;
        BlockPos.MutableBlockPos blockpos$mutableblockpos = new BlockPos.MutableBlockPos();

        for(Direction direction : Direction.values()) {
            blockpos$mutableblockpos.setWithOffset(p_54438_, direction);
            i = Math.min(i, getDistanceAt(p_54437_.getBlockState(blockpos$mutableblockpos)) + 1);
            if (i == 1) {
                break;
            }
        }

        return p_54436_.setValue(DISTANCE, Integer.valueOf(i));
    }

    private static int getDistanceAt(BlockState p_54464_) {
        return getOptionalDistanceAt(p_54464_).orElse(7);
    }

    public static OptionalInt getOptionalDistanceAt(BlockState p_277868_) {
        if (p_277868_.is(BlockTags.LOGS)) {
            return OptionalInt.of(0);
        } else {
            return p_277868_.hasProperty(DISTANCE) ? OptionalInt.of(p_277868_.getValue(DISTANCE)) : OptionalInt.empty();
        }
    }

    public void animateTick(BlockState p_221374_, Level p_221375_, BlockPos p_221376_, RandomSource p_221377_) {
        if (p_221375_.isRainingAt(p_221376_.above())) {
            if (p_221377_.nextInt(15) == 1) {
                BlockPos blockpos = p_221376_.below();
                BlockState blockstate = p_221375_.getBlockState(blockpos);
                if (!blockstate.canOcclude() || !blockstate.isFaceSturdy(p_221375_, blockpos, Direction.UP)) {
                    ParticleUtils.spawnParticleBelow(p_221375_, p_221376_, p_221377_, ParticleTypes.DRIPPING_WATER);
                }
            }
        }
    }
}
