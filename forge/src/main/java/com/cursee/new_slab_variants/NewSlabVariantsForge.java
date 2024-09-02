package com.cursee.new_slab_variants;

import com.cursee.monolib.core.MonoLibConfiguration;
import com.cursee.monolib.core.sailing.Sailing;
import com.cursee.new_slab_variants.core.common.registry.RegistryForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Constants.MOD_ID)
public class NewSlabVariantsForge {

    // todo: fix redstone lamp and ore blockstates
    // todo: full transparent block rendering (glasses, honey, slime)
    
    public NewSlabVariantsForge() {
    
        NewSlabVariants.init();
        Sailing.register(Constants.MOD_NAME, Constants.MOD_ID, Constants.MOD_VERSION, Constants.MC_VERSION_RAW, Constants.PUBLISHER_AUTHOR, Constants.PRIMARY_CURSEFORGE_MODRINTH);

        NewSlabVariants.debugCommon = MonoLibConfiguration.debugging;

        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        RegistryForge.register(modEventBus);

        modEventBus.addListener(NewSlabVariantsClientForge::registerBlockColors);
        modEventBus.addListener(NewSlabVariantsClientForge::registerItemColors);

        modEventBus.addListener(this::onLoadComplete);
    }

    private void onLoadComplete(FMLLoadCompleteEvent event) {
//        event.enqueueWork(() -> {
//
//            RegistryForge.BLOCKS.getEntries().forEach(registryObject -> {
//
//                // block.new_slab_variants.netherite_block_slab
//                // ->
//                // "block.new_slab_variants.netherite_block_slab": "Netherite Block Slab",
//
//                // System.out.println(asTitle(registryObject.get().getDescriptionId().replace('_', ' ')));
//
//                StringBuilder outline = new StringBuilder();
//                outline
//                        .append('\"')
//                        .append(registryObject.get().getDescriptionId())
//                        .append('\"')
//                        .append(": ")
//                        .append('\"')
//                        .append(asTitle(registryObject.get().getDescriptionId().replace("block.new_slab_variants.", "").replace('_', ' ')))
//                        .append('\"').append(',');
//
//                System.out.println(outline.toString().trim());
//            });
//        });
    }

    public static String asTitle(String input) {

        String[] words = input.split(" ");
        StringBuilder titleCase = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                titleCase.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1).toLowerCase())
                        .append(" ");
            }
        }

        return titleCase.toString().trim();
    }
}