package totalhamman.missingthings.materials;

import totalhamman.missingthings.MissingThings;

public class ModMaterials {
	
    //  TODO Add Bedrock Shard
	
	public static MaterialBedrockShard bedrockShard;
	
	public static void init() {
		MissingThings.log.debug("Creating Materials");
		bedrockShard = new MaterialBedrockShard(); 
	}
	
}
