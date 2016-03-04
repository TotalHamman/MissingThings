package totalhamman.missingthings.blocks;

import totalhamman.missingthings.MissingThings;
import totalhamman.missingthings.blocks.ore.BlockRoughDiamondOre;

public class ModBlocks {

    //public static BlockSleepingBag sleepingBag;
    public static BlockFloatingBlock floatingBlock;
    public static BlockBedrockGlass bedrockGlass; 
    public static BlockBedrockInfusedSand bedrockSand;
    public static BlockRoughDiamondOre roughDiamondOre;

    public static void init() {
        MissingThings.log.debug("Creating Blocks");
        //sleepingBag = new BlockSleepingBag();
        floatingBlock = new BlockFloatingBlock();
        bedrockGlass = new BlockBedrockGlass();
        bedrockSand = new BlockBedrockInfusedSand();
        roughDiamondOre = new BlockRoughDiamondOre();
        
    }
}
