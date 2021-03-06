package totalhamman.missingthings.items;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import totalhamman.missingthings.library.Reference;

public class ItemMod extends Item {

    public static void initModel(Item item) {
//        MissingThings.log.debug("Register Item Render - " + item.getUnlocalizedName().substring(5));
        ModelResourceLocation modelRL = new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory");
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, modelRL);
    }
}
