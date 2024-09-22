package com.cursee.new_slab_variants.core.common.registry;

import com.cursee.new_slab_variants.core.common.block.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

@SuppressWarnings("unused")
public class ModBlocksFabric {

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
    public static final Block OAK_LOG_SLAB = RegistryFabric.registerBlockAndBlockItem("oak_log_slab", new RotatedSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));
    public static final Block OAK_WOOD_SLAB = RegistryFabric.registerBlockAndBlockItem("oak_wood_slab", new RotatedSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));
    public static final Block STRIPPED_OAK_LOG_SLAB = RegistryFabric.registerBlockAndBlockItem("stripped_oak_log_slab", new RotatedSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));
    public static final Block STRIPPED_OAK_WOOD_SLAB = RegistryFabric.registerBlockAndBlockItem("stripped_oak_wood_slab", new RotatedSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));

    public static final Block SPRUCE_LOG_SLAB = RegistryFabric.registerBlockAndBlockItem("spruce_log_slab", new RotatedSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_SLAB)));
    public static final Block SPRUCE_WOOD_SLAB = RegistryFabric.registerBlockAndBlockItem("spruce_wood_slab", new RotatedSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_SLAB)));
    public static final Block STRIPPED_SPRUCE_LOG_SLAB = RegistryFabric.registerBlockAndBlockItem("stripped_spruce_log_slab", new RotatedSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_SLAB)));
    public static final Block STRIPPED_SPRUCE_WOOD_SLAB = RegistryFabric.registerBlockAndBlockItem("stripped_spruce_wood_slab", new RotatedSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_SLAB)));

    public static final Block BIRCH_LOG_SLAB = RegistryFabric.registerBlockAndBlockItem("birch_log_slab", new RotatedSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_SLAB)));
    public static final Block BIRCH_WOOD_SLAB = RegistryFabric.registerBlockAndBlockItem("birch_wood_slab", new RotatedSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_SLAB)));
    public static final Block STRIPPED_BIRCH_LOG_SLAB = RegistryFabric.registerBlockAndBlockItem("stripped_birch_log_slab", new RotatedSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_SLAB)));
    public static final Block STRIPPED_BIRCH_WOOD_SLAB = RegistryFabric.registerBlockAndBlockItem("stripped_birch_wood_slab", new RotatedSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_SLAB)));

    public static final Block JUNGLE_LOG_SLAB = RegistryFabric.registerBlockAndBlockItem("jungle_log_slab", new RotatedSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_SLAB)));
    public static final Block JUNGLE_WOOD_SLAB = RegistryFabric.registerBlockAndBlockItem("jungle_wood_slab", new RotatedSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_SLAB)));
    public static final Block STRIPPED_JUNGLE_LOG_SLAB = RegistryFabric.registerBlockAndBlockItem("stripped_jungle_log_slab", new RotatedSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_SLAB)));
    public static final Block STRIPPED_JUNGLE_WOOD_SLAB = RegistryFabric.registerBlockAndBlockItem("stripped_jungle_wood_slab", new RotatedSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_SLAB)));

    public static final Block ACACIA_LOG_SLAB = RegistryFabric.registerBlockAndBlockItem("acacia_log_slab", new RotatedSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_SLAB)));
    public static final Block ACACIA_WOOD_SLAB = RegistryFabric.registerBlockAndBlockItem("acacia_wood_slab", new RotatedSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_SLAB)));
    public static final Block STRIPPED_ACACIA_LOG_SLAB = RegistryFabric.registerBlockAndBlockItem("stripped_acacia_log_slab", new RotatedSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_SLAB)));
    public static final Block STRIPPED_ACACIA_WOOD_SLAB = RegistryFabric.registerBlockAndBlockItem("stripped_acacia_wood_slab", new RotatedSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_SLAB)));

    public static final Block DARK_OAK_LOG_SLAB = RegistryFabric.registerBlockAndBlockItem("dark_oak_log_slab", new RotatedSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_SLAB)));
    public static final Block DARK_OAK_WOOD_SLAB = RegistryFabric.registerBlockAndBlockItem("dark_oak_wood_slab", new RotatedSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_SLAB)));
    public static final Block STRIPPED_DARK_OAK_LOG_SLAB = RegistryFabric.registerBlockAndBlockItem("stripped_dark_oak_log_slab", new RotatedSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_SLAB)));
    public static final Block STRIPPED_DARK_OAK_WOOD_SLAB = RegistryFabric.registerBlockAndBlockItem("stripped_dark_oak_wood_slab", new RotatedSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_SLAB)));

    public static final Block MANGROVE_LOG_SLAB = RegistryFabric.registerBlockAndBlockItem("mangrove_log_slab", new RotatedSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MANGROVE_SLAB)));
    public static final Block MANGROVE_WOOD_SLAB = RegistryFabric.registerBlockAndBlockItem("mangrove_wood_slab", new RotatedSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MANGROVE_SLAB)));
    public static final Block STRIPPED_MANGROVE_LOG_SLAB = RegistryFabric.registerBlockAndBlockItem("stripped_mangrove_log_slab", new RotatedSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MANGROVE_SLAB)));
    public static final Block STRIPPED_MANGROVE_WOOD_SLAB = RegistryFabric.registerBlockAndBlockItem("stripped_mangrove_wood_slab", new RotatedSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MANGROVE_SLAB)));

    public static final Block CHERRY_LOG_SLAB = RegistryFabric.registerBlockAndBlockItem("cherry_log_slab", new RotatedSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_SLAB)));
    public static final Block CHERRY_WOOD_SLAB = RegistryFabric.registerBlockAndBlockItem("cherry_wood_slab", new RotatedSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_SLAB)));
    public static final Block STRIPPED_CHERRY_LOG_SLAB = RegistryFabric.registerBlockAndBlockItem("stripped_cherry_log_slab", new RotatedSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_SLAB)));
    public static final Block STRIPPED_CHERRY_WOOD_SLAB = RegistryFabric.registerBlockAndBlockItem("stripped_cherry_wood_slab", new RotatedSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_SLAB)));

    public static final Block BAMBOO_BLOCK_SLAB = RegistryFabric.registerBlockAndBlockItem("bamboo_block_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BAMBOO_SLAB)));
    public static final Block STRIPPED_BAMBOO_BLOCK_SLAB = RegistryFabric.registerBlockAndBlockItem("stripped_bamboo_block_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BAMBOO_SLAB)));

    // LEAVES
    public static final Block OAK_LEAVES_SLAB = RegistryFabric.registerBlockAndBlockItem("oak_leaves_slab", new LeavesSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
    public static final Block SPRUCE_LEAVES_SLAB = RegistryFabric.registerBlockAndBlockItem("spruce_leaves_slab", new LeavesSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_LEAVES)));
    public static final Block BIRCH_LEAVES_SLAB = RegistryFabric.registerBlockAndBlockItem("birch_leaves_slab", new LeavesSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_LEAVES)));
    public static final Block JUNGLE_LEAVES_SLAB = RegistryFabric.registerBlockAndBlockItem("jungle_leaves_slab", new LeavesSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_LEAVES)));
    public static final Block ACACIA_LEAVES_SLAB = RegistryFabric.registerBlockAndBlockItem("acacia_leaves_slab", new LeavesSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_LEAVES)));
    public static final Block DARK_OAK_LEAVES_SLAB = RegistryFabric.registerBlockAndBlockItem("dark_oak_leaves_slab", new LeavesSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_LEAVES)));
    public static final Block MANGROVE_LEAVES_SLAB = RegistryFabric.registerBlockAndBlockItem("mangrove_leaves_slab", new LeavesSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MANGROVE_LEAVES)));
    public static final Block CHERRY_LEAVES_SLAB = RegistryFabric.registerBlockAndBlockItem("cherry_leaves_slab", new LeavesSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_LEAVES)));
    public static final Block AZALEA_LEAVES_SLAB = RegistryFabric.registerBlockAndBlockItem("azalea_leaves_slab", new LeavesSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.AZALEA_LEAVES)));
    public static final Block FLOWERING_AZALEA_LEAVES_SLAB = RegistryFabric.registerBlockAndBlockItem("flowering_azalea_leaves_slab", new LeavesSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.FLOWERING_AZALEA_LEAVES)));

    // WOOL
    public static final Block WHITE_WOOL_SLAB = RegistryFabric.registerBlockAndBlockItem("white_wool_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_WOOL)));
    public static final Block LIGHT_GRAY_WOOL_SLAB = RegistryFabric.registerBlockAndBlockItem("light_gray_wool_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_WOOL)));
    public static final Block GRAY_WOOL_SLAB = RegistryFabric.registerBlockAndBlockItem("gray_wool_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_WOOL)));
    public static final Block BLACK_WOOL_SLAB = RegistryFabric.registerBlockAndBlockItem("black_wool_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_WOOL)));
    public static final Block BROWN_WOOL_SLAB = RegistryFabric.registerBlockAndBlockItem("brown_wool_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_WOOL)));
    public static final Block RED_WOOL_SLAB = RegistryFabric.registerBlockAndBlockItem("red_wool_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_WOOL)));
    public static final Block ORANGE_WOOL_SLAB = RegistryFabric.registerBlockAndBlockItem("orange_wool_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_WOOL)));
    public static final Block YELLOW_WOOL_SLAB = RegistryFabric.registerBlockAndBlockItem("yellow_wool_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_WOOL)));
    public static final Block LIME_WOOL_SLAB = RegistryFabric.registerBlockAndBlockItem("lime_wool_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_WOOL)));
    public static final Block GREEN_WOOL_SLAB = RegistryFabric.registerBlockAndBlockItem("green_wool_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_WOOL)));
    public static final Block CYAN_WOOL_SLAB = RegistryFabric.registerBlockAndBlockItem("cyan_wool_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_WOOL)));
    public static final Block LIGHT_BLUE_WOOL_SLAB = RegistryFabric.registerBlockAndBlockItem("light_blue_wool_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_WOOL)));
    public static final Block BLUE_WOOL_SLAB = RegistryFabric.registerBlockAndBlockItem("blue_wool_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_WOOL)));
    public static final Block PURPLE_WOOL_SLAB = RegistryFabric.registerBlockAndBlockItem("purple_wool_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_WOOL)));
    public static final Block MAGENTA_WOOL_SLAB = RegistryFabric.registerBlockAndBlockItem("magenta_wool_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_WOOL)));
    public static final Block PINK_WOOL_SLAB = RegistryFabric.registerBlockAndBlockItem("pink_wool_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_WOOL)));

    // TERRACOTTA
    public static final Block TERRACOTTA_SLAB = RegistryFabric.registerBlockAndBlockItem("terracotta_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)));
    public static final Block WHITE_TERRACOTTA_SLAB = RegistryFabric.registerBlockAndBlockItem("white_terracotta_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_TERRACOTTA)));
    public static final Block LIGHT_GRAY_TERRACOTTA_SLAB = RegistryFabric.registerBlockAndBlockItem("light_gray_terracotta_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_TERRACOTTA)));
    public static final Block GRAY_TERRACOTTA_SLAB = RegistryFabric.registerBlockAndBlockItem("gray_terracotta_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_TERRACOTTA)));
    public static final Block BLACK_TERRACOTTA_SLAB = RegistryFabric.registerBlockAndBlockItem("black_terracotta_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_TERRACOTTA)));
    public static final Block BROWN_TERRACOTTA_SLAB = RegistryFabric.registerBlockAndBlockItem("brown_terracotta_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_TERRACOTTA)));
    public static final Block RED_TERRACOTTA_SLAB = RegistryFabric.registerBlockAndBlockItem("red_terracotta_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_TERRACOTTA)));
    public static final Block ORANGE_TERRACOTTA_SLAB = RegistryFabric.registerBlockAndBlockItem("orange_terracotta_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_TERRACOTTA)));
    public static final Block YELLOW_TERRACOTTA_SLAB = RegistryFabric.registerBlockAndBlockItem("yellow_terracotta_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_TERRACOTTA)));
    public static final Block LIME_TERRACOTTA_SLAB = RegistryFabric.registerBlockAndBlockItem("lime_terracotta_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_TERRACOTTA)));
    public static final Block GREEN_TERRACOTTA_SLAB = RegistryFabric.registerBlockAndBlockItem("green_terracotta_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_TERRACOTTA)));
    public static final Block CYAN_TERRACOTTA_SLAB = RegistryFabric.registerBlockAndBlockItem("cyan_terracotta_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_TERRACOTTA)));
    public static final Block LIGHT_BLUE_TERRACOTTA_SLAB = RegistryFabric.registerBlockAndBlockItem("light_blue_terracotta_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_TERRACOTTA)));
    public static final Block BLUE_TERRACOTTA_SLAB = RegistryFabric.registerBlockAndBlockItem("blue_terracotta_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_TERRACOTTA)));
    public static final Block PURPLE_TERRACOTTA_SLAB = RegistryFabric.registerBlockAndBlockItem("purple_terracotta_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_TERRACOTTA)));
    public static final Block MAGENTA_TERRACOTTA_SLAB = RegistryFabric.registerBlockAndBlockItem("magenta_terracotta_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_TERRACOTTA)));
    public static final Block PINK_TERRACOTTA_SLAB = RegistryFabric.registerBlockAndBlockItem("pink_terracotta_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_TERRACOTTA)));

    // GLAZED TERRACOTTA
    public static final Block WHITE_GLAZED_TERRACOTTA_SLAB = RegistryFabric.registerBlockAndBlockItem("white_glazed_terracotta_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_GLAZED_TERRACOTTA)));
    public static final Block LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB = RegistryFabric.registerBlockAndBlockItem("light_gray_glazed_terracotta_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA)));
    public static final Block GRAY_GLAZED_TERRACOTTA_SLAB = RegistryFabric.registerBlockAndBlockItem("gray_glazed_terracotta_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_GLAZED_TERRACOTTA)));
    public static final Block BLACK_GLAZED_TERRACOTTA_SLAB = RegistryFabric.registerBlockAndBlockItem("black_glazed_terracotta_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_GLAZED_TERRACOTTA)));
    public static final Block BROWN_GLAZED_TERRACOTTA_SLAB = RegistryFabric.registerBlockAndBlockItem("brown_glazed_terracotta_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_GLAZED_TERRACOTTA)));
    public static final Block RED_GLAZED_TERRACOTTA_SLAB = RegistryFabric.registerBlockAndBlockItem("red_glazed_terracotta_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_GLAZED_TERRACOTTA)));
    public static final Block ORANGE_GLAZED_TERRACOTTA_SLAB = RegistryFabric.registerBlockAndBlockItem("orange_glazed_terracotta_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_GLAZED_TERRACOTTA)));
    public static final Block YELLOW_GLAZED_TERRACOTTA_SLAB = RegistryFabric.registerBlockAndBlockItem("yellow_glazed_terracotta_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_GLAZED_TERRACOTTA)));
    public static final Block LIME_GLAZED_TERRACOTTA_SLAB = RegistryFabric.registerBlockAndBlockItem("lime_glazed_terracotta_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_GLAZED_TERRACOTTA)));
    public static final Block GREEN_GLAZED_TERRACOTTA_SLAB = RegistryFabric.registerBlockAndBlockItem("green_glazed_terracotta_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_GLAZED_TERRACOTTA)));
    public static final Block CYAN_GLAZED_TERRACOTTA_SLAB = RegistryFabric.registerBlockAndBlockItem("cyan_glazed_terracotta_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_GLAZED_TERRACOTTA)));
    public static final Block LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB = RegistryFabric.registerBlockAndBlockItem("light_blue_glazed_terracotta_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA)));
    public static final Block BLUE_GLAZED_TERRACOTTA_SLAB = RegistryFabric.registerBlockAndBlockItem("blue_glazed_terracotta_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_GLAZED_TERRACOTTA)));
    public static final Block PURPLE_GLAZED_TERRACOTTA_SLAB = RegistryFabric.registerBlockAndBlockItem("purple_glazed_terracotta_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_GLAZED_TERRACOTTA)));
    public static final Block MAGENTA_GLAZED_TERRACOTTA_SLAB = RegistryFabric.registerBlockAndBlockItem("magenta_glazed_terracotta_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_GLAZED_TERRACOTTA)));
    public static final Block PINK_GLAZED_TERRACOTTA_SLAB = RegistryFabric.registerBlockAndBlockItem("pink_glazed_terracotta_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_GLAZED_TERRACOTTA)));

    // CONCRETE
    public static final Block WHITE_CONCRETE_SLAB = RegistryFabric.registerBlockAndBlockItem("white_concrete_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_CONCRETE)));
    public static final Block LIGHT_GRAY_CONCRETE_SLAB = RegistryFabric.registerBlockAndBlockItem("light_gray_concrete_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_CONCRETE)));
    public static final Block GRAY_CONCRETE_SLAB = RegistryFabric.registerBlockAndBlockItem("gray_concrete_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_CONCRETE)));
    public static final Block BLACK_CONCRETE_SLAB = RegistryFabric.registerBlockAndBlockItem("black_concrete_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_CONCRETE)));
    public static final Block BROWN_CONCRETE_SLAB = RegistryFabric.registerBlockAndBlockItem("brown_concrete_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_CONCRETE)));
    public static final Block RED_CONCRETE_SLAB = RegistryFabric.registerBlockAndBlockItem("red_concrete_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_CONCRETE)));
    public static final Block ORANGE_CONCRETE_SLAB = RegistryFabric.registerBlockAndBlockItem("orange_concrete_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_CONCRETE)));
    public static final Block YELLOW_CONCRETE_SLAB = RegistryFabric.registerBlockAndBlockItem("yellow_concrete_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_CONCRETE)));
    public static final Block LIME_CONCRETE_SLAB = RegistryFabric.registerBlockAndBlockItem("lime_concrete_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_CONCRETE)));
    public static final Block GREEN_CONCRETE_SLAB = RegistryFabric.registerBlockAndBlockItem("green_concrete_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_CONCRETE)));
    public static final Block CYAN_CONCRETE_SLAB = RegistryFabric.registerBlockAndBlockItem("cyan_concrete_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_CONCRETE)));
    public static final Block LIGHT_BLUE_CONCRETE_SLAB = RegistryFabric.registerBlockAndBlockItem("light_blue_concrete_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_CONCRETE)));
    public static final Block BLUE_CONCRETE_SLAB = RegistryFabric.registerBlockAndBlockItem("blue_concrete_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_CONCRETE)));
    public static final Block PURPLE_CONCRETE_SLAB = RegistryFabric.registerBlockAndBlockItem("purple_concrete_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_CONCRETE)));
    public static final Block MAGENTA_CONCRETE_SLAB = RegistryFabric.registerBlockAndBlockItem("magenta_concrete_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_CONCRETE)));
    public static final Block PINK_CONCRETE_SLAB = RegistryFabric.registerBlockAndBlockItem("pink_concrete_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_CONCRETE)));

    // GLASS
    public static final Block GLASS_SLAB = RegistryFabric.registerBlockAndBlockItem("glass_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS)));
    public static final Block TINTED_GLASS_SLAB = RegistryFabric.registerBlockAndBlockItem("tinted_glass_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TINTED_GLASS)));
    public static final Block WHITE_STAINED_GLASS_SLAB = RegistryFabric.registerBlockAndBlockItem("white_stained_glass_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_STAINED_GLASS)));
    public static final Block LIGHT_GRAY_STAINED_GLASS_SLAB = RegistryFabric.registerBlockAndBlockItem("light_gray_stained_glass_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_STAINED_GLASS)));
    public static final Block GRAY_STAINED_GLASS_SLAB = RegistryFabric.registerBlockAndBlockItem("gray_stained_glass_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_STAINED_GLASS)));
    public static final Block BLACK_STAINED_GLASS_SLAB = RegistryFabric.registerBlockAndBlockItem("black_stained_glass_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_STAINED_GLASS)));
    public static final Block BROWN_STAINED_GLASS_SLAB = RegistryFabric.registerBlockAndBlockItem("brown_stained_glass_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_STAINED_GLASS)));
    public static final Block RED_STAINED_GLASS_SLAB = RegistryFabric.registerBlockAndBlockItem("red_stained_glass_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_STAINED_GLASS)));
    public static final Block ORANGE_STAINED_GLASS_SLAB = RegistryFabric.registerBlockAndBlockItem("orange_stained_glass_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_STAINED_GLASS)));
    public static final Block YELLOW_STAINED_GLASS_SLAB = RegistryFabric.registerBlockAndBlockItem("yellow_stained_glass_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_STAINED_GLASS)));
    public static final Block LIME_STAINED_GLASS_SLAB = RegistryFabric.registerBlockAndBlockItem("lime_stained_glass_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_STAINED_GLASS)));
    public static final Block GREEN_STAINED_GLASS_SLAB = RegistryFabric.registerBlockAndBlockItem("green_stained_glass_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_STAINED_GLASS)));
    public static final Block CYAN_STAINED_GLASS_SLAB = RegistryFabric.registerBlockAndBlockItem("cyan_stained_glass_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_STAINED_GLASS)));
    public static final Block LIGHT_BLUE_STAINED_GLASS_SLAB = RegistryFabric.registerBlockAndBlockItem("light_blue_stained_glass_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_STAINED_GLASS)));
    public static final Block BLUE_STAINED_GLASS_SLAB = RegistryFabric.registerBlockAndBlockItem("blue_stained_glass_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_STAINED_GLASS)));
    public static final Block PURPLE_STAINED_GLASS_SLAB = RegistryFabric.registerBlockAndBlockItem("purple_stained_glass_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_STAINED_GLASS)));
    public static final Block MAGENTA_STAINED_GLASS_SLAB = RegistryFabric.registerBlockAndBlockItem("magenta_stained_glass_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_STAINED_GLASS)));
    public static final Block PINK_STAINED_GLASS_SLAB = RegistryFabric.registerBlockAndBlockItem("pink_stained_glass_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_STAINED_GLASS)));

    // PROBLEMATIC
    public static final Block REDSTONE_LAMP_SLAB = RegistryFabric.registerBlockAndBlockItem("redstone_lamp_slab", new RedstoneLampSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_LAMP)));
    public static final Block REDSTONE_ORE_SLAB = RegistryFabric.registerBlockAndBlockItem("redstone_ore_slab", new RedstoneOreSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_ORE)));
    public static final Block DEEPSLATE_REDSTONE_ORE_SLAB = RegistryFabric.registerBlockAndBlockItem("deepslate_redstone_ore_slab", new RedstoneOreSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_REDSTONE_ORE)));

    public static final Block TNT_SLAB = RegistryFabric.registerBlockAndBlockItem("tnt_slab", new TNTSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TNT)));

    public static final Block DIRT_SLAB = RegistryFabric.registerBlockAndBlockItem("dirt_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT)));
    public static final Block GRASS_BLOCK_SLAB = RegistryFabric.registerBlockAndBlockItem("grass_block_slab", new GrassSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRASS_BLOCK)));

    // FUNCTIONAL
    public static final Block SEA_LANTERN_SLAB = RegistryFabric.registerBlockAndBlockItem("sea_lantern_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SEA_LANTERN)));
    public static final Block GLOWSTONE_SLAB = RegistryFabric.registerBlockAndBlockItem("glowstone_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE)));
    public static final Block SHROOMLIGHT_SLAB = RegistryFabric.registerBlockAndBlockItem("shroomlight_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SHROOMLIGHT)));
    public static final Block OCHRE_FROGLIGHT_SLAB = RegistryFabric.registerBlockAndBlockItem("ochre_froglight_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OCHRE_FROGLIGHT)));
    public static final Block VERDANT_FROGLIGHT_SLAB = RegistryFabric.registerBlockAndBlockItem("verdant_froglight_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.VERDANT_FROGLIGHT)));
    public static final Block PEARLESCENT_FROGLIGHT_SLAB = RegistryFabric.registerBlockAndBlockItem("pearlescent_froglight_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PEARLESCENT_FROGLIGHT)));
    public static final Block CRYING_OBSIDIAN_SLAB = RegistryFabric.registerBlockAndBlockItem("crying_obsidian_slab", new CryingObsidianSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRYING_OBSIDIAN)));
    public static final Block MAGMA_BLOCK_SLAB = RegistryFabric.registerBlockAndBlockItem("magma_block_slab", new MagmaSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MAGMA_BLOCK)));
    public static final Block LADDER_SLAB = RegistryFabric.registerBlockAndBlockItem("ladder_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LADDER)));
    public static final Block SCAFFOLDING_SLAB = RegistryFabric.registerBlockAndBlockItem("scaffolding_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SCAFFOLDING)));
    public static final Block BOOKSHELF_SLAB = RegistryFabric.registerBlockAndBlockItem("bookshelf_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BOOKSHELF)));

    public static final Block INFESTED_STONE_SLAB = RegistryFabric.registerBlockAndBlockItem("infested_stone_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.INFESTED_STONE)));
    public static final Block INFESTED_COBBLESTONE_SLAB = RegistryFabric.registerBlockAndBlockItem("infested_cobblestone_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.INFESTED_COBBLESTONE)));
    public static final Block INFESTED_STONE_BRICKS_SLAB = RegistryFabric.registerBlockAndBlockItem("infested_stone_bricks_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.INFESTED_STONE_BRICKS)));
    public static final Block INFESTED_MOSSY_STONE_BRICKS_SLAB = RegistryFabric.registerBlockAndBlockItem("infested_mossy_stone_bricks_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.INFESTED_MOSSY_STONE_BRICKS)));
    public static final Block INFESTED_CRACKED_STONE_BRICKS_SLAB = RegistryFabric.registerBlockAndBlockItem("infested_cracked_stone_bricks_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.INFESTED_CRACKED_STONE_BRICKS)));
    public static final Block INFESTED_CHISELED_STONE_BRICKS_SLAB = RegistryFabric.registerBlockAndBlockItem("infested_chiseled_stone_bricks_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.INFESTED_CHISELED_STONE_BRICKS)));
    public static final Block INFESTED_DEEPSLATE_SLAB = RegistryFabric.registerBlockAndBlockItem("infested_deepslate_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.INFESTED_DEEPSLATE)));

    // NATURAL
    public static final Block MUD_SLAB = RegistryFabric.registerBlockAndBlockItem("mud_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MUD)));
    public static final Block CLAY_SLAB = RegistryFabric.registerBlockAndBlockItem("clay_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CLAY)));

    public static final Block ICE_SLAB = RegistryFabric.registerBlockAndBlockItem("ice_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ICE)));
    public static final Block PACKED_ICE_SLAB = RegistryFabric.registerBlockAndBlockItem("packed_ice_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_ICE)));
    public static final Block BLUE_ICE_SLAB = RegistryFabric.registerBlockAndBlockItem("blue_ice_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_ICE)));
    public static final Block SNOW_BLOCK_SLAB = RegistryFabric.registerBlockAndBlockItem("snow_block_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SNOW_BLOCK)));
    public static final Block MOSS_BLOCK_SLAB = RegistryFabric.registerBlockAndBlockItem("moss_block_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MOSS_BLOCK)));

    public static final Block DEEPSLATE_SLAB = RegistryFabric.registerBlockAndBlockItem("deepslate_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE)));
    public static final Block CALCITE_SLAB = RegistryFabric.registerBlockAndBlockItem("calcite_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE)));
    public static final Block TUFF_SLAB = RegistryFabric.registerBlockAndBlockItem("tuff_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TUFF)));
    public static final Block DRIPSTONE_BLOCK_SLAB = RegistryFabric.registerBlockAndBlockItem("dripstone_block_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DRIPSTONE_BLOCK)));
    public static final Block OBSIDIAN_SLAB = RegistryFabric.registerBlockAndBlockItem("obsidian_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OBSIDIAN)));
    public static final Block NETHERRACK_SLAB = RegistryFabric.registerBlockAndBlockItem("netherrack_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHERRACK)));
    public static final Block CRIMSON_NYLIUM_SLAB = RegistryFabric.registerBlockAndBlockItem("crimson_nylium_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_NYLIUM)));
    public static final Block WARPED_NYLIUM_SLAB = RegistryFabric.registerBlockAndBlockItem("warped_nylium_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_NYLIUM)));

    public static final Block SOUL_SAND_SLAB = RegistryFabric.registerBlockAndBlockItem("soul_sand_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_SAND)));
    public static final Block SOUL_SOIL_SLAB = RegistryFabric.registerBlockAndBlockItem("soul_soil_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_SOIL)));
    public static final Block BONE_BLOCK_SLAB = RegistryFabric.registerBlockAndBlockItem("bone_block_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BONE_BLOCK)));
    public static final Block BASALT_SLAB = RegistryFabric.registerBlockAndBlockItem("basalt_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BASALT)));
    public static final Block SMOOTH_BASALT_SLAB = RegistryFabric.registerBlockAndBlockItem("smooth_basalt_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_BASALT)));
    public static final Block POLISHED_BASALT_SLAB = RegistryFabric.registerBlockAndBlockItem("polished_basalt_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BASALT)));
    public static final Block END_STONE_SLAB = RegistryFabric.registerBlockAndBlockItem("end_stone_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)));

    public static final Block COAL_ORE_SLAB = RegistryFabric.registerBlockAndBlockItem("coal_ore_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COAL_ORE)));
    public static final Block DEEPSLATE_COAL_ORE_SLAB = RegistryFabric.registerBlockAndBlockItem("deepslate_coal_ore_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_COAL_ORE)));
    public static final Block IRON_ORE_SLAB = RegistryFabric.registerBlockAndBlockItem("iron_ore_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)));
    public static final Block DEEPSLATE_IRON_ORE_SLAB = RegistryFabric.registerBlockAndBlockItem("deepslate_iron_ore_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE)));
    public static final Block COPPER_ORE_SLAB = RegistryFabric.registerBlockAndBlockItem("copper_ore_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_ORE)));
    public static final Block DEEPSLATE_COPPER_ORE_SLAB = RegistryFabric.registerBlockAndBlockItem("deepslate_copper_ore_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_COPPER_ORE)));
    public static final Block GOLD_ORE_SLAB = RegistryFabric.registerBlockAndBlockItem("gold_ore_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GOLD_ORE)));
    public static final Block DEEPSLATE_GOLD_ORE_SLAB = RegistryFabric.registerBlockAndBlockItem("deepslate_gold_ore_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_GOLD_ORE)));
    public static final Block EMERALD_ORE_SLAB = RegistryFabric.registerBlockAndBlockItem("emerald_ore_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.EMERALD_ORE)));
    public static final Block DEEPSLATE_EMERALD_ORE_SLAB = RegistryFabric.registerBlockAndBlockItem("deepslate_emerald_ore_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_EMERALD_ORE)));
    public static final Block LAPIS_ORE_SLAB = RegistryFabric.registerBlockAndBlockItem("lapis_ore_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LAPIS_ORE)));
    public static final Block DEEPSLATE_LAPIS_ORE_SLAB = RegistryFabric.registerBlockAndBlockItem("deepslate_lapis_ore_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_LAPIS_ORE)));
    public static final Block DIAMOND_ORE_SLAB = RegistryFabric.registerBlockAndBlockItem("diamond_ore_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIAMOND_ORE)));
    public static final Block DEEPSLATE_DIAMOND_ORE_SLAB = RegistryFabric.registerBlockAndBlockItem("deepslate_diamond_ore_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_DIAMOND_ORE)));
    public static final Block NETHER_GOLD_ORE_SLAB = RegistryFabric.registerBlockAndBlockItem("nether_gold_ore_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_GOLD_ORE)));
    public static final Block NETHER_QUARTZ_ORE_SLAB = RegistryFabric.registerBlockAndBlockItem("nether_quartz_ore_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_QUARTZ_ORE)));

    public static final Block ANCIENT_DEBRIS_SLAB = RegistryFabric.registerBlockAndBlockItem("ancient_debris_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ANCIENT_DEBRIS)));
    public static final Block RAW_IRON_BLOCK_SLAB = RegistryFabric.registerBlockAndBlockItem("raw_iron_block_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RAW_IRON_BLOCK)));
    public static final Block RAW_COPPER_BLOCK_SLAB = RegistryFabric.registerBlockAndBlockItem("raw_copper_block_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RAW_COPPER_BLOCK)));
    public static final Block RAW_GOLD_BLOCK_SLAB = RegistryFabric.registerBlockAndBlockItem("raw_gold_block_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RAW_GOLD_BLOCK)));
    public static final Block AMETHYST_BLOCK_SLAB = RegistryFabric.registerBlockAndBlockItem("amethyst_block_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_BLOCK)));
    public static final Block BUDDING_AMETHYST_SLAB = RegistryFabric.registerBlockAndBlockItem("budding_amethyst_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BUDDING_AMETHYST)));

    public static final Block BROWN_MUSHROOM_BLOCK_SLAB = RegistryFabric.registerBlockAndBlockItem("brown_mushroom_block_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_MUSHROOM_BLOCK)));
    public static final Block RED_MUSHROOM_BLOCK_SLAB = RegistryFabric.registerBlockAndBlockItem("red_mushroom_block_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_MUSHROOM_BLOCK)));
    public static final Block NETHER_WART_BLOCK_SLAB = RegistryFabric.registerBlockAndBlockItem("nether_wart_block_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_WART_BLOCK)));
    public static final Block WARPED_WART_BLOCK_SLAB = RegistryFabric.registerBlockAndBlockItem("warped_wart_block_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_WART_BLOCK)));

    public static final Block DRIED_KELP_BLOCK_SLAB = RegistryFabric.registerBlockAndBlockItem("dried_kelp_block_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DRIED_KELP_BLOCK)));
    public static final Block TUBE_CORAL_BLOCK_SLAB = RegistryFabric.registerBlockAndBlockItem("tube_coral_block_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TUBE_CORAL_BLOCK)));
    public static final Block BRAIN_CORAL_BLOCK_SLAB = RegistryFabric.registerBlockAndBlockItem("brain_coral_block_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRAIN_CORAL_BLOCK)));
    public static final Block BUBBLE_CORAL_BLOCK_SLAB = RegistryFabric.registerBlockAndBlockItem("bubble_coral_block_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BUBBLE_CORAL_BLOCK)));
    public static final Block FIRE_CORAL_BLOCK_SLAB = RegistryFabric.registerBlockAndBlockItem("fire_coral_block_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.FIRE_CORAL_BLOCK)));
    public static final Block HORN_CORAL_BLOCK_SLAB = RegistryFabric.registerBlockAndBlockItem("horn_coral_block_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.HORN_CORAL_BLOCK)));
    public static final Block DEAD_TUBE_CORAL_BLOCK_SLAB = RegistryFabric.registerBlockAndBlockItem("dead_tube_coral_block_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEAD_TUBE_CORAL_BLOCK)));
    public static final Block DEAD_BRAIN_CORAL_BLOCK_SLAB = RegistryFabric.registerBlockAndBlockItem("dead_brain_coral_block_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEAD_BRAIN_CORAL_BLOCK)));
    public static final Block DEAD_BUBBLE_CORAL_BLOCK_SLAB = RegistryFabric.registerBlockAndBlockItem("dead_bubble_coral_block_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEAD_BUBBLE_CORAL_BLOCK)));
    public static final Block DEAD_FIRE_CORAL_BLOCK_SLAB = RegistryFabric.registerBlockAndBlockItem("dead_fire_coral_block_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEAD_FIRE_CORAL_BLOCK)));
    public static final Block DEAD_HORN_CORAL_BLOCK_SLAB = RegistryFabric.registerBlockAndBlockItem("dead_horn_coral_block_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEAD_HORN_CORAL_BLOCK)));

    public static final Block SPONGE_SLAB = RegistryFabric.registerBlockAndBlockItem("sponge_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPONGE)));
    public static final Block WET_SPONGE_SLAB = RegistryFabric.registerBlockAndBlockItem("wet_sponge_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WET_SPONGE)));

    public static final Block MELON_SLAB = RegistryFabric.registerBlockAndBlockItem("melon_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MELON)));
    public static final Block PUMPKIN_SLAB = RegistryFabric.registerBlockAndBlockItem("pumpkin_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PUMPKIN)));

    public static final Block HAY_BLOCK_SLAB = RegistryFabric.registerBlockAndBlockItem("hay_block_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.HAY_BLOCK)));
    public static final Block HONEYCOMB_BLOCK_SLAB = RegistryFabric.registerBlockAndBlockItem("honeycomb_block_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.HONEYCOMB_BLOCK)));
    public static final Block SLIME_BLOCK_SLAB = RegistryFabric.registerBlockAndBlockItem("slime_block_slab", new SlimeSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SLIME_BLOCK)));
    public static final Block HONEY_BLOCK_SLAB = RegistryFabric.registerBlockAndBlockItem("honey_block_slab", new HoneySlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.HONEY_BLOCK)));

    public static final Block SCULK_SLAB = RegistryFabric.registerBlockAndBlockItem("sculk_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SCULK)));
    public static final Block SCULK_CATALYST_SLAB = RegistryFabric.registerBlockAndBlockItem("sculk_catalyst_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SCULK_CATALYST)));

    // BUILDING
    public static final Block CRACKED_STONE_BRICKS_SLAB = RegistryFabric.registerBlockAndBlockItem("cracked_stone_bricks_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRACKED_STONE_BRICKS)));
    public static final Block CRACKED_DEEPSLATE_BRICKS_SLAB = RegistryFabric.registerBlockAndBlockItem("cracked_deepslate_bricks_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRACKED_DEEPSLATE_BRICKS)));
    public static final Block CRACKED_DEEPSLATE_TILES_SLAB = RegistryFabric.registerBlockAndBlockItem("cracked_deepslate_tiles_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRACKED_DEEPSLATE_TILES)));
    public static final Block CRACKED_NETHER_BRICKS_SLAB = RegistryFabric.registerBlockAndBlockItem("cracked_nether_bricks_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRACKED_NETHER_BRICKS)));
    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICKS_SLAB = RegistryFabric.registerBlockAndBlockItem("cracked_polished_blackstone_bricks_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS)));

    public static final Block CHISELED_STONE_BRICKS_SLAB = RegistryFabric.registerBlockAndBlockItem("chiseled_stone_bricks_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHISELED_STONE_BRICKS)));
    public static final Block CHISELED_DEEPSLATE_SLAB = RegistryFabric.registerBlockAndBlockItem("chiseled_deepslate_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHISELED_DEEPSLATE)));
    public static final Block CHISELED_SANDSTONE_SLAB = RegistryFabric.registerBlockAndBlockItem("chiseled_sandstone_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHISELED_SANDSTONE)));
    public static final Block CHISELED_RED_SANDSTONE_SLAB = RegistryFabric.registerBlockAndBlockItem("chiseled_red_sandstone_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHISELED_RED_SANDSTONE)));
    public static final Block CHISELED_NETHER_BRICKS_SLAB = RegistryFabric.registerBlockAndBlockItem("chiseled_nether_bricks_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHISELED_NETHER_BRICKS)));
    public static final Block CHISELED_POLISHED_BLACKSTONE_SLAB = RegistryFabric.registerBlockAndBlockItem("chiseled_polished_blackstone_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHISELED_POLISHED_BLACKSTONE)));
    public static final Block CHISELED_QUARTZ_BLOCK_SLAB = RegistryFabric.registerBlockAndBlockItem("chiseled_quartz_block_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHISELED_QUARTZ_BLOCK)));

    public static final Block PACKED_MUD_SLAB = RegistryFabric.registerBlockAndBlockItem("packed_mud_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_MUD)));

    public static final Block GILDED_BLACKSTONE_SLAB = RegistryFabric.registerBlockAndBlockItem("gilded_blackstone_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GILDED_BLACKSTONE)));

    public static final Block COAL_BLOCK_SLAB = RegistryFabric.registerBlockAndBlockItem("coal_block_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COAL_BLOCK)));
    public static final Block IRON_BLOCK_SLAB = RegistryFabric.registerBlockAndBlockItem("iron_block_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));
    public static final Block GOLD_BLOCK_SLAB = RegistryFabric.registerBlockAndBlockItem("gold_block_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GOLD_BLOCK)));
    public static final Block REDSTONE_BLOCK_SLAB = RegistryFabric.registerBlockAndBlockItem("redstone_block_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_BLOCK)));
    public static final Block EMERALD_BLOCK_SLAB = RegistryFabric.registerBlockAndBlockItem("emerald_block_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.EMERALD_BLOCK)));
    public static final Block LAPIS_BLOCK_SLAB = RegistryFabric.registerBlockAndBlockItem("lapis_block_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LAPIS_BLOCK)));
    public static final Block DIAMOND_BLOCK_SLAB = RegistryFabric.registerBlockAndBlockItem("diamond_block_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIAMOND_BLOCK)));
    public static final Block NETHERITE_BLOCK_SLAB = RegistryFabric.registerBlockAndBlockItem("netherite_block_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHERITE_BLOCK)));

    public static final Block COPPER_BLOCK_SLAB = RegistryFabric.registerBlockAndBlockItem("copper_block_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_BLOCK)));
    public static final Block EXPOSED_COPPER_SLAB = RegistryFabric.registerBlockAndBlockItem("exposed_copper_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.EXPOSED_COPPER)));
    public static final Block WEATHERED_COPPER_SLAB = RegistryFabric.registerBlockAndBlockItem("weathered_copper_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WEATHERED_COPPER)));
    public static final Block OXIDIZED_COPPER_SLAB = RegistryFabric.registerBlockAndBlockItem("oxidized_copper_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OXIDIZED_COPPER)));
    public static final Block WAXED_COPPER_BLOCK_SLAB = RegistryFabric.registerBlockAndBlockItem("waxed_copper_block_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WAXED_COPPER_BLOCK)));
    public static final Block WAXED_EXPOSED_COPPER_SLAB = RegistryFabric.registerBlockAndBlockItem("waxed_exposed_copper_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WAXED_EXPOSED_COPPER)));
    public static final Block WAXED_WEATHERED_COPPER_SLAB = RegistryFabric.registerBlockAndBlockItem("waxed_weathered_copper_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WAXED_WEATHERED_COPPER)));
    public static final Block WAXED_OXIDIZED_COPPER_SLAB = RegistryFabric.registerBlockAndBlockItem("waxed_oxidized_copper_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WAXED_OXIDIZED_COPPER)));
}
