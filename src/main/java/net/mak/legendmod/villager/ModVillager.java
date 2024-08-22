package net.mak.legendmod.villager;

import com.google.common.collect.ImmutableSet;
import net.mak.legendmod.LegendMod;
import net.mak.legendmod.block.BlockInit;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModVillager {
    public static final DeferredRegister<PoiType> POI_TYPES = DeferredRegister.create(
            ForgeRegistries.POI_TYPES, LegendMod.MOD_ID
    );

    public static final DeferredRegister<VillagerProfession> VILLAGER_PROFESSIONS = DeferredRegister.create(
            ForgeRegistries.VILLAGER_PROFESSIONS, LegendMod.MOD_ID
    );

    public static final RegistryObject<PoiType> SWORD_POI = POI_TYPES.register("sword_poi",
            () -> new PoiType(ImmutableSet.copyOf(BlockInit.CITRINE_BLOCK.get().getStateDefinition().getPossibleStates()), 1, 1));

    private static net.minecraft.sounds.SoundEvent SoundEvent;
    public static final RegistryObject<VillagerProfession> SWORD_MASTER = VILLAGER_PROFESSIONS.register("swordmaster",
            () -> new VillagerProfession("swordmaster", holder -> holder.get() == SWORD_POI.get(), holder -> holder.get() == SWORD_POI.get(),
                    ImmutableSet.of(), ImmutableSet.of(), SoundEvent));

    public static void register(IEventBus eventBus) {
        POI_TYPES.register(eventBus);
        VILLAGER_PROFESSIONS.register(eventBus);
    }
}