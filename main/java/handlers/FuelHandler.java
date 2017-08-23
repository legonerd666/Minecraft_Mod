package handlers;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

public class FuelHandler implements IFuelHandler{

	@Override
	public int getBurnTime(ItemStack fuel) {
		
		if(fuel.getItem() == ItemHandler.tutInfinityFlame) {
			return 1999999999;
		}
		
		return 0;
	}

}
