package com.cursee.new_slab_variants.core.common.registry;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class ModTabsForge {

    public static void register() {}

    public static List<Supplier<Item>> slabItemsToAdd = new ArrayList<>();

    public static final RegistryObject<CreativeModeTab> NEW_SLAB_VARIANTS_TAB = RegistryForge.registerCreativeModeTab("new_slab_variants_tab", () -> CreativeModeTab.builder()
            .withTabsBefore(CreativeModeTabs.SPAWN_EGGS)
            .title(Component.translatable("itemGroup.newSlabVariants"))
            .icon(() -> new ItemStack(ModBlocksForge.CHERRY_LOG_SLAB.get()))
            .displayItems((displayParameters, output) -> {

                for (Supplier<Item> slabItem : slabItemsToAdd) {
                    if (!slabItem.get().getDescriptionId().contains("ladder") && !slabItem.get().getDescriptionId().contains("scaffolding") && !slabItem.get().getDescriptionId().contains("dirt") && !slabItem.get().getDescriptionId().contains("grass_block")) {
                        output.accept(slabItem.get());
                    }
                }

                for (ItemLike itemLike : ModBlocksForge.slabs) {
                    output.accept(itemLike);
                }
            }).build());
}
