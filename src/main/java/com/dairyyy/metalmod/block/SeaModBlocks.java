package com.dairyyy.metalmod.block;

import com.dairyyy.metalmod.MetalMod;
import com.dairyyy.metalmod.ModTrees.SeaWoodTree;
import com.dairyyy.metalmod.util.Registration;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Supplier;

public class SeaModBlocks
{
    public static final RegistryObject<Block> DEAD_GRASS = register("dead_grass",
            () -> new GrassBlock(AbstractBlock.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT)));

    public static final RegistryObject<Block> SEAWOOD_PLANK = register("seawood_planks",
            () -> new Block(AbstractBlock.Properties.from(Blocks.OAK_PLANKS)));

    public static final RegistryObject<Block> SEAWOOD_LOG = register("seawood_log",
            () -> new RotatedPillarBlock(AbstractBlock.Properties.from(Blocks.OAK_WOOD)));

    public static final RegistryObject<Block> SEAWOOD_LEAVES = register("seawood_leaves",
            () -> new LeavesBlock(AbstractBlock.Properties.from(Blocks.OAK_LEAVES)));

    public static final RegistryObject<Block> SEAWOOD_SAPLING = register("seawood_sapling",
            () -> new SeaWoodSapling(
                    () -> new SeaWoodTree(), AbstractBlock.Properties.from(Blocks.OAK_SAPLING)));

    public static final RegistryObject<Block> SEA_TELEPORTER = register("sea_teleporter",
            () -> new SeaTeleporter(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(3, 3f)));


    public static void register() { }



    private static <T extends Block>RegistryObject<T> register(String name, Supplier<T> block)
    {
        RegistryObject<T> toReturn = Registration.BLOCKS.register(name, block);
        Registration.ITEMS.register(name, ()-> new BlockItem(toReturn.get(),
                new Item.Properties().group(MetalMod.SEA_TAB)));
        return  toReturn;
    }
}


