package totalhamman.missingthings.items.materials;

import net.minecraftforge.fml.common.registry.GameRegistry;
import totalhamman.missingthings.MissingThings;

public class MaterialRoughDiamond extends MaterialMod {

    public MaterialRoughDiamond() {
        super();
        this.setMaxStackSize(64);
        this.setUnlocalizedName("rough_diamond");
        this.setCreativeTab(MissingThings.tabMissing);
        GameRegistry.registerItem(this, this.getUnlocalizedName().substring(5));
    }

}
