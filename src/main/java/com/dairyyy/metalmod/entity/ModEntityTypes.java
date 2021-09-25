package com.dairyyy.metalmod.entity;

import com.dairyyy.metalmod.MetalMod;
import com.dairyyy.metalmod.util.Registration;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;

public class ModEntityTypes
{
    public static final RegistryObject<EntityType<PossumEntity>> POSSUM = Registration.ENTITIES.register("possum",
            () -> EntityType.Builder.create(PossumEntity::new, EntityClassification.CREATURE)
    .size(.8f,.8f).build(new ResourceLocation(MetalMod.MOD_ID + "possum").toString()));

    public static final RegistryObject<EntityType<ElephantShrewEntity>> ELEPHANT_SHREW = Registration.ENTITIES.register("elephant_shrew",
            () -> EntityType.Builder.create(ElephantShrewEntity::new, EntityClassification.CREATURE)
                    .size(.6f,.4f).build(new ResourceLocation(MetalMod.MOD_ID + "elephant_shrew").toString()));

    public static final RegistryObject<EntityType<SerpentEntity>> SERPENT = Registration.ENTITIES.register("serpent",
            () -> EntityType.Builder.create(SerpentEntity::new, EntityClassification.WATER_CREATURE)
                    .size(2f,1.8f).build(new ResourceLocation(MetalMod.MOD_ID + "serpent").toString()));

    public static final RegistryObject<EntityType<MosasaurusEntity>> MOSASAURUS = Registration.ENTITIES.register("mosasaurus",
            () -> EntityType.Builder.create(MosasaurusEntity::new, EntityClassification.MONSTER)
                    .size(5f,5f).build(new ResourceLocation(MetalMod.MOD_ID + "mosasaurus").toString()));

    public static void register() { }
}
