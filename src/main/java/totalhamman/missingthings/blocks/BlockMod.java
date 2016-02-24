package totalhamman.missingthings.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import totalhamman.missingthings.MissingThings;
import totalhamman.missingthings.items.ItemMod;
import totalhamman.missingthings.library.Reference;

public class BlockMod extends Block {

    public BlockMod(Material material, String name) {
        super(material);
        super.setUnlocalizedName(name);
        super.setRegistryName(name);
        this.setCreativeTab(MissingThings.tabMissing);
    }

    public static void initModel(Block block) {
        ModelResourceLocation modelRL = new ModelResourceLocation(Reference.MOD_ID + ":" + block.getUnlocalizedName().substring(5), "inventory");
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, modelRL);

        ItemMod.initModel(Item.getItemFromBlock(block));
    }

}
