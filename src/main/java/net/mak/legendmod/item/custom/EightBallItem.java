package net.mak.legendmod.item.custom;

import net.minecraft.network.chat.Component;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;

public class EightBallItem extends Item {
    public EightBallItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        if (!level.isClientSide() && hand == InteractionHand.MAIN_HAND) {
            outputRandomNumber(player);
            player.getCooldowns().addCooldown(this, 2000);
            if (getRandomNumber(player) == 9) {
                ItemStack Sword = new ItemStack(Items.NETHERITE_SWORD);
                player.addItem(Sword);
                player.sendSystemMessage(Component.literal("Вы получили незеритовый меч!"));
            } if (getRandomNumber(player) == 5) {
                ItemStack Apple = new ItemStack(Items.ENCHANTED_GOLDEN_APPLE);
                player.addItem(Apple);
                player.sendSystemMessage(Component.literal("Вы получили зачарованное золотое яблоко!"));
            } if (getRandomNumber(player) == 0) {
                ItemStack Diamond = new ItemStack(Items.DIAMOND);
                player.addItem(Diamond);
                player.sendSystemMessage(Component.literal("Вы получили алмаз!"));
            } if (getRandomNumber(player) == 1) {
                ItemStack Star = new ItemStack(Items.NETHER_STAR);
                player.addItem(Star);
                player.sendSystemMessage(Component.literal("Вы получили незеритовую звезду!"));
            } if (getRandomNumber(player) == 2) {
                ItemStack Melon = new ItemStack(Items.MELON);
                player.addItem(Melon);
                player.sendSystemMessage(Component.literal("Вы получили арбуз!"));
            } if (getRandomNumber(player) == 3) {
                ItemStack Gold_Block = new ItemStack(Items.GOLD_BLOCK);
                player.addItem(Gold_Block);
                player.sendSystemMessage(Component.literal("Вы получили золотой блок!"));
            } if (getRandomNumber(player) == 4) {
                ItemStack Grass = new ItemStack(Items.GRASS);
                player.addItem(Grass);
                player.sendSystemMessage(Component.literal("Вы получили траву!"));
            } if (getRandomNumber(player) == 6) {
                ItemStack Stone = new ItemStack(Items.STONE);
                player.addItem(Stone);
                player.sendSystemMessage(Component.literal("Вы получили камень!"));
            } if (getRandomNumber(player) == 7) {
                ItemStack Heart = new ItemStack(Items.HEART_OF_THE_SEA);
                player.addItem(Heart);
                player.sendSystemMessage(Component.literal("Вы получили сердце моря!"));
            } if (getRandomNumber(player) == 8) {
                ItemStack Table = new ItemStack(Items.ENCHANTING_TABLE);
                player.addItem(Table);
                player.sendSystemMessage(Component.literal("Вы получили стол зачарования!"));
            }
        }

        return super.use(level, player, hand);
    }

    private int outputRandomNumber (Player player) {
        return 0;
    }

    private int getRandomNumber(Player player) {
        return RandomSource.createNewThreadLocalInstance().nextInt(10);
    }
}