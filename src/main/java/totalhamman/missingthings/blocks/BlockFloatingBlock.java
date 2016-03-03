package totalhamman.missingthings.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import totalhamman.missingthings.items.ItemFloatingBlock;

public class BlockFloatingBlock extends BlockMod {

    public BlockFloatingBlock() {
        super(Material.cactus, "floating_block");
        this.setStepSound(soundTypeStone);
        MinecraftForge.EVENT_BUS.register(this);
        GameRegistry.registerBlock(this, ItemFloatingBlock.class, this.getUnlocalizedName().substring(5));
    }
    
    @SubscribeEvent
    public void floatingBlockBreak(PlayerInteractEvent event) {
        if (event.action == PlayerInteractEvent.Action.LEFT_CLICK_BLOCK) {
            Block block = event.world.getBlockState(event.pos).getBlock();
            if (block.getUnlocalizedName().equals(this.getUnlocalizedName())) {
                event.entityPlayer.inventory.addItemStackToInventory(new ItemStack(Block.getBlockFromName(block.getRegistryName())));
                event.world.setBlockToAir(event.pos);
            }
        }
    }

}
