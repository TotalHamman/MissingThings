package totalhamman.missingthings.blocks;

import totalhamman.missingthings.MissingThings;

public class ModBlocks {

    public static BlockFloatingBlock floatingBlock;
    public static BlockSleepingBag sleepingBag;

    public static void init() {
        MissingThings.log.debug("Creating Blocks");
        floatingBlock = new BlockFloatingBlock();
        sleepingBag = new BlockSleepingBag();
    }
}
