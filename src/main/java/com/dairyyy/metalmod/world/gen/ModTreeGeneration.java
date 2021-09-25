package com.dairyyy.metalmod.world.gen;

import com.dairyyy.metalmod.MetalMod;
import com.dairyyy.metalmod.ModTrees.BurningBushTree;
import com.dairyyy.metalmod.ModTrees.SeaWoodTree;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.placement.NoPlacementConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;
import java.util.Set;
import java.util.function.Supplier;


@Mod.EventBusSubscriber(modid = MetalMod.MOD_ID)
public class ModTreeGeneration
{
        @SubscribeEvent
        public static void onBiomeLoad(BiomeLoadingEvent event)
        {
            RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
            Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

            if (types.contains(BiomeDictionary.Type.MOUNTAIN))
            {
                List<Supplier<ConfiguredFeature<?, ?>>> base =
                        event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);

                base.add(() -> Feature.TREE.withConfiguration(BurningBushTree.BURNING_BUSH_CONFIG)
                .withPlacement(Placement.EMERALD_ORE.configure(NoPlacementConfig.INSTANCE)));
            }
        }


}
