package totalhamman.missingthings.items;

import totalhamman.missingthings.MissingThings;
import totalhamman.missingthings.items.equipment.baubles.BaubleFlightRing;
import totalhamman.missingthings.items.materials.MaterialBedrockShard;
import totalhamman.missingthings.items.materials.MaterialRoughDiamond;
import totalhamman.missingthings.items.materials.MaterialRoughDiamondGem;
import totalhamman.missingthings.items.equipment.tools.ToolBedrockChisel;

public final class ModItems {

    public static ItemHangGlider hangGlider;
    public static MaterialBedrockShard bedrockShard;
    public static MaterialRoughDiamond roughDiamond;
    public static MaterialRoughDiamondGem roughDiamondGem;
    public static BaubleFlightRing flightRing;
    public static ToolBedrockChisel bedrockChisel;

    public static void init() {
        MissingThings.log.debug("Creating Items");
        hangGlider = new ItemHangGlider();

        MissingThings.log.debug("Creating Materials");
        bedrockShard = new MaterialBedrockShard();
        roughDiamond = new MaterialRoughDiamond();
        roughDiamondGem = new MaterialRoughDiamondGem();

        MissingThings.log.debug("Creating Equipment");
        flightRing = new BaubleFlightRing();

        MissingThings.log.debug("Creating Tools");
        bedrockChisel = new ToolBedrockChisel();
    }
}
