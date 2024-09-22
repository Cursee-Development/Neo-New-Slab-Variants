package com.cursee.new_slab_variants;

import com.cursee.new_slab_variants.core.client.entity.renderer.PrimedTNTSlabRenderer;
import com.cursee.new_slab_variants.core.common.registry.ModBlocksForge;
import com.cursee.new_slab_variants.core.common.registry.ModEntityTypesForge;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.BlockAndTintGetter;
import net.minecraft.world.level.FoliageColor;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;

@SuppressWarnings("unused")
@EventBusSubscriber(modid = Constants.MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class NewSlabVariantsClientNeoForge {

    @SubscribeEvent
    public static void onRegisterRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(ModEntityTypesForge.PRIMED_TNT_SLAB.get(), PrimedTNTSlabRenderer::new);
    }

    @SubscribeEvent
    public static void registerBlockColors(RegisterColorHandlersEvent.Block event) {

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

        event.register((stack, tintIndex) -> {
            return FoliageColor.getMangroveColor();
        }, ModBlocksForge.MANGROVE_LEAVES_SLAB.get());

        event.register((stack, tintIndex) -> {
            BlockState state = ((BlockItem)stack.getItem()).getBlock().defaultBlockState();
            return event.getBlockColors().getColor(state, (BlockAndTintGetter)null, (BlockPos)null, tintIndex);
        }, ModBlocksForge.OAK_LEAVES_SLAB.get(), ModBlocksForge.SPRUCE_LEAVES_SLAB.get(), ModBlocksForge.BIRCH_LEAVES_SLAB.get(), ModBlocksForge.JUNGLE_LEAVES_SLAB.get(), ModBlocksForge.ACACIA_LEAVES_SLAB.get(), ModBlocksForge.DARK_OAK_LEAVES_SLAB.get());
    }
}