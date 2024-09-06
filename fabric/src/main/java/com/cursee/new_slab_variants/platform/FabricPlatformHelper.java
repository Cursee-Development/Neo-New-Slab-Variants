package com.cursee.new_slab_variants.platform;

import com.cursee.new_slab_variants.core.common.entity.PrimedTNTSlab;
import com.cursee.new_slab_variants.core.common.registry.ModBlocksFabric;
import com.cursee.new_slab_variants.core.common.registry.ModEntityTypesFabric;
import com.cursee.new_slab_variants.platform.services.IPlatformHelper;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.block.Block;

public class FabricPlatformHelper implements IPlatformHelper {

    @Override
    public String getPlatformName() {
        return "Fabric";
    }

    @Override
    public boolean isModLoaded(String modId) {

        return FabricLoader.getInstance().isModLoaded(modId);
    }

    @Override
    public boolean isDevelopmentEnvironment() {

        return FabricLoader.getInstance().isDevelopmentEnvironment();
    }

    @Override
    public EntityType<? extends PrimedTNTSlab> getPrimedTNTSlabEntityType() {
        return ModEntityTypesFabric.PRIMED_TNT_SLAB;
    }

    @Override
    public Block getTNTSlabBlock() {
        return ModBlocksFabric.TNT_SLAB;
    }
}
