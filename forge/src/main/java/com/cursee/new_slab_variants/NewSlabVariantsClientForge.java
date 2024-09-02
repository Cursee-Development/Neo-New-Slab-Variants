package com.cursee.new_slab_variants;

import com.cursee.new_slab_variants.core.common.registry.ModBlocksForge;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.BlockAndTintGetter;
import net.minecraft.world.level.FoliageColor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Constants.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class NewSlabVariantsClientForge {

    @SubscribeEvent
    public static void registerBlockColors(RegisterColorHandlersEvent.Block event) {

//        event.getBlockColors().register((state, blockAndTintGetter, pos, value) -> {
//            return blockAndTintGetter != null && pos != null ? BiomeColors.getAverageFoliageColor(blockAndTintGetter, pos) : FoliageColor.getDefaultColor();
//        }, ModBlocksForge.OAK_LEAVES_SLAB.get());

//        event.register((state, blockAndTintGetter, pos, value) -> {
//            return blockAndTintGetter != null && pos != null ? BiomeColors.getAverageFoliageColor(blockAndTintGetter, pos) : FoliageColor.getDefaultColor();
//        }, ModBlocksForge.OAK_LEAVES_SLAB.get());

        event.register((state, tintGetter, pos, tintIndex) -> {
            return FoliageColor.getEvergreenColor();
        }, ModBlocksForge.SPRUCE_LEAVES_SLAB.get());
        event.register((state, tintGetter, pos, tintIndex) -> {
            return FoliageColor.getBirchColor();
        }, ModBlocksForge.BIRCH_LEAVES_SLAB.get());
        event.register((state, tintGetter, pos, tintIndex) -> {
            return tintGetter != null && pos != null ? BiomeColors.getAverageFoliageColor(tintGetter, pos) : FoliageColor.getDefaultColor();
        }, ModBlocksForge.OAK_LEAVES_SLAB.get(), ModBlocksForge.JUNGLE_LEAVES_SLAB.get(), ModBlocksForge.ACACIA_LEAVES_SLAB.get(), ModBlocksForge.DARK_OAK_LEAVES_SLAB.get(), ModBlocksForge.MANGROVE_LEAVES_SLAB.get());
    }

    @SubscribeEvent
    public static void registerItemColors(RegisterColorHandlersEvent.Item event) {

//        event.getItemColors().register((stack, value) -> {
//            BlockState $$3 = ((BlockItem)stack.getItem()).getBlock().defaultBlockState();
//            return event.getBlockColors().getColor($$3, (BlockAndTintGetter)null, (BlockPos)null, value);
//        }, ModBlocksForge.OAK_LEAVES_SLAB.get());

//        event.register((stack, value) -> {
//            BlockState $$3 = ((BlockItem)stack.getItem()).getBlock().defaultBlockState();
//            return event.getBlockColors().getColor($$3, (BlockAndTintGetter)null, (BlockPos)null, value);
//        }, ModBlocksForge.OAK_LEAVES_SLAB.get());

        event.register((stack, tintIndex) -> {
            return FoliageColor.getMangroveColor();
        }, ModBlocksForge.MANGROVE_LEAVES_SLAB.get());

        event.register((stack, tintIndex) -> {
            BlockState state = ((BlockItem)stack.getItem()).getBlock().defaultBlockState();
            return event.getBlockColors().getColor(state, (BlockAndTintGetter)null, (BlockPos)null, tintIndex);
        }, ModBlocksForge.OAK_LEAVES_SLAB.get(), ModBlocksForge.SPRUCE_LEAVES_SLAB.get(), ModBlocksForge.BIRCH_LEAVES_SLAB.get(), ModBlocksForge.JUNGLE_LEAVES_SLAB.get(), ModBlocksForge.ACACIA_LEAVES_SLAB.get(), ModBlocksForge.DARK_OAK_LEAVES_SLAB.get());

    }
}
