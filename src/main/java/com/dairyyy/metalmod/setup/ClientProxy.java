package com.dairyyy.metalmod.setup;

import com.dairyyy.metalmod.MetalMod;
import com.dairyyy.metalmod.block.MetalModBlocks;
import com.dairyyy.metalmod.block.ModFluids;
import com.dairyyy.metalmod.block.SeaModBlocks;
import com.dairyyy.metalmod.entity.ModEntityTypes;
import com.dairyyy.metalmod.entity.render.ElephantShrewRender;
import com.dairyyy.metalmod.entity.render.MosasaurusRender;
import com.dairyyy.metalmod.entity.render.PossumRender;
import com.dairyyy.metalmod.entity.render.SerpentRender;
import com.dairyyy.metalmod.item.ModSpawnEggItem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MetalMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientProxy implements IProxy
{

    @Override
    public void init()
    {
        RenderTypeLookup.setRenderLayer(SeaModBlocks.SEAWOOD_SAPLING.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(MetalModBlocks.BURNING_BUSH.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(MetalModBlocks.BUSH_SMOKE.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(SeaModBlocks.DEAD_GRASS.get(), RenderType.getCutout());

        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.POSSUM.get(), PossumRender::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.ELEPHANT_SHREW.get(), ElephantShrewRender::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.SERPENT.get(), SerpentRender::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.MOSASAURUS.get(), MosasaurusRender::new);

        ModSpawnEggItem.initSpawnEggs();
    }

    @Override
    public World getClientWorld()
    {
        return Minecraft.getInstance().world;
    }
}
