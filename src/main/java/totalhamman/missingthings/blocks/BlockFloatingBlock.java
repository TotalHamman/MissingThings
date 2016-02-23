package totalhamman.missingthings.blocks;

import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;
import totalhamman.missingthings.items.ItemFloatingBlock;

public class BlockFloatingBlock extends BlockMod {

    public BlockFloatingBlock() {
        super(Material.cactus, "floating_block");
        GameRegistry.registerBlock(this, ItemFloatingBlock.class, this.getUnlocalizedName().substring(5));
    }

}
