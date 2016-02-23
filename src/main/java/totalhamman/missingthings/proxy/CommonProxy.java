package totalhamman.missingthings.proxy;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import totalhamman.missingthings.blocks.ModBlocks;
import totalhamman.missingthings.crafting.ModCraftingRecipes;
import totalhamman.missingthings.handler.ServerEventHandler;
import totalhamman.missingthings.items.ModItems;

public class CommonProxy {
    public void preInit(FMLPreInitializationEvent e) {
        ModItems.init();
        ModBlocks.init();
        ModCraftingRecipes.init();

        MinecraftForge.EVENT_BUS.register(new ServerEventHandler.EventHandler());
    }

    public void init(FMLInitializationEvent e) {

    }

    public void postInit(FMLPostInitializationEvent e) {

    }
}
