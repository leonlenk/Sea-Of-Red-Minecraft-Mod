package com.dairyyy.metalmod.item.ItemClasses;

import com.dairyyy.metalmod.util.Keyboardutil;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

import java.util.List;

public class BurningStick extends Item
{
    public BurningStick(Properties properties) {
        super(properties);
    }

    @Override
    public void addInformation(ItemStack stack, World world, List<ITextComponent> tooltip,
                               ITooltipFlag flag)
    {
        tooltip.add(new StringTextComponent("\u00A76He looked and beheld, the bush burned with fire, and the bush was not consumed."));
        super.addInformation(stack,world,tooltip, flag);
    }
}
