package totalhamman.missingthings.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.util.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockBedrockGlass extends BlockMod {

	public BlockBedrockGlass() {
		super(Material.rock, "bedrock_glass");
		this.setHardness(50);
		this.setResistance(2000.0F);
		this.setStepSound(soundTypeGlass);
        GameRegistry.registerBlock(this, this.getUnlocalizedName().substring(5));
	}
	
	public boolean canEntityDestroy(IBlockAccess world, BlockPos pos, Entity entity) {
		return false;
	}

	@Override
	public void onBlockExploded(World world,  BlockPos pos, Explosion explosion) {
		// NO-OP
	}

	@Override
	public boolean canDropFromExplosion(Explosion explosion) {
		return false;
	}
	
}
