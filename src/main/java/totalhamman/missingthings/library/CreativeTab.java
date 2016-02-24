package totalhamman.missingthings.library;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import totalhamman.missingthings.blocks.ModBlocks;

public class CreativeTab extends CreativeTabs {

    public static final Logger log = LogManager.getLogger(Reference.MOD_ID);

    public CreativeTab(String label) {
        super(label);
        log.info("Creative Tab Name - " + label);
    }

    @Override
    public Item getTabIconItem () {
        return Item.getItemFromBlock(ModBlocks.sleepingBag);
    }

}
