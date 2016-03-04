package totalhamman.missingthings.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import totalhamman.missingthings.MissingThings;
import totalhamman.missingthings.blocks.BlockMod;
import totalhamman.missingthings.items.ItemMod;

import static totalhamman.missingthings.blocks.ModBlocks.*;
import static totalhamman.missingthings.items.ModItems.*;


public class ClientProxy extends CommonProxy {
    @Override
    public void preInit(FMLPreInitializationEvent e) {
        super.preInit(e);
    }

    @Override
    public void init(FMLInitializationEvent e) {
        super.init(e);

        MissingThings.log.debug("Init Models");

        ItemMod.initModel(hangGlider);
        ItemMod.initModel(bedrockChisel);
        ItemMod.initModel(bedrockShard);
        ItemMod.initModel(netherDiamond);
        ItemMod.initModel(netherDiamondGem);
        ItemMod.initModel(flightRing);
       // BlockMod.initModel(sleepingBag);
        BlockMod.initModel(floatingBlock);
        BlockMod.initModel(bedrockGlass);
        BlockMod.initModel(bedrockSand);
        BlockMod.initModel(netherDiamondOre);
    }

    @Override
    public void postInit(FMLPostInitializationEvent e) {
        super.postInit(e);
    }
}
