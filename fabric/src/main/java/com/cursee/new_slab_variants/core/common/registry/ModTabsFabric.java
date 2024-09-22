package com.cursee.new_slab_variants.core.common.registry;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class ModTabsFabric {

    public static void register() {}

    public static List<Supplier<Item>> slabItemsToAdd = new ArrayList<>();

    public static final CreativeModeTab NEW_SLAB_VARIANTS_TAB = RegistryFabric.registerCreativeModeTab("new_slab_variants_tab",
            FabricItemGroup.builder()
            .title(Component.translatable("itemGroup.newSlabVariants"))
            .icon(() -> new ItemStack(ModBlocksFabric.CHERRY_LOG_SLAB))
            .displayItems((displayParameters, output) -> {

                for (Supplier<Item> slabItem : slabItemsToAdd) {
                    if (!slabItem.get().getDescriptionId().contains("ladder") && !slabItem.get().getDescriptionId().contains("scaffolding") && !slabItem.get().getDescriptionId().contains("dirt") && !slabItem.get().getDescriptionId().contains("grass_block")) {
                        output.accept(slabItem.get());
                    }
                }

                for (ItemLike itemLike : ModBlocksFabric.slabs) {
                    output.accept(itemLike);
                }
            }).build());
}
