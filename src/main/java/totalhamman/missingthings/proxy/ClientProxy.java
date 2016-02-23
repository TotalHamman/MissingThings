package totalhamman.missingthings.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import totalhamman.missingthings.blocks.BlockMod;
import totalhamman.missingthings.items.ItemMod;

import static totalhamman.missingthings.items.ModItems.*;
import static totalhamman.missingthings.blocks.ModBlocks.*;

public class ClientProxy extends CommonProxy {
    @Override
    public void preInit(FMLPreInitializationEvent e) {
        super.preInit(e);
    }

    @Override
    public void init(FMLInitializationEvent e) {
        super.init(e);

        ItemMod.initModel(sleepingBag);
        ItemMod.initModel(hangGlider);
        ItemMod.initModel(flightRing);
        BlockMod.initModel(floatingBlock);
    }

    @Override
    public void postInit(FMLPostInitializationEvent e) {
        super.postInit(e);
    }
}
