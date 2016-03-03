package totalhamman.missingthings.blocks;

import net.minecraft.block.BlockBed;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockSleepingBag extends BlockBed {

    public BlockSleepingBag () {
        super();

        this.setUnlocalizedName("sleeping_bag");
        GameRegistry.registerBlock(this, this.getUnlocalizedName().substring(5));
    }

    @Override
    public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumFacing side, float hitX, float hitY, float hitZ) {
        return super.onBlockActivated(world, pos, state, player, side, hitX, hitY, hitZ);
    }

}
