package com.cursee.new_slab_variants.core.common.registry;

import com.cursee.new_slab_variants.core.common.block.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredHolder;

// @SuppressWarnings("unused")
public class ModBlocksForge {

    public static void register() {}

    public static final Block[] slabs = new Block[] {
            Blocks.CUT_COPPER_SLAB,
            Blocks.EXPOSED_CUT_COPPER_SLAB,
            Blocks.WEATHERED_CUT_COPPER_SLAB,
            Blocks.OXIDIZED_CUT_COPPER_SLAB,
            Blocks.WAXED_CUT_COPPER_SLAB,
            Blocks.WAXED_EXPOSED_CUT_COPPER_SLAB,
            Blocks.WAXED_WEATHERED_CUT_COPPER_SLAB,
            Blocks.WAXED_OXIDIZED_CUT_COPPER_SLAB,
            Blocks.OAK_SLAB,
            Blocks.SPRUCE_SLAB,
            Blocks.BIRCH_SLAB,
            Blocks.JUNGLE_SLAB,
            Blocks.ACACIA_SLAB,
            Blocks.CHERRY_SLAB,
            Blocks.DARK_OAK_SLAB,
            Blocks.MANGROVE_SLAB,
            Blocks.BAMBOO_SLAB,
            Blocks.BAMBOO_MOSAIC_SLAB,
            Blocks.CRIMSON_SLAB,
            Blocks.WARPED_SLAB,
            Blocks.STONE_SLAB,
            Blocks.SMOOTH_STONE_SLAB,
            Blocks.SANDSTONE_SLAB,
            Blocks.CUT_SANDSTONE_SLAB,
            Blocks.COBBLESTONE_SLAB,
            Blocks.BRICK_SLAB,
            Blocks.STONE_BRICK_SLAB,
            Blocks.MUD_BRICK_SLAB,
            Blocks.NETHER_BRICK_SLAB,
            Blocks.QUARTZ_SLAB,
            Blocks.RED_SANDSTONE_SLAB,
            Blocks.CUT_RED_SANDSTONE_SLAB,
            Blocks.PURPUR_SLAB,
            Blocks.PRISMARINE_SLAB,
            Blocks.PRISMARINE_BRICK_SLAB,
            Blocks.DARK_PRISMARINE_SLAB,
            Blocks.POLISHED_GRANITE_SLAB,
            Blocks.SMOOTH_RED_SANDSTONE_SLAB,
            Blocks.MOSSY_STONE_BRICK_SLAB,
            Blocks.POLISHED_DIORITE_SLAB,
            Blocks.MOSSY_COBBLESTONE_SLAB,
            Blocks.END_STONE_BRICK_SLAB,
            Blocks.SMOOTH_SANDSTONE_SLAB,
            Blocks.SMOOTH_QUARTZ_SLAB,
            Blocks.GRANITE_SLAB,
            Blocks.ANDESITE_SLAB,
            Blocks.RED_NETHER_BRICK_SLAB,
            Blocks.POLISHED_ANDESITE_SLAB,
            Blocks.DIORITE_SLAB,
            Blocks.COBBLED_DEEPSLATE_SLAB,
            Blocks.POLISHED_DEEPSLATE_SLAB,
            Blocks.DEEPSLATE_BRICK_SLAB,
            Blocks.DEEPSLATE_TILE_SLAB,
            Blocks.BLACKSTONE_SLAB,
            Blocks.POLISHED_BLACKSTONE_SLAB,
            Blocks.POLISHED_BLACKSTONE_BRICK_SLAB
    };

