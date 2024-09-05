package com.cursee.new_slab_variants.core.common.registry;

import com.cursee.new_slab_variants.Constants;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class RegistryNeoForge {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Constants.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Constants.MOD_ID);
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(BuiltInRegistries.CREATIVE_MODE_TAB.key(), Constants.MOD_ID);
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, Constants.MOD_ID);
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, Constants.MOD_ID);

    public static void register(IEventBus modEventBus) {

        ModBlocksNeoForge.register();
        ModItemsNeoForge.register();
        ModTabsNeoForge.register();
        ModBlockEntityTypesNeoForge.register();
        ModEntityTypesNeoForge.register();

        BLOCKS.register(modEventBus);
        ITEMS.register(modEventBus);

        ModTabsNeoForge.slabItemsToAdd.addAll(ITEMS.getEntries());

        TABS.register(modEventBus);
        BLOCK_ENTITY_TYPES.register(modEventBus);
        ENTITY_TYPES.register(modEventBus);
    }

    protected static <T extends Block> RegistryObject<T> registerBlock(String blockID, Supplier<T> blockSupplier) {
        return BLOCKS.register(blockID, blockSupplier);
    }

    protected static <T extends Item> RegistryObject<T> registerItem(String name, Supplier<T> item) {
        return ITEMS.register(name, item);
    }

    protected static <T extends Block> RegistryObject<T> registerBlockAndBlockItem(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = registerBlock(name, block);
        registerItem(name, () -> new BlockItem(toReturn.get(), new Item.Properties()));
        return toReturn;
    }

    protected static <T extends CreativeModeTab> RegistryObject<T> registerCreativeModeTab(String tabID, Supplier<T> tab) {
        return TABS.register(tabID, tab);
    }

    protected static <T extends BlockEntityType<?>> RegistryObject<T> registerBlockEntityType(String entityTypeID, Supplier<T> entityType) {
        return BLOCK_ENTITY_TYPES.register(entityTypeID, entityType);
    }

    protected static <T extends EntityType<?>> RegistryObject<T> registerEntityType(String entityTypeID, Supplier<T> entityType) {
        return ENTITY_TYPES.register(entityTypeID, entityType);
    }
}
