package totalhamman.missingthings.blocks;

import totalhamman.missingthings.MissingThings;

public class ModBlocks {

	//  TODO Add Bedrock Glass, Bedrock Infused Sand, Tiny Chest, Timer, Trash Can

    public static BlockFloatingBlock floatingBlock;
    public static BlockSleepingBag sleepingBag;
    public static BlockBedrockGlass bedrockGlass; 

    public static void init() {
        MissingThings.log.debug("Creating Blocks");
        floatingBlock = new BlockFloatingBlock();
        sleepingBag = new BlockSleepingBag();
        bedrockGlass = new BlockBedrockGlass();
    }
}
