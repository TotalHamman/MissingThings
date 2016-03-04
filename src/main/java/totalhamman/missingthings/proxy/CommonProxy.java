package totalhamman.missingthings.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import totalhamman.missingthings.blocks.ModBlocks;
import totalhamman.missingthings.handler.CraftingRecipeHandler;
import totalhamman.missingthings.items.ModItems;
import totalhamman.missingthings.world.NetherOreGenerator;

public class CommonProxy {
    public void preInit(FMLPreInitializationEvent e) {
        ModItems.init();
        ModBlocks.init();
        CraftingRecipeHandler.init();

        //MinecraftForge.EVENT_BUS.register(new ServerEventHandler.EventHandler());
    }

    public void init(FMLInitializationEvent e) {
        NetherOreGenerator.init();
    }

    public void postInit(FMLPostInitializationEvent e) {

    }
}
