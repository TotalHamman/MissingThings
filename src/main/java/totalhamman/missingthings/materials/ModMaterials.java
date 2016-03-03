package totalhamman.missingthings.materials;

import totalhamman.missingthings.MissingThings;

public class ModMaterials {
	
	public static MaterialBedrockShard bedrockShard;
	public static MaterialRoughDiamond roughDiamond;
    public static MaterialRoughDiamondGem roughDiamondGem;
	
	public static void init() {
		MissingThings.log.debug("Creating Materials");
		bedrockShard = new MaterialBedrockShard();
		roughDiamond = new MaterialRoughDiamond();
        roughDiamondGem = new MaterialRoughDiamondGem();
	}
	
}
