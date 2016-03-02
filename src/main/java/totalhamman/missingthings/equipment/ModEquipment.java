package totalhamman.missingthings.equipment;

import net.minecraft.item.Item;
import totalhamman.missingthings.MissingThings;

public class ModEquipment {

	//  TODO Add Potion Belt
	
	public static Item flightRing;
	
	public static void init() {
		MissingThings.log.debug("Creating Equipment");
		flightRing = new EquipmentFlightRing();
	}
}
