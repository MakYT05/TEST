package net.mak.legendmod.item.custom;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;

public class ZeusItem extends Item{

    public ZeusItem(Properties properties) {super(properties);}

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand) {
        ItemStack itemstack = player.getUseItem();
        if (!world.isClientSide() && hand == InteractionHand.MAIN_HAND) {
            player.getCooldowns().addCooldown(this, 0);

            BlockHitResult ray = getPlayerPOVHitResult(world, player, ClipContext.Fluid.NONE);
            BlockPos lookPos = ray.getBlockPos().relative(ray.getDirection());
            player.setPos(lookPos.getX(), lookPos.getY(), lookPos.getZ());
        }

        return super.use(world, player, hand);
    }
}