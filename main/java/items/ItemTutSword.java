package items;

import com.legonerd666.tut.Ref;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ResourceLocation;

public class ItemTutSword extends ItemSword{

	public ItemTutSword(ToolMaterial material, String unlocalizedName) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Ref.MODID, unlocalizedName));
	}


}
