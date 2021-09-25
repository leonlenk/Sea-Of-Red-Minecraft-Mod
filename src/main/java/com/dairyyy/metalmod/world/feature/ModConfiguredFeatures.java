package com.dairyyy.metalmod.world.feature;

import com.dairyyy.metalmod.ModTrees.SeaWoodTree;
import com.dairyyy.metalmod.block.ModFluids;
import com.dairyyy.metalmod.block.SeaModBlocks;
import com.dairyyy.metalmod.entity.ModEntityTypes;
import com.dairyyy.metalmod.world.gen.ModTreeGeneration;
import com.google.common.collect.ImmutableList;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.fluid.FluidState;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.BiomeGenerationSettings;
import net.minecraft.world.biome.MobSpawnInfo;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.foliageplacer.BlobFoliagePlacer;
import net.minecraft.world.gen.placement.AtSurfaceWithExtraConfig;
import net.minecraft.world.gen.placement.ChanceConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.trunkplacer.StraightTrunkPlacer;

public class ModConfiguredFeatures
{
    public static final ConfiguredFeature<?, ?> BLOOD_LAKE =
            Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, "lake_blood",
                    Feature.LAKE.withConfiguration(new BlockStateFeatureConfig(ModFluids.BLOOD_BLOCK.get().getDefaultState()))
                            .withPlacement(Placement.WATER_LAKE.configure(new ChanceConfig(1))));


    public static void withLavaSprings(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Features.SPRING_LAVA);
    }


    public static final ConfiguredFeature<?, ?> SEA_TREE = register("sea_tree", Feature.TREE.withConfiguration((
            new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(SeaModBlocks.SEAWOOD_LOG.get().getDefaultState()),
                    new SimpleBlockStateProvider(SeaModBlocks.SEAWOOD_LEAVES.get().getDefaultState()),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(5, 3, 0),
                    new TwoLayerFeature(1, 0, 1))).setMaxWaterDepth(80).build()).
            withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).
            withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(2, 0.1F, 1))));

    private static <FC extends IFeatureConfig> ConfiguredFeature<FC, ?> register(String key, ConfiguredFeature<FC, ?> configuredFeature) {
        return Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, key, configuredFeature);
    }
}
