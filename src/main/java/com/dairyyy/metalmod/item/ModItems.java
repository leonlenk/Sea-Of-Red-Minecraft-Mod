package com.dairyyy.metalmod.item;

import com.dairyyy.metalmod.MetalMod;
import com.dairyyy.metalmod.block.ModFluids;
import com.dairyyy.metalmod.entity.ModEntityTypes;
import com.dairyyy.metalmod.item.ArmorClasses.ModArmorMaterial;
import com.dairyyy.metalmod.item.ArmorClasses.SeaArmorItem;
import com.dairyyy.metalmod.item.ItemClasses.BurningDiamondSword;
import com.dairyyy.metalmod.item.ItemClasses.BurningStick;
import com.dairyyy.metalmod.item.ItemClasses.SalmonSeaFruit;
import com.dairyyy.metalmod.item.SwordClasses.BismuthItemTier;
import com.dairyyy.metalmod.item.SwordClasses.MosasaurusItemTier;
import com.dairyyy.metalmod.item.SwordClasses.MosasaurusSword;
import com.dairyyy.metalmod.util.Registration;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;

import java.awt.*;

public class ModItems {

   public static final RegistryObject<Item> BISMUTH_INGOT =
           Registration.ITEMS.register("bismuth_ingot",
                   () -> new Item(new Item.Properties().group(MetalMod.METAL_TAB)));

   public static final RegistryObject<Item> SCALE_OF_THE_SEA =
           Registration.ITEMS.register("scale_of_the_sea",
                   () -> new Item(new Item.Properties().group(MetalMod.SEA_TAB)));

   public static final RegistryObject<Item> GILDED_SCALE =
           Registration.ITEMS.register("gilded_scale",
                   () -> new Item(new Item.Properties().group(MetalMod.SEA_TAB)));

   public static final RegistryObject<Item> SALMON_SEA_FRUIT =
           Registration.ITEMS.register("salmon_sea_fruit",
                   () -> new SalmonSeaFruit());

   // Spawn Eggs

   public static final RegistryObject<ModSpawnEggItem> POSSUM_SPAWNING_EGG =
           Registration.ITEMS.register("possum_spawn_egg",
                   () -> new ModSpawnEggItem(ModEntityTypes.POSSUM, new Color(166,15,20,255).getRGB(), 0xFFC0CB,
                           new Item.Properties().group(MetalMod.METAL_TAB)));

   public static final RegistryObject<ModSpawnEggItem> ELEPHANT_SHREW_SPAWNING_EGG =
           Registration.ITEMS.register("elephant_shrew_spawn_egg",
                   () -> new ModSpawnEggItem(ModEntityTypes.ELEPHANT_SHREW, 0xd4ae7b, 0x9a774a,
                           new Item.Properties().group(MetalMod.METAL_TAB)));

   public static final RegistryObject<ModSpawnEggItem> SERPENT_SPAWNING_EGG =
           Registration.ITEMS.register("serpent_spawn_egg",
                   () -> new ModSpawnEggItem(ModEntityTypes.SERPENT, 0x008db0, 0xFFD700,
                           new Item.Properties().group(MetalMod.SEA_TAB)));

   /* tools */
   public static final RegistryObject<Item> BURNING_STICK =
           Registration.ITEMS.register("burning_stick",
                   () -> new BurningStick(new Item.Properties().group(MetalMod.METAL_TAB)));

   public static final RegistryObject<Item> BURNING_DIAMOND_SWORD =
           Registration.ITEMS.register("burning_diamond_sword",
                   () -> new BurningDiamondSword(ItemTier.DIAMOND, 8, -2.6f,
                           new Item.Properties()
                                   .defaultMaxDamage(1561)
                                   .group(MetalMod.METAL_TAB)));

   public static final RegistryObject<Item> MOSASAURUS_SWORD =
           Registration.ITEMS.register("mosasaurus_sword",
                   () -> new MosasaurusSword(MosasaurusItemTier.STRONGBONE, 24, -2.0f,
                           new Item.Properties()
                                   .defaultMaxDamage(3000)
                                   .group(MetalMod.SEA_TAB)));

   public static final RegistryObject<Item> BISMUTH_SHOVEL =
           Registration.ITEMS.register("bismuth_shovel",
                   () -> new ShovelItem(BismuthItemTier.BISMUTH, 0f, 0f,
                           new Item.Properties()
                                   .defaultMaxDamage(200)
                                   .addToolType(ToolType.SHOVEL, 2)
                                   .group(MetalMod.METAL_TAB)));

   public static final RegistryObject<Item> BISMUTH_SWORD =
           Registration.ITEMS.register("bismuth_sword",
                   () -> new SwordItem(BismuthItemTier.BISMUTH, 11, -2.4f,
                           new Item.Properties()
                                   .defaultMaxDamage(200)
                                   .group(MetalMod.METAL_TAB)));

   public static final RegistryObject<Item> BISMUTH_PICKAXE =
           Registration.ITEMS.register("bismuth_pickaxe",
                   () -> new PickaxeItem(BismuthItemTier.BISMUTH, 6, -2.8f,
                           new Item.Properties()
                                   .defaultMaxDamage(200)
                                   .addToolType(ToolType.PICKAXE, 4)
                                   .group(MetalMod.METAL_TAB)));

   public static final RegistryObject<Item> BISMUTH_HOE =
           Registration.ITEMS.register("bismuth_hoe",
                   () -> new HoeItem(BismuthItemTier.BISMUTH, 0, 0f,
                           new Item.Properties()
                                   .defaultMaxDamage(200)
                                   .addToolType(ToolType.HOE, 2)
                                   .group(MetalMod.METAL_TAB)));

   public static final RegistryObject<Item> BISMUTH_AXE =
           Registration.ITEMS.register("bismuth_axe",
                   () -> new AxeItem(BismuthItemTier.BISMUTH, 13f, -2.8f,
                           new Item.Properties()
                                   .defaultMaxDamage(200)
                                   .addToolType(ToolType.AXE, 2)
                                   .group(MetalMod.METAL_TAB)));

   /* Armor */

   public static final RegistryObject<Item> SEA_HELMET =
           Registration.ITEMS.register("sea_helmet",
                   () -> new SeaArmorItem(ModArmorMaterial.GILDED_SCALE, EquipmentSlotType.HEAD,
                           new Item.Properties().group(MetalMod.SEA_TAB)));


   public static final RegistryObject<Item> SEA_CHESTPLATE =
           Registration.ITEMS.register("sea_chestplate",
                   () -> new SeaArmorItem(ModArmorMaterial.GILDED_SCALE, EquipmentSlotType.CHEST,
                           new Item.Properties().group(MetalMod.SEA_TAB)));


   public static final RegistryObject<Item> SEA_LEGGINS =
           Registration.ITEMS.register("sea_leggings",
                   () -> new SeaArmorItem(ModArmorMaterial.GILDED_SCALE, EquipmentSlotType.LEGS,
                           new Item.Properties().group(MetalMod.SEA_TAB)));


   public static final RegistryObject<Item> SEA_BOOTS =
           Registration.ITEMS.register("sea_boots",
                   () -> new SeaArmorItem(ModArmorMaterial.GILDED_SCALE, EquipmentSlotType.FEET,
                           new Item.Properties().group(MetalMod.SEA_TAB)));

// fluids
   public static final RegistryObject<Item> BLOOD_BUCKET =
           Registration.ITEMS.register("blood_bucket",
                   () -> new BucketItem(ModFluids.BLOOD_FLUID::get,
                           new Item.Properties().group(MetalMod.SEA_TAB).maxStackSize(1)));

   public static void register() { }
}


