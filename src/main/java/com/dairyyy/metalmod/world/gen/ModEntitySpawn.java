package com.dairyyy.metalmod.world.gen;

import com.dairyyy.metalmod.MetalMod;
import com.dairyyy.metalmod.entity.ModEntityTypes;
import com.dairyyy.metalmod.entity.SerpentEntity;
import com.dairyyy.metalmod.world.biome.ModBiomes;
import com.google.common.eventbus.Subscribe;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntitySpawnPlacementRegistry;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.MobSpawnInfo;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;
import java.util.Set;


@Mod.EventBusSubscriber(modid = MetalMod.MOD_ID)
public class ModEntitySpawn
{

    @SubscribeEvent
    public static void onBiomeLoad(BiomeLoadingEvent event)
    {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.DRY) && !types.contains(BiomeDictionary.Type.NETHER) && !types.contains(BiomeDictionary.Type.END)
                && !types.contains(BiomeDictionary.Type.OCEAN) && !types.contains(BiomeDictionary.Type.MAGICAL) && !types.contains(BiomeDictionary.Type.WET))
        {
            List<MobSpawnInfo.Spawners> base = event.getSpawns().getSpawner(EntityClassification.CREATURE);
            base.add(new MobSpawnInfo.Spawners(ModEntityTypes.POSSUM.get(),
                    1, 2, 8));
            base.add(new MobSpawnInfo.Spawners(ModEntityTypes.ELEPHANT_SHREW.get(),
                    1, 2, 8));
        }

        if (types.contains(BiomeDictionary.Type.DRY) && types.contains(BiomeDictionary.Type.WET) && types.contains(BiomeDictionary.Type.DEAD))
        {
            List<MobSpawnInfo.Spawners> base = event.getSpawns().getSpawner(EntityClassification.MONSTER);
            base.add(new MobSpawnInfo.Spawners(ModEntityTypes.SERPENT.get(),
                    1, 4, 6));
        }
    }
}
