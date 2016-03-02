package totalhamman.missingthings.items;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import totalhamman.missingthings.MissingThings;

public class ItemFloatingBlock extends ItemBlock {

    public ItemFloatingBlock(Block block) {
        super(block);
    }

    public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer player) {
        if (world.isRemote) {
            return item;
        }

        int x = (int)(Math.floor(player.posX));
        int y = (int)(Math.floor(player.posY) + 1.0);
        int z = (int)(Math.floor(player.posZ));

        Vec3 look = player.getLookVec();
        double m = Math.max(Math.max(Math.abs(look.xCoord), Math.abs(look.yCoord)), Math.abs(look.zCoord));
        
        //MissingThings.log.info("Look: "+look.toString()+" | x: "+x+" | y: "+y+" | z: "+z+" | m: "+m);

        // Set initial Placement Vector Offset from Player Head
        if (look.yCoord == m) {
            y = (int)(Math.ceil(player.posY) + 2.0);
        } else if (- look.yCoord == m) {
            y = (int)(Math.floor(player.posY) - 2.0);
        } else if (look.xCoord == m) {
            x = (int)(Math.floor(player.posX) + 2.0);
        } else if (- look.xCoord == m) {
            x = (int)(Math.floor(player.posX) - 2.0);
        } else if (look.zCoord == m) {
            z = (int)(Math.floor(player.posZ) + 2.0);
        } else if (- look.zCoord == m) {
            z = (int)(Math.floor(player.posZ) - 2.0);
        }
        
        // Adjust Initial Placement Vector Offset to include Diagonal placement
        if (look.yCoord > 0.35 && look.yCoord < 0.65) {
        	y += 1;
        } else if (look.yCoord < -0.35 && look.yCoord > -0.65) {
        	y -= 1;
        } else if (look.xCoord > 0.35 && look.xCoord < 0.65) {
        	x += 1;
        } else if (look.xCoord < -0.35 && look.xCoord > -0.65) {
        	x -= 1;
        } else if (look.zCoord > 0.35 && look.zCoord < 0.65) {
        	z += 1;
        } else if (look.zCoord < -0.35 && look.zCoord > -0.65) {
        	z -= 1;
        }

        BlockPos position = new BlockPos(x, y, z);

        if (world.canBlockBePlaced(this.block, position, false, EnumFacing.getFront(0), player, item)) {
            item.onItemUse(player, world, position, EnumFacing.getFront(0), x, y, z);
        }

        return item;
    }

}
