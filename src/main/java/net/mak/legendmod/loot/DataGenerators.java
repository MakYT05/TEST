package net.mak.legendmod.loot;

import net.mak.legendmod.LegendMod;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.concurrent.CompletableFuture;

//@Mod.EventBusSubscriber(modid = LegendMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
//public class DataGenerators {
//    @SubscribeEvent
//    public static void gatherData(GatherDataEvent event) {
//        DataGenerator generators = event.getGenerator();
//        PackOutput packOutput = generator.getPackOutput;
//        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
//        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
//    }
//}