package totalhamman.missingthings.handler;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import totalhamman.missingthings.blocks.ModBlocks;
import totalhamman.missingthings.items.ModItems;

public class CraftingRecipeHandler {
    public static void init() {

        addShapedRecipe(new ItemStack(ModItems.flightRing),
                "NGN", "G G", " G ",
                'G', "ingotGold",
                'N', new ItemStack(Items.nether_star));

       /* addShapedRecipe(new ItemStack(ModBlocks.sleepingBag),
                "   ", "CC ", "WWW",
                'C', new ItemStack(Blocks.carpet),
                'W', new ItemStack(Blocks.wool));*/

        /*addShapedRecipe(new ItemStack(ModItems.hangGlider),
                " L ", "LLL", "LSL",
                'L', new ItemStack(Items.leather),
                'S', new ItemStack(Items.stick));*/

        addShapedRecipe(new ItemStack(ModItems.bedrockChisel),
                " G ", "O  ", "   ",
                'G', new ItemStack(ModItems.netherDiamondGem),
                'O', new ItemStack(Blocks.obsidian));

        addShapedRecipe(new ItemStack(ModBlocks.floatingBlock),
                "OFO", "FGF", "OFO",
                'O', new ItemStack(Blocks.obsidian),
                'G', new ItemStack(ModItems.netherDiamondGem),
                'F', new ItemStack(Items.feather));

        addShapedRecipe(new ItemStack(ModItems.netherDiamondGem),
                " G ", "GGG", " G ",
                'G', new ItemStack(ModItems.netherDiamond));

        addShapelessRecipe(new ItemStack(ModBlocks.bedrockSand),
                Blocks.sand, ModItems.bedrockShard);

        addSmeltingRecipe(ModBlocks.bedrockSand, new ItemStack(ModBlocks.bedrockGlass), 0.1F);

    }

    public static void addShapedRecipe(ItemStack output, Object... recipe) {
        GameRegistry.addRecipe(new ShapedOreRecipe(output, recipe));
    }

    public static void addShapelessRecipe(ItemStack output, Object... recipe) {
        GameRegistry.addRecipe(new ShapelessOreRecipe(output, recipe));
    }

    public static void addSmeltingRecipe(Item input, ItemStack output, Float exp) {
        GameRegistry.addSmelting(input, output, exp);
    }

    public static void addSmeltingRecipe(Block input, ItemStack output, Float exp) {
        GameRegistry.addSmelting(input, output, exp);
    }

    public static void addSmeltingRecipe(ItemStack input, ItemStack output, Float exp) {
        GameRegistry.addSmelting(input, output, exp);
    }

}
