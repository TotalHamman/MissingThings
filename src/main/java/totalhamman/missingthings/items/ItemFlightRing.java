package totalhamman.missingthings.items;

import baubles.api.BaubleType;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import totalhamman.missingthings.MissingThings;

public class ItemFlightRing extends _ItemBauble {

    public ItemFlightRing() {
        super();
        this.setMaxStackSize(1);
        this.setUnlocalizedName("flight_ring");
        this.setCreativeTab(MissingThings.tabMissing);
        GameRegistry.registerItem(this, this.getUnlocalizedName().substring(5));
    }

    @Override
    public void onUnequipped(ItemStack stack, EntityLivingBase player) {
        EntityPlayer p = (EntityPlayer) player;

        p.capabilities.allowFlying = false;
        p.capabilities.isFlying = false;
        p.capabilities.disableDamage = false;
    }

    @Override
    public void onEquipped(ItemStack stack, EntityLivingBase player) {
        super.onEquipped(stack, player);

        EntityPlayer p = (EntityPlayer) player;
        p.capabilities.allowFlying = true;
        p.capabilities.disableDamage = true;
    }

    @Override
    public BaubleType getBaubleType (ItemStack stack) {
        return BaubleType.RING;
    }

    @Override
    public void onWornTick(ItemStack stack, EntityLivingBase player) {
        if (player instanceof EntityPlayer) {
            EntityPlayer p = (EntityPlayer) player;

        }
    }
}
