package com.cursee.new_slab_variants;

import com.cursee.new_slab_variants.core.client.entity.renderer.PrimedTNTSlabRenderer;
import com.cursee.new_slab_variants.core.common.registry.ModBlocksFabric;
import com.cursee.new_slab_variants.core.common.registry.ModEntityTypesFabric;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.BlockAndTintGetter;
import net.minecraft.world.level.FoliageColor;
import net.minecraft.world.level.block.state.BlockState;

public class NewSlabVariantsClientFabric implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        EntityRendererRegistry.register(ModEntityTypesFabric.PRIMED_TNT_SLAB, PrimedTNTSlabRenderer::new);
        
        ColorProviderRegistry.BLOCK.register((state, tintGetter, pos, tintIndex) -> {
            return FoliageColor.getEvergreenColor();
        }, ModBlocksFabric.SPRUCE_LEAVES_SLAB);
        
        ColorProviderRegistry.BLOCK.register((state, tintGetter, pos, tintIndex) -> {
            return FoliageColor.getBirchColor();
        }, ModBlocksFabric.BIRCH_LEAVES_SLAB);
        
        ColorProviderRegistry.BLOCK.register((state, tintGetter, pos, tintIndex) -> {
            return tintGetter != null && pos != null ? BiomeColors.getAverageFoliageColor(tintGetter, pos) : FoliageColor.getDefaultColor();
        }, ModBlocksFabric.OAK_LEAVES_SLAB, ModBlocksFabric.JUNGLE_LEAVES_SLAB, ModBlocksFabric.ACACIA_LEAVES_SLAB, ModBlocksFabric.DARK_OAK_LEAVES_SLAB, ModBlocksFabric.MANGROVE_LEAVES_SLAB);
        
        ColorProviderRegistry.ITEM.register((a, b) -> {return 0;});

        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> {
            return FoliageColor.getMangroveColor();
        }, ModBlocksFabric.MANGROVE_LEAVES_SLAB);

        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> {
//            BlockState state = ((BlockItem)stack.getItem()).getBlock().defaultBlockState();
//            return event.getBlockColors().getColor(state, (BlockAndTintGetter)null, (BlockPos)null, tintIndex);
            return FoliageColor.getDefaultColor();
        }, ModBlocksFabric.OAK_LEAVES_SLAB, ModBlocksFabric.SPRUCE_LEAVES_SLAB, ModBlocksFabric.BIRCH_LEAVES_SLAB, ModBlocksFabric.JUNGLE_LEAVES_SLAB, ModBlocksFabric.ACACIA_LEAVES_SLAB, ModBlocksFabric.DARK_OAK_LEAVES_SLAB);

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocksFabric.HONEY_BLOCK_SLAB, RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocksFabric.SLIME_BLOCK_SLAB, RenderType.translucent());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocksFabric.GLASS_SLAB, RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocksFabric.TINTED_GLASS_SLAB, RenderType.translucent());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocksFabric.WHITE_STAINED_GLASS_SLAB, RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocksFabric.LIGHT_GRAY_STAINED_GLASS_SLAB, RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocksFabric.GRAY_STAINED_GLASS_SLAB, RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocksFabric.BLACK_STAINED_GLASS_SLAB, RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocksFabric.BROWN_STAINED_GLASS_SLAB, RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocksFabric.RED_STAINED_GLASS_SLAB, RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocksFabric.ORANGE_STAINED_GLASS_SLAB, RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocksFabric.YELLOW_STAINED_GLASS_SLAB, RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocksFabric.LIME_STAINED_GLASS_SLAB, RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocksFabric.GREEN_STAINED_GLASS_SLAB, RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocksFabric.CYAN_STAINED_GLASS_SLAB, RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocksFabric.LIGHT_BLUE_STAINED_GLASS_SLAB, RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocksFabric.BLUE_STAINED_GLASS_SLAB, RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocksFabric.PURPLE_STAINED_GLASS_SLAB, RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocksFabric.MAGENTA_STAINED_GLASS_SLAB, RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocksFabric.PINK_STAINED_GLASS_SLAB, RenderType.translucent());
    }
}
