package com.cursee.new_slab_variants.core.common.registry;

import com.cursee.new_slab_variants.core.common.block.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.RegistryObject;

@SuppressWarnings("unused")
public class ModBlocksNeoForge {

    public static void register() {}

    private static final Block[] slabs = new Block[] {
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
            Blocks.PETRIFIED_OAK_SLAB,
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

    // PROBLEMATIC
    public static final RegistryObject<Block> REDSTONE_LAMP_SLAB = RegistryNeoForge.registerBlockAndBlockItem("redstone_lamp_slab", () -> new RedstoneLampSlabBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP)));
    public static final RegistryObject<Block> REDSTONE_ORE_SLAB = RegistryNeoForge.registerBlockAndBlockItem("redstone_ore_slab", () -> new RedstoneOreSlabBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_ORE)));
    public static final RegistryObject<Block> DEEPSLATE_REDSTONE_ORE_SLAB = RegistryNeoForge.registerBlockAndBlockItem("deepslate_redstone_ore_slab", () -> new RedstoneOreSlabBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_REDSTONE_ORE)));

    // WOOL
    public static final RegistryObject<Block> WHITE_WOOL_SLAB = RegistryNeoForge.registerBlockAndBlockItem("white_wool_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));
    public static final RegistryObject<Block> LIGHT_GRAY_WOOL_SLAB = RegistryNeoForge.registerBlockAndBlockItem("light_gray_wool_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_WOOL)));
    public static final RegistryObject<Block> GRAY_WOOL_SLAB = RegistryNeoForge.registerBlockAndBlockItem("gray_wool_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_WOOL)));
    public static final RegistryObject<Block> BLACK_WOOL_SLAB = RegistryNeoForge.registerBlockAndBlockItem("black_wool_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_WOOL)));
    public static final RegistryObject<Block> BROWN_WOOL_SLAB = RegistryNeoForge.registerBlockAndBlockItem("brown_wool_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL)));
    public static final RegistryObject<Block> RED_WOOL_SLAB = RegistryNeoForge.registerBlockAndBlockItem("red_wool_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.RED_WOOL)));
    public static final RegistryObject<Block> ORANGE_WOOL_SLAB = RegistryNeoForge.registerBlockAndBlockItem("orange_wool_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_WOOL)));
    public static final RegistryObject<Block> YELLOW_WOOL_SLAB = RegistryNeoForge.registerBlockAndBlockItem("yellow_wool_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_WOOL)));
    public static final RegistryObject<Block> LIME_WOOL_SLAB = RegistryNeoForge.registerBlockAndBlockItem("lime_wool_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIME_WOOL)));
    public static final RegistryObject<Block> GREEN_WOOL_SLAB = RegistryNeoForge.registerBlockAndBlockItem("green_wool_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_WOOL)));
    public static final RegistryObject<Block> CYAN_WOOL_SLAB = RegistryNeoForge.registerBlockAndBlockItem("cyan_wool_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_WOOL)));
    public static final RegistryObject<Block> LIGHT_BLUE_WOOL_SLAB = RegistryNeoForge.registerBlockAndBlockItem("light_blue_wool_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_WOOL)));
    public static final RegistryObject<Block> BLUE_WOOL_SLAB = RegistryNeoForge.registerBlockAndBlockItem("blue_wool_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_WOOL)));
    public static final RegistryObject<Block> PURPLE_WOOL_SLAB = RegistryNeoForge.registerBlockAndBlockItem("purple_wool_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_WOOL)));
    public static final RegistryObject<Block> MAGENTA_WOOL_SLAB = RegistryNeoForge.registerBlockAndBlockItem("magenta_wool_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_WOOL)));
    public static final RegistryObject<Block> PINK_WOOL_SLAB = RegistryNeoForge.registerBlockAndBlockItem("pink_wool_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.PINK_WOOL)));

    // TERRACOTTA
    public static final RegistryObject<Block> TERRACOTTA_SLAB = RegistryNeoForge.registerBlockAndBlockItem("terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));
    public static final RegistryObject<Block> WHITE_TERRACOTTA_SLAB = RegistryNeoForge.registerBlockAndBlockItem("white_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));
    public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_SLAB = RegistryNeoForge.registerBlockAndBlockItem("light_gray_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_TERRACOTTA)));
    public static final RegistryObject<Block> GRAY_TERRACOTTA_SLAB = RegistryNeoForge.registerBlockAndBlockItem("gray_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_TERRACOTTA)));
    public static final RegistryObject<Block> BLACK_TERRACOTTA_SLAB = RegistryNeoForge.registerBlockAndBlockItem("black_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_TERRACOTTA)));
    public static final RegistryObject<Block> BROWN_TERRACOTTA_SLAB = RegistryNeoForge.registerBlockAndBlockItem("brown_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_TERRACOTTA)));
    public static final RegistryObject<Block> RED_TERRACOTTA_SLAB = RegistryNeoForge.registerBlockAndBlockItem("red_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.RED_TERRACOTTA)));
    public static final RegistryObject<Block> ORANGE_TERRACOTTA_SLAB = RegistryNeoForge.registerBlockAndBlockItem("orange_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_TERRACOTTA)));
    public static final RegistryObject<Block> YELLOW_TERRACOTTA_SLAB = RegistryNeoForge.registerBlockAndBlockItem("yellow_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_TERRACOTTA)));
    public static final RegistryObject<Block> LIME_TERRACOTTA_SLAB = RegistryNeoForge.registerBlockAndBlockItem("lime_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIME_TERRACOTTA)));
    public static final RegistryObject<Block> GREEN_TERRACOTTA_SLAB = RegistryNeoForge.registerBlockAndBlockItem("green_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_TERRACOTTA)));
    public static final RegistryObject<Block> CYAN_TERRACOTTA_SLAB = RegistryNeoForge.registerBlockAndBlockItem("cyan_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_TERRACOTTA)));
    public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_SLAB = RegistryNeoForge.registerBlockAndBlockItem("light_blue_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_TERRACOTTA)));
    public static final RegistryObject<Block> BLUE_TERRACOTTA_SLAB = RegistryNeoForge.registerBlockAndBlockItem("blue_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_TERRACOTTA)));
    public static final RegistryObject<Block> PURPLE_TERRACOTTA_SLAB = RegistryNeoForge.registerBlockAndBlockItem("purple_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_TERRACOTTA)));
    public static final RegistryObject<Block> MAGENTA_TERRACOTTA_SLAB = RegistryNeoForge.registerBlockAndBlockItem("magenta_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_TERRACOTTA)));
    public static final RegistryObject<Block> PINK_TERRACOTTA_SLAB = RegistryNeoForge.registerBlockAndBlockItem("pink_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.PINK_TERRACOTTA)));

    // GLAZED TERRACOTTA
    public static final RegistryObject<Block> WHITE_GLAZED_TERRACOTTA_SLAB = RegistryNeoForge.registerBlockAndBlockItem("white_glazed_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_GLAZED_TERRACOTTA)));
    public static final RegistryObject<Block> LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB = RegistryNeoForge.registerBlockAndBlockItem("light_gray_glazed_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA)));
    public static final RegistryObject<Block> GRAY_GLAZED_TERRACOTTA_SLAB = RegistryNeoForge.registerBlockAndBlockItem("gray_glazed_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_GLAZED_TERRACOTTA)));
    public static final RegistryObject<Block> BLACK_GLAZED_TERRACOTTA_SLAB = RegistryNeoForge.registerBlockAndBlockItem("black_glazed_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_GLAZED_TERRACOTTA)));
    public static final RegistryObject<Block> BROWN_GLAZED_TERRACOTTA_SLAB = RegistryNeoForge.registerBlockAndBlockItem("brown_glazed_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_GLAZED_TERRACOTTA)));
    public static final RegistryObject<Block> RED_GLAZED_TERRACOTTA_SLAB = RegistryNeoForge.registerBlockAndBlockItem("red_glazed_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.RED_GLAZED_TERRACOTTA)));
    public static final RegistryObject<Block> ORANGE_GLAZED_TERRACOTTA_SLAB = RegistryNeoForge.registerBlockAndBlockItem("orange_glazed_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_GLAZED_TERRACOTTA)));
    public static final RegistryObject<Block> YELLOW_GLAZED_TERRACOTTA_SLAB = RegistryNeoForge.registerBlockAndBlockItem("yellow_glazed_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_GLAZED_TERRACOTTA)));
    public static final RegistryObject<Block> LIME_GLAZED_TERRACOTTA_SLAB = RegistryNeoForge.registerBlockAndBlockItem("lime_glazed_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIME_GLAZED_TERRACOTTA)));
    public static final RegistryObject<Block> GREEN_GLAZED_TERRACOTTA_SLAB = RegistryNeoForge.registerBlockAndBlockItem("green_glazed_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_GLAZED_TERRACOTTA)));
    public static final RegistryObject<Block> CYAN_GLAZED_TERRACOTTA_SLAB = RegistryNeoForge.registerBlockAndBlockItem("cyan_glazed_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_GLAZED_TERRACOTTA)));
    public static final RegistryObject<Block> LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB = RegistryNeoForge.registerBlockAndBlockItem("light_blue_glazed_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA)));
    public static final RegistryObject<Block> BLUE_GLAZED_TERRACOTTA_SLAB = RegistryNeoForge.registerBlockAndBlockItem("blue_glazed_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_GLAZED_TERRACOTTA)));
    public static final RegistryObject<Block> PURPLE_GLAZED_TERRACOTTA_SLAB = RegistryNeoForge.registerBlockAndBlockItem("purple_glazed_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_GLAZED_TERRACOTTA)));
    public static final RegistryObject<Block> MAGENTA_GLAZED_TERRACOTTA_SLAB = RegistryNeoForge.registerBlockAndBlockItem("magenta_glazed_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_GLAZED_TERRACOTTA)));
    public static final RegistryObject<Block> PINK_GLAZED_TERRACOTTA_SLAB = RegistryNeoForge.registerBlockAndBlockItem("pink_glazed_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.PINK_GLAZED_TERRACOTTA)));

    // CONCRETE
    public static final RegistryObject<Block> WHITE_CONCRETE_SLAB = RegistryNeoForge.registerBlockAndBlockItem("white_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_SLAB = RegistryNeoForge.registerBlockAndBlockItem("light_gray_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_CONCRETE)));
    public static final RegistryObject<Block> GRAY_CONCRETE_SLAB = RegistryNeoForge.registerBlockAndBlockItem("gray_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_CONCRETE)));
    public static final RegistryObject<Block> BLACK_CONCRETE_SLAB = RegistryNeoForge.registerBlockAndBlockItem("black_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_CONCRETE)));
    public static final RegistryObject<Block> BROWN_CONCRETE_SLAB = RegistryNeoForge.registerBlockAndBlockItem("brown_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_CONCRETE)));
    public static final RegistryObject<Block> RED_CONCRETE_SLAB = RegistryNeoForge.registerBlockAndBlockItem("red_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.RED_CONCRETE)));
    public static final RegistryObject<Block> ORANGE_CONCRETE_SLAB = RegistryNeoForge.registerBlockAndBlockItem("orange_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_CONCRETE)));
    public static final RegistryObject<Block> YELLOW_CONCRETE_SLAB = RegistryNeoForge.registerBlockAndBlockItem("yellow_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_CONCRETE)));
    public static final RegistryObject<Block> LIME_CONCRETE_SLAB = RegistryNeoForge.registerBlockAndBlockItem("lime_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIME_CONCRETE)));
    public static final RegistryObject<Block> GREEN_CONCRETE_SLAB = RegistryNeoForge.registerBlockAndBlockItem("green_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_CONCRETE)));
    public static final RegistryObject<Block> CYAN_CONCRETE_SLAB = RegistryNeoForge.registerBlockAndBlockItem("cyan_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_CONCRETE)));
    public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_SLAB = RegistryNeoForge.registerBlockAndBlockItem("light_blue_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_CONCRETE)));
    public static final RegistryObject<Block> BLUE_CONCRETE_SLAB = RegistryNeoForge.registerBlockAndBlockItem("blue_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_CONCRETE)));
    public static final RegistryObject<Block> PURPLE_CONCRETE_SLAB = RegistryNeoForge.registerBlockAndBlockItem("purple_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_CONCRETE)));
    public static final RegistryObject<Block> MAGENTA_CONCRETE_SLAB = RegistryNeoForge.registerBlockAndBlockItem("magenta_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_CONCRETE)));
    public static final RegistryObject<Block> PINK_CONCRETE_SLAB = RegistryNeoForge.registerBlockAndBlockItem("pink_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.PINK_CONCRETE)));

    // GLASS
    public static final RegistryObject<Block> GLASS_SLAB = RegistryNeoForge.registerBlockAndBlockItem("glass_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)));
    public static final RegistryObject<Block> TINTED_GLASS_SLAB = RegistryNeoForge.registerBlockAndBlockItem("tinted_glass_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.TINTED_GLASS)));
    public static final RegistryObject<Block> WHITE_STAINED_GLASS_SLAB = RegistryNeoForge.registerBlockAndBlockItem("white_stained_glass_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_STAINED_GLASS)));
    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_GLASS_SLAB = RegistryNeoForge.registerBlockAndBlockItem("light_gray_stained_glass_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_STAINED_GLASS)));
    public static final RegistryObject<Block> GRAY_STAINED_GLASS_SLAB = RegistryNeoForge.registerBlockAndBlockItem("gray_stained_glass_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_STAINED_GLASS)));
    public static final RegistryObject<Block> BLACK_STAINED_GLASS_SLAB = RegistryNeoForge.registerBlockAndBlockItem("black_stained_glass_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_STAINED_GLASS)));
    public static final RegistryObject<Block> BROWN_STAINED_GLASS_SLAB = RegistryNeoForge.registerBlockAndBlockItem("brown_stained_glass_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_STAINED_GLASS)));
    public static final RegistryObject<Block> RED_STAINED_GLASS_SLAB = RegistryNeoForge.registerBlockAndBlockItem("red_stained_glass_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.RED_STAINED_GLASS)));
    public static final RegistryObject<Block> ORANGE_STAINED_GLASS_SLAB = RegistryNeoForge.registerBlockAndBlockItem("orange_stained_glass_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_STAINED_GLASS)));
    public static final RegistryObject<Block> YELLOW_STAINED_GLASS_SLAB = RegistryNeoForge.registerBlockAndBlockItem("yellow_stained_glass_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_STAINED_GLASS)));
    public static final RegistryObject<Block> LIME_STAINED_GLASS_SLAB = RegistryNeoForge.registerBlockAndBlockItem("lime_stained_glass_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIME_STAINED_GLASS)));
    public static final RegistryObject<Block> GREEN_STAINED_GLASS_SLAB = RegistryNeoForge.registerBlockAndBlockItem("green_stained_glass_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_STAINED_GLASS)));
    public static final RegistryObject<Block> CYAN_STAINED_GLASS_SLAB = RegistryNeoForge.registerBlockAndBlockItem("cyan_stained_glass_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_STAINED_GLASS)));
    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_GLASS_SLAB = RegistryNeoForge.registerBlockAndBlockItem("light_blue_stained_glass_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_STAINED_GLASS)));
    public static final RegistryObject<Block> BLUE_STAINED_GLASS_SLAB = RegistryNeoForge.registerBlockAndBlockItem("blue_stained_glass_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_STAINED_GLASS)));
    public static final RegistryObject<Block> PURPLE_STAINED_GLASS_SLAB = RegistryNeoForge.registerBlockAndBlockItem("purple_stained_glass_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_STAINED_GLASS)));
    public static final RegistryObject<Block> MAGENTA_STAINED_GLASS_SLAB = RegistryNeoForge.registerBlockAndBlockItem("magenta_stained_glass_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_STAINED_GLASS)));
    public static final RegistryObject<Block> PINK_STAINED_GLASS_SLAB = RegistryNeoForge.registerBlockAndBlockItem("pink_stained_glass_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.PINK_STAINED_GLASS)));

    // WOODEN
    public static final RegistryObject<Block> OAK_LOG_SLAB = RegistryNeoForge.registerBlockAndBlockItem("oak_log_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> OAK_WOOD_SLAB = RegistryNeoForge.registerBlockAndBlockItem("oak_wood_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> STRIPPED_OAK_LOG_SLAB = RegistryNeoForge.registerBlockAndBlockItem("stripped_oak_log_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> STRIPPED_OAK_WOOD_SLAB = RegistryNeoForge.registerBlockAndBlockItem("stripped_oak_wood_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> SPRUCE_LOG_SLAB = RegistryNeoForge.registerBlockAndBlockItem("spruce_log_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_SLAB)));
    public static final RegistryObject<Block> SPRUCE_WOOD_SLAB = RegistryNeoForge.registerBlockAndBlockItem("spruce_wood_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_SLAB)));
    public static final RegistryObject<Block> STRIPPED_SPRUCE_LOG_SLAB = RegistryNeoForge.registerBlockAndBlockItem("stripped_spruce_log_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_SLAB)));
    public static final RegistryObject<Block> STRIPPED_SPRUCE_WOOD_SLAB = RegistryNeoForge.registerBlockAndBlockItem("stripped_spruce_wood_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_SLAB)));
    public static final RegistryObject<Block> BIRCH_LOG_SLAB = RegistryNeoForge.registerBlockAndBlockItem("birch_log_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_SLAB)));
    public static final RegistryObject<Block> BIRCH_WOOD_SLAB = RegistryNeoForge.registerBlockAndBlockItem("birch_wood_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_SLAB)));
    public static final RegistryObject<Block> STRIPPED_BIRCH_LOG_SLAB = RegistryNeoForge.registerBlockAndBlockItem("stripped_birch_log_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_SLAB)));
    public static final RegistryObject<Block> STRIPPED_BIRCH_WOOD_SLAB = RegistryNeoForge.registerBlockAndBlockItem("stripped_birch_wood_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_SLAB)));
    public static final RegistryObject<Block> JUNGLE_LOG_SLAB = RegistryNeoForge.registerBlockAndBlockItem("jungle_log_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_SLAB)));
    public static final RegistryObject<Block> JUNGLE_WOOD_SLAB = RegistryNeoForge.registerBlockAndBlockItem("jungle_wood_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_SLAB)));
    public static final RegistryObject<Block> STRIPPED_JUNGLE_LOG_SLAB = RegistryNeoForge.registerBlockAndBlockItem("stripped_jungle_log_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_SLAB)));
    public static final RegistryObject<Block> STRIPPED_JUNGLE_WOOD_SLAB = RegistryNeoForge.registerBlockAndBlockItem("stripped_jungle_wood_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_SLAB)));
    public static final RegistryObject<Block> ACACIA_LOG_SLAB = RegistryNeoForge.registerBlockAndBlockItem("acacia_log_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_SLAB)));
    public static final RegistryObject<Block> ACACIA_WOOD_SLAB = RegistryNeoForge.registerBlockAndBlockItem("acacia_wood_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_SLAB)));
    public static final RegistryObject<Block> STRIPPED_ACACIA_LOG_SLAB = RegistryNeoForge.registerBlockAndBlockItem("stripped_acacia_log_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_SLAB)));
    public static final RegistryObject<Block> STRIPPED_ACACIA_WOOD_SLAB = RegistryNeoForge.registerBlockAndBlockItem("stripped_acacia_wood_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_SLAB)));
    public static final RegistryObject<Block> DARK_OAK_LOG_SLAB = RegistryNeoForge.registerBlockAndBlockItem("dark_oak_log_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_SLAB)));
    public static final RegistryObject<Block> DARK_OAK_WOOD_SLAB = RegistryNeoForge.registerBlockAndBlockItem("dark_oak_wood_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_SLAB)));
    public static final RegistryObject<Block> STRIPPED_DARK_OAK_LOG_SLAB = RegistryNeoForge.registerBlockAndBlockItem("stripped_dark_oak_log_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_SLAB)));
    public static final RegistryObject<Block> STRIPPED_DARK_OAK_WOOD_SLAB = RegistryNeoForge.registerBlockAndBlockItem("stripped_dark_oak_wood_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_SLAB)));
    public static final RegistryObject<Block> MANGROVE_LOG_SLAB = RegistryNeoForge.registerBlockAndBlockItem("mangrove_log_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_SLAB)));
    public static final RegistryObject<Block> MANGROVE_WOOD_SLAB = RegistryNeoForge.registerBlockAndBlockItem("mangrove_wood_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_SLAB)));
    public static final RegistryObject<Block> STRIPPED_MANGROVE_LOG_SLAB = RegistryNeoForge.registerBlockAndBlockItem("stripped_mangrove_log_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_SLAB)));
    public static final RegistryObject<Block> STRIPPED_MANGROVE_WOOD_SLAB = RegistryNeoForge.registerBlockAndBlockItem("stripped_mangrove_wood_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_SLAB)));
    public static final RegistryObject<Block> CHERRY_LOG_SLAB = RegistryNeoForge.registerBlockAndBlockItem("cherry_log_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_SLAB)));
    public static final RegistryObject<Block> CHERRY_WOOD_SLAB = RegistryNeoForge.registerBlockAndBlockItem("cherry_wood_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_SLAB)));
    public static final RegistryObject<Block> STRIPPED_CHERRY_LOG_SLAB = RegistryNeoForge.registerBlockAndBlockItem("stripped_cherry_log_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_SLAB)));
    public static final RegistryObject<Block> STRIPPED_CHERRY_WOOD_SLAB = RegistryNeoForge.registerBlockAndBlockItem("stripped_cherry_wood_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_SLAB)));
    public static final RegistryObject<Block> BAMBOO_BLOCK_SLAB = RegistryNeoForge.registerBlockAndBlockItem("bamboo_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_SLAB)));
    public static final RegistryObject<Block> STRIPPED_BAMBOO_BLOCK_SLAB = RegistryNeoForge.registerBlockAndBlockItem("stripped_bamboo_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_SLAB)));

    // LEAVES
    public static final RegistryObject<Block> OAK_LEAVES_SLAB = RegistryNeoForge.registerBlockAndBlockItem("oak_leaves_slab", () -> new LeavesSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> SPRUCE_LEAVES_SLAB = RegistryNeoForge.registerBlockAndBlockItem("spruce_leaves_slab", () -> new LeavesSlabBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LEAVES)));
    public static final RegistryObject<Block> BIRCH_LEAVES_SLAB = RegistryNeoForge.registerBlockAndBlockItem("birch_leaves_slab", () -> new LeavesSlabBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_LEAVES)));
    public static final RegistryObject<Block> JUNGLE_LEAVES_SLAB = RegistryNeoForge.registerBlockAndBlockItem("jungle_leaves_slab", () -> new LeavesSlabBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_LEAVES)));
    public static final RegistryObject<Block> ACACIA_LEAVES_SLAB = RegistryNeoForge.registerBlockAndBlockItem("acacia_leaves_slab", () -> new LeavesSlabBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_LEAVES)));
    public static final RegistryObject<Block> DARK_OAK_LEAVES_SLAB = RegistryNeoForge.registerBlockAndBlockItem("dark_oak_leaves_slab", () -> new LeavesSlabBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_LEAVES)));
    public static final RegistryObject<Block> MANGROVE_LEAVES_SLAB = RegistryNeoForge.registerBlockAndBlockItem("mangrove_leaves_slab", () -> new LeavesSlabBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_LEAVES)));
    public static final RegistryObject<Block> CHERRY_LEAVES_SLAB = RegistryNeoForge.registerBlockAndBlockItem("cherry_leaves_slab", () -> new LeavesSlabBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_LEAVES)));
    public static final RegistryObject<Block> AZALEA_LEAVES_SLAB = RegistryNeoForge.registerBlockAndBlockItem("azalea_leaves_slab", () -> new LeavesSlabBlock(BlockBehaviour.Properties.copy(Blocks.AZALEA_LEAVES)));
    public static final RegistryObject<Block> FLOWERING_AZALEA_LEAVES_SLAB = RegistryNeoForge.registerBlockAndBlockItem("flowering_azalea_leaves_slab", () -> new LeavesSlabBlock(BlockBehaviour.Properties.copy(Blocks.FLOWERING_AZALEA_LEAVES)));

    // FUNCTIONAL
    public static final RegistryObject<Block> SEA_LANTERN_SLAB = RegistryNeoForge.registerBlockAndBlockItem("sea_lantern_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SEA_LANTERN)));
    public static final RegistryObject<Block> GLOWSTONE_SLAB = RegistryNeoForge.registerBlockAndBlockItem("glowstone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GLOWSTONE)));
    public static final RegistryObject<Block> SHROOMLIGHT_SLAB = RegistryNeoForge.registerBlockAndBlockItem("shroomlight_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SHROOMLIGHT)));
    public static final RegistryObject<Block> OCHRE_FROGLIGHT_SLAB = RegistryNeoForge.registerBlockAndBlockItem("ochre_froglight_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OCHRE_FROGLIGHT)));
    public static final RegistryObject<Block> VERDANT_FROGLIGHT_SLAB = RegistryNeoForge.registerBlockAndBlockItem("verdant_froglight_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.VERDANT_FROGLIGHT)));
    public static final RegistryObject<Block> PEARLESCENT_FROGLIGHT_SLAB = RegistryNeoForge.registerBlockAndBlockItem("pearlescent_froglight_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.PEARLESCENT_FROGLIGHT)));
    public static final RegistryObject<Block> CRYING_OBSIDIAN_SLAB = RegistryNeoForge.registerBlockAndBlockItem("crying_obsidian_slab", () -> new CryingObsidianSlabBlock(BlockBehaviour.Properties.copy(Blocks.CRYING_OBSIDIAN)));
    public static final RegistryObject<Block> MAGMA_BLOCK_SLAB = RegistryNeoForge.registerBlockAndBlockItem("magma_block_slab", () -> new MagmaSlabBlock(BlockBehaviour.Properties.copy(Blocks.MAGMA_BLOCK)));
    public static final RegistryObject<Block> LADDER_SLAB = RegistryNeoForge.registerBlockAndBlockItem("ladder_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LADDER)));
    public static final RegistryObject<Block> SCAFFOLDING_SLAB = RegistryNeoForge.registerBlockAndBlockItem("scaffolding_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SCAFFOLDING)));
    public static final RegistryObject<Block> BOOKSHELF_SLAB = RegistryNeoForge.registerBlockAndBlockItem("bookshelf_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BOOKSHELF)));

    public static final RegistryObject<Block> INFESTED_STONE_SLAB = RegistryNeoForge.registerBlockAndBlockItem("infested_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.INFESTED_STONE)));
    public static final RegistryObject<Block> INFESTED_COBBLESTONE_SLAB = RegistryNeoForge.registerBlockAndBlockItem("infested_cobblestone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.INFESTED_COBBLESTONE)));
    public static final RegistryObject<Block> INFESTED_STONE_BRICKS_SLAB = RegistryNeoForge.registerBlockAndBlockItem("infested_stone_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.INFESTED_STONE_BRICKS)));
    public static final RegistryObject<Block> INFESTED_MOSSY_STONE_BRICKS_SLAB = RegistryNeoForge.registerBlockAndBlockItem("infested_mossy_stone_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.INFESTED_MOSSY_STONE_BRICKS)));
    public static final RegistryObject<Block> INFESTED_CRACKED_STONE_BRICKS_SLAB = RegistryNeoForge.registerBlockAndBlockItem("infested_cracked_stone_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.INFESTED_CRACKED_STONE_BRICKS)));
    public static final RegistryObject<Block> INFESTED_CHISELED_STONE_BRICKS_SLAB = RegistryNeoForge.registerBlockAndBlockItem("infested_chiseled_stone_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.INFESTED_CHISELED_STONE_BRICKS)));
    public static final RegistryObject<Block> INFESTED_DEEPSLATE_SLAB = RegistryNeoForge.registerBlockAndBlockItem("infested_deepslate_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.INFESTED_DEEPSLATE)));

    // NATURAL
    public static final RegistryObject<Block> MUD_SLAB = RegistryNeoForge.registerBlockAndBlockItem("mud_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.MUD)));
    public static final RegistryObject<Block> CLAY_SLAB = RegistryNeoForge.registerBlockAndBlockItem("clay_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CLAY)));

    public static final RegistryObject<Block> ICE_SLAB = RegistryNeoForge.registerBlockAndBlockItem("ice_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.ICE)));
    public static final RegistryObject<Block> PACKED_ICE_SLAB = RegistryNeoForge.registerBlockAndBlockItem("packed_ice_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.PACKED_ICE)));
    public static final RegistryObject<Block> BLUE_ICE_SLAB = RegistryNeoForge.registerBlockAndBlockItem("blue_ice_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_ICE)));
    public static final RegistryObject<Block> SNOW_BLOCK_SLAB = RegistryNeoForge.registerBlockAndBlockItem("snow_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SNOW_BLOCK)));
    public static final RegistryObject<Block> MOSS_BLOCK_SLAB = RegistryNeoForge.registerBlockAndBlockItem("moss_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK)));

    public static final RegistryObject<Block> DEEPSLATE_SLAB = RegistryNeoForge.registerBlockAndBlockItem("deepslate_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));
    public static final RegistryObject<Block> CALCITE_SLAB = RegistryNeoForge.registerBlockAndBlockItem("calcite_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CALCITE)));
    public static final RegistryObject<Block> TUFF_SLAB = RegistryNeoForge.registerBlockAndBlockItem("tuff_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.TUFF)));
    public static final RegistryObject<Block> DRIPSTONE_BLOCK_SLAB = RegistryNeoForge.registerBlockAndBlockItem("dripstone_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> OBSIDIAN_SLAB = RegistryNeoForge.registerBlockAndBlockItem("obsidian_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OBSIDIAN)));
    public static final RegistryObject<Block> NETHERRACK_SLAB = RegistryNeoForge.registerBlockAndBlockItem("netherrack_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)));
    public static final RegistryObject<Block> CRIMSON_NYLIUM_SLAB = RegistryNeoForge.registerBlockAndBlockItem("crimson_nylium_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_NYLIUM)));
    public static final RegistryObject<Block> WARPED_NYLIUM_SLAB = RegistryNeoForge.registerBlockAndBlockItem("warped_nylium_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_NYLIUM)));

    public static final RegistryObject<Block> SOUL_SAND_SLAB = RegistryNeoForge.registerBlockAndBlockItem("soul_sand_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_SAND)));
    public static final RegistryObject<Block> SOUL_SOIL_SLAB = RegistryNeoForge.registerBlockAndBlockItem("soul_soil_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_SOIL)));
    public static final RegistryObject<Block> BONE_BLOCK_SLAB = RegistryNeoForge.registerBlockAndBlockItem("bone_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BONE_BLOCK)));
    public static final RegistryObject<Block> BASALT_SLAB = RegistryNeoForge.registerBlockAndBlockItem("basalt_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BASALT)));
    public static final RegistryObject<Block> SMOOTH_BASALT_SLAB = RegistryNeoForge.registerBlockAndBlockItem("smooth_basalt_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_BASALT)));
    public static final RegistryObject<Block> POLISHED_BASALT_SLAB = RegistryNeoForge.registerBlockAndBlockItem("polished_basalt_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_BASALT)));
    public static final RegistryObject<Block> END_STONE_SLAB = RegistryNeoForge.registerBlockAndBlockItem("end_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE)));

    public static final RegistryObject<Block> COAL_ORE_SLAB = RegistryNeoForge.registerBlockAndBlockItem("coal_ore_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.COAL_ORE)));
    public static final RegistryObject<Block> DEEPSLATE_COAL_ORE_SLAB = RegistryNeoForge.registerBlockAndBlockItem("deepslate_coal_ore_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_COAL_ORE)));
    public static final RegistryObject<Block> IRON_ORE_SLAB = RegistryNeoForge.registerBlockAndBlockItem("iron_ore_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)));
    public static final RegistryObject<Block> DEEPSLATE_IRON_ORE_SLAB = RegistryNeoForge.registerBlockAndBlockItem("deepslate_iron_ore_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)));
    public static final RegistryObject<Block> COPPER_ORE_SLAB = RegistryNeoForge.registerBlockAndBlockItem("copper_ore_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_ORE)));
    public static final RegistryObject<Block> DEEPSLATE_COPPER_ORE_SLAB = RegistryNeoForge.registerBlockAndBlockItem("deepslate_copper_ore_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_COPPER_ORE)));
    public static final RegistryObject<Block> GOLD_ORE_SLAB = RegistryNeoForge.registerBlockAndBlockItem("gold_ore_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_ORE)));
    public static final RegistryObject<Block> DEEPSLATE_GOLD_ORE_SLAB = RegistryNeoForge.registerBlockAndBlockItem("deepslate_gold_ore_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_GOLD_ORE)));
    public static final RegistryObject<Block> EMERALD_ORE_SLAB = RegistryNeoForge.registerBlockAndBlockItem("emerald_ore_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.EMERALD_ORE)));
    public static final RegistryObject<Block> DEEPSLATE_EMERALD_ORE_SLAB = RegistryNeoForge.registerBlockAndBlockItem("deepslate_emerald_ore_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_EMERALD_ORE)));
    public static final RegistryObject<Block> LAPIS_ORE_SLAB = RegistryNeoForge.registerBlockAndBlockItem("lapis_ore_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LAPIS_ORE)));
    public static final RegistryObject<Block> DEEPSLATE_LAPIS_ORE_SLAB = RegistryNeoForge.registerBlockAndBlockItem("deepslate_lapis_ore_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_LAPIS_ORE)));
    public static final RegistryObject<Block> DIAMOND_ORE_SLAB = RegistryNeoForge.registerBlockAndBlockItem("diamond_ore_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)));
    public static final RegistryObject<Block> DEEPSLATE_DIAMOND_ORE_SLAB = RegistryNeoForge.registerBlockAndBlockItem("deepslate_diamond_ore_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_DIAMOND_ORE)));
    public static final RegistryObject<Block> NETHER_GOLD_ORE_SLAB = RegistryNeoForge.registerBlockAndBlockItem("nether_gold_ore_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_GOLD_ORE)));
    public static final RegistryObject<Block> NETHER_QUARTZ_ORE_SLAB = RegistryNeoForge.registerBlockAndBlockItem("nether_quartz_ore_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_QUARTZ_ORE)));

    public static final RegistryObject<Block> ANCIENT_DEBRIS_SLAB = RegistryNeoForge.registerBlockAndBlockItem("ancient_debris_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.ANCIENT_DEBRIS)));
    public static final RegistryObject<Block> RAW_IRON_BLOCK_SLAB = RegistryNeoForge.registerBlockAndBlockItem("raw_iron_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK)));
    public static final RegistryObject<Block> RAW_COPPER_BLOCK_SLAB = RegistryNeoForge.registerBlockAndBlockItem("raw_copper_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.RAW_COPPER_BLOCK)));
    public static final RegistryObject<Block> RAW_GOLD_BLOCK_SLAB = RegistryNeoForge.registerBlockAndBlockItem("raw_gold_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.RAW_GOLD_BLOCK)));
    public static final RegistryObject<Block> AMETHYST_BLOCK_SLAB = RegistryNeoForge.registerBlockAndBlockItem("amethyst_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)));
    public static final RegistryObject<Block> BUDDING_AMETHYST_SLAB = RegistryNeoForge.registerBlockAndBlockItem("budding_amethyst_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BUDDING_AMETHYST)));

    public static final RegistryObject<Block> BROWN_MUSHROOM_BLOCK_SLAB = RegistryNeoForge.registerBlockAndBlockItem("brown_mushroom_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_MUSHROOM_BLOCK)));
    public static final RegistryObject<Block> RED_MUSHROOM_BLOCK_SLAB = RegistryNeoForge.registerBlockAndBlockItem("red_mushroom_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM_BLOCK)));
    public static final RegistryObject<Block> NETHER_WART_BLOCK_SLAB = RegistryNeoForge.registerBlockAndBlockItem("nether_wart_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_WART_BLOCK)));
    public static final RegistryObject<Block> WARPED_WART_BLOCK_SLAB = RegistryNeoForge.registerBlockAndBlockItem("warped_wart_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_WART_BLOCK)));

    public static final RegistryObject<Block> DRIED_KELP_BLOCK_SLAB = RegistryNeoForge.registerBlockAndBlockItem("dried_kelp_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DRIED_KELP_BLOCK)));
    public static final RegistryObject<Block> TUBE_CORAL_BLOCK_SLAB = RegistryNeoForge.registerBlockAndBlockItem("tube_coral_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.TUBE_CORAL_BLOCK)));
    public static final RegistryObject<Block> BRAIN_CORAL_BLOCK_SLAB = RegistryNeoForge.registerBlockAndBlockItem("brain_coral_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRAIN_CORAL_BLOCK)));
    public static final RegistryObject<Block> BUBBLE_CORAL_BLOCK_SLAB = RegistryNeoForge.registerBlockAndBlockItem("bubble_coral_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BUBBLE_CORAL_BLOCK)));
    public static final RegistryObject<Block> FIRE_CORAL_BLOCK_SLAB = RegistryNeoForge.registerBlockAndBlockItem("fire_coral_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.FIRE_CORAL_BLOCK)));
    public static final RegistryObject<Block> HORN_CORAL_BLOCK_SLAB = RegistryNeoForge.registerBlockAndBlockItem("horn_coral_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.HORN_CORAL_BLOCK)));
    public static final RegistryObject<Block> DEAD_TUBE_CORAL_BLOCK_SLAB = RegistryNeoForge.registerBlockAndBlockItem("dead_tube_coral_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DEAD_TUBE_CORAL_BLOCK)));
    public static final RegistryObject<Block> DEAD_BRAIN_CORAL_BLOCK_SLAB = RegistryNeoForge.registerBlockAndBlockItem("dead_brain_coral_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DEAD_BRAIN_CORAL_BLOCK)));
    public static final RegistryObject<Block> DEAD_BUBBLE_CORAL_BLOCK_SLAB = RegistryNeoForge.registerBlockAndBlockItem("dead_bubble_coral_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DEAD_BUBBLE_CORAL_BLOCK)));
    public static final RegistryObject<Block> DEAD_FIRE_CORAL_BLOCK_SLAB = RegistryNeoForge.registerBlockAndBlockItem("dead_fire_coral_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DEAD_FIRE_CORAL_BLOCK)));
    public static final RegistryObject<Block> DEAD_HORN_CORAL_BLOCK_SLAB = RegistryNeoForge.registerBlockAndBlockItem("dead_horn_coral_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DEAD_HORN_CORAL_BLOCK)));

    public static final RegistryObject<Block> SPONGE_SLAB = RegistryNeoForge.registerBlockAndBlockItem("sponge_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SPONGE)));
    public static final RegistryObject<Block> WET_SPONGE_SLAB = RegistryNeoForge.registerBlockAndBlockItem("wet_sponge_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WET_SPONGE)));

    public static final RegistryObject<Block> MELON_SLAB = RegistryNeoForge.registerBlockAndBlockItem("melon_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.MELON)));
    public static final RegistryObject<Block> PUMPKIN_SLAB = RegistryNeoForge.registerBlockAndBlockItem("pumpkin_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.PUMPKIN)));

    public static final RegistryObject<Block> HAY_BLOCK_SLAB = RegistryNeoForge.registerBlockAndBlockItem("hay_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.HAY_BLOCK)));
    public static final RegistryObject<Block> HONEYCOMB_BLOCK_SLAB = RegistryNeoForge.registerBlockAndBlockItem("honeycomb_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.HONEYCOMB_BLOCK)));
    public static final RegistryObject<Block> SLIME_BLOCK_SLAB = RegistryNeoForge.registerBlockAndBlockItem("slime_block_slab", () -> new SlimeSlabBlock(BlockBehaviour.Properties.copy(Blocks.SLIME_BLOCK)));
    public static final RegistryObject<Block> HONEY_BLOCK_SLAB = RegistryNeoForge.registerBlockAndBlockItem("honey_block_slab", () -> new HoneySlabBlock(BlockBehaviour.Properties.copy(Blocks.HONEY_BLOCK)));

    public static final RegistryObject<Block> SCULK_SLAB = RegistryNeoForge.registerBlockAndBlockItem("sculk_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SCULK)));
    public static final RegistryObject<Block> SCULK_CATALYST_SLAB = RegistryNeoForge.registerBlockAndBlockItem("sculk_catalyst_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SCULK_CATALYST)));

    // BUILDING
    public static final RegistryObject<Block> CRACKED_STONE_BRICKS_SLAB = RegistryNeoForge.registerBlockAndBlockItem("cracked_stone_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CRACKED_STONE_BRICKS)));
    public static final RegistryObject<Block> CRACKED_DEEPSLATE_BRICKS_SLAB = RegistryNeoForge.registerBlockAndBlockItem("cracked_deepslate_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CRACKED_DEEPSLATE_BRICKS)));
    public static final RegistryObject<Block> CRACKED_DEEPSLATE_TILES_SLAB = RegistryNeoForge.registerBlockAndBlockItem("cracked_deepslate_tiles_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CRACKED_DEEPSLATE_TILES)));
    public static final RegistryObject<Block> CRACKED_NETHER_BRICKS_SLAB = RegistryNeoForge.registerBlockAndBlockItem("cracked_nether_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CRACKED_NETHER_BRICKS)));
    public static final RegistryObject<Block> CRACKED_POLISHED_BLACKSTONE_BRICKS_SLAB = RegistryNeoForge.registerBlockAndBlockItem("cracked_polished_blackstone_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS)));

    public static final RegistryObject<Block> CHISELED_STONE_BRICKS_SLAB = RegistryNeoForge.registerBlockAndBlockItem("chiseled_stone_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final RegistryObject<Block> CHISELED_DEEPSLATE_SLAB = RegistryNeoForge.registerBlockAndBlockItem("chiseled_deepslate_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CHISELED_DEEPSLATE)));
    public static final RegistryObject<Block> CHISELED_SANDSTONE_SLAB = RegistryNeoForge.registerBlockAndBlockItem("chiseled_sandstone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CHISELED_SANDSTONE)));
    public static final RegistryObject<Block> CHISELED_RED_SANDSTONE_SLAB = RegistryNeoForge.registerBlockAndBlockItem("chiseled_red_sandstone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CHISELED_RED_SANDSTONE)));
    public static final RegistryObject<Block> CHISELED_NETHER_BRICKS_SLAB = RegistryNeoForge.registerBlockAndBlockItem("chiseled_nether_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CHISELED_NETHER_BRICKS)));
    public static final RegistryObject<Block> CHISELED_POLISHED_BLACKSTONE_SLAB = RegistryNeoForge.registerBlockAndBlockItem("chiseled_polished_blackstone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CHISELED_POLISHED_BLACKSTONE)));
    public static final RegistryObject<Block> CHISELED_QUARTZ_BLOCK_SLAB = RegistryNeoForge.registerBlockAndBlockItem("chiseled_quartz_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CHISELED_QUARTZ_BLOCK)));

    public static final RegistryObject<Block> PACKED_MUD_SLAB = RegistryNeoForge.registerBlockAndBlockItem("packed_mud_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD)));

    public static final RegistryObject<Block> GILDED_BLACKSTONE_SLAB = RegistryNeoForge.registerBlockAndBlockItem("gilded_blackstone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GILDED_BLACKSTONE)));

    public static final RegistryObject<Block> COAL_BLOCK_SLAB = RegistryNeoForge.registerBlockAndBlockItem("coal_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.COAL_BLOCK)));
    public static final RegistryObject<Block> IRON_BLOCK_SLAB = RegistryNeoForge.registerBlockAndBlockItem("iron_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> GOLD_BLOCK_SLAB = RegistryNeoForge.registerBlockAndBlockItem("gold_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK)));
    public static final RegistryObject<Block> REDSTONE_BLOCK_SLAB = RegistryNeoForge.registerBlockAndBlockItem("redstone_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_BLOCK)));
    public static final RegistryObject<Block> EMERALD_BLOCK_SLAB = RegistryNeoForge.registerBlockAndBlockItem("emerald_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK)));
    public static final RegistryObject<Block> LAPIS_BLOCK_SLAB = RegistryNeoForge.registerBlockAndBlockItem("lapis_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LAPIS_BLOCK)));
    public static final RegistryObject<Block> DIAMOND_BLOCK_SLAB = RegistryNeoForge.registerBlockAndBlockItem("diamond_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK)));
    public static final RegistryObject<Block> NETHERITE_BLOCK_SLAB = RegistryNeoForge.registerBlockAndBlockItem("netherite_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK)));

    public static final RegistryObject<Block> COPPER_BLOCK_SLAB = RegistryNeoForge.registerBlockAndBlockItem("copper_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK)));
    public static final RegistryObject<Block> EXPOSED_COPPER_SLAB = RegistryNeoForge.registerBlockAndBlockItem("exposed_copper_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.EXPOSED_COPPER)));
    public static final RegistryObject<Block> WEATHERED_COPPER_SLAB = RegistryNeoForge.registerBlockAndBlockItem("weathered_copper_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WEATHERED_COPPER)));
    public static final RegistryObject<Block> OXIDIZED_COPPER_SLAB = RegistryNeoForge.registerBlockAndBlockItem("oxidized_copper_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OXIDIZED_COPPER)));
    public static final RegistryObject<Block> WAXED_COPPER_BLOCK_SLAB = RegistryNeoForge.registerBlockAndBlockItem("waxed_copper_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_COPPER_BLOCK)));
    public static final RegistryObject<Block> WAXED_EXPOSED_COPPER_SLAB = RegistryNeoForge.registerBlockAndBlockItem("waxed_exposed_copper_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_EXPOSED_COPPER)));
    public static final RegistryObject<Block> WAXED_WEATHERED_COPPER_SLAB = RegistryNeoForge.registerBlockAndBlockItem("waxed_weathered_copper_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_WEATHERED_COPPER)));
    public static final RegistryObject<Block> WAXED_OXIDIZED_COPPER_SLAB = RegistryNeoForge.registerBlockAndBlockItem("waxed_oxidized_copper_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_OXIDIZED_COPPER)));
}
