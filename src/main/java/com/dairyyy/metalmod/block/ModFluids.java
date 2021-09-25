package com.dairyyy.metalmod.block;

import com.dairyyy.metalmod.MetalMod;
import com.dairyyy.metalmod.item.ModItems;
import com.dairyyy.metalmod.util.Registration;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.block.material.Material;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.item.Rarity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.GameRules;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fml.RegistryObject;

import java.awt.*;
import java.util.function.ToIntFunction;

public class ModFluids
{
    public static final ResourceLocation BLOOD_STILL_RL = new ResourceLocation(MetalMod.MOD_ID,
            "block/blood_still");

    public static final ResourceLocation BLOOD_FLOWING_RL = new ResourceLocation(MetalMod.MOD_ID,
            "block/blood_flowing");

    public static final ResourceLocation BLOOD_OVERLAY_RL = new ResourceLocation(MetalMod.MOD_ID,
            "block/blood_overlay");

    public static final RegistryObject<FlowingFluid> BLOOD_FLUID
            = Registration.Fluids.register("blood_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.BLOOD_PROPERTIES));

    public static final RegistryObject<FlowingFluid> BLOOD_FLOWING
            = Registration.Fluids.register("blood_flowing",
            ()-> new ForgeFlowingFluid.Flowing(ModFluids.BLOOD_PROPERTIES));

    public static final ForgeFlowingFluid.Properties BLOOD_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> BLOOD_FLUID.get(), () -> BLOOD_FLOWING.get(), FluidAttributes.builder(BLOOD_STILL_RL,BLOOD_FLOWING_RL)
            .luminosity(15).temperature(34567).density(50).rarity(Rarity.EPIC).viscosity(40).sound(SoundEvents.BLOCK_BLASTFURNACE_FIRE_CRACKLE).color(new Color(166,15,20,255).getRGB())
            .overlay(BLOOD_OVERLAY_RL)).slopeFindDistance(3).levelDecreasePerBlock(3)
            .block(() -> ModFluids.BLOOD_BLOCK.get()).bucket(() -> ModItems.BLOOD_BUCKET.get());

    public static final RegistryObject<FlowingFluidBlock> BLOOD_BLOCK = Registration.BLOCKS.register("blood",
            () -> new FlowingFluidBlock(() -> ModFluids.BLOOD_FLUID.get(), AbstractBlock.Properties.create(Material.WATER)
            .doesNotBlockMovement().hardnessAndResistance(100f).noDrops()));



    public static void register() { }
}
