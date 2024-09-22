package com.cursee.new_slab_variants.core.common.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.BubbleColumnBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockState;

public class MagmaSlabBlock extends SlabBlock {

    private static final int BUBBLE_COLUMN_CHECK_DELAY = 20;

    public MagmaSlabBlock(Properties $$0) {
        super($$0);
    }

    public void stepOn(Level $$0, BlockPos $$1, BlockState $$2, Entity $$3) {
        if ($$0 instanceof ServerLevel serverLevel && !$$3.isSteppingCarefully() && $$3 instanceof LivingEntity && !EnchantmentHelper.isImmuneToDamage(serverLevel, (LivingEntity)$$3, $$0.damageSources().hotFloor())) {
            $$3.hurt($$0.damageSources().hotFloor(), 1.0F);
        }

        super.stepOn($$0, $$1, $$2, $$3);
    }

    public void tick(BlockState $$0, ServerLevel $$1, BlockPos $$2, RandomSource $$3) {
        BubbleColumnBlock.updateColumn($$1, $$2.above(), $$0);
    }

    public BlockState updateShape(BlockState $$0, Direction $$1, BlockState $$2, LevelAccessor $$3, BlockPos $$4, BlockPos $$5) {
        if ($$1 == Direction.UP && $$2.is(Blocks.WATER)) {
            $$3.scheduleTick($$4, this, 20);
        }

        return super.updateShape($$0, $$1, $$2, $$3, $$4, $$5);
    }

    public void onPlace(BlockState $$0, Level $$1, BlockPos $$2, BlockState $$3, boolean $$4) {
        $$1.scheduleTick($$2, this, 20);
    }
}
