package com.cursee.new_slab_variants;

import com.cursee.new_slab_variants.core.common.registry.ModBlocksNeoForge;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.BlockAndTintGetter;
import net.minecraft.world.level.FoliageColor;
import net.minecraft.world.level.GrassColor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Constants.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class NewSlabVariantsClientNeoForge {

    @SubscribeEvent
    public static void registerBlockColors(RegisterColorHandlersEvent.Block event) {

        event.register((p_276237_, p_276238_, p_276239_, p_276240_) -> {
            return p_276238_ != null && p_276239_ != null ? BiomeColors.getAverageGrassColor(p_276238_, p_276239_) : GrassColor.getDefaultColor();
        }, ModBlocksNeoForge.GRASS_BLOCK_SLAB.get());

        event.register((state, tintGetter, pos, tintIndex) -> {
            return FoliageColor.getEvergreenColor();
        }, ModBlocksNeoForge.SPRUCE_LEAVES_SLAB.get());
        event.register((state, tintGetter, pos, tintIndex) -> {
            return FoliageColor.getBirchColor();
        }, ModBlocksNeoForge.BIRCH_LEAVES_SLAB.get());
        event.register((state, tintGetter, pos, tintIndex) -> {
            return tintGetter != null && pos != null ? BiomeColors.getAverageFoliageColor(tintGetter, pos) : FoliageColor.getDefaultColor();
        }, ModBlocksNeoForge.OAK_LEAVES_SLAB.get(), ModBlocksNeoForge.JUNGLE_LEAVES_SLAB.get(), ModBlocksNeoForge.ACACIA_LEAVES_SLAB.get(), ModBlocksNeoForge.DARK_OAK_LEAVES_SLAB.get(), ModBlocksNeoForge.MANGROVE_LEAVES_SLAB.get());
    }

    @SubscribeEvent
    public static void registerItemColors(RegisterColorHandlersEvent.Item event) {

        event.register((p_92687_, p_92688_) -> {
            BlockState blockstate = ((BlockItem)p_92687_.getItem()).getBlock().defaultBlockState();
            return event.getBlockColors().getColor(blockstate, (BlockAndTintGetter)null, (BlockPos)null, p_92688_);
        }, ModBlocksNeoForge.GRASS_BLOCK_SLAB.get());

        event.register((stack, tintIndex) -> {
            return FoliageColor.getMangroveColor();
        }, ModBlocksNeoForge.MANGROVE_LEAVES_SLAB.get());

        event.register((stack, tintIndex) -> {
            BlockState state = ((BlockItem)stack.getItem()).getBlock().defaultBlockState();
            return event.getBlockColors().getColor(state, (BlockAndTintGetter)null, (BlockPos)null, tintIndex);
        }, ModBlocksNeoForge.OAK_LEAVES_SLAB.get(), ModBlocksNeoForge.SPRUCE_LEAVES_SLAB.get(), ModBlocksNeoForge.BIRCH_LEAVES_SLAB.get(), ModBlocksNeoForge.JUNGLE_LEAVES_SLAB.get(), ModBlocksNeoForge.ACACIA_LEAVES_SLAB.get(), ModBlocksNeoForge.DARK_OAK_LEAVES_SLAB.get());

    }
}

