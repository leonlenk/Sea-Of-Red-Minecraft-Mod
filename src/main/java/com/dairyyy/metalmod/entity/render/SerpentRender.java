package com.dairyyy.metalmod.entity.render;

import com.dairyyy.metalmod.MetalMod;
import com.dairyyy.metalmod.entity.SerpentEntity;
import com.dairyyy.metalmod.entity.model.SerpentModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class SerpentRender extends MobRenderer<SerpentEntity, SerpentModel<SerpentEntity>>
{
    public SerpentRender(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new SerpentModel<>(), 1.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(SerpentEntity entity) {
        return new ResourceLocation(MetalMod.MOD_ID, "textures/entity/serpent.png");
    }
}
