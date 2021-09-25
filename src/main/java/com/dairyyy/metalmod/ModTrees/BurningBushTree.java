package com.dairyyy.metalmod.ModTrees;

import com.dairyyy.metalmod.block.MetalModBlocks;
import com.dairyyy.metalmod.block.SeaModBlocks;
import net.minecraft.block.trees.Tree;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.foliageplacer.BlobFoliagePlacer;
import net.minecraft.world.gen.trunkplacer.StraightTrunkPlacer;

import java.util.Random;

public class BurningBushTree extends Tree
{
    private static final int BASE_HEIGHT = 1;
    private static final int FIRST_RANDOM_HEIGHT = 0;
    private static final int SECOND_RANDOM_HEIGHT = 0;

    private static final int LEAVE_RADIUS = 0;
    private static final int LEAVE_OFFSET = 0;
    private static final int LEAVE_HEIGHT = 0;

    public static final BaseTreeFeatureConfig BURNING_BUSH_CONFIG = (new BaseTreeFeatureConfig.Builder(
            new SimpleBlockStateProvider(MetalModBlocks.BURNING_BUSH.get().getDefaultState()),
            new SimpleBlockStateProvider(SeaModBlocks.SEAWOOD_LEAVES.get().getDefaultState()),
            new BlobFoliagePlacer(FeatureSpread.create(LEAVE_RADIUS),
                    FeatureSpread.create(LEAVE_OFFSET), LEAVE_HEIGHT),
            new StraightTrunkPlacer(BASE_HEIGHT, FIRST_RANDOM_HEIGHT, SECOND_RANDOM_HEIGHT),
            new TwoLayerFeature(1,0,1)
    )).build();

    @Override
    protected ConfiguredFeature<BaseTreeFeatureConfig, ?> getTreeFeature(Random randomIn, boolean largeHive) {
        return Feature.TREE.withConfiguration(BURNING_BUSH_CONFIG);
    }
}
