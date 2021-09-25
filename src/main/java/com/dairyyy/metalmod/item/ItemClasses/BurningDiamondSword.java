package com.dairyyy.metalmod.item.ItemClasses;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

import java.util.List;

public class BurningDiamondSword extends SwordItem
{
    public BurningDiamondSword(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builderIn) {
        super(tier, attackDamageIn, attackSpeedIn, builderIn);
    }

    @Override
    public void addInformation(ItemStack stack, World world, List<ITextComponent> tooltip,
                               ITooltipFlag flag)
    {
        tooltip.add(new StringTextComponent("\u00A76A diamond sword blessed with the strength of fire, truly a wonder to behold"));
        super.addInformation(stack,world,tooltip, flag);
    }
}
