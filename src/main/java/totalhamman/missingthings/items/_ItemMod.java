package totalhamman.missingthings.items;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import totalhamman.missingthings.MissingThings;
import totalhamman.missingthings.library.Reference;

public class _ItemMod extends Item {

    public static void registerItemRender(Item item) {
        MissingThings.log.info("Register Item Render - " + item.getUnlocalizedName().substring(5));
        ModelResourceLocation modelRL = new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory");
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, modelRL);
    }
}
