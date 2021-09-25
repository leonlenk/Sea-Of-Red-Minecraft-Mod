package com.dairyyy.metalmod.world.biome;

import com.dairyyy.metalmod.entity.ModEntityTypes;
import com.dairyyy.metalmod.util.Registration;
import com.dairyyy.metalmod.world.feature.ModConfiguredFeatures;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.*;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Features;
import net.minecraft.world.gen.feature.structure.StructureFeatures;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilders;
import net.minecraftforge.fml.RegistryObject;

import java.awt.*;
import java.util.function.Supplier;

public class ModBiomes
{
    public static final RegistryObject<Biome> DEADLY_SEA_BIOME =
            Registration.BIOMES.register("deadly_sea_biome",
                    () -> makeDeadlySeaBiome(() -> WorldGenRegistries.CONFIGURED_SURFACE_BUILDER.getOrThrow(
                            ModConfiguredSurfaceBuilders.BLOOD_SURFACE), 0.00015f, 3f));

    public static void register() { }

    private static Biome makeDeadlySeaBiome(final Supplier<ConfiguredSurfaceBuilder<?>> surfaceBuilder, float depth, float scale)
    {
        final BiomeGenerationSettings.Builder biomeGenerationSettingBuilder =
                new BiomeGenerationSettings.Builder().withSurfaceBuilder(surfaceBuilder);

        MobSpawnInfo.Builder mobspawninfo$builder = new MobSpawnInfo.Builder();
        DefaultBiomeFeatures.withBatsAndHostiles(mobspawninfo$builder);
        mobspawninfo$builder.withSpawner(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityType.SLIME, 1, 1, 1));

        BiomeGenerationSettings.Builder biomegenerationsettings$builder =
                (new BiomeGenerationSettings.Builder()).withSurfaceBuilder(surfaceBuilder);


        biomegenerationsettings$builder.withStructure(StructureFeatures.MINESHAFT);
        biomegenerationsettings$builder.withStructure(StructureFeatures.RUINED_PORTAL);
        DefaultBiomeFeatures.withCavesAndCanyons(biomegenerationsettings$builder);


        DefaultBiomeFeatures.withLavaLakes(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withMonsterRoom(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withCommonOverworldBlocks(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withOverworldOres(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withFossils(biomegenerationsettings$builder);

        ModConfiguredFeatures.withLavaSprings(biomegenerationsettings$builder);

        biomegenerationsettings$builder.withFeature(GenerationStage.Decoration.LAKES, ModConfiguredFeatures.BLOOD_LAKE);
        biomegenerationsettings$builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ModConfiguredFeatures.SEA_TREE);

        DefaultBiomeFeatures.withFrozenTopLayer(biomegenerationsettings$builder);
        return (new Biome.Builder()).precipitation(Biome.RainType.RAIN).category(Biome.Category.NONE)
                .depth(depth).scale(scale).temperature(0.8F).downfall(0.9F)
                .setEffects((new BiomeAmbience.Builder()).setWaterColor(new Color(166,15,20,255).getRGB())
                        .setWaterFogColor(new Color(166,15,20,255).getRGB()).setFogColor(new Color(166,15,20,255).getRGB())
                        .withSkyColor(new Color(166,15,20,255).getRGB())
                        .withFoliageColor(new Color(166,15,20,255).getRGB()).withGrassColorModifier(BiomeAmbience.GrassColorModifier.DARK_FOREST)
                        .setMoodSound(MoodSoundAmbience.DEFAULT_CAVE).build())
                .withMobSpawnSettings(mobspawninfo$builder.build())
                .withGenerationSettings(biomegenerationsettings$builder.build()).build();
    }
}
