import os
from fileinput import filename
from tkinter.font import names

filenames = ["WHITE_WOOL_SLAB",
             "LIGHT_GRAY_WOOL_SLAB",
             "GRAY_WOOL_SLAB",
             "BLACK_WOOL_SLAB",
             "BROWN_WOOL_SLAB",
             "RED_WOOL_SLAB",
             "ORANGE_WOOL_SLAB",
             "YELLOW_WOOL_SLAB",
             "LIME_WOOL_SLAB",
             "GREEN_WOOL_SLAB",
             "CYAN_WOOL_SLAB",
             "LIGHT_BLUE_WOOL_SLAB",
             "BLUE_WOOL_SLAB",
             "PURPLE_WOOL_SLAB",
             "MAGENTA_WOOL_SLAB",
             "PINK_WOOL_SLAB",
             "TERRACOTTA_SLAB",

             "WHITE_TERRACOTTA_SLAB",
             "LIGHT_GRAY_TERRACOTTA_SLAB",
             "GRAY_TERRACOTTA_SLAB",
             "BLACK_TERRACOTTA_SLAB",
             "BROWN_TERRACOTTA_SLAB",
             "RED_TERRACOTTA_SLAB",
             "ORANGE_TERRACOTTA_SLAB",
             "YELLOW_TERRACOTTA_SLAB",
             "LIME_TERRACOTTA_SLAB",
             "GREEN_TERRACOTTA_SLAB",
             "CYAN_TERRACOTTA_SLAB",
             "LIGHT_BLUE_TERRACOTTA_SLAB",
             "BLUE_TERRACOTTA_SLAB",
             "PURPLE_TERRACOTTA_SLAB",
             "MAGENTA_TERRACOTTA_SLAB",
             "PINK_TERRACOTTA_SLAB",

             "WHITE_GLAZED_TERRACOTTA_SLAB",
             "LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB",
             "GRAY_GLAZED_TERRACOTTA_SLAB",
             "BLACK_GLAZED_TERRACOTTA_SLAB",
             "BROWN_GLAZED_TERRACOTTA_SLAB",
             "RED_GLAZED_TERRACOTTA_SLAB",
             "ORANGE_GLAZED_TERRACOTTA_SLAB",
             "YELLOW_GLAZED_TERRACOTTA_SLAB",
             "LIME_GLAZED_TERRACOTTA_SLAB",
             "GREEN_GLAZED_TERRACOTTA_SLAB",
             "CYAN_GLAZED_TERRACOTTA_SLAB",
             "LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB",
             "BLUE_GLAZED_TERRACOTTA_SLAB",
             "PURPLE_GLAZED_TERRACOTTA_SLAB",
             "MAGENTA_GLAZED_TERRACOTTA_SLAB",
             "PINK_GLAZED_TERRACOTTA_SLAB",

             "WHITE_CONCRETE_SLAB",
             "LIGHT_GRAY_CONCRETE_SLAB",
             "GRAY_CONCRETE_SLAB",
             "BLACK_CONCRETE_SLAB",
             "BROWN_CONCRETE_SLAB",
             "RED_CONCRETE_SLAB",
             "ORANGE_CONCRETE_SLAB",
             "YELLOW_CONCRETE_SLAB",
             "LIME_CONCRETE_SLAB",
             "GREEN_CONCRETE_SLAB",
             "CYAN_CONCRETE_SLAB",
             "LIGHT_BLUE_CONCRETE_SLAB",
             "BLUE_CONCRETE_SLAB",
             "PURPLE_CONCRETE_SLAB",
             "MAGENTA_CONCRETE_SLAB",
             "PINK_CONCRETE_SLAB",

             "GLASS_SLAB",
             "TINTED_GLASS_SLAB",
             "WHITE_STAINED_GLASS_SLAB",
             "LIGHT_GRAY_STAINED_GLASS_SLAB",
             "GRAY_STAINED_GLASS_SLAB",
             "BLACK_STAINED_GLASS_SLAB",
             "BROWN_STAINED_GLASS_SLAB",
             "RED_STAINED_GLASS_SLAB",
             "ORANGE_STAINED_GLASS_SLAB",
             "YELLOW_STAINED_GLASS_SLAB",
             "LIME_STAINED_GLASS_SLAB",
             "GREEN_STAINED_GLASS_SLAB",
             "CYAN_STAINED_GLASS_SLAB",
             "LIGHT_BLUE_STAINED_GLASS_SLAB",
             "BLUE_STAINED_GLASS_SLAB",
             "PURPLE_STAINED_GLASS_SLAB",
             "MAGENTA_STAINED_GLASS_SLAB",
             "PINK_STAINED_GLASS_SLAB",

             "OAK_LOG_SLAB",
             "OAK_WOOD_SLAB",
             "STRIPPED_OAK_LOG_SLAB",
             "STRIPPED_OAK_WOOD_SLAB",
             "SPRUCE_LOG_SLAB",
             "SPRUCE_WOOD_SLAB",
             "STRIPPED_SPRUCE_LOG_SLAB",
             "STRIPPED_SPRUCE_WOOD_SLAB",
             "BIRCH_LOG_SLAB",
             "BIRCH_WOOD_SLAB",
             "STRIPPED_BIRCH_LOG_SLAB",
             "STRIPPED_BIRCH_WOOD_SLAB",
             "JUNGLE_LOG_SLAB",
             "JUNGLE_WOOD_SLAB",
             "STRIPPED_JUNGLE_LOG_SLAB",
             "STRIPPED_JUNGLE_WOOD_SLAB",
             "ACACIA_LOG_SLAB",
             "ACACIA_WOOD_SLAB",
             "STRIPPED_ACACIA_LOG_SLAB",
             "STRIPPED_ACACIA_WOOD_SLAB",
             "DARK_OAK_LOG_SLAB",
             "DARK_OAK_WOOD_SLAB",
             "STRIPPED_DARK_OAK_LOG_SLAB",
             "STRIPPED_DARK_OAK_WOOD_SLAB",
             "MANGROVE_LOG_SLAB",
             "MANGROVE_WOOD_SLAB",
             "STRIPPED_MANGROVE_LOG_SLAB",
             "STRIPPED_MANGROVE_WOOD_SLAB",
             "CHERRY_LOG_SLAB",
             "CHERRY_WOOD_SLAB",
             "STRIPPED_CHERRY_LOG_SLAB",
             "STRIPPED_CHERRY_WOOD_SLAB",
             "BAMBOO_BLOCK_SLAB",
             "STRIPPED_BAMBOO_BLOCK_SLAB",

             "OAK_LEAVES_SLAB",
             "SPRUCE_LEAVES_SLAB",
             "BIRCH_LEAVES_SLAB",
             "JUNGLE_LEAVES_SLAB",
             "ACACIA_LEAVES_SLAB",
             "DARK_OAK_LEAVES_SLAB",
             "MANGROVE_LEAVES_SLAB",
             "CHERRY_LEAVES_SLAB",
             "AZALEA_LEAVES_SLAB",
             "FLOWERING_AZALEA_LEAVES_SLAB",

             "SEA_LANTERN_SLAB",
             "REDSTONE_LAMP_SLAB",
             "GLOWSTONE_SLAB",
             "SHROOMLIGHT_SLAB",
             "OCHRE_FROGLIGHT_SLAB",
             "VERDANT_FROGLIGHT_SLAB",
             "PEARLESCENT_FROGLIGHT_SLAB",
             "CRYING_OBSIDIAN_SLAB",
             "MAGMA_BLOCK_SLAB",
             "LADDER_SLAB",
             "SCAFFOLDING_SLAB",
             "BOOKSHELF_SLAB",

             "INFESTED_STONE_SLAB",
             "INFESTED_COBBLESTONE_SLAB",
             "INFESTED_STONE_BRICKS_SLAB",
             "INFESTED_MOSSY_STONE_BRICKS_SLAB",
             "INFESTED_CRACKED_STONE_BRICKS_SLAB",
             "INFESTED_CHISELED_STONE_BRICKS_SLAB",
             "INFESTED_DEEPSLATE_SLAB",

             "MUD_SLAB",
             "CLAY_SLAB",

             "ICE_SLAB",
             "PACKED_ICE_SLAB",
             "BLUE_ICE_SLAB",
             "SNOW_BLOCK_SLAB",
             "MOSS_BLOCK_SLAB",

             "DEEPSLATE_SLAB",
             "CALCITE_SLAB",
             "TUFF_SLAB",
             "DRIPSTONE_BLOCK_SLAB",
             "OBSIDIAN_SLAB",
             "NETHERRACK_SLAB",
             "CRIMSON_NYLIUM_SLAB",
             "WARPED_NYLIUM_SLAB",

             "SOUL_SAND_SLAB",
             "SOUL_SOIL_SLAB",
             "BONE_BLOCK_SLAB",
             "BASALT_SLAB",
             "SMOOTH_BASALT_SLAB",
             "POLISHED_BASALT_SLAB",
             "END_STONE_SLAB",

             "COAL_ORE_SLAB",
             "DEEPSLATE_COAL_ORE_SLAB",
             "IRON_ORE_SLAB",
             "DEEPSLATE_IRON_ORE_SLAB",
             "COPPER_ORE_SLAB",
             "DEEPSLATE_COPPER_ORE_SLAB",
             "GOLD_ORE_SLAB",
             "DEEPSLATE_GOLD_ORE_SLAB",
             "REDSTONE_ORE_SLAB",
             "DEEPSLATE_REDSTONE_ORE_SLAB",
             "EMERALD_ORE_SLAB",
             "DEEPSLATE_EMERALD_ORE_SLAB",
             "LAPIS_ORE_SLAB",
             "DEEPSLATE_LAPIS_ORE_SLAB",
             "DIAMOND_ORE_SLAB",
             "DEEPSLATE_DIAMOND_ORE_SLAB",
             "NETHER_GOLD_ORE_SLAB",
             "NETHER_QUARTZ_ORE_SLAB",

             "ANCIENT_DEBRIS_SLAB",
             "RAW_IRON_BLOCK_SLAB",
             "RAW_COPPER_BLOCK_SLAB",
             "RAW_GOLD_BLOCK_SLAB",
             "AMETHYST_BLOCK_SLAB",
             "BUDDING_AMETHYST_SLAB",

             "BROWN_MUSHROOM_BLOCK_SLAB",
             "RED_MUSHROOM_BLOCK_SLAB",
             "NETHER_WART_BLOCK_SLAB",
             "WARPED_WART_BLOCK_SLAB",

             "DRIED_KELP_BLOCK_SLAB",
             "TUBE_CORAL_BLOCK_SLAB",
             "BRAIN_CORAL_BLOCK_SLAB",
             "BUBBLE_CORAL_BLOCK_SLAB",
             "FIRE_CORAL_BLOCK_SLAB",
             "HORN_CORAL_BLOCK_SLAB",
             "DEAD_TUBE_CORAL_BLOCK_SLAB",
             "DEAD_BRAIN_CORAL_BLOCK_SLAB",
             "DEAD_BUBBLE_CORAL_BLOCK_SLAB",
             "DEAD_FIRE_CORAL_BLOCK_SLAB",
             "DEAD_HORN_CORAL_BLOCK_SLAB",

             "SPONGE_SLAB",
             "WET_SPONGE_SLAB",
             "MELON_SLAB",
             "PUMPKIN_SLAB",
             "HAY_BLOCK_SLAB",
             "HONEYCOMB_BLOCK_SLAB",
             "SLIME_BLOCK_SLAB",
             "HONEY_BLOCK_SLAB",
             "SCULK_SLAB",
             "SCULK_CATALYST_SLAB",

             "CRACKED_STONE_BRICKS_SLAB",
             "CRACKED_DEEPSLATE_BRICKS_SLAB",
             "CRACKED_DEEPSLATE_TILES_SLAB",
             "CRACKED_NETHER_BRICKS_SLAB",
             "CRACKED_POLISHED_BLACKSTONE_BRICKS_SLAB",
             "CHISELED_STONE_BRICKS_SLAB",
             "CHISELED_DEEPSLATE_SLAB",
             "CHISELED_SANDSTONE_SLAB",
             "CHISELED_RED_SANDSTONE_SLAB",
             "CHISELED_NETHER_BRICKS_SLAB",
             "CHISELED_POLISHED_BLACKSTONE_SLAB",
             "CHISELED_QUARTZ_BLOCK_SLAB",

             "PACKED_MUD_SLAB",
             "GILDED_BLACKSTONE_SLAB",
             "COAL_BLOCK_SLAB",
             "IRON_BLOCK_SLAB",
             "GOLD_BLOCK_SLAB",
             "REDSTONE_BLOCK_SLAB",
             "EMERALD_BLOCK_SLAB",
             "LAPIS_BLOCK_SLAB",
             "DIAMOND_BLOCK_SLAB",
             "NETHERITE_BLOCK_SLAB",
             "COPPER_BLOCK_SLAB",
             "EXPOSED_COPPER_SLAB",
             "WEATHERED_COPPER_SLAB",
             "OXIDIZED_COPPER_SLAB",
             "WAXED_COPPER_BLOCK_SLAB",
             "WAXED_EXPOSED_COPPER_SLAB",
             "WAXED_WEATHERED_COPPER_SLAB",
             "WAXED_OXIDIZED_COPPER_SLAB"
             ]

