package com.dairyyy.metalmod.world.dimension;

import com.dairyyy.metalmod.MetalMod;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;

public class ModDimensions
{
    public static RegistryKey<World> EndlessSeaDim;

    public static void register()
    {
        EndlessSeaDim = RegistryKey.getOrCreateKey(Registry.WORLD_KEY,
        new ResourceLocation(MetalMod.MOD_ID, "endless_sea_dim"));
    }
}
