package com.dairyyy.metalmod.entity.render;

import com.dairyyy.metalmod.MetalMod;
import com.dairyyy.metalmod.entity.ElephantShrewEntity;
import com.dairyyy.metalmod.entity.model.ElephantShrewModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class ElephantShrewRender extends MobRenderer<ElephantShrewEntity, ElephantShrewModel<ElephantShrewEntity>>
{
    public ElephantShrewRender(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new ElephantShrewModel<>(), .25f);
    }

    @Override
    public ResourceLocation getEntityTexture(ElephantShrewEntity entity) {
        return new ResourceLocation(MetalMod.MOD_ID, "textures/entity/elephant_shrew.png");
    }
}
