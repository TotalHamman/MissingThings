package totalhamman.missingthings.items.materials;

import net.minecraftforge.fml.common.registry.GameRegistry;
import totalhamman.missingthings.MissingThings;
import totalhamman.missingthings.items.ItemMod;

public class MaterialRoughDiamondGem extends ItemMod {

    public MaterialRoughDiamondGem() {
        super();
        this.setMaxStackSize(64);
        this.setUnlocalizedName("rough_diamond_gem");
        this.setCreativeTab(MissingThings.tabMissing);
        GameRegistry.registerItem(this, this.getUnlocalizedName().substring(5));
    }
}
