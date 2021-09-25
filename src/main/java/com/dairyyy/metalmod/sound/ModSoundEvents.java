package com.dairyyy.metalmod.sound;

import com.dairyyy.metalmod.MetalMod;
import com.dairyyy.metalmod.util.Registration;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;

public class ModSoundEvents
{
    public static final RegistryObject<SoundEvent> ELEPHANT_SHREW_DEATH_CRY =
            Registration.SOUND_EVENTS.register("elephant_shrew_death_cry",
                    () -> new SoundEvent(new ResourceLocation(MetalMod.MOD_ID, "elephant_shrew_death_cry")));

    public static void register() { }
}
