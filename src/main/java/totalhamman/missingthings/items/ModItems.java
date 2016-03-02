package totalhamman.missingthings.items;

import net.minecraft.item.Item;
import totalhamman.missingthings.MissingThings;

public final class ModItems {
	
	//  TODO Add Bedrock Chisel, PotionBelt, Mod Book, Void Bag, Backpack

    public static Item hangGlider;

    public static void init() {
        MissingThings.log.debug("Creating Items");
        hangGlider = new ItemHangGlider();
    }
}
