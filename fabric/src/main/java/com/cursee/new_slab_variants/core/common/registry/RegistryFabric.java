package com.cursee.new_slab_variants.core.common.registry;

import com.cursee.new_slab_variants.Constants;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class RegistryFabric {

    public static void register() {
        ModBlocksFabric.register();
        ModItemsFabric.register();
        ModTabsFabric.register();
        ModBlockEntityTypesFabric.register();
        ModEntityTypesFabric.register();
    }
    
    protected static ResourceLocation identifier(String id) {
        return new ResourceLocation(Constants.MOD_ID, id);
    }

    protected static <T extends Block> T registerBlock(String blockID, T block) {
        return Registry.register(BuiltInRegistries.BLOCK, identifier(blockID), block);
    }

    protected static <T extends Item> T registerItem(String itemID, T item) {

        T toReturn = Registry.register(BuiltInRegistries.ITEM, identifier(itemID), item);

        ModTabsFabric.slabItemsToAdd.add(() -> toReturn);

        return toReturn;
    }

    protected static <T extends Block> T registerBlockAndBlockItem(String id, T block) {
        registerItem(id, new BlockItem(block, new Item.Properties()));
        return registerBlock(id, block);
    }

    protected static <T extends CreativeModeTab> T registerCreativeModeTab(String tabID, T tab) {
        return Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, identifier(tabID), tab);
    }

    protected static <T extends BlockEntityType<?>> T registerBlockEntityType(String blockEntityTypeID, T entityType) {
        return Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, identifier(blockEntityTypeID), entityType);
    }

    protected static <T extends EntityType<?>> T registerEntityType(String entityTypeID, T entityType) {
        return Registry.register(BuiltInRegistries.ENTITY_TYPE, identifier(entityTypeID), entityType);
    }
}
