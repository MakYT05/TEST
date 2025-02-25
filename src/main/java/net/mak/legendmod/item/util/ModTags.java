package net.mak.legendmod.item.util;

import net.mak.legendmod.LegendMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    private static class Blocks{
        public static final TagKey<Block> NEEDS_SAPPHIRE_TOOL = tag("needs_sapphire_tool");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(LegendMod.MOD_ID, name));
        }
    }

    private static class Items {
        public static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(LegendMod.MOD_ID, name));
        }
    }
}
