package totalhamman.missingthings.items;

import net.minecraft.item.Item;
import totalhamman.missingthings.MissingThings;

public final class ModItems {

    public static Item hangGlider;

    public static void init() {
        MissingThings.log.debug("Creating Items");
        hangGlider = new ItemHangGlider();
    }
}
