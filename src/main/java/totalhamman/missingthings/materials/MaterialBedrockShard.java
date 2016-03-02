package totalhamman.missingthings.materials;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.registry.GameRegistry;
import totalhamman.missingthings.MissingThings;

public class MaterialBedrockShard extends MaterialMod {
	
	public MaterialBedrockShard() {
		super();
		this.setMaxStackSize(64);
        this.setUnlocalizedName("bedrock_shard");
        this.setCreativeTab(MissingThings.tabMissing);
        GameRegistry.registerItem(this, this.getUnlocalizedName().substring(5));
	}

}
