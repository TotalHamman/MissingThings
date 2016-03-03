package totalhamman.missingthings.blocks;

import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockBedrockInfusedSand extends BlockMod {

	public BlockBedrockInfusedSand() {
		super(Material.sand, "bedrock_sand");
		this.setStepSound(soundTypeSand);
		GameRegistry.registerBlock(this, this.getUnlocalizedName().substring(5));		
	}
}
