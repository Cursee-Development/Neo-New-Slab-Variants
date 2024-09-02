package com.cursee.new_slab_variants;

import com.cursee.monolib.core.MonoLibConfiguration;
import com.cursee.monolib.core.sailing.Sailing;
import com.cursee.new_slab_variants.core.common.registry.RegistryFabric;
import net.fabricmc.api.ModInitializer;

public class NewSlabVariantsFabric implements ModInitializer {
    
    @Override
    public void onInitialize() {

        NewSlabVariants.init();
        Sailing.register(Constants.MOD_NAME, Constants.MOD_ID, Constants.MOD_VERSION, Constants.MC_VERSION_RAW, Constants.PUBLISHER_AUTHOR, Constants.PRIMARY_CURSEFORGE_MODRINTH);

        NewSlabVariants.debugCommon = MonoLibConfiguration.debugging;

        RegistryFabric.register();
    }
}
