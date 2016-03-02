package totalhamman.missingthings.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.registry.GameRegistry;
import totalhamman.missingthings.items.ItemBedrockGlass;
import totalhamman.missingthings.items.ItemFloatingBlock;

public class BlockBedrockGlass extends BlockMod {

	public BlockBedrockGlass() {
		super(Material.rock, "bedrock_glass");
		this.setHardness(50);
		this.setResistance(2000.0F);
        GameRegistry.registerBlock(this, this.getUnlocalizedName().substring(5));
	}
	
	public boolean canEntityDestroy(IBlockAccess world, int x, int y, int z, Entity entity) {
		return false;
	}
	

	
}
