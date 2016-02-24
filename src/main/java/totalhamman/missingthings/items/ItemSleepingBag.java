package totalhamman.missingthings.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBed;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import totalhamman.missingthings.MissingThings;

import java.util.List;

public class ItemSleepingBag extends ItemBed {

    public ItemSleepingBag() {
        super();

        this.setCreativeTab(MissingThings.tabMissing);
    }

//    TODO Add sleeping_bag Item code

    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean bool) {
        list.add("Not Yet Implemented");
    }

    @Override
    public boolean onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ) {
        MissingThings.log.info("OnItemUse SleepingBag");
        return super.onItemUse(stack, playerIn, worldIn, pos, side, hitX, hitY, hitZ);
    }
}
