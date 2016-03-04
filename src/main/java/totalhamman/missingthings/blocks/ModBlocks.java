package totalhamman.missingthings.blocks;

import totalhamman.missingthings.MissingThings;
import totalhamman.missingthings.blocks.ore.BlockNetherDiamondOre;

public class ModBlocks {

    //public static BlockSleepingBag sleepingBag;
    public static BlockFloatingBlock floatingBlock;
    public static BlockBedrockGlass bedrockGlass; 
    public static BlockBedrockInfusedSand bedrockSand;
    public static BlockNetherDiamondOre netherDiamondOre;

    public static void init() {
        MissingThings.log.debug("Creating Blocks");
        //sleepingBag = new BlockSleepingBag();
        floatingBlock = new BlockFloatingBlock();
        bedrockGlass = new BlockBedrockGlass();
        bedrockSand = new BlockBedrockInfusedSand();
        netherDiamondOre = new BlockNetherDiamondOre();
        
    }
}
