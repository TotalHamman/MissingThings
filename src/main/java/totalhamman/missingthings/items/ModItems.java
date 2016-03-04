package totalhamman.missingthings.items;

import totalhamman.missingthings.MissingThings;
import totalhamman.missingthings.items.equipment.baubles.BaubleFlightRing;
import totalhamman.missingthings.items.materials.MaterialBedrockShard;
import totalhamman.missingthings.items.materials.MaterialNetherDiamond;
import totalhamman.missingthings.items.materials.MaterialNetherDiamondGem;
import totalhamman.missingthings.items.equipment.tools.ToolBedrockChisel;

public final class ModItems {

    public static ItemHangGlider hangGlider;
    public static MaterialBedrockShard bedrockShard;
    public static MaterialNetherDiamond netherDiamond;
    public static MaterialNetherDiamondGem netherDiamondGem;
    public static BaubleFlightRing flightRing;
    public static ToolBedrockChisel bedrockChisel;

    public static void init() {
        MissingThings.log.debug("Creating Items");
        hangGlider = new ItemHangGlider();

        MissingThings.log.debug("Creating Materials");
        bedrockShard = new MaterialBedrockShard();
        netherDiamond = new MaterialNetherDiamond();
        netherDiamondGem = new MaterialNetherDiamondGem();

        MissingThings.log.debug("Creating Equipment");
        flightRing = new BaubleFlightRing();

        MissingThings.log.debug("Creating Tools");
        bedrockChisel = new ToolBedrockChisel();
    }
}
