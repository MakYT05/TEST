package net.mak.legendmod.event;

import net.mak.legendmod.LegendMod;
import net.mak.legendmod.item.ModItems;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.animal.Sheep;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

public class ModEvents {
    @Mod.EventBusSubscriber(modid = LegendMod.MOD_ID)
    public static class ForgeEvents {
        @SubscribeEvent
        public static void onLivingHurt(LivingHurtEvent event) {
            if (event.getEntity() instanceof Sheep) {
                if (event.getSource().getEntity() instanceof Player player) {
                    if (player.getMainHandItem().getItem() == ModItems.KATANA.get()) {
                        player.sendSystemMessage(Component.literal(player.getName().getString() + " ударил овцу катаной!"));
                    } else {
                        player.sendSystemMessage(Component.literal(player.getName().getString() + " ударил овцу!"));
                    }
                }
            }
        }
    }
}