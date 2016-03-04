package baubles.api;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;

/**
 * 
 * This interface should be extended by items that can be worn in baubles slots
 * 
 * @author Azanor
 */

public interface IBauble {
	
	/**
	 * This method return the type of baubles this is.
	 * Type is used to determine the slots it can go into.
	 */
	public BaubleType getBaubleType(ItemStack itemstack);
	
	/**
	 * This method is called once per tick if the baubles is being worn by a player
	 */
	public void onWornTick(ItemStack itemstack, EntityLivingBase player);
	
	/**
	 * This method is called when the baubles is equipped by a player
	 */
	public void onEquipped(ItemStack itemstack, EntityLivingBase player);
	
	/**
	 * This method is called when the baubles is unequipped by a player
	 */
	public void onUnequipped(ItemStack itemstack, EntityLivingBase player);

	/**
	 * can this baubles be placed in a baubles slot
	 */
	public boolean canEquip(ItemStack itemstack, EntityLivingBase player);
	
	/**
	 * Can this baubles be removed from a baubles slot
	 */
	public boolean canUnequip(ItemStack itemstack, EntityLivingBase player);
}
