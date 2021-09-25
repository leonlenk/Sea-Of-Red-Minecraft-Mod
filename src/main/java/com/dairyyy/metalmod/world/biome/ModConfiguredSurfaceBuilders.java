package com.dairyyy.metalmod.world.biome;

import com.dairyyy.metalmod.MetalMod;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;

public class ModConfiguredSurfaceBuilders
{

    public static RegistryKey<ConfiguredSurfaceBuilder<?>> BLOOD_SURFACE
            = RegistryKey.getOrCreateKey(Registry.CONFIGURED_SURFACE_BUILDER_KEY,
            new ResourceLocation(MetalMod.MOD_ID, "blood_surface"));
}