# Generating Block Loot Table files
# folder_name = "loot_tables/blocks"
# os.makedirs(folder_name, exist_ok=True)
# template = """{
#   "type": "minecraft:block",
#   "pools": [
#     {
#       "bonus_rolls": 0.0,
#       "entries": [
#         {
#           "type": "minecraft:item",
#           "functions": [
#             {
#               "add": false,
#               "conditions": [
#                 {
#                   "block": "new_slab_variants:UPPER_slab",
#                   "condition": "minecraft:block_state_property",
#                   "properties": {
#                     "type": "double"
#                   }
#                 }
#               ],
#               "count": 2.0,
#               "function": "minecraft:set_count"
#             },
#             {
#               "function": "minecraft:explosion_decay"
#             }
#           ],
#           "name": "new_slab_variants:UPPER_slab"
#         }
#       ],
#       "rolls": 1.0
#     }
#   ],
#   "random_sequence": "new_slab_variants:blocks/UPPER_slab"
# }"""
#
# for name in filenames:
#
#     file_path = os.path.join(folder_name, f"{name.lower()}.json")
#     with open(file_path, 'w+') as file:
#         file.write(template.replace("UPPER", name.lower().replace("_slab", "")))

# Generating Recipe files
folder_name = "recipes"
os.makedirs(folder_name, exist_ok=True)
template = """{
  "type": "minecraft:crafting_shaped",
  "category": "building",
  "key": {
    "#": {
      "item": "minecraft:UPPER"
    }
  },
  "pattern": [
    "###"
  ],
  "result": {
    "count": 6,
    "item": "new_slab_variants:UPPER_slab"
  },
  "show_notification": true
}"""

for name in filenames:

    file_path = os.path.join(folder_name, f"{name.lower()}.json")
    with open(file_path, 'w+') as file:
        file.write(template.replace("UPPER", name.lower().replace("_slab", "")))

# Generating Advancement files
# folder_name = "advancements/recipes/building_blocks"
# os.makedirs(folder_name, exist_ok=True)
# template = """{
#   "parent": "minecraft:recipes/root",
#   "criteria": {
#     "has_UPPER": {
#       "conditions": {
#         "items": [
#           {
#             "items": [
#               "minecraft:UPPER"
#             ]
#           }
#         ]
#       },
#       "trigger": "minecraft:inventory_changed"
#     }
#   },
#   "requirements": [
#     [
#       "has_UPPER"
#     ]
#   ],
#   "rewards": {
#     "recipes": [
#       "new_slab_variants:UPPER_slab"
#     ]
#   },
#   "sends_telemetry_event": false
# }"""
#
# for name in filenames:
#
#     file_path = os.path.join(folder_name, f"{name.lower()}.json")
#     with open(file_path, 'w+') as file:
#         file.write(template.replace("UPPER", name.lower().replace("_slab", "")))