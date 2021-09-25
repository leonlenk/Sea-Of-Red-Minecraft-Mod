package com.dairyyy.metalmod.entity.render;

import com.dairyyy.metalmod.MetalMod;
import com.dairyyy.metalmod.entity.PossumEntity;
import com.dairyyy.metalmod.entity.model.PossumModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class PossumRender  extends MobRenderer<PossumEntity, PossumModel<PossumEntity>>
{
    public PossumRender(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new PossumModel<>(), .5f);
    }

    @Override
    public ResourceLocation getEntityTexture(PossumEntity entity) {
        return new ResourceLocation(MetalMod.MOD_ID, "textures/entity/possum.png");
    }
}
