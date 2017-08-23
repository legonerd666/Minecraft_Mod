package handlers;

import com.legonerd666.tut.Ref;

import items.ItemTutAxe;
import items.ItemTutHoe;
import items.ItemTutPickaxe;
import items.ItemTutSpade;
import items.ItemTutSword;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ToolHandler {
	
	public static final ToolMaterial rubyMaterialTool = EnumHelper.addToolMaterial(Ref.MODID + ":ruby", 3, 800, 10.0F, 5.0F, 30);
	

	public static Item tutPickaxe;
	public static Item tutSword;
	public static Item tutSpade;
	public static Item tutHoe;
	public static Item tutAxe;
	
	public static void init(){
		
		tutPickaxe = new ItemTutPickaxe(rubyMaterialTool, "tut_pickaxe");
		tutSword = new ItemTutSword(rubyMaterialTool, "tut_sword");
		tutSpade = new ItemTutSpade(rubyMaterialTool, "tut_spade");
		tutHoe = new ItemTutHoe(rubyMaterialTool, "tut_hoe");
		tutAxe = new ItemTutAxe(rubyMaterialTool, "tut_axe");
		
	 }
	 
	 public static void register(){
		 
		 GameRegistry.register(tutPickaxe);
		 GameRegistry.register(tutSword);
		 GameRegistry.register(tutSpade);
		 GameRegistry.register(tutHoe);
		 GameRegistry.register(tutAxe);
	  
	 }
	 
	 public static void registerRenders(){
		 
		 registerRender(tutPickaxe);
		 registerRender(tutSword);
		 registerRender(tutSpade);
		 registerRender(tutHoe);
		 registerRender(tutAxe);
	
	 }
	 
	 public static void registerRender(Item item){
		 
		 Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	  
	 }

}
