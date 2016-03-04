package totalhamman.missingthings.items.materials;

import net.minecraftforge.fml.common.registry.GameRegistry;
import totalhamman.missingthings.MissingThings;
import totalhamman.missingthings.items.ItemMod;

public class MaterialNetherDiamondGem extends ItemMod {

    public MaterialNetherDiamondGem() {
        super();
        this.setMaxStackSize(64);
        this.setUnlocalizedName("nether_diamond_gem");
        this.setCreativeTab(MissingThings.tabMissing);
        GameRegistry.registerItem(this, this.getUnlocalizedName().substring(5));
    }
}
