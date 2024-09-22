package com.cursee.new_slab_variants.core.client.entity.renderer;

import com.cursee.new_slab_variants.core.common.entity.PrimedTNTSlab;
import com.cursee.new_slab_variants.platform.Services;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.block.BlockRenderDispatcher;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.texture.TextureAtlas;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.SlabType;
import org.jetbrains.annotations.NotNull;

public class PrimedTNTSlabRenderer extends EntityRenderer<PrimedTNTSlab> {

    private final BlockRenderDispatcher blockRenderer;

    public PrimedTNTSlabRenderer(EntityRendererProvider.Context $$0) {
        super($$0);
        this.shadowRadius = 0.5F;
        this.blockRenderer = $$0.getBlockRenderDispatcher();
    }

    @Override @SuppressWarnings("deprecation")
    public @NotNull ResourceLocation getTextureLocation(@NotNull PrimedTNTSlab primedTNTSlab) {
        return TextureAtlas.LOCATION_BLOCKS;
    }

    @Override
    public void render(PrimedTNTSlab $$0, float $$1, float $$2, PoseStack $$3, MultiBufferSource $$4, int $$5) {
        $$3.pushPose();
        $$3.translate(0.0F, 0.5F, 0.0F);
        int $$6 = $$0.getFuse();

        if ((float)$$6 - $$2 + 1.0F < 10.0F) {
            float $$7 = 1.0F - ((float)$$6 - $$2 + 1.0F) / 10.0F;
            $$7 = Mth.clamp($$7, 0.0F, 1.0F);
            $$7 *= $$7;
            $$7 *= $$7;
            float $$8 = 1.0F + $$7 * 0.3F;
            $$3.scale($$8, $$8, $$8);
        }

        $$3.mulPose(Axis.YP.rotationDegrees(-90.0F));
        $$3.translate(-0.5F, -0.5F, 0.5F);
        $$3.mulPose(Axis.YP.rotationDegrees(90.0F));

        switch ($$0.getSlabType()) {
            case "bottom" -> {
                PrimedTNTSlabRenderer.renderWhiteSolidBlock(this.blockRenderer, Services.PLATFORM.getTNTSlabBlock().defaultBlockState().setValue(BlockStateProperties.SLAB_TYPE, SlabType.BOTTOM), $$3, $$4, $$5, $$6 / 5 % 2 == 0);
            }
            case "double" -> {
                PrimedTNTSlabRenderer.renderWhiteSolidBlock(this.blockRenderer, Services.PLATFORM.getTNTSlabBlock().defaultBlockState().setValue(BlockStateProperties.SLAB_TYPE, SlabType.DOUBLE), $$3, $$4, $$5, $$6 / 5 % 2 == 0);
            }
            case "top" -> {
                $$3.translate(0, -0.5F, 0);
                PrimedTNTSlabRenderer.renderWhiteSolidBlock(this.blockRenderer, Services.PLATFORM.getTNTSlabBlock().defaultBlockState().setValue(BlockStateProperties.SLAB_TYPE, SlabType.TOP), $$3, $$4, $$5, $$6 / 5 % 2 == 0);
            }
        }

        $$3.popPose();
        super.render($$0, $$1, $$2, $$3, $$4, $$5);
    }

    public static void renderWhiteSolidBlock(BlockRenderDispatcher $$0, BlockState $$1, PoseStack $$2, MultiBufferSource $$3, int $$4, boolean $$5) {
        int $$7;
        if ($$5) {
            $$7 = OverlayTexture.pack(OverlayTexture.u(1.0F), 10);
        } else {
            $$7 = OverlayTexture.NO_OVERLAY;
        }

        $$0.renderSingleBlock($$1, $$2, $$3, $$4, $$7);
    }
}
