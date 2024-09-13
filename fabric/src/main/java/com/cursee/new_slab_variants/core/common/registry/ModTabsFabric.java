package com.cursee.new_slab_variants.core.common.registry;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
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

                // start vanilla slabs
                output.accept(Blocks.CUT_COPPER_SLAB);
                output.accept(Blocks.EXPOSED_CUT_COPPER_SLAB);
                output.accept(Blocks.WEATHERED_CUT_COPPER_SLAB);
                output.accept(Blocks.OXIDIZED_CUT_COPPER_SLAB);
                output.accept(Blocks.WAXED_CUT_COPPER_SLAB);
                output.accept(Blocks.WAXED_EXPOSED_CUT_COPPER_SLAB);
                output.accept(Blocks.WAXED_WEATHERED_CUT_COPPER_SLAB);
                output.accept(Blocks.WAXED_OXIDIZED_CUT_COPPER_SLAB);
                output.accept(Blocks.OAK_SLAB);
                output.accept(Blocks.SPRUCE_SLAB);
                output.accept(Blocks.BIRCH_SLAB);
                output.accept(Blocks.JUNGLE_SLAB);
                output.accept(Blocks.ACACIA_SLAB);
                output.accept(Blocks.CHERRY_SLAB);
                output.accept(Blocks.DARK_OAK_SLAB);
                output.accept(Blocks.MANGROVE_SLAB);
                output.accept(Blocks.BAMBOO_SLAB);
                output.accept(Blocks.BAMBOO_MOSAIC_SLAB);
                output.accept(Blocks.CRIMSON_SLAB);
                output.accept(Blocks.WARPED_SLAB);
                output.accept(Blocks.STONE_SLAB);
                output.accept(Blocks.SMOOTH_STONE_SLAB);
                output.accept(Blocks.SANDSTONE_SLAB);
                output.accept(Blocks.CUT_SANDSTONE_SLAB);
                output.accept(Blocks.PETRIFIED_OAK_SLAB);
                output.accept(Blocks.COBBLESTONE_SLAB);
                output.accept(Blocks.BRICK_SLAB);
                output.accept(Blocks.STONE_BRICK_SLAB);
                output.accept(Blocks.MUD_BRICK_SLAB);
                output.accept(Blocks.NETHER_BRICK_SLAB);
                output.accept(Blocks.QUARTZ_SLAB);
                output.accept(Blocks.RED_SANDSTONE_SLAB);
                output.accept(Blocks.CUT_RED_SANDSTONE_SLAB);
                output.accept(Blocks.PURPUR_SLAB);
                output.accept(Blocks.PRISMARINE_SLAB);
                output.accept(Blocks.PRISMARINE_BRICK_SLAB);
                output.accept(Blocks.DARK_PRISMARINE_SLAB);
                output.accept(Blocks.POLISHED_GRANITE_SLAB);
                output.accept(Blocks.SMOOTH_RED_SANDSTONE_SLAB);
                output.accept(Blocks.MOSSY_STONE_BRICK_SLAB);
                output.accept(Blocks.POLISHED_DIORITE_SLAB);
                output.accept(Blocks.MOSSY_COBBLESTONE_SLAB);
                output.accept(Blocks.END_STONE_BRICK_SLAB);
                output.accept(Blocks.SMOOTH_SANDSTONE_SLAB);
                output.accept(Blocks.SMOOTH_QUARTZ_SLAB);
                output.accept(Blocks.GRANITE_SLAB);
                output.accept(Blocks.ANDESITE_SLAB);
                output.accept(Blocks.RED_NETHER_BRICK_SLAB);
                output.accept(Blocks.POLISHED_ANDESITE_SLAB);
                output.accept(Blocks.DIORITE_SLAB);
                output.accept(Blocks.COBBLED_DEEPSLATE_SLAB);
                output.accept(Blocks.POLISHED_DEEPSLATE_SLAB);
                output.accept(Blocks.DEEPSLATE_BRICK_SLAB);
                output.accept(Blocks.DEEPSLATE_TILE_SLAB);
                output.accept(Blocks.BLACKSTONE_SLAB);
                output.accept(Blocks.POLISHED_BLACKSTONE_SLAB);
                output.accept(Blocks.POLISHED_BLACKSTONE_BRICK_SLAB);
                // end vanilla slabs

                for (Supplier<Item> slabItem : slabItemsToAdd) {
                    if (!slabItem.get().getDescriptionId().contains("ladder") && !slabItem.get().getDescriptionId().contains("scaffolding") && !slabItem.get().getDescriptionId().contains("dirt") && !slabItem.get().getDescriptionId().contains("grass_block")) {
                        output.accept(slabItem.get());
                    }
                }
            }).build());
}
