package totalhamman.missingthings.items.equipment.tools;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import totalhamman.missingthings.MissingThings;
import totalhamman.missingthings.items.ItemMod;
import totalhamman.missingthings.items.ModItems;

public class ToolBedrockChisel extends ItemMod {

    public ToolBedrockChisel() {
        super();
        this.setMaxStackSize(1);
        this.setUnlocalizedName("bedrock_chisel");
        this.setCreativeTab(MissingThings.tabMissing);
        this.setMaxDamage(8);
        this.setNoRepair();
        GameRegistry.registerItem(this, this.getUnlocalizedName().substring(5));
    }

    @Override
    public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ) {

        if (world.getBlockState(pos).getBlock() == Block.getBlockFromName(Blocks.bedrock.getRegistryName())) {
            player.inventory.addItemStackToInventory(new ItemStack(ModItems.bedrockShard));
            stack.damageItem(1, (EntityLivingBase) player);
            return true;
        }

        return false;
    }

    @Override
    public int getItemEnchantability() {
        return 14;
    }

}

