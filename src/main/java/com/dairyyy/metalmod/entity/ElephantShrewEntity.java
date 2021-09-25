package com.dairyyy.metalmod.entity;

import com.dairyyy.metalmod.sound.ModSoundEvents;
import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import javax.annotation.Nullable;

public class ElephantShrewEntity extends AnimalEntity
{

    public boolean hitByEntity;

    protected ElephantShrewEntity(EntityType<? extends AnimalEntity> type, World worldIn)
    {
        super(type, worldIn);
    }

    public static AttributeModifierMap.MutableAttribute setCustomAttributes()
    {
        return MobEntity.func_233666_p_()
                .createMutableAttribute(Attributes.MAX_HEALTH, 10D)
                .createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.5D);
    }


    @Nullable
    @Override
    protected SoundEvent getDeathSound() {
        return ModSoundEvents.ELEPHANT_SHREW_DEATH_CRY.get();
    }

    @Override
    protected void registerGoals()
    {
        super.registerGoals();
        this.goalSelector.addGoal(0, new SwimGoal(this));
        this.goalSelector.addGoal(1, new PanicGoal(this, 1.5D));
        this.goalSelector.addGoal(2, new BreedGoal(this, 1.6D));
        this.goalSelector.addGoal(3, new TemptGoal(this, 1.25D,
                Ingredient.fromItems(Items.MUTTON.getItem()),false));
        this.goalSelector.addGoal(4, new FollowParentGoal(this, 1.1D));
        this.goalSelector.addGoal(5, new WaterAvoidingRandomWalkingGoal(this, 1.1D));
        this.goalSelector.addGoal(6, new LookAtGoal(this, PlayerEntity.class, 8f));
        this.goalSelector.addGoal(7, new LookRandomlyGoal(this));
    }


    @Nullable
    @Override
    public AgeableEntity createChild(ServerWorld world, AgeableEntity mate)
    {
        return ModEntityTypes.ELEPHANT_SHREW.get().create(this.world);
    }
}