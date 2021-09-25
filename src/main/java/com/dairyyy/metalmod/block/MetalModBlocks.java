package com.dairyyy.metalmod.block;

import com.dairyyy.metalmod.MetalMod;
import com.dairyyy.metalmod.ModTrees.SeaWoodTree;
import com.dairyyy.metalmod.util.Registration;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Supplier;

public class MetalModBlocks
{
    public static final RegistryObject<Block> BISMUTH_BLOCK = register("bismuth_block",
            () -> new Block(AbstractBlock.Properties.create(Material.IRON)
                    .hardnessAndResistance(3f, 10f).sound(SoundType.METAL).harvestLevel(2).setRequiresTool().harvestTool(ToolType.PICKAXE)));

    public static final RegistryObject<Block> BISMUTH_ORE = register("bismuth_ore",
            () -> new Block(AbstractBlock.Properties.create(Material.IRON)
                    .hardnessAndResistance(7f, 10f).sound(SoundType.METAL).harvestLevel(3).setRequiresTool().harvestTool(ToolType.PICKAXE)));

    public static final RegistryObject<Block> BURNING_BUSH = register("burning_bush",
            () -> new Block(AbstractBlock.Properties.from(Blocks.DEAD_BUSH)));

    public static final RegistryObject<Block> BUSH_SMOKE = register("bush_smoke",
            () -> new Block(AbstractBlock.Properties.from(Blocks.DEAD_BUSH)));

    public static void register() { }



    private static <T extends Block>RegistryObject<T> register(String name, Supplier<T> block)
    {
        RegistryObject<T> toReturn = Registration.BLOCKS.register(name, block);
        Registration.ITEMS.register(name, ()-> new BlockItem(toReturn.get(),
               new Item.Properties().group(MetalMod.METAL_TAB)));
        return  toReturn;
    }
}
