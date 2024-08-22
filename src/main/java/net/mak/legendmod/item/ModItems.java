package net.mak.legendmod.item;

import net.mak.legendmod.LegendMod;
import net.mak.legendmod.item.custom.EightBallItem;
import net.mak.legendmod.item.custom.ZeusItem;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public abstract class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, LegendMod.MOD_ID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    public static final RegistryObject<Item> MANDARIN = ITEMS.register("mandarin",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TAB).stacksTo(64).rarity(Rarity.COMMON).food(new FoodProperties.Builder()
                    .nutrition(6).saturationMod(1f).alwaysEat().build())));

    public static final RegistryObject<Item> CHERRY = ITEMS.register("cherry",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TAB).stacksTo(64).rarity(Rarity.COMMON).food(new FoodProperties.Builder()
                    .nutrition(6).saturationMod(1f).alwaysEat().build())));

    public static final RegistryObject<Item> FRESH = ITEMS.register("fresh",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TAB).stacksTo(1).rarity(Rarity.COMMON).food(new FoodProperties.Builder()
                    .nutrition(10).saturationMod(1f).alwaysEat().build())));

    public static final RegistryObject<Item> KIWI = ITEMS.register("kiwi",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TAB).stacksTo(1).rarity(Rarity.COMMON).food(new FoodProperties.Builder()
                    .nutrition(6).saturationMod(1f).alwaysEat().build())));

    public static final RegistryObject<SwordItem> KATANA = ITEMS.register("katana",
            () -> new SwordItem(Tiers.EXAMPLE, 10, 5, new Item.Properties().tab(ModCreativeModeTab.TAB)));

    public static final RegistryObject<Item> ZEUS = ITEMS.register("zeus",
            () -> new ZeusItem(new Item.Properties().tab(ModCreativeModeTab.TAB)));

    public static final RegistryObject<Item> EIGHT_BALL = ITEMS.register("eight_ball",
            () -> new EightBallItem(new Item.Properties().tab(ModCreativeModeTab.TAB)));

    public static final RegistryObject<Item> CITRINE = ITEMS.register("citrine",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TAB)));

    public static final RegistryObject<Item> TYPO_MECH = ITEMS.register("typo_mech",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TAB).stacksTo(1)));

    public abstract int getBurnTime(ItemStack fuel);

    public abstract int getItemBurnTime(ItemStack itemStack);

    public static class Tiers {
        public static final Tier EXAMPLE = new ForgeTier(
                2,
                500,
                5,
                10,
                350,
                null,
                () -> Ingredient.of(ModItems.KATANA.get())
        );
    }
}