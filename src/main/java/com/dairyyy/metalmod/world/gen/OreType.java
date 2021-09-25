package com.dairyyy.metalmod.world.gen;

import com.dairyyy.metalmod.block.MetalModBlocks;
import net.minecraft.block.Block;

public enum OreType
{
    BISMUTH(MetalModBlocks.BISMUTH_ORE.get(), 6,1,15);

    private final Block block;
    private final int mavVeinSize;
    private final int minHeight;
    private final int maxHeight;

    OreType(Block block, int maxVeinSize, int minHeight, int maxHeight)
    {
        this.block = block;
        this.mavVeinSize = maxVeinSize;
        this.minHeight = minHeight;
        this.maxHeight = maxHeight;
    }

    public Block getBlock() {
        return block;
    }

    public int getMavVeinSize() {
        return mavVeinSize;
    }

    public int getMinHeight() {
        return minHeight;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public static OreType get (Block block)
    {
        for(OreType ore : values())
        {
            if(block == ore.block)
            {
                return  ore;
            }
        }
        return null;
    }
}
