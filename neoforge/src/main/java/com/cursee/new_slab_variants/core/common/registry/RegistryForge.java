package com.cursee.new_slab_variants.core.common.registry;

import com.cursee.new_slab_variants.Constants;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.Collections;
import java.util.function.Supplier;

public class RegistryForge {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(BuiltInRegistries.BLOCK, Constants.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(BuiltInRegistries.ITEM, Constants.MOD_ID);
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(BuiltInRegistries.CREATIVE_MODE_TAB.key(), Constants.MOD_ID);
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, Constants.MOD_ID);
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(BuiltInRegistries.ENTITY_TYPE, Constants.MOD_ID);

    public static void register(IEventBus modEventBus) {

        ModBlocksForge.register();
        ModItemsForge.register();
        ModTabsForge.register();
        ModBlockEntityTypesForge.register();
        ModEntityTypesForge.register();

        BLOCKS.register(modEventBus);
        ITEMS.register(modEventBus);

        // ModTabsForge.slabItemsToAdd.addAll(ITEMS.getEntries());
        ModTabsForge.slabs.addAll(ITEMS.getEntries());

        TABS.register(modEventBus);
        BLOCK_ENTITY_TYPES.register(modEventBus);
        ENTITY_TYPES.register(modEventBus);
    }

    protected static <T extends Block> DeferredHolder<Block, T> registerBlock(String blockID, Supplier<T> blockSupplier) {
        return BLOCKS.register(blockID, blockSupplier);
    }

    protected static <T extends Item> DeferredHolder<Item, T> registerItem(String name, Supplier<T> item) {
        return ITEMS.register(name, item);
    }

    protected static <T extends Block> DeferredHolder<Block, T> registerBlockAndBlockItem(String name, Supplier<T> block) {
        DeferredHolder<Block, T> toReturn = registerBlock(name, block);
        registerItem(name, () -> new BlockItem(toReturn.get(), new Item.Properties()));
        return toReturn;
    }

    protected static <T extends CreativeModeTab> DeferredHolder<CreativeModeTab, T> registerCreativeModeTab(String tabID, Supplier<T> tab) {
        return TABS.register(tabID, tab);
    }

    protected static <T extends BlockEntityType<?>> DeferredHolder<BlockEntityType<?>, T> registerBlockEntityType(String entityTypeID, Supplier<T> entityType) {
        return BLOCK_ENTITY_TYPES.register(entityTypeID, entityType);
    }

    protected static <T extends EntityType<?>> DeferredHolder<EntityType<?>, T> registerEntityType(String entityTypeID, Supplier<T> entityType) {
        return ENTITY_TYPES.register(entityTypeID, entityType);
    }
}
