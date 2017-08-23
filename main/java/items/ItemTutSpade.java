package items;

import com.legonerd666.tut.Ref;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSpade;
import net.minecraft.util.ResourceLocation;

public class ItemTutSpade extends ItemSpade{

	public ItemTutSpade(ToolMaterial material, String unlocalizedName) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Ref.MODID, unlocalizedName));
	}


}
