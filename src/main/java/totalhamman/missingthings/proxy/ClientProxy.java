package totalhamman.missingthings.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import totalhamman.missingthings.MissingThings;
import totalhamman.missingthings.blocks.BlockMod;
import totalhamman.missingthings.equipment.EquipmentMod;
import totalhamman.missingthings.items.ItemMod;
import totalhamman.missingthings.materials.MaterialMod;

import static totalhamman.missingthings.items.ModItems.*;
import static totalhamman.missingthings.blocks.ModBlocks.*;
import static totalhamman.missingthings.materials.ModMaterials.*;
import static totalhamman.missingthings.equipment.ModEquipment.*;


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
        BlockMod.initModel(floatingBlock);
        BlockMod.initModel(sleepingBag);
        BlockMod.initModel(bedrockGlass);
        MaterialMod.initModel(bedrockShard);
        EquipmentMod.initModel(flightRing);
    }

    @Override
    public void postInit(FMLPostInitializationEvent e) {
        super.postInit(e);
    }
}
