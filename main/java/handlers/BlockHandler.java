package handlers;

import blocks.BlockTutBarrel;
import blocks.BlockTutBlockRuby;
import blocks.BlockTutDirt;
import blocks.BlockTutGrass;
import blocks.BlockTutRubyOre;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockHandler {
	
	public static Block tutBarrel;
	public static ItemBlock ibTutBarrel;
	
	public static Block tutDirt;
	public static ItemBlock ibTutDirt;
	
	public static Block tutGrass;
	public static ItemBlock ibTutGrass;
	
	public static Block tutRubyOre;
	public static ItemBlock ibTutRubyOre;
	
	public static Block tutBlockRuby;
	public static ItemBlock ibTutBlockRuby;
	
	public static void init(){
		
		tutBarrel = new BlockTutBarrel(Material.WOOD, "tut_barrel", CreativeTabs.BUILDING_BLOCKS, 5F, 15F, 0, "axe");
		ibTutBarrel = (ItemBlock) new ItemBlock(tutBarrel);
		
		tutDirt = new BlockTutDirt(Material.GROUND, "tut_dirt", CreativeTabs.BUILDING_BLOCKS, 5F, 15F, 3, "shovel");
		ibTutDirt = (ItemBlock) new ItemBlock(tutDirt);
		
		tutGrass = new BlockTutGrass(Material.GRASS, "tut_grass", CreativeTabs.BUILDING_BLOCKS, 5F, 15F, 3, "shovel");
		ibTutGrass = (ItemBlock) new ItemBlock(tutGrass);
		
		tutRubyOre = new BlockTutRubyOre(Material.ROCK, "tut_ruby_ore", CreativeTabs.BUILDING_BLOCKS, 5F, 15F, 3, "pickaxe");
		ibTutRubyOre = (ItemBlock) new ItemBlock(tutRubyOre);
		
		tutBlockRuby = new BlockTutBlockRuby(Material.ROCK, "tut_block_ruby", CreativeTabs.BUILDING_BLOCKS, 5F, 15F, 3, "pickaxe");
		ibTutBlockRuby = (ItemBlock) new ItemBlock(tutBlockRuby);
		
	 }
	 
	public static void register(){
		  GameRegistry.register(tutBarrel);
		  GameRegistry.register(ibTutBarrel, tutBarrel.getRegistryName());
		
		  GameRegistry.register(tutDirt);
		  GameRegistry.register(ibTutDirt, tutDirt.getRegistryName());
		  
		  GameRegistry.register(tutGrass);
		  GameRegistry.register(ibTutGrass, tutGrass.getRegistryName());
		  
		  GameRegistry.register(tutRubyOre);
		  GameRegistry.register(ibTutRubyOre, tutRubyOre.getRegistryName());
		  
		  GameRegistry.register(tutBlockRuby);
		  GameRegistry.register(ibTutBlockRuby, tutBlockRuby.getRegistryName());
		 }
		 
	public static void registerRenders(){
		  registerRender(tutBarrel);
		
		  registerRender(tutDirt);
		  
		  registerRender(tutGrass);
		  
		  registerRender(tutRubyOre);
		  
		  registerRender(tutBlockRuby);
		 }
	 
	 public static void registerRender(Block block){
		 
		 Item item = Item.getItemFromBlock(block);
		 Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));

	 }

}
