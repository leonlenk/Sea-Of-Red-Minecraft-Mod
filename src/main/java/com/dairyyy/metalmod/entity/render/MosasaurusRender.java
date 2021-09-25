package com.dairyyy.metalmod.entity.render;

import com.dairyyy.metalmod.MetalMod;
import com.dairyyy.metalmod.entity.MosasaurusEntity;
import com.dairyyy.metalmod.entity.model.MosasaurusModel;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.AxisAlignedBB;

public class MosasaurusRender extends MobRenderer<MosasaurusEntity, MosasaurusModel<MosasaurusEntity>>
{
    public MosasaurusRender(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new MosasaurusModel<>(), 10f);
    }

    @Override
    public ResourceLocation getEntityTexture(MosasaurusEntity entity) {
        return new ResourceLocation(MetalMod.MOD_ID, "textures/entity/mosasaurus.png");
    }
}
