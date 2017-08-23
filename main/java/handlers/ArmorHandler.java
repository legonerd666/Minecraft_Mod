package handlers;

import com.legonerd666.tut.Ref;

import items.ItemTutArmor;
import items.ItemTutAxe;
import items.ItemTutHoe;
import items.ItemTutPickaxe;
import items.ItemTutSpade;
import items.ItemTutSword;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ArmorHandler {
	
	public static ArmorMaterial rubyMaterialArmor = EnumHelper.addArmorMaterial("ruby", Ref.MODID + ":ruby", 40, new int[] {2,6,5,2}, 30, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 6.0F);
	
	public static Item tutHelmet;
	public static Item tutChestplate;
	public static Item tutLeggings;
	public static Item tutBoots;
	
	public static void init(){
		
		tutHelmet = new ItemTutArmor(rubyMaterialArmor, 1, EntityEquipmentSlot.HEAD, "tut_helmet");
		tutChestplate = new ItemTutArmor(rubyMaterialArmor, 1, EntityEquipmentSlot.CHEST, "tut_chestplate");
		tutLeggings = new ItemTutArmor(rubyMaterialArmor, 2, EntityEquipmentSlot.LEGS, "tut_leggings");
		tutBoots = new ItemTutArmor(rubyMaterialArmor, 1, EntityEquipmentSlot.FEET, "tut_boots");
		  
	 }
	 
	 public static void register(){
		 
		 GameRegistry.register(tutHelmet);
		 GameRegistry.register(tutChestplate);
		 GameRegistry.register(tutLeggings);
		 GameRegistry.register(tutBoots);
	  
	 }
	 
	 public static void registerRenders(){
		 
		 registerRender(tutHelmet);
		 registerRender(tutChestplate);
		 registerRender(tutLeggings);
		 registerRender(tutBoots);
	  
	 }
	 
public static void registerRender(Item item){
		 
		 Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	  
	 }

}
