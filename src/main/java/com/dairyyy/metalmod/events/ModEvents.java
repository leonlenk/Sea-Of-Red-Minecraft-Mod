package com.dairyyy.metalmod.events;


import com.dairyyy.metalmod.entity.ModEntityTypes;
import com.dairyyy.metalmod.item.ModItems;
import com.dairyyy.metalmod.world.dimension.ModDimensions;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class ModEvents
{

    @SubscribeEvent
    public void onWearingSeaArmor(PlayerEvent event)
    {
        PlayerEntity player = event.getPlayer();
        for(ItemStack element : event.getPlayer().getArmorInventoryList())
                {
                    if (ItemStack.areItemsEqualIgnoreDurability(element, new ItemStack(ModItems.SEA_BOOTS.get()))) {
                         player.addPotionEffect(new EffectInstance(Effects.JUMP_BOOST, 80));
                      }
                    if (ItemStack.areItemsEqualIgnoreDurability(element, new ItemStack(ModItems.SEA_LEGGINS.get()))) {
                         player.addPotionEffect(new EffectInstance(Effects.DOLPHINS_GRACE, 80));
                    }
                    if (ItemStack.areItemsEqualIgnoreDurability(element, new ItemStack(ModItems.SEA_CHESTPLATE.get()))) {
                        player.addPotionEffect(new EffectInstance(Effects.LUCK, 80));
                    }
                    if (ItemStack.areItemsEqualIgnoreDurability(element, new ItemStack(ModItems.SEA_HELMET.get()))) {
                        player.addPotionEffect(new EffectInstance(Effects.WATER_BREATHING, 80));
                    }
                }
    }

    @SubscribeEvent
    public void MosasaurusSwordEquiped (AttackEntityEvent event)
        {
            if(event.getPlayer().getHeldItemMainhand().getItem() == ModItems.MOSASAURUS_SWORD.get())
            {
                if (event.getTarget().isAlive())
                {
                    LivingEntity target = (LivingEntity) event.getTarget();
                    target.addPotionEffect(new EffectInstance(Effects.WITHER, 200, 2));
                }
            }
        }

    @SubscribeEvent
    public void BurningAttack (AttackEntityEvent event)
    {
        if(event.getPlayer().getHeldItemMainhand().getItem() == ModItems.BURNING_STICK.get()
                || event.getPlayer().getHeldItemMainhand().getItem() == ModItems.BURNING_DIAMOND_SWORD.get())
        {
            if (event.getTarget().isAlive())
            {
                LivingEntity target = (LivingEntity) event.getTarget();
                target.setFire(200);
            }
        }
    }

    @SubscribeEvent
    public void InDimension (PlayerEvent.PlayerChangedDimensionEvent event)
    {

        BlockPos summonPos = new BlockPos(0d,65d,0d);
        LivingEntity entity = event.getEntityLiving();
        World world = entity.getEntityWorld();
        if(!world.isRemote() && world.getDimensionKey() == ModDimensions.EndlessSeaDim)
        {
            ModEntityTypes.MOSASAURUS.get().spawn((ServerWorld) world, null, null, summonPos,
                    SpawnReason.EVENT,true, true);
        }
    }

}


