package com.dairyyy.metalmod.entity;

import net.minecraft.entity.*;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.monster.GuardianEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.pathfinding.PathNodeType;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import java.util.List;

public class SerpentEntity extends GuardianEntity
{

    protected SerpentEntity(EntityType<? extends SerpentEntity> type, World worldIn)
    {
        super(type, worldIn);
        this.experienceValue = 30;
        this.enablePersistence();
        this.setPathPriority(PathNodeType.WATER, 0.0F);
        if (this.wander != null) {
            this.wander.setExecutionChance(400);}
    }

    public static AttributeModifierMap.MutableAttribute setCustomAttributes()
    {
        return MobEntity.func_233666_p_()
                .createMutableAttribute(Attributes.MAX_HEALTH, 200D)
                .createMutableAttribute(Attributes.ATTACK_DAMAGE, 10.0D)
                .createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.5D);

    }

    public int getAttackDuration() {
        return 5;
    }
    public int getMaxSpawnedInChunk() {
        return 5;
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(0, new RandomSwimmingGoal(this, 1.0D, 10));
        this.goalSelector.addGoal(1, new FindWaterGoal(this));
        this.goalSelector.addGoal(5, new LookAtGoal(this, PlayerEntity.class, 8f));
        this.goalSelector.addGoal(6, new LookRandomlyGoal(this));
        this.goalSelector.addGoal(2, new PanicGoal(this, 1D));
    }

    protected void updateAITasks() {
        super.updateAITasks();
        int i = 1200;
        if ((this.ticksExisted + this.getEntityId()) % 1200 == 0) {
            Effect effect = Effects.HUNGER;
            List<ServerPlayerEntity> list = ((ServerWorld)this.world).getPlayers((p_210138_1_) -> {
                return this.getDistanceSq(p_210138_1_) < 2500.0D && p_210138_1_.interactionManager.survivalOrAdventure();
            });
            int j = 2;
            int k = 6000;
            int l = 1200;

            for(ServerPlayerEntity serverplayerentity : list) {
                if (!serverplayerentity.isPotionActive(effect) || serverplayerentity.getActivePotionEffect(effect).getAmplifier() < 2 || serverplayerentity.getActivePotionEffect(effect).getDuration() < 300) {
                    serverplayerentity.addPotionEffect(new EffectInstance(effect, 600, 2));
                }
            }
        }

        if (!this.detachHome()) {
            this.setHomePosAndDistance(this.getPosition(), 16);
        }

    }

}

