package totalhamman.missingthings.items.materials;

import net.minecraftforge.fml.common.registry.GameRegistry;
import totalhamman.missingthings.MissingThings;
import totalhamman.missingthings.items.ItemMod;

public class MaterialBedrockShard extends ItemMod {
	
	public MaterialBedrockShard() {
		super();
		this.setMaxStackSize(64);
        this.setUnlocalizedName("bedrock_shard");
        this.setCreativeTab(MissingThings.tabMissing);
        GameRegistry.registerItem(this, this.getUnlocalizedName().substring(5));
	}

}
