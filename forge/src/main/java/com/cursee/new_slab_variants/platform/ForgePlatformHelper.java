package com.cursee.new_slab_variants.platform;

import com.cursee.new_slab_variants.core.common.entity.PrimedTNTSlab;
import com.cursee.new_slab_variants.core.common.registry.ModBlocksForge;
import com.cursee.new_slab_variants.core.common.registry.ModEntityTypesForge;
import com.cursee.new_slab_variants.platform.services.IPlatformHelper;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.loading.FMLLoader;

public class ForgePlatformHelper implements IPlatformHelper {

    @Override
    public String getPlatformName() {

        return "Forge";
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
        return ModEntityTypesForge.PRIMED_TNT_SLAB.get();
    }

    @Override
    public Block getTNTSlabBlock() {
        return ModBlocksForge.TNT_SLAB.get();
    }
}