    // WOODEN
    public static final DeferredHolder<Block, Block> OAK_LOG_SLAB = RegistryForge.registerBlockAndBlockItem("oak_log_slab", () -> new RotatedSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));
    public static final DeferredHolder<Block, Block> OAK_WOOD_SLAB = RegistryForge.registerBlockAndBlockItem("oak_wood_slab", () -> new RotatedSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));
    public static final DeferredHolder<Block, Block> STRIPPED_OAK_LOG_SLAB = RegistryForge.registerBlockAndBlockItem("stripped_oak_log_slab", () -> new RotatedSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));
    public static final DeferredHolder<Block, Block> STRIPPED_OAK_WOOD_SLAB = RegistryForge.registerBlockAndBlockItem("stripped_oak_wood_slab", () -> new RotatedSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));
    public static final DeferredHolder<Block, Block> SPRUCE_LOG_SLAB = RegistryForge.registerBlockAndBlockItem("spruce_log_slab", () -> new RotatedSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_SLAB)));
    public static final DeferredHolder<Block, Block> SPRUCE_WOOD_SLAB = RegistryForge.registerBlockAndBlockItem("spruce_wood_slab", () -> new RotatedSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_SLAB)));
    public static final DeferredHolder<Block, Block> STRIPPED_SPRUCE_LOG_SLAB = RegistryForge.registerBlockAndBlockItem("stripped_spruce_log_slab", () -> new RotatedSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_SLAB)));
    public static final DeferredHolder<Block, Block> STRIPPED_SPRUCE_WOOD_SLAB = RegistryForge.registerBlockAndBlockItem("stripped_spruce_wood_slab", () -> new RotatedSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_SLAB)));
    public static final DeferredHolder<Block, Block> BIRCH_LOG_SLAB = RegistryForge.registerBlockAndBlockItem("birch_log_slab", () -> new RotatedSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_SLAB)));
    public static final DeferredHolder<Block, Block> BIRCH_WOOD_SLAB = RegistryForge.registerBlockAndBlockItem("birch_wood_slab", () -> new RotatedSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_SLAB)));
    public static final DeferredHolder<Block, Block> STRIPPED_BIRCH_LOG_SLAB = RegistryForge.registerBlockAndBlockItem("stripped_birch_log_slab", () -> new RotatedSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_SLAB)));
    public static final DeferredHolder<Block, Block> STRIPPED_BIRCH_WOOD_SLAB = RegistryForge.registerBlockAndBlockItem("stripped_birch_wood_slab", () -> new RotatedSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_SLAB)));
    public static final DeferredHolder<Block, Block> JUNGLE_LOG_SLAB = RegistryForge.registerBlockAndBlockItem("jungle_log_slab", () -> new RotatedSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_SLAB)));
    public static final DeferredHolder<Block, Block> JUNGLE_WOOD_SLAB = RegistryForge.registerBlockAndBlockItem("jungle_wood_slab", () -> new RotatedSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_SLAB)));
    public static final DeferredHolder<Block, Block> STRIPPED_JUNGLE_LOG_SLAB = RegistryForge.registerBlockAndBlockItem("stripped_jungle_log_slab", () -> new RotatedSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_SLAB)));
    public static final DeferredHolder<Block, Block> STRIPPED_JUNGLE_WOOD_SLAB = RegistryForge.registerBlockAndBlockItem("stripped_jungle_wood_slab", () -> new RotatedSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_SLAB)));
    public static final DeferredHolder<Block, Block> ACACIA_LOG_SLAB = RegistryForge.registerBlockAndBlockItem("acacia_log_slab", () -> new RotatedSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_SLAB)));
    public static final DeferredHolder<Block, Block> ACACIA_WOOD_SLAB = RegistryForge.registerBlockAndBlockItem("acacia_wood_slab", () -> new RotatedSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_SLAB)));
    public static final DeferredHolder<Block, Block> STRIPPED_ACACIA_LOG_SLAB = RegistryForge.registerBlockAndBlockItem("stripped_acacia_log_slab", () -> new RotatedSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_SLAB)));
    public static final DeferredHolder<Block, Block> STRIPPED_ACACIA_WOOD_SLAB = RegistryForge.registerBlockAndBlockItem("stripped_acacia_wood_slab", () -> new RotatedSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_SLAB)));
    public static final DeferredHolder<Block, Block> DARK_OAK_LOG_SLAB = RegistryForge.registerBlockAndBlockItem("dark_oak_log_slab", () -> new RotatedSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_SLAB)));
    public static final DeferredHolder<Block, Block> DARK_OAK_WOOD_SLAB = RegistryForge.registerBlockAndBlockItem("dark_oak_wood_slab", () -> new RotatedSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_SLAB)));
    public static final DeferredHolder<Block, Block> STRIPPED_DARK_OAK_LOG_SLAB = RegistryForge.registerBlockAndBlockItem("stripped_dark_oak_log_slab", () -> new RotatedSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_SLAB)));
    public static final DeferredHolder<Block, Block> STRIPPED_DARK_OAK_WOOD_SLAB = RegistryForge.registerBlockAndBlockItem("stripped_dark_oak_wood_slab", () -> new RotatedSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_SLAB)));
    public static final DeferredHolder<Block, Block> MANGROVE_LOG_SLAB = RegistryForge.registerBlockAndBlockItem("mangrove_log_slab", () -> new RotatedSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MANGROVE_SLAB)));
    public static final DeferredHolder<Block, Block> MANGROVE_WOOD_SLAB = RegistryForge.registerBlockAndBlockItem("mangrove_wood_slab", () -> new RotatedSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MANGROVE_SLAB)));
    public static final DeferredHolder<Block, Block> STRIPPED_MANGROVE_LOG_SLAB = RegistryForge.registerBlockAndBlockItem("stripped_mangrove_log_slab", () -> new RotatedSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MANGROVE_SLAB)));
    public static final DeferredHolder<Block, Block> STRIPPED_MANGROVE_WOOD_SLAB = RegistryForge.registerBlockAndBlockItem("stripped_mangrove_wood_slab", () -> new RotatedSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MANGROVE_SLAB)));
    public static final DeferredHolder<Block, Block> CHERRY_LOG_SLAB = RegistryForge.registerBlockAndBlockItem("cherry_log_slab", () -> new RotatedSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_SLAB)));
    public static final DeferredHolder<Block, Block> CHERRY_WOOD_SLAB = RegistryForge.registerBlockAndBlockItem("cherry_wood_slab", () -> new RotatedSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_SLAB)));
    public static final DeferredHolder<Block, Block> STRIPPED_CHERRY_LOG_SLAB = RegistryForge.registerBlockAndBlockItem("stripped_cherry_log_slab", () -> new RotatedSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_SLAB)));
    public static final DeferredHolder<Block, Block> STRIPPED_CHERRY_WOOD_SLAB = RegistryForge.registerBlockAndBlockItem("stripped_cherry_wood_slab", () -> new RotatedSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_SLAB)));
    
    public static final DeferredHolder<Block, Block> BAMBOO_BLOCK_SLAB = RegistryForge.registerBlockAndBlockItem("bamboo_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BAMBOO_SLAB)));
    public static final DeferredHolder<Block, Block> STRIPPED_BAMBOO_BLOCK_SLAB = RegistryForge.registerBlockAndBlockItem("stripped_bamboo_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BAMBOO_SLAB)));

    // LEAVES
    public static final DeferredHolder<Block, Block> OAK_LEAVES_SLAB = RegistryForge.registerBlockAndBlockItem("oak_leaves_slab", () -> new LeavesSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
    public static final DeferredHolder<Block, Block> SPRUCE_LEAVES_SLAB = RegistryForge.registerBlockAndBlockItem("spruce_leaves_slab", () -> new LeavesSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_LEAVES)));
    public static final DeferredHolder<Block, Block> BIRCH_LEAVES_SLAB = RegistryForge.registerBlockAndBlockItem("birch_leaves_slab", () -> new LeavesSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_LEAVES)));
    public static final DeferredHolder<Block, Block> JUNGLE_LEAVES_SLAB = RegistryForge.registerBlockAndBlockItem("jungle_leaves_slab", () -> new LeavesSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_LEAVES)));
    public static final DeferredHolder<Block, Block> ACACIA_LEAVES_SLAB = RegistryForge.registerBlockAndBlockItem("acacia_leaves_slab", () -> new LeavesSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_LEAVES)));
    public static final DeferredHolder<Block, Block> DARK_OAK_LEAVES_SLAB = RegistryForge.registerBlockAndBlockItem("dark_oak_leaves_slab", () -> new LeavesSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_LEAVES)));
    public static final DeferredHolder<Block, Block> MANGROVE_LEAVES_SLAB = RegistryForge.registerBlockAndBlockItem("mangrove_leaves_slab", () -> new LeavesSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MANGROVE_LEAVES)));
    public static final DeferredHolder<Block, Block> CHERRY_LEAVES_SLAB = RegistryForge.registerBlockAndBlockItem("cherry_leaves_slab", () -> new LeavesSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_LEAVES)));
    public static final DeferredHolder<Block, Block> AZALEA_LEAVES_SLAB = RegistryForge.registerBlockAndBlockItem("azalea_leaves_slab", () -> new LeavesSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.AZALEA_LEAVES)));
    public static final DeferredHolder<Block, Block> FLOWERING_AZALEA_LEAVES_SLAB = RegistryForge.registerBlockAndBlockItem("flowering_azalea_leaves_slab", () -> new LeavesSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.FLOWERING_AZALEA_LEAVES)));

    // WOOL
    public static final DeferredHolder<Block, Block> WHITE_WOOL_SLAB = RegistryForge.registerBlockAndBlockItem("white_wool_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_WOOL)));
    public static final DeferredHolder<Block, Block> LIGHT_GRAY_WOOL_SLAB = RegistryForge.registerBlockAndBlockItem("light_gray_wool_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_WOOL)));
    public static final DeferredHolder<Block, Block> GRAY_WOOL_SLAB = RegistryForge.registerBlockAndBlockItem("gray_wool_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_WOOL)));
    public static final DeferredHolder<Block, Block> BLACK_WOOL_SLAB = RegistryForge.registerBlockAndBlockItem("black_wool_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_WOOL)));
    public static final DeferredHolder<Block, Block> BROWN_WOOL_SLAB = RegistryForge.registerBlockAndBlockItem("brown_wool_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_WOOL)));
    public static final DeferredHolder<Block, Block> RED_WOOL_SLAB = RegistryForge.registerBlockAndBlockItem("red_wool_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_WOOL)));
    public static final DeferredHolder<Block, Block> ORANGE_WOOL_SLAB = RegistryForge.registerBlockAndBlockItem("orange_wool_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_WOOL)));
    public static final DeferredHolder<Block, Block> YELLOW_WOOL_SLAB = RegistryForge.registerBlockAndBlockItem("yellow_wool_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_WOOL)));
    public static final DeferredHolder<Block, Block> LIME_WOOL_SLAB = RegistryForge.registerBlockAndBlockItem("lime_wool_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_WOOL)));
    public static final DeferredHolder<Block, Block> GREEN_WOOL_SLAB = RegistryForge.registerBlockAndBlockItem("green_wool_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_WOOL)));
    public static final DeferredHolder<Block, Block> CYAN_WOOL_SLAB = RegistryForge.registerBlockAndBlockItem("cyan_wool_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_WOOL)));
    public static final DeferredHolder<Block, Block> LIGHT_BLUE_WOOL_SLAB = RegistryForge.registerBlockAndBlockItem("light_blue_wool_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_WOOL)));
    public static final DeferredHolder<Block, Block> BLUE_WOOL_SLAB = RegistryForge.registerBlockAndBlockItem("blue_wool_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_WOOL)));
    public static final DeferredHolder<Block, Block> PURPLE_WOOL_SLAB = RegistryForge.registerBlockAndBlockItem("purple_wool_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_WOOL)));
    public static final DeferredHolder<Block, Block> MAGENTA_WOOL_SLAB = RegistryForge.registerBlockAndBlockItem("magenta_wool_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_WOOL)));
    public static final DeferredHolder<Block, Block> PINK_WOOL_SLAB = RegistryForge.registerBlockAndBlockItem("pink_wool_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_WOOL)));

    // TERRACOTTA
    public static final DeferredHolder<Block, Block> TERRACOTTA_SLAB = RegistryForge.registerBlockAndBlockItem("terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)));
    public static final DeferredHolder<Block, Block> WHITE_TERRACOTTA_SLAB = RegistryForge.registerBlockAndBlockItem("white_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_TERRACOTTA)));
    public static final DeferredHolder<Block, Block> LIGHT_GRAY_TERRACOTTA_SLAB = RegistryForge.registerBlockAndBlockItem("light_gray_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_TERRACOTTA)));
    public static final DeferredHolder<Block, Block> GRAY_TERRACOTTA_SLAB = RegistryForge.registerBlockAndBlockItem("gray_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_TERRACOTTA)));
    public static final DeferredHolder<Block, Block> BLACK_TERRACOTTA_SLAB = RegistryForge.registerBlockAndBlockItem("black_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_TERRACOTTA)));
    public static final DeferredHolder<Block, Block> BROWN_TERRACOTTA_SLAB = RegistryForge.registerBlockAndBlockItem("brown_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_TERRACOTTA)));
    public static final DeferredHolder<Block, Block> RED_TERRACOTTA_SLAB = RegistryForge.registerBlockAndBlockItem("red_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_TERRACOTTA)));
    public static final DeferredHolder<Block, Block> ORANGE_TERRACOTTA_SLAB = RegistryForge.registerBlockAndBlockItem("orange_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_TERRACOTTA)));
    public static final DeferredHolder<Block, Block> YELLOW_TERRACOTTA_SLAB = RegistryForge.registerBlockAndBlockItem("yellow_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_TERRACOTTA)));
    public static final DeferredHolder<Block, Block> LIME_TERRACOTTA_SLAB = RegistryForge.registerBlockAndBlockItem("lime_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_TERRACOTTA)));
    public static final DeferredHolder<Block, Block> GREEN_TERRACOTTA_SLAB = RegistryForge.registerBlockAndBlockItem("green_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_TERRACOTTA)));
    public static final DeferredHolder<Block, Block> CYAN_TERRACOTTA_SLAB = RegistryForge.registerBlockAndBlockItem("cyan_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_TERRACOTTA)));
    public static final DeferredHolder<Block, Block> LIGHT_BLUE_TERRACOTTA_SLAB = RegistryForge.registerBlockAndBlockItem("light_blue_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_TERRACOTTA)));
    public static final DeferredHolder<Block, Block> BLUE_TERRACOTTA_SLAB = RegistryForge.registerBlockAndBlockItem("blue_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_TERRACOTTA)));
    public static final DeferredHolder<Block, Block> PURPLE_TERRACOTTA_SLAB = RegistryForge.registerBlockAndBlockItem("purple_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_TERRACOTTA)));
    public static final DeferredHolder<Block, Block> MAGENTA_TERRACOTTA_SLAB = RegistryForge.registerBlockAndBlockItem("magenta_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_TERRACOTTA)));
    public static final DeferredHolder<Block, Block> PINK_TERRACOTTA_SLAB = RegistryForge.registerBlockAndBlockItem("pink_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_TERRACOTTA)));

    // GLAZED TERRACOTTA
    public static final DeferredHolder<Block, Block> WHITE_GLAZED_TERRACOTTA_SLAB = RegistryForge.registerBlockAndBlockItem("white_glazed_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_GLAZED_TERRACOTTA)));
    public static final DeferredHolder<Block, Block> LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB = RegistryForge.registerBlockAndBlockItem("light_gray_glazed_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA)));
    public static final DeferredHolder<Block, Block> GRAY_GLAZED_TERRACOTTA_SLAB = RegistryForge.registerBlockAndBlockItem("gray_glazed_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_GLAZED_TERRACOTTA)));
    public static final DeferredHolder<Block, Block> BLACK_GLAZED_TERRACOTTA_SLAB = RegistryForge.registerBlockAndBlockItem("black_glazed_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_GLAZED_TERRACOTTA)));
    public static final DeferredHolder<Block, Block> BROWN_GLAZED_TERRACOTTA_SLAB = RegistryForge.registerBlockAndBlockItem("brown_glazed_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_GLAZED_TERRACOTTA)));
    public static final DeferredHolder<Block, Block> RED_GLAZED_TERRACOTTA_SLAB = RegistryForge.registerBlockAndBlockItem("red_glazed_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_GLAZED_TERRACOTTA)));
    public static final DeferredHolder<Block, Block> ORANGE_GLAZED_TERRACOTTA_SLAB = RegistryForge.registerBlockAndBlockItem("orange_glazed_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_GLAZED_TERRACOTTA)));
    public static final DeferredHolder<Block, Block> YELLOW_GLAZED_TERRACOTTA_SLAB = RegistryForge.registerBlockAndBlockItem("yellow_glazed_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_GLAZED_TERRACOTTA)));
    public static final DeferredHolder<Block, Block> LIME_GLAZED_TERRACOTTA_SLAB = RegistryForge.registerBlockAndBlockItem("lime_glazed_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_GLAZED_TERRACOTTA)));
    public static final DeferredHolder<Block, Block> GREEN_GLAZED_TERRACOTTA_SLAB = RegistryForge.registerBlockAndBlockItem("green_glazed_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_GLAZED_TERRACOTTA)));
    public static final DeferredHolder<Block, Block> CYAN_GLAZED_TERRACOTTA_SLAB = RegistryForge.registerBlockAndBlockItem("cyan_glazed_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_GLAZED_TERRACOTTA)));
    public static final DeferredHolder<Block, Block> LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB = RegistryForge.registerBlockAndBlockItem("light_blue_glazed_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA)));
    public static final DeferredHolder<Block, Block> BLUE_GLAZED_TERRACOTTA_SLAB = RegistryForge.registerBlockAndBlockItem("blue_glazed_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_GLAZED_TERRACOTTA)));
    public static final DeferredHolder<Block, Block> PURPLE_GLAZED_TERRACOTTA_SLAB = RegistryForge.registerBlockAndBlockItem("purple_glazed_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_GLAZED_TERRACOTTA)));
    public static final DeferredHolder<Block, Block> MAGENTA_GLAZED_TERRACOTTA_SLAB = RegistryForge.registerBlockAndBlockItem("magenta_glazed_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_GLAZED_TERRACOTTA)));
    public static final DeferredHolder<Block, Block> PINK_GLAZED_TERRACOTTA_SLAB = RegistryForge.registerBlockAndBlockItem("pink_glazed_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_GLAZED_TERRACOTTA)));

    // CONCRETE
    public static final DeferredHolder<Block, Block> WHITE_CONCRETE_SLAB = RegistryForge.registerBlockAndBlockItem("white_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_CONCRETE)));
    public static final DeferredHolder<Block, Block> LIGHT_GRAY_CONCRETE_SLAB = RegistryForge.registerBlockAndBlockItem("light_gray_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_CONCRETE)));
    public static final DeferredHolder<Block, Block> GRAY_CONCRETE_SLAB = RegistryForge.registerBlockAndBlockItem("gray_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_CONCRETE)));
    public static final DeferredHolder<Block, Block> BLACK_CONCRETE_SLAB = RegistryForge.registerBlockAndBlockItem("black_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_CONCRETE)));
    public static final DeferredHolder<Block, Block> BROWN_CONCRETE_SLAB = RegistryForge.registerBlockAndBlockItem("brown_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_CONCRETE)));
    public static final DeferredHolder<Block, Block> RED_CONCRETE_SLAB = RegistryForge.registerBlockAndBlockItem("red_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_CONCRETE)));
    public static final DeferredHolder<Block, Block> ORANGE_CONCRETE_SLAB = RegistryForge.registerBlockAndBlockItem("orange_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_CONCRETE)));
    public static final DeferredHolder<Block, Block> YELLOW_CONCRETE_SLAB = RegistryForge.registerBlockAndBlockItem("yellow_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_CONCRETE)));
    public static final DeferredHolder<Block, Block> LIME_CONCRETE_SLAB = RegistryForge.registerBlockAndBlockItem("lime_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_CONCRETE)));
    public static final DeferredHolder<Block, Block> GREEN_CONCRETE_SLAB = RegistryForge.registerBlockAndBlockItem("green_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_CONCRETE)));
    public static final DeferredHolder<Block, Block> CYAN_CONCRETE_SLAB = RegistryForge.registerBlockAndBlockItem("cyan_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_CONCRETE)));
    public static final DeferredHolder<Block, Block> LIGHT_BLUE_CONCRETE_SLAB = RegistryForge.registerBlockAndBlockItem("light_blue_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_CONCRETE)));
    public static final DeferredHolder<Block, Block> BLUE_CONCRETE_SLAB = RegistryForge.registerBlockAndBlockItem("blue_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_CONCRETE)));
    public static final DeferredHolder<Block, Block> PURPLE_CONCRETE_SLAB = RegistryForge.registerBlockAndBlockItem("purple_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_CONCRETE)));
    public static final DeferredHolder<Block, Block> MAGENTA_CONCRETE_SLAB = RegistryForge.registerBlockAndBlockItem("magenta_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_CONCRETE)));
    public static final DeferredHolder<Block, Block> PINK_CONCRETE_SLAB = RegistryForge.registerBlockAndBlockItem("pink_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_CONCRETE)));

    // GLASS
    public static final DeferredHolder<Block, Block> GLASS_SLAB = RegistryForge.registerBlockAndBlockItem("glass_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS)));
    public static final DeferredHolder<Block, Block> TINTED_GLASS_SLAB = RegistryForge.registerBlockAndBlockItem("tinted_glass_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TINTED_GLASS)));
    public static final DeferredHolder<Block, Block> WHITE_STAINED_GLASS_SLAB = RegistryForge.registerBlockAndBlockItem("white_stained_glass_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_STAINED_GLASS)));
    public static final DeferredHolder<Block, Block> LIGHT_GRAY_STAINED_GLASS_SLAB = RegistryForge.registerBlockAndBlockItem("light_gray_stained_glass_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_STAINED_GLASS)));
    public static final DeferredHolder<Block, Block> GRAY_STAINED_GLASS_SLAB = RegistryForge.registerBlockAndBlockItem("gray_stained_glass_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_STAINED_GLASS)));
    public static final DeferredHolder<Block, Block> BLACK_STAINED_GLASS_SLAB = RegistryForge.registerBlockAndBlockItem("black_stained_glass_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_STAINED_GLASS)));
    public static final DeferredHolder<Block, Block> BROWN_STAINED_GLASS_SLAB = RegistryForge.registerBlockAndBlockItem("brown_stained_glass_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_STAINED_GLASS)));
    public static final DeferredHolder<Block, Block> RED_STAINED_GLASS_SLAB = RegistryForge.registerBlockAndBlockItem("red_stained_glass_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_STAINED_GLASS)));
    public static final DeferredHolder<Block, Block> ORANGE_STAINED_GLASS_SLAB = RegistryForge.registerBlockAndBlockItem("orange_stained_glass_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_STAINED_GLASS)));
    public static final DeferredHolder<Block, Block> YELLOW_STAINED_GLASS_SLAB = RegistryForge.registerBlockAndBlockItem("yellow_stained_glass_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_STAINED_GLASS)));
    public static final DeferredHolder<Block, Block> LIME_STAINED_GLASS_SLAB = RegistryForge.registerBlockAndBlockItem("lime_stained_glass_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_STAINED_GLASS)));
    public static final DeferredHolder<Block, Block> GREEN_STAINED_GLASS_SLAB = RegistryForge.registerBlockAndBlockItem("green_stained_glass_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_STAINED_GLASS)));
    public static final DeferredHolder<Block, Block> CYAN_STAINED_GLASS_SLAB = RegistryForge.registerBlockAndBlockItem("cyan_stained_glass_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_STAINED_GLASS)));
    public static final DeferredHolder<Block, Block> LIGHT_BLUE_STAINED_GLASS_SLAB = RegistryForge.registerBlockAndBlockItem("light_blue_stained_glass_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_STAINED_GLASS)));
    public static final DeferredHolder<Block, Block> BLUE_STAINED_GLASS_SLAB = RegistryForge.registerBlockAndBlockItem("blue_stained_glass_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_STAINED_GLASS)));
    public static final DeferredHolder<Block, Block> PURPLE_STAINED_GLASS_SLAB = RegistryForge.registerBlockAndBlockItem("purple_stained_glass_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_STAINED_GLASS)));
    public static final DeferredHolder<Block, Block> MAGENTA_STAINED_GLASS_SLAB = RegistryForge.registerBlockAndBlockItem("magenta_stained_glass_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_STAINED_GLASS)));
    public static final DeferredHolder<Block, Block> PINK_STAINED_GLASS_SLAB = RegistryForge.registerBlockAndBlockItem("pink_stained_glass_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_STAINED_GLASS)));

    // PROBLEMATIC
    public static final DeferredHolder<Block, Block> REDSTONE_LAMP_SLAB = RegistryForge.registerBlockAndBlockItem("redstone_lamp_slab", () -> new RedstoneLampSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_LAMP)));
    public static final DeferredHolder<Block, Block> REDSTONE_ORE_SLAB = RegistryForge.registerBlockAndBlockItem("redstone_ore_slab", () -> new RedstoneOreSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_ORE)));
    public static final DeferredHolder<Block, Block> DEEPSLATE_REDSTONE_ORE_SLAB = RegistryForge.registerBlockAndBlockItem("deepslate_redstone_ore_slab", () -> new RedstoneOreSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_REDSTONE_ORE)));

    public static final DeferredHolder<Block, Block> TNT_SLAB = RegistryForge.registerBlockAndBlockItem("tnt_slab", () -> new TNTSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TNT)));

    public static final DeferredHolder<Block, Block> DIRT_SLAB = RegistryForge.registerBlockAndBlockItem("dirt_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT)));
    public static final DeferredHolder<Block, Block> GRASS_BLOCK_SLAB = RegistryForge.registerBlockAndBlockItem("grass_block_slab", () -> new GrassSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRASS_BLOCK)));

    // FUNCTIONAL
    public static final DeferredHolder<Block, Block> SEA_LANTERN_SLAB = RegistryForge.registerBlockAndBlockItem("sea_lantern_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SEA_LANTERN)));
    public static final DeferredHolder<Block, Block> GLOWSTONE_SLAB = RegistryForge.registerBlockAndBlockItem("glowstone_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE)));
    public static final DeferredHolder<Block, Block> SHROOMLIGHT_SLAB = RegistryForge.registerBlockAndBlockItem("shroomlight_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SHROOMLIGHT)));
    public static final DeferredHolder<Block, Block> OCHRE_FROGLIGHT_SLAB = RegistryForge.registerBlockAndBlockItem("ochre_froglight_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OCHRE_FROGLIGHT)));
    public static final DeferredHolder<Block, Block> VERDANT_FROGLIGHT_SLAB = RegistryForge.registerBlockAndBlockItem("verdant_froglight_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.VERDANT_FROGLIGHT)));
    public static final DeferredHolder<Block, Block> PEARLESCENT_FROGLIGHT_SLAB = RegistryForge.registerBlockAndBlockItem("pearlescent_froglight_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PEARLESCENT_FROGLIGHT)));
    public static final DeferredHolder<Block, Block> CRYING_OBSIDIAN_SLAB = RegistryForge.registerBlockAndBlockItem("crying_obsidian_slab", () -> new CryingObsidianSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRYING_OBSIDIAN)));
    public static final DeferredHolder<Block, Block> MAGMA_BLOCK_SLAB = RegistryForge.registerBlockAndBlockItem("magma_block_slab", () -> new MagmaSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MAGMA_BLOCK)));
    public static final DeferredHolder<Block, Block> LADDER_SLAB = RegistryForge.registerBlockAndBlockItem("ladder_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LADDER)));
    public static final DeferredHolder<Block, Block> SCAFFOLDING_SLAB = RegistryForge.registerBlockAndBlockItem("scaffolding_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SCAFFOLDING)));
    public static final DeferredHolder<Block, Block> BOOKSHELF_SLAB = RegistryForge.registerBlockAndBlockItem("bookshelf_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BOOKSHELF)));

    public static final DeferredHolder<Block, Block> INFESTED_STONE_SLAB = RegistryForge.registerBlockAndBlockItem("infested_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.INFESTED_STONE)));
    public static final DeferredHolder<Block, Block> INFESTED_COBBLESTONE_SLAB = RegistryForge.registerBlockAndBlockItem("infested_cobblestone_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.INFESTED_COBBLESTONE)));
    public static final DeferredHolder<Block, Block> INFESTED_STONE_BRICKS_SLAB = RegistryForge.registerBlockAndBlockItem("infested_stone_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.INFESTED_STONE_BRICKS)));
    public static final DeferredHolder<Block, Block> INFESTED_MOSSY_STONE_BRICKS_SLAB = RegistryForge.registerBlockAndBlockItem("infested_mossy_stone_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.INFESTED_MOSSY_STONE_BRICKS)));
    public static final DeferredHolder<Block, Block> INFESTED_CRACKED_STONE_BRICKS_SLAB = RegistryForge.registerBlockAndBlockItem("infested_cracked_stone_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.INFESTED_CRACKED_STONE_BRICKS)));
    public static final DeferredHolder<Block, Block> INFESTED_CHISELED_STONE_BRICKS_SLAB = RegistryForge.registerBlockAndBlockItem("infested_chiseled_stone_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.INFESTED_CHISELED_STONE_BRICKS)));
    public static final DeferredHolder<Block, Block> INFESTED_DEEPSLATE_SLAB = RegistryForge.registerBlockAndBlockItem("infested_deepslate_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.INFESTED_DEEPSLATE)));

    // NATURAL
    public static final DeferredHolder<Block, Block> MUD_SLAB = RegistryForge.registerBlockAndBlockItem("mud_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MUD)));
    public static final DeferredHolder<Block, Block> CLAY_SLAB = RegistryForge.registerBlockAndBlockItem("clay_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CLAY)));

    public static final DeferredHolder<Block, Block> ICE_SLAB = RegistryForge.registerBlockAndBlockItem("ice_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ICE)));
    public static final DeferredHolder<Block, Block> PACKED_ICE_SLAB = RegistryForge.registerBlockAndBlockItem("packed_ice_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_ICE)));
    public static final DeferredHolder<Block, Block> BLUE_ICE_SLAB = RegistryForge.registerBlockAndBlockItem("blue_ice_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_ICE)));
    public static final DeferredHolder<Block, Block> SNOW_BLOCK_SLAB = RegistryForge.registerBlockAndBlockItem("snow_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SNOW_BLOCK)));
    public static final DeferredHolder<Block, Block> MOSS_BLOCK_SLAB = RegistryForge.registerBlockAndBlockItem("moss_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MOSS_BLOCK)));

    public static final DeferredHolder<Block, Block> DEEPSLATE_SLAB = RegistryForge.registerBlockAndBlockItem("deepslate_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE)));
    public static final DeferredHolder<Block, Block> CALCITE_SLAB = RegistryForge.registerBlockAndBlockItem("calcite_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE)));
    public static final DeferredHolder<Block, Block> TUFF_SLAB = RegistryForge.registerBlockAndBlockItem("tuff_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TUFF)));
    public static final DeferredHolder<Block, Block> DRIPSTONE_BLOCK_SLAB = RegistryForge.registerBlockAndBlockItem("dripstone_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DRIPSTONE_BLOCK)));
    public static final DeferredHolder<Block, Block> OBSIDIAN_SLAB = RegistryForge.registerBlockAndBlockItem("obsidian_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OBSIDIAN)));
    public static final DeferredHolder<Block, Block> NETHERRACK_SLAB = RegistryForge.registerBlockAndBlockItem("netherrack_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHERRACK)));
    public static final DeferredHolder<Block, Block> CRIMSON_NYLIUM_SLAB = RegistryForge.registerBlockAndBlockItem("crimson_nylium_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_NYLIUM)));
    public static final DeferredHolder<Block, Block> WARPED_NYLIUM_SLAB = RegistryForge.registerBlockAndBlockItem("warped_nylium_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_NYLIUM)));

    public static final DeferredHolder<Block, Block> SOUL_SAND_SLAB = RegistryForge.registerBlockAndBlockItem("soul_sand_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_SAND)));
    public static final DeferredHolder<Block, Block> SOUL_SOIL_SLAB = RegistryForge.registerBlockAndBlockItem("soul_soil_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_SOIL)));
    public static final DeferredHolder<Block, Block> BONE_BLOCK_SLAB = RegistryForge.registerBlockAndBlockItem("bone_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BONE_BLOCK)));
    public static final DeferredHolder<Block, Block> BASALT_SLAB = RegistryForge.registerBlockAndBlockItem("basalt_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BASALT)));
    public static final DeferredHolder<Block, Block> SMOOTH_BASALT_SLAB = RegistryForge.registerBlockAndBlockItem("smooth_basalt_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_BASALT)));
    public static final DeferredHolder<Block, Block> POLISHED_BASALT_SLAB = RegistryForge.registerBlockAndBlockItem("polished_basalt_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BASALT)));
    public static final DeferredHolder<Block, Block> END_STONE_SLAB = RegistryForge.registerBlockAndBlockItem("end_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)));

    public static final DeferredHolder<Block, Block> COAL_ORE_SLAB = RegistryForge.registerBlockAndBlockItem("coal_ore_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COAL_ORE)));
    public static final DeferredHolder<Block, Block> DEEPSLATE_COAL_ORE_SLAB = RegistryForge.registerBlockAndBlockItem("deepslate_coal_ore_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_COAL_ORE)));
    public static final DeferredHolder<Block, Block> IRON_ORE_SLAB = RegistryForge.registerBlockAndBlockItem("iron_ore_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)));
    public static final DeferredHolder<Block, Block> DEEPSLATE_IRON_ORE_SLAB = RegistryForge.registerBlockAndBlockItem("deepslate_iron_ore_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE)));
    public static final DeferredHolder<Block, Block> COPPER_ORE_SLAB = RegistryForge.registerBlockAndBlockItem("copper_ore_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_ORE)));
    public static final DeferredHolder<Block, Block> DEEPSLATE_COPPER_ORE_SLAB = RegistryForge.registerBlockAndBlockItem("deepslate_copper_ore_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_COPPER_ORE)));
    public static final DeferredHolder<Block, Block> GOLD_ORE_SLAB = RegistryForge.registerBlockAndBlockItem("gold_ore_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GOLD_ORE)));
    public static final DeferredHolder<Block, Block> DEEPSLATE_GOLD_ORE_SLAB = RegistryForge.registerBlockAndBlockItem("deepslate_gold_ore_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_GOLD_ORE)));
    public static final DeferredHolder<Block, Block> EMERALD_ORE_SLAB = RegistryForge.registerBlockAndBlockItem("emerald_ore_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.EMERALD_ORE)));
    public static final DeferredHolder<Block, Block> DEEPSLATE_EMERALD_ORE_SLAB = RegistryForge.registerBlockAndBlockItem("deepslate_emerald_ore_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_EMERALD_ORE)));
    public static final DeferredHolder<Block, Block> LAPIS_ORE_SLAB = RegistryForge.registerBlockAndBlockItem("lapis_ore_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LAPIS_ORE)));
    public static final DeferredHolder<Block, Block> DEEPSLATE_LAPIS_ORE_SLAB = RegistryForge.registerBlockAndBlockItem("deepslate_lapis_ore_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_LAPIS_ORE)));
    public static final DeferredHolder<Block, Block> DIAMOND_ORE_SLAB = RegistryForge.registerBlockAndBlockItem("diamond_ore_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIAMOND_ORE)));
    public static final DeferredHolder<Block, Block> DEEPSLATE_DIAMOND_ORE_SLAB = RegistryForge.registerBlockAndBlockItem("deepslate_diamond_ore_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_DIAMOND_ORE)));
    public static final DeferredHolder<Block, Block> NETHER_GOLD_ORE_SLAB = RegistryForge.registerBlockAndBlockItem("nether_gold_ore_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_GOLD_ORE)));
    public static final DeferredHolder<Block, Block> NETHER_QUARTZ_ORE_SLAB = RegistryForge.registerBlockAndBlockItem("nether_quartz_ore_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_QUARTZ_ORE)));

    public static final DeferredHolder<Block, Block> ANCIENT_DEBRIS_SLAB = RegistryForge.registerBlockAndBlockItem("ancient_debris_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ANCIENT_DEBRIS)));
    public static final DeferredHolder<Block, Block> RAW_IRON_BLOCK_SLAB = RegistryForge.registerBlockAndBlockItem("raw_iron_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RAW_IRON_BLOCK)));
    public static final DeferredHolder<Block, Block> RAW_COPPER_BLOCK_SLAB = RegistryForge.registerBlockAndBlockItem("raw_copper_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RAW_COPPER_BLOCK)));
    public static final DeferredHolder<Block, Block> RAW_GOLD_BLOCK_SLAB = RegistryForge.registerBlockAndBlockItem("raw_gold_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RAW_GOLD_BLOCK)));
    public static final DeferredHolder<Block, Block> AMETHYST_BLOCK_SLAB = RegistryForge.registerBlockAndBlockItem("amethyst_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_BLOCK)));
    public static final DeferredHolder<Block, Block> BUDDING_AMETHYST_SLAB = RegistryForge.registerBlockAndBlockItem("budding_amethyst_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BUDDING_AMETHYST)));

    public static final DeferredHolder<Block, Block> BROWN_MUSHROOM_BLOCK_SLAB = RegistryForge.registerBlockAndBlockItem("brown_mushroom_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_MUSHROOM_BLOCK)));
    public static final DeferredHolder<Block, Block> RED_MUSHROOM_BLOCK_SLAB = RegistryForge.registerBlockAndBlockItem("red_mushroom_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_MUSHROOM_BLOCK)));
    public static final DeferredHolder<Block, Block> NETHER_WART_BLOCK_SLAB = RegistryForge.registerBlockAndBlockItem("nether_wart_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_WART_BLOCK)));
    public static final DeferredHolder<Block, Block> WARPED_WART_BLOCK_SLAB = RegistryForge.registerBlockAndBlockItem("warped_wart_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_WART_BLOCK)));

    public static final DeferredHolder<Block, Block> DRIED_KELP_BLOCK_SLAB = RegistryForge.registerBlockAndBlockItem("dried_kelp_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DRIED_KELP_BLOCK)));
    public static final DeferredHolder<Block, Block> TUBE_CORAL_BLOCK_SLAB = RegistryForge.registerBlockAndBlockItem("tube_coral_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TUBE_CORAL_BLOCK)));
    public static final DeferredHolder<Block, Block> BRAIN_CORAL_BLOCK_SLAB = RegistryForge.registerBlockAndBlockItem("brain_coral_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRAIN_CORAL_BLOCK)));
    public static final DeferredHolder<Block, Block> BUBBLE_CORAL_BLOCK_SLAB = RegistryForge.registerBlockAndBlockItem("bubble_coral_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BUBBLE_CORAL_BLOCK)));
    public static final DeferredHolder<Block, Block> FIRE_CORAL_BLOCK_SLAB = RegistryForge.registerBlockAndBlockItem("fire_coral_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.FIRE_CORAL_BLOCK)));
    public static final DeferredHolder<Block, Block> HORN_CORAL_BLOCK_SLAB = RegistryForge.registerBlockAndBlockItem("horn_coral_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.HORN_CORAL_BLOCK)));
    public static final DeferredHolder<Block, Block> DEAD_TUBE_CORAL_BLOCK_SLAB = RegistryForge.registerBlockAndBlockItem("dead_tube_coral_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEAD_TUBE_CORAL_BLOCK)));
    public static final DeferredHolder<Block, Block> DEAD_BRAIN_CORAL_BLOCK_SLAB = RegistryForge.registerBlockAndBlockItem("dead_brain_coral_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEAD_BRAIN_CORAL_BLOCK)));
    public static final DeferredHolder<Block, Block> DEAD_BUBBLE_CORAL_BLOCK_SLAB = RegistryForge.registerBlockAndBlockItem("dead_bubble_coral_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEAD_BUBBLE_CORAL_BLOCK)));
    public static final DeferredHolder<Block, Block> DEAD_FIRE_CORAL_BLOCK_SLAB = RegistryForge.registerBlockAndBlockItem("dead_fire_coral_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEAD_FIRE_CORAL_BLOCK)));
    public static final DeferredHolder<Block, Block> DEAD_HORN_CORAL_BLOCK_SLAB = RegistryForge.registerBlockAndBlockItem("dead_horn_coral_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEAD_HORN_CORAL_BLOCK)));

    public static final DeferredHolder<Block, Block> SPONGE_SLAB = RegistryForge.registerBlockAndBlockItem("sponge_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPONGE)));
    public static final DeferredHolder<Block, Block> WET_SPONGE_SLAB = RegistryForge.registerBlockAndBlockItem("wet_sponge_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WET_SPONGE)));

    public static final DeferredHolder<Block, Block> MELON_SLAB = RegistryForge.registerBlockAndBlockItem("melon_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MELON)));
    public static final DeferredHolder<Block, Block> PUMPKIN_SLAB = RegistryForge.registerBlockAndBlockItem("pumpkin_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PUMPKIN)));

    public static final DeferredHolder<Block, Block> HAY_BLOCK_SLAB = RegistryForge.registerBlockAndBlockItem("hay_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.HAY_BLOCK)));
    public static final DeferredHolder<Block, Block> HONEYCOMB_BLOCK_SLAB = RegistryForge.registerBlockAndBlockItem("honeycomb_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.HONEYCOMB_BLOCK)));
    public static final DeferredHolder<Block, Block> SLIME_BLOCK_SLAB = RegistryForge.registerBlockAndBlockItem("slime_block_slab", () -> new SlimeSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SLIME_BLOCK)));
    public static final DeferredHolder<Block, Block> HONEY_BLOCK_SLAB = RegistryForge.registerBlockAndBlockItem("honey_block_slab", () -> new HoneySlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.HONEY_BLOCK)));

    public static final DeferredHolder<Block, Block> SCULK_SLAB = RegistryForge.registerBlockAndBlockItem("sculk_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SCULK)));
    public static final DeferredHolder<Block, Block> SCULK_CATALYST_SLAB = RegistryForge.registerBlockAndBlockItem("sculk_catalyst_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SCULK_CATALYST)));

    // BUILDING
    public static final DeferredHolder<Block, Block> CRACKED_STONE_BRICKS_SLAB = RegistryForge.registerBlockAndBlockItem("cracked_stone_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRACKED_STONE_BRICKS)));
    public static final DeferredHolder<Block, Block> CRACKED_DEEPSLATE_BRICKS_SLAB = RegistryForge.registerBlockAndBlockItem("cracked_deepslate_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRACKED_DEEPSLATE_BRICKS)));
    public static final DeferredHolder<Block, Block> CRACKED_DEEPSLATE_TILES_SLAB = RegistryForge.registerBlockAndBlockItem("cracked_deepslate_tiles_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRACKED_DEEPSLATE_TILES)));
    public static final DeferredHolder<Block, Block> CRACKED_NETHER_BRICKS_SLAB = RegistryForge.registerBlockAndBlockItem("cracked_nether_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRACKED_NETHER_BRICKS)));
    public static final DeferredHolder<Block, Block> CRACKED_POLISHED_BLACKSTONE_BRICKS_SLAB = RegistryForge.registerBlockAndBlockItem("cracked_polished_blackstone_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS)));

    public static final DeferredHolder<Block, Block> CHISELED_STONE_BRICKS_SLAB = RegistryForge.registerBlockAndBlockItem("chiseled_stone_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHISELED_STONE_BRICKS)));
    public static final DeferredHolder<Block, Block> CHISELED_DEEPSLATE_SLAB = RegistryForge.registerBlockAndBlockItem("chiseled_deepslate_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHISELED_DEEPSLATE)));
    public static final DeferredHolder<Block, Block> CHISELED_SANDSTONE_SLAB = RegistryForge.registerBlockAndBlockItem("chiseled_sandstone_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHISELED_SANDSTONE)));
    public static final DeferredHolder<Block, Block> CHISELED_RED_SANDSTONE_SLAB = RegistryForge.registerBlockAndBlockItem("chiseled_red_sandstone_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHISELED_RED_SANDSTONE)));
    public static final DeferredHolder<Block, Block> CHISELED_NETHER_BRICKS_SLAB = RegistryForge.registerBlockAndBlockItem("chiseled_nether_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHISELED_NETHER_BRICKS)));
    public static final DeferredHolder<Block, Block> CHISELED_POLISHED_BLACKSTONE_SLAB = RegistryForge.registerBlockAndBlockItem("chiseled_polished_blackstone_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHISELED_POLISHED_BLACKSTONE)));
    public static final DeferredHolder<Block, Block> CHISELED_QUARTZ_BLOCK_SLAB = RegistryForge.registerBlockAndBlockItem("chiseled_quartz_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHISELED_QUARTZ_BLOCK)));

    public static final DeferredHolder<Block, Block> PACKED_MUD_SLAB = RegistryForge.registerBlockAndBlockItem("packed_mud_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_MUD)));

    public static final DeferredHolder<Block, Block> GILDED_BLACKSTONE_SLAB = RegistryForge.registerBlockAndBlockItem("gilded_blackstone_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GILDED_BLACKSTONE)));

    public static final DeferredHolder<Block, Block> COAL_BLOCK_SLAB = RegistryForge.registerBlockAndBlockItem("coal_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COAL_BLOCK)));
    public static final DeferredHolder<Block, Block> IRON_BLOCK_SLAB = RegistryForge.registerBlockAndBlockItem("iron_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));
    public static final DeferredHolder<Block, Block> GOLD_BLOCK_SLAB = RegistryForge.registerBlockAndBlockItem("gold_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GOLD_BLOCK)));
    public static final DeferredHolder<Block, Block> REDSTONE_BLOCK_SLAB = RegistryForge.registerBlockAndBlockItem("redstone_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_BLOCK)));
    public static final DeferredHolder<Block, Block> EMERALD_BLOCK_SLAB = RegistryForge.registerBlockAndBlockItem("emerald_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.EMERALD_BLOCK)));
    public static final DeferredHolder<Block, Block> LAPIS_BLOCK_SLAB = RegistryForge.registerBlockAndBlockItem("lapis_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LAPIS_BLOCK)));
    public static final DeferredHolder<Block, Block> DIAMOND_BLOCK_SLAB = RegistryForge.registerBlockAndBlockItem("diamond_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIAMOND_BLOCK)));
    public static final DeferredHolder<Block, Block> NETHERITE_BLOCK_SLAB = RegistryForge.registerBlockAndBlockItem("netherite_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHERITE_BLOCK)));

    public static final DeferredHolder<Block, Block> COPPER_BLOCK_SLAB = RegistryForge.registerBlockAndBlockItem("copper_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_BLOCK)));
    public static final DeferredHolder<Block, Block> EXPOSED_COPPER_SLAB = RegistryForge.registerBlockAndBlockItem("exposed_copper_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.EXPOSED_COPPER)));
    public static final DeferredHolder<Block, Block> WEATHERED_COPPER_SLAB = RegistryForge.registerBlockAndBlockItem("weathered_copper_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WEATHERED_COPPER)));
    public static final DeferredHolder<Block, Block> OXIDIZED_COPPER_SLAB = RegistryForge.registerBlockAndBlockItem("oxidized_copper_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OXIDIZED_COPPER)));
    public static final DeferredHolder<Block, Block> WAXED_COPPER_BLOCK_SLAB = RegistryForge.registerBlockAndBlockItem("waxed_copper_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WAXED_COPPER_BLOCK)));
    public static final DeferredHolder<Block, Block> WAXED_EXPOSED_COPPER_SLAB = RegistryForge.registerBlockAndBlockItem("waxed_exposed_copper_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WAXED_EXPOSED_COPPER)));
    public static final DeferredHolder<Block, Block> WAXED_WEATHERED_COPPER_SLAB = RegistryForge.registerBlockAndBlockItem("waxed_weathered_copper_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WAXED_WEATHERED_COPPER)));
    public static final DeferredHolder<Block, Block> WAXED_OXIDIZED_COPPER_SLAB = RegistryForge.registerBlockAndBlockItem("waxed_oxidized_copper_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WAXED_OXIDIZED_COPPER)));
}
