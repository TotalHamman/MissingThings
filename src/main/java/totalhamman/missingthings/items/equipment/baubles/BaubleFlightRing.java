package totalhamman.missingthings.items.equipment.baubles;

import baubles.api.BaubleType;
import baubles.common.lib.PlayerHandler;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import totalhamman.missingthings.MissingThings;
import totalhamman.missingthings.items.ItemBauble;

import java.util.ArrayList;
import java.util.List;

public class BaubleFlightRing extends ItemBauble {
	
	public static List<String> playersWithFlightList = new ArrayList();

    public BaubleFlightRing() {
        super();
        this.setMaxStackSize(1);
        this.setUnlocalizedName("flight_ring");
        this.setCreativeTab(MissingThings.tabMissing);
        MinecraftForge.EVENT_BUS.register(this);
        GameRegistry.registerItem(this, this.getUnlocalizedName().substring(5));
    }

    @Override
    public BaubleType getBaubleType (ItemStack stack) {
        return BaubleType.RING;
    }
    
    @Override
    public void onUnequipped(ItemStack stack, EntityLivingBase player) {
        super.onUnequipped(stack, player);
    }

    @Override
    public void onEquipped(ItemStack stack, EntityLivingBase player) {
        super.onEquipped(stack, player);
    }

    @Override
    public void onWornTick(ItemStack stack, EntityLivingBase player) {
    	super.onWornTick(stack, player);
    }
    
    public static String playerName(EntityPlayer player) {
    	return player.getGameProfile().getName() + ":" + player.worldObj.isRemote;
    }
    
    public boolean shouldHaveFlightPlayer(EntityPlayer player) {
    	ItemStack ringOne = PlayerHandler.getPlayerBaubles(player).getStackInSlot(1);
    	ItemStack ringTwo = PlayerHandler.getPlayerBaubles(player).getStackInSlot(2);
    	
    	if ((ringOne != null && ringOne.getItem() == this) || (ringTwo != null && ringTwo.getItem() == this)) {
    		return true;    	
    	}
    	
    	return false;
    }
    
    @SubscribeEvent
    public void onPlayerLoggedOut(PlayerEvent.PlayerLoggedOutEvent event) {
    	playersWithFlightList.remove(event.player.getGameProfile().getName() + ":false");
    	playersWithFlightList.remove(event.player.getGameProfile().getName() + ":true");
    }
    
    @SubscribeEvent
    public void updateFlightStatusPlayer(LivingEvent.LivingUpdateEvent event) {
    	if (event.entityLiving instanceof EntityPlayer) {
    		EntityPlayer player = (EntityPlayer) event.entityLiving;
    		
    		if (playersWithFlightList.contains(playerName(player))) {
    			if (shouldHaveFlightPlayer(player)) {
    				player.capabilities.allowFlying = true;
    			} else {
    				if(!player.capabilities.isCreativeMode) {
    					player.capabilities.allowFlying = false;
    					player.capabilities.isFlying = false;
    					player.capabilities.disableDamage = false;
    				}
    				playersWithFlightList.remove(playerName(player));
    			}
    		} else {
    			if (shouldHaveFlightPlayer(player)) {
    				playersWithFlightList.add(playerName(player));
    				player.capabilities.allowFlying = true;
    			}
    		}  	
    	}
    }
}
