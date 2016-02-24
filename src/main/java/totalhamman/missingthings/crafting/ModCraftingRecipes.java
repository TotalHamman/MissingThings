package totalhamman.missingthings.crafting;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import totalhamman.missingthings.blocks.ModBlocks;
import totalhamman.missingthings.items.ModItems;

public class ModCraftingRecipes {
    public static void init() {

        addShapedRecipe(new ItemStack(ModItems.flightRing),
                "NGN", "G G", " G ",
                'G', "ingotGold",
                'N', new ItemStack(Items.nether_star));

        addShapedRecipe(new ItemStack(ModBlocks.sleepingBag),
                "   ", "CC ", "WWW",
                'C', new ItemStack(Blocks.carpet),
                'W', new ItemStack(Blocks.wool));

        addShapedRecipe(new ItemStack(ModItems.hangGlider),
                " L ", "LLL", "LSL",
                'L', new ItemStack(Items.leather),
                'S', new ItemStack(Items.stick));

        addShapedRecipe(new ItemStack(ModBlocks.floatingBlock),
                "OFO", "FNF", "OFO",
                'O', new ItemStack(Blocks.obsidian),
                'N', new ItemStack(Items.nether_star),
                'F', new ItemStack(Items.feather));
    }

    public static void addShapedRecipe(ItemStack output, Object... recipe) {
        GameRegistry.addRecipe(new ShapedOreRecipe(output, recipe));
    }

    public static void addShapelessRecipe(ItemStack output, Object... recipe) {
        GameRegistry.addRecipe(new ShapelessOreRecipe(output, recipe));
    }

}
