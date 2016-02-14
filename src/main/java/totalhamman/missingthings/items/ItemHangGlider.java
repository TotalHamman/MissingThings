package totalhamman.missingthings.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import totalhamman.missingthings.MissingThings;

public class ItemHangGlider extends Item {

    public ItemHangGlider() {
        super();

        this.setUnlocalizedName("hang_glider");
        this.setCreativeTab(MissingThings.tabMissing);
        this.setMaxStackSize(1);
        GameRegistry.registerItem(this, this.getUnlocalizedName().substring(5));
    }
}
