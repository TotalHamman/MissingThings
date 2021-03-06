package totalhamman.missingthings.blocks.ore;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import totalhamman.missingthings.blocks.BlockMod;
import totalhamman.missingthings.items.ModItems;

import java.util.Random;

public class BlockNetherDiamondOre extends BlockMod {

    public BlockNetherDiamondOre() {
        super(Material.rock, "nether_diamond_ore");
        this.setHarvestLevel("pickaxe", 3);
        this.setHardness(9.0F);
        this.setStepSound(soundTypeStone);
        GameRegistry.registerBlock(this, this.getUnlocalizedName().substring(5));
    }

    @Override
    public Item getItemDropped(IBlockState state, Random random, int fortune) {
        return ModItems.netherDiamond;
    }

    @Override
    public int quantityDropped(Random random) {
        return 1 + random.nextInt(3);
    }

    @Override
    public int quantityDroppedWithBonus(int fortune, Random random) {
        return this.quantityDropped(random) + random.nextInt(fortune + 2);
    }
}
