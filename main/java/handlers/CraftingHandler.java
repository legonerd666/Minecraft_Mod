package handlers;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import items.ItemTutPickaxe;

public class CraftingHandler {
	
	public static void register() {
		
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WHITE_SHULKER_BOX), Blocks.PURPLE_SHULKER_BOX, new ItemStack(Items.DYE, 1, 15));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.ORANGE_SHULKER_BOX), Blocks.PURPLE_SHULKER_BOX, new ItemStack(Items.DYE, 1, 14));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.MAGENTA_SHULKER_BOX), Blocks.PURPLE_SHULKER_BOX, new ItemStack(Items.DYE, 1, 13));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.LIGHT_BLUE_SHULKER_BOX), Blocks.PURPLE_SHULKER_BOX, new ItemStack(Items.DYE, 1, 12));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.YELLOW_SHULKER_BOX), Blocks.PURPLE_SHULKER_BOX, new ItemStack(Items.DYE, 1, 11));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.LIME_SHULKER_BOX), Blocks.PURPLE_SHULKER_BOX, new ItemStack(Items.DYE, 1, 10));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.PINK_SHULKER_BOX), Blocks.PURPLE_SHULKER_BOX, new ItemStack(Items.DYE, 1, 9));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.GRAY_SHULKER_BOX), Blocks.PURPLE_SHULKER_BOX, new ItemStack(Items.DYE, 1, 8));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.SILVER_SHULKER_BOX), Blocks.PURPLE_SHULKER_BOX, new ItemStack(Items.DYE, 1, 7));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.CYAN_SHULKER_BOX), Blocks.PURPLE_SHULKER_BOX, new ItemStack(Items.DYE, 1, 6));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.RED_SHULKER_BOX), Blocks.PURPLE_SHULKER_BOX, new ItemStack(Items.DYE, 1, 5));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.BLUE_SHULKER_BOX), Blocks.PURPLE_SHULKER_BOX, new ItemStack(Items.DYE, 1, 4));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.BROWN_SHULKER_BOX), Blocks.PURPLE_SHULKER_BOX, new ItemStack(Items.DYE, 1, 3));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.GREEN_SHULKER_BOX), Blocks.PURPLE_SHULKER_BOX, new ItemStack(Items.DYE, 1, 2));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.RED_SHULKER_BOX), Blocks.PURPLE_SHULKER_BOX, new ItemStack(Items.DYE, 1, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.BLACK_SHULKER_BOX), Blocks.PURPLE_SHULKER_BOX, new ItemStack(Items.DYE, 1, 0));
		GameRegistry.addShapelessRecipe(new ItemStack(BlockHandler.tutGrass), Blocks.GRASS, Items.BEEF);
		GameRegistry.addShapelessRecipe(new ItemStack(BlockHandler.tutDirt), Blocks.DIRT, Items.BEEF);
		
		GameRegistry.addShapedRecipe(new ItemStack(ToolHandler.tutPickaxe), "RRR", " S ", " S ", 'R', ItemHandler.tutRuby, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ToolHandler.tutAxe), "RR ", "RS ", " S ", 'R', ItemHandler.tutRuby, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ToolHandler.tutAxe), " RR", " SR", " S ", 'R', ItemHandler.tutRuby, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ToolHandler.tutSpade), " R ", " S ", " S ", 'R', ItemHandler.tutRuby, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ToolHandler.tutHoe), "RR ", " S ", " S ", 'R', ItemHandler.tutRuby, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ToolHandler.tutHoe), " RR", " S ", " S ", 'R', ItemHandler.tutRuby, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ToolHandler.tutSword), " R ", " R ", " S ", 'R', ItemHandler.tutRuby, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(BlockHandler.tutBlockRuby), "RRR", "RRR", "RRR", 'R', ItemHandler.tutRuby);
		GameRegistry.addShapedRecipe(new ItemStack(ArmorHandler.tutHelmet), "RRR", "R R", "   ", 'R', ItemHandler.tutRuby);
		GameRegistry.addShapedRecipe(new ItemStack(ArmorHandler.tutChestplate), "R R", "RRR", "RRR", 'R', ItemHandler.tutRuby);
		GameRegistry.addShapedRecipe(new ItemStack(ArmorHandler.tutLeggings), "RRR", "L L", "L L", 'R', ItemHandler.tutRuby, 'L', Items.LEATHER);
		GameRegistry.addShapedRecipe(new ItemStack(ArmorHandler.tutBoots), "   ", "L L", "R R", 'R', ItemHandler.tutRuby, 'L', Items.LEATHER);
		
	}


}
