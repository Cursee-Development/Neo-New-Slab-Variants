package com.cursee.new_slab_variants.platform;

import com.cursee.new_slab_variants.core.common.entity.PrimedTNTSlab;
import com.cursee.new_slab_variants.core.common.registry.ModBlocksNeoForge;
import com.cursee.new_slab_variants.core.common.registry.ModEntityTypesNeoForge;
import com.cursee.new_slab_variants.platform.services.IPlatformHelper;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.loading.FMLLoader;

public class NeoForgePlatformHelper implements IPlatformHelper {

    @Override
    public String getPlatformName() {

        return "NeoForge";
    }

    @Override
    public boolean isModLoaded(String modId) {

        return ModList.get().isLoaded(modId);
    }

    @Override
    public boolean isDevelopmentEnvironment() {

        return !FMLLoader.isProduction();
    }

    @Override
    public EntityType<? extends PrimedTNTSlab> getPrimedTNTSlabEntityType() {
        return ModEntityTypesNeoForge.PRIMED_TNT_SLAB.get();
    }

    @Override
    public Block getTNTSlabBlock() {
        return ModBlocksNeoForge.TNT_SLAB.get();
    }

    @Override
    public Block getDirtSlabBlock() {
        return ModBlocksNeoForge.DIRT_SLAB.get();
    }
}