package com.dairyyy.metalmod.entity;

import com.dairyyy.metalmod.item.ModItems;
import net.minecraft.client.renderer.entity.CaveSpiderRenderer;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.monster.CaveSpiderEntity;
import net.minecraft.entity.monster.ElderGuardianEntity;
import net.minecraft.entity.passive.IronGolemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.DamageSource;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.BossInfo;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerBossInfo;
import net.minecraft.world.server.ServerWorld;

import javax.annotation.Nullable;
import java.util.List;


public class MosasaurusEntity extends ElderGuardianEntity
{

    private final ServerBossInfo bossInfo = (ServerBossInfo)(new ServerBossInfo(this.getDisplayName(), BossInfo.Color.BLUE, BossInfo.Overlay.PROGRESS)).setDarkenSky(true);

    protected MosasaurusEntity(EntityType<? extends ElderGuardianEntity> type, World worldIn)
    {
        super(type, worldIn);
        this.experienceValue = 200;
        this.enablePersistence();
    }

    public static AttributeModifierMap.MutableAttribute setCustomAttributes()
    {
        return MobEntity.func_233666_p_()
                .createMutableAttribute(Attributes.MAX_HEALTH, 400D)
                .createMutableAttribute(Attributes.ATTACK_DAMAGE, 10.0D)
                .createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.5D);

    }

    public int getAttackDuration() {
        return 5;
    }

    /**
     * (abstract) Protected helper method to read subclass entity data from NBT.
     */
    public void readAdditional(CompoundNBT compound) {
        super.readAdditional(compound);
        if (this.hasCustomName()) {
            this.bossInfo.setName(this.getDisplayName());
        }

    }

    public void setCustomName(@Nullable ITextComponent name) {
        super.setCustomName(name);
        this.bossInfo.setName(this.getDisplayName());
    }

    protected void dropSpecialItems(DamageSource source, int looting, boolean recentlyHitIn) {
        super.dropSpecialItems(source, looting, recentlyHitIn);
        ItemEntity itementity = this.entityDropItem(ModItems.MOSASAURUS_SWORD.get());
        if (itementity != null) {
            itementity.setNoDespawn();
        }

    }

    @Override
    protected void registerGoals()
    {
        super.registerGoals();
        this.goalSelector.addGoal(1, new LookAtGoal(this, PlayerEntity.class, 8.0F));
        this.goalSelector.addGoal(7, new SwimGoal(this));
        this.goalSelector.addGoal(5, new LookAtGoal(this, PlayerEntity.class, 8f));
        this.goalSelector.addGoal(6, new LookRandomlyGoal(this));
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

        this.bossInfo.setPercent(this.getHealth() / this.getMaxHealth());
    }

    public void addTrackingPlayer(ServerPlayerEntity player) {
        super.addTrackingPlayer(player);
        this.bossInfo.addPlayer(player);
    }

    public void removeTrackingPlayer(ServerPlayerEntity player) {
        super.removeTrackingPlayer(player);
        this.bossInfo.removePlayer(player);
    }

    protected boolean canBeRidden(Entity entityIn) {
        return false;
    }

    /**
     * Returns false if this Entity can't move between dimensions. True if it can.
     */
    public boolean canChangeDimension() {
        return false;
    }

}
