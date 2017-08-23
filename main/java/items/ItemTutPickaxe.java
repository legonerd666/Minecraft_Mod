package items;

import com.legonerd666.tut.Ref;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.util.ResourceLocation;

public class ItemTutPickaxe extends ItemPickaxe{

	public ItemTutPickaxe(ToolMaterial material, String unlocalizedName) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Ref.MODID, unlocalizedName));
	}

}
