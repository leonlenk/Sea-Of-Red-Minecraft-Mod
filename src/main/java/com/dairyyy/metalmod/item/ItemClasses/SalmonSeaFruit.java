package com.dairyyy.metalmod.item.ItemClasses;

import com.dairyyy.metalmod.MetalMod;
import com.dairyyy.metalmod.util.Keyboardutil;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

import java.util.List;

public class SalmonSeaFruit extends Item
{
    public SalmonSeaFruit()
    {
        super(new Properties().group(MetalMod.SEA_TAB)
                .food(new Food.Builder()
                        .hunger(10)
                        .saturation(16.0f)
                        .effect(() -> new EffectInstance(Effects.WATER_BREATHING, 1200,1), 1.0f)
                        .build()));
    }
    @Override
    public void addInformation(ItemStack stack, World world, List<ITextComponent> tooltip,
                               ITooltipFlag flag)
    {
        if(Keyboardutil.isHoldingShift())
        {
            tooltip.add(new StringTextComponent("Gives water breathing effect and is very tasty!"));
        }
        else
        {
            tooltip.add(new StringTextComponent("Hold"+"\u00A7e"+" SHIFT "+"\u00A77"+"for more info"));
        }
        super.addInformation(stack,world,tooltip, flag);
    }
}
