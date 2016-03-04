package totalhamman.missingthings.items.materials;

import net.minecraftforge.fml.common.registry.GameRegistry;
import totalhamman.missingthings.MissingThings;
import totalhamman.missingthings.items.ItemMod;

public class MaterialNetherDiamond extends ItemMod {

    public MaterialNetherDiamond() {
        super();
        this.setMaxStackSize(64);
        this.setUnlocalizedName("nether_diamond");
        this.setCreativeTab(MissingThings.tabMissing);
        GameRegistry.registerItem(this, this.getUnlocalizedName().substring(5));
    }

}
