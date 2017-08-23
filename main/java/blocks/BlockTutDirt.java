package blocks;

import java.util.Random;

import handlers.ItemHandler;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class BlockTutDirt extends ModBlock{
	
	public BlockTutDirt(Material mat, String name, CreativeTabs tab, float hardness, float resistance, int harvest, String tool) {
		super(mat, name, tab, hardness, resistance, harvest, tool);
	}

}
