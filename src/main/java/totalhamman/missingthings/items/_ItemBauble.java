package totalhamman.missingthings.items;

import baubles.api.BaubleType;
import baubles.api.IBauble;
import baubles.common.container.InventoryBaubles;
import baubles.common.lib.PlayerHandler;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class _ItemBauble extends _ItemMod implements IBauble {

    @Override
    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
        if(canEquip(stack, player)) {
            InventoryBaubles baubles = PlayerHandler.getPlayerBaubles(player);
            for(int i = 0; i < baubles.getSizeInventory(); i++) {
                if(baubles.isItemValidForSlot(i, stack) && baubles.getStackInSlot(i) == null) {
                    if(!world.isRemote) {
                        baubles.setInventorySlotContents(i, stack.copy());
                        if (!player.capabilities.isCreativeMode) {
                            player.inventory.setInventorySlotContents(player.inventory.currentItem, null);
                        }
                        break;
                    }
                }
            }
        }

        return stack;
    }

    @Override
    public boolean canEquip (ItemStack stack, EntityLivingBase player) {
        return true;
    }

    @Override
    public boolean canUnequip(ItemStack stack, EntityLivingBase player) {
        return true;
    }

    @Override
    public void onUnequipped(ItemStack stack, EntityLivingBase player) {
    }

    @Override
    public void onEquipped(ItemStack stack, EntityLivingBase player) {
    }

    @Override
    public BaubleType getBaubleType (ItemStack stack) {
        return BaubleType.AMULET;
    }

    @Override
    public void onWornTick(ItemStack stack, EntityLivingBase player) {
    }
}
