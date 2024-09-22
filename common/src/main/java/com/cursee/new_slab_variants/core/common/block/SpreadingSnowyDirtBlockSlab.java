package com.cursee.new_slab_variants.core.common.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraft.world.level.lighting.LightEngine;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import org.jetbrains.annotations.Nullable;

public class SpreadingSnowyDirtBlockSlab extends SlabBlock implements SimpleWaterloggedBlock {

    public static final BooleanProperty SNOWY = BlockStateProperties.SNOWY;

    public SpreadingSnowyDirtBlockSlab(Properties $$0) {
        super($$0);
        this.registerDefaultState(defaultBlockState().setValue(SNOWY, false));
    }

    // INSTANCE FUNCTIONS

    @Override
    public BlockState updateShape(BlockState $$0, Direction $$1, BlockState $$2, LevelAccessor $$3, BlockPos $$4, BlockPos $$5) {
        return $$1 == Direction.UP ? (BlockState)$$0.setValue(SNOWY, isSnowySetting($$2)) : super.updateShape($$0, $$1, $$2, $$3, $$4, $$5);
    }


//    @Override
//    public BlockState getStateForPlacement(BlockPlaceContext $$0) {
//        BlockState $$1 = $$0.getLevel().getBlockState($$0.getClickedPos().above());
//        return (BlockState)this.defaultBlockState().setValue(SNOWY, isSnowySetting($$1));
//    }

    @Nullable
    public BlockState getStateForPlacement(BlockPlaceContext $$0) {
        BlockPos $$1 = $$0.getClickedPos();
        BlockState $$2 = $$0.getLevel().getBlockState($$1);
        if ($$2.is(this)) {
            return (BlockState)((BlockState)$$2.setValue(TYPE, SlabType.DOUBLE)).setValue(WATERLOGGED, false);
        } else {
            FluidState $$3 = $$0.getLevel().getFluidState($$1);
            BlockState $$4 = (BlockState)((BlockState)this.defaultBlockState().setValue(TYPE, SlabType.BOTTOM)).setValue(WATERLOGGED, $$3.getType() == Fluids.WATER);
            Direction $$5 = $$0.getClickedFace();

            final BlockState above = $$0.getLevel().getBlockState($$0.getClickedPos().above());

            return $$5 != Direction.DOWN && ($$5 == Direction.UP || !($$0.getClickLocation().y - (double)$$1.getY() > 0.5)) ? $$4.setValue(SNOWY, isSnowySetting(above)) : $$4.setValue(TYPE, SlabType.TOP).setValue(SNOWY, isSnowySetting(above));
        }
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> $$0) {
        super.createBlockStateDefinition($$0);
        $$0.add(new Property[]{SNOWY});
    }

    @Override
    public void randomTick(BlockState $$0, ServerLevel $$1, BlockPos $$2, RandomSource $$3) {
        if (!canBeGrass($$0, $$1, $$2)) {
            $$1.setBlockAndUpdate($$2, Blocks.DIRT.defaultBlockState());
        } else {
            if ($$1.getMaxLocalRawBrightness($$2.above()) >= 9) {
                BlockState $$4 = this.defaultBlockState();

                for(int $$5 = 0; $$5 < 4; ++$$5) {
                    BlockPos $$6 = $$2.offset($$3.nextInt(3) - 1, $$3.nextInt(5) - 3, $$3.nextInt(3) - 1);
                    if ($$1.getBlockState($$6).is(Blocks.DIRT) && canPropagate($$4, $$1, $$6)) {
                        $$1.setBlockAndUpdate($$6, (BlockState)$$4.setValue(SNOWY, $$1.getBlockState($$6.above()).is(Blocks.SNOW)));
                    }
                }
            }

        }
    }

    // STATIC FUNCTIONS

    private static boolean canBeGrass(BlockState $$0, LevelReader $$1, BlockPos $$2) {
        BlockPos $$3 = $$2.above();
        BlockState $$4 = $$1.getBlockState($$3);
        if ($$4.is(Blocks.SNOW) && (Integer)$$4.getValue(SnowLayerBlock.LAYERS) == 1) {
            return true;
        } else if ($$4.getFluidState().getAmount() == 8) {
            return false;
        } else {
            int $$5 = LightEngine.getLightBlockInto($$1, $$0, $$2, $$4, $$3, Direction.UP, $$4.getLightBlock($$1, $$3));
            return $$5 < $$1.getMaxLightLevel();
        }
    }

    private static boolean canPropagate(BlockState $$0, LevelReader $$1, BlockPos $$2) {
        BlockPos $$3 = $$2.above();
        return canBeGrass($$0, $$1, $$2) && !$$1.getFluidState($$3).is(FluidTags.WATER);
    }

    private static boolean isSnowySetting(BlockState $$0) {
        return $$0.is(BlockTags.SNOW);
    }
}
