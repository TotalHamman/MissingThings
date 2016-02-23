package totalhamman.missingthings.items;

import net.minecraft.item.Item;

public final class ModItems {

    public static Item sleepingBag;
    public static Item hangGlider;
    public static Item flightRing;

    public static void init() {
//        MissingThings.log.debug("Creating Items");
        sleepingBag = new ItemSleepingBag();
        hangGlider = new ItemHangGlider();
        flightRing = new ItemFlightRing();
    }
}
