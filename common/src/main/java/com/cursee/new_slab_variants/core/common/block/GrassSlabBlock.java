package com.cursee.new_slab_variants.core.common.block;

import com.cursee.new_slab_variants.platform.Services;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

import java.util.List;
import java.util.Optional;

public class GrassSlabBlock extends SpreadingSnowyDirtBlockSlab implements BonemealableBlock {

    public GrassSlabBlock(Properties $$0) {
        super($$0);
    }

    public boolean isValidBonemealTarget(LevelReader $$0, BlockPos $$1, BlockState $$2, boolean $$3) {
        return $$0.getBlockState($$1.above()).isAir();
    }

    public boolean isBonemealSuccess(Level $$0, RandomSource $$1, BlockPos $$2, BlockState $$3) {
        return true;
    }

    public void performBonemeal(ServerLevel $$0, RandomSource $$1, BlockPos $$2, BlockState $$3) {
        BlockPos $$4 = $$2.above();
        BlockState $$5 = Services.PLATFORM.getDirtSlabBlock().defaultBlockState();
        Optional<Holder.Reference<PlacedFeature>> $$6 = $$0.registryAccess().registryOrThrow(Registries.PLACED_FEATURE).getHolder(VegetationPlacements.GRASS_BONEMEAL);

        label49:
        for(int $$7 = 0; $$7 < 128; ++$$7) {
            BlockPos $$8 = $$4;

            for(int $$9 = 0; $$9 < $$7 / 16; ++$$9) {
                $$8 = $$8.offset($$1.nextInt(3) - 1, ($$1.nextInt(3) - 1) * $$1.nextInt(3) / 2, $$1.nextInt(3) - 1);
                if (!$$0.getBlockState($$8.below()).is(this) || $$0.getBlockState($$8).isCollisionShapeFullBlock($$0, $$8) && $$8 != $$4) {
                    continue label49;
                }
            }

            BlockState $$10 = $$0.getBlockState($$8);
            if ($$10.is($$5.getBlock()) && $$1.nextInt(10) == 0) {
                ((BonemealableBlock)$$5.getBlock()).performBonemeal($$0, $$1, $$8, $$10);
            }

            if ($$10.isAir()) {
                Holder $$13;
                if ($$1.nextInt(8) == 0) {
                    List<ConfiguredFeature<?, ?>> $$11 = ((Biome)$$0.getBiome($$8).value()).getGenerationSettings().getFlowerFeatures();
                    if ($$11.isEmpty()) {
                        continue;
                    }

                    $$13 = ((RandomPatchConfiguration)((ConfiguredFeature)$$11.get(0)).config()).feature();
                } else {
                    if (!$$6.isPresent()) {
                        continue;
                    }

                    $$13 = (Holder)$$6.get();
                }

                ((PlacedFeature)$$13.value()).place($$0, $$0.getChunkSource().getGenerator(), $$1, $$8);
            }
        }

    }
}
