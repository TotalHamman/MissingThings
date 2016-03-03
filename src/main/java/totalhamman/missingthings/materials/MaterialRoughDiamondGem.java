package totalhamman.missingthings.materials;

import net.minecraftforge.fml.common.registry.GameRegistry;
import totalhamman.missingthings.MissingThings;

public class MaterialRoughDiamondGem extends MaterialMod {

    public MaterialRoughDiamondGem() {
        super();
        this.setMaxStackSize(64);
        this.setUnlocalizedName("rough_diamond_gem");
        this.setCreativeTab(MissingThings.tabMissing);
        GameRegistry.registerItem(this, this.getUnlocalizedName().substring(5));
    }
}
