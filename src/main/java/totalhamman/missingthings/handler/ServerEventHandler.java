package totalhamman.missingthings.handler;

import baubles.common.container.InventoryBaubles;
import baubles.common.lib.PlayerHandler;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.entity.player.PlayerSleepInBedEvent;
import net.minecraftforge.event.entity.player.PlayerUseItemEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import totalhamman.missingthings.MissingThings;
import totalhamman.missingthings.items.ModItems;

public class ServerEventHandler {

    public static class EventHandler {
        @SubscribeEvent
        public void fbOnPlayerInteract(PlayerInteractEvent event) {
            if (event.action == PlayerInteractEvent.Action.LEFT_CLICK_BLOCK) {
                Block block = event.world.getBlockState(event.pos).getBlock();
                if (block.getUnlocalizedName().equals("tile.floating_block")) {
                    event.entityPlayer.inventory.addItemStackToInventory(new ItemStack(Block.getBlockFromName(block.getRegistryName())));
                    event.world.setBlockToAir(event.pos);
                }
            }
        }

        @SubscribeEvent
        public void frOnLivingUpdate(LivingEvent.LivingUpdateEvent event) {
            if (event.entityLiving != null && event.entityLiving instanceof EntityPlayer) {
                EntityPlayer player =  ((EntityPlayer)event.entityLiving);
                InventoryBaubles baubles = PlayerHandler.getPlayerBaubles(player);
                if(baubles.getStackInSlot(1) == null || baubles.getStackInSlot(1).getItem() != ModItems.flightRing) {
                    if(baubles.getStackInSlot(2) == null || baubles.getStackInSlot(2).getItem() != ModItems.flightRing) {
                        if(player.capabilities.allowFlying) {
                            player.capabilities.allowFlying = false;
                            player.capabilities.isFlying = false;
                        }
                    }
                }
            }
        }
    }
}
