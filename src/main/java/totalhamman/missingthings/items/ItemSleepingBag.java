package totalhamman.missingthings.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import totalhamman.missingthings.MissingThings;

import java.util.List;

public class ItemSleepingBag extends Item {

    public ItemSleepingBag() {
        super();

        this.setUnlocalizedName("sleeping_bag");
        this.setCreativeTab(MissingThings.tabMissing);
        this.setMaxStackSize(1);
        GameRegistry.registerItem(this, this.getUnlocalizedName().substring(5));
    }

//    TODO Add sleeping bag code

    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean bool) {
        list.add("Not Yet Implemented");
    }
}
