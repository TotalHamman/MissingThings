package totalhamman.missingthings.items;

import net.minecraft.item.Item;
import totalhamman.missingthings.MissingThings;

public final class _ModItems {

    public static Item sleepingBag;
    public static Item hangGlider;
    public static Item flightRing;

    public static void createItems() {
        MissingThings.log.info("Creating Items");
        sleepingBag = new ItemSleepingBag();
        hangGlider = new ItemHangGlider();
        flightRing = new ItemFlightRing();
    }
}
