package net.mak.legendmod.sound;

import net.mak.legendmod.LegendMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENT =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, LegendMod.MOD_ID);

    public static final RegistryObject<SoundEvent> METAL = registerSoundEvents("metal");

    public static final RegistryObject<SoundEvent> SOUND_BREAK = registerSoundEvents("sound_break");
    public static final RegistryObject<SoundEvent> SOUND_STEP = registerSoundEvents("sound_step");
    public static final RegistryObject<SoundEvent> SOUND_FALL = registerSoundEvents("sound_fall");
    public static final RegistryObject<SoundEvent> SOUND_PLACE = registerSoundEvents("sound_place");
    public static final RegistryObject<SoundEvent> SOUND_HIT = registerSoundEvents("sound_hit");

    public static final ForgeSoundType SOUND_BLOCK_SOUNDS = new ForgeSoundType(1f, 1f,
            ModSounds.SOUND_BREAK, ModSounds.SOUND_STEP, ModSounds.SOUND_PLACE,
            ModSounds.SOUND_HIT, ModSounds.SOUND_FALL);

    private static RegistryObject<SoundEvent> registerSoundEvents(String name) {
        return SOUND_EVENT.register(name, () -> new SoundEvent(new ResourceLocation(LegendMod.MOD_ID, name)));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENT.register(eventBus);
    }
}