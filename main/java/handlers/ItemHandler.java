package handlers;

import items.ItemTutRuby;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import items.ItemTutInfinityFlame;

public class ItemHandler {
	
	public static Item tutRuby;
	public static Item tutInfinityFlame;

	public static void init(){
		
		tutRuby = new ItemTutRuby("tut_ruby", CreativeTabs.MATERIALS);
		tutInfinityFlame = new ItemTutInfinityFlame("tut_infinity_flame", CreativeTabs.MATERIALS);
		  
	 }
	 
	 public static void register(){
		 
		 GameRegistry.register(tutRuby);
		 GameRegistry.register(tutInfinityFlame);

	 }
	 
	 public static void registerRenders(){
			
		 registerRender(tutRuby);
		 registerRender(tutInfinityFlame);
	
	 }
	 
	 public static void registerRender(Item item){
		 
		 Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	  
	 }

}
