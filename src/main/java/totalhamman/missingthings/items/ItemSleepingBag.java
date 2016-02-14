package totalhamman.missingthings.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import totalhamman.missingthings.MissingThings;

public class ItemSleepingBag extends Item {

    public ItemSleepingBag() {
        super();

        this.setUnlocalizedName("sleeping_bag");
        this.setCreativeTab(MissingThings.tabMissing);
        this.setMaxStackSize(1);
        GameRegistry.registerItem(this, this.getUnlocalizedName().substring(5));
    }


}
