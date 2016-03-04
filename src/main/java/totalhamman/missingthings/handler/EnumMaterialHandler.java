package totalhamman.missingthings.handler;

import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemTool;
import net.minecraftforge.common.util.EnumHelper;

public class EnumMaterialHandler {

    public static final ItemArmor.ArmorMaterial armorNetherDiamond = EnumHelper.addArmorMaterial("NETHERDIAMOND", "nether_diamond", 33, new int[]{3, 8, 6, 3}, 10);
    public static final ItemTool.ToolMaterial toolNetherDiamond = EnumHelper.addToolMaterial("NETHERDIAMOND", 3, 1561, 6.0F, 3F, 10);

 }
