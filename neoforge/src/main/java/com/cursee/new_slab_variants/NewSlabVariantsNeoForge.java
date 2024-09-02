package com.cursee.new_slab_variants;

import com.cursee.monolib.core.MonoLibConfiguration;
import com.cursee.monolib.core.sailing.Sailing;
import net.minecraftforge.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class NewSlabVariantsNeoForge {
    
    public NewSlabVariantsNeoForge() {
    
        NewSlabVariants.init();
        Sailing.register(Constants.MOD_NAME, Constants.MOD_ID, Constants.MOD_VERSION, Constants.MC_VERSION_RAW, Constants.PUBLISHER_AUTHOR, Constants.PRIMARY_CURSEFORGE_MODRINTH);

        NewSlabVariants.debugCommon = MonoLibConfiguration.debugging;
    }
}