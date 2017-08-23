package command;

import com.legonerd666.tut.Main;
import com.legonerd666.tut.Ref;

import handlers.BlockHandler;
import handlers.ItemHandler;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.World;

public class CommandTutorial extends CommandBase{

	@Override
	public String getName() {
		return "tut";
	}

	@Override
	public String getUsage(ICommandSender sender) {
		return null;
	}

	@Override
	public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
		
		World world = sender.getEntityWorld();
		
		if(world.isRemote) {
			Main.LOGGER.info("Not Processing on the Client Side!");
		}
		
		else {
			Main.LOGGER.info("Processing on the Server Side!");
			
			EntityPlayerMP player = getCommandSenderAsPlayer(sender);
			
			if(args[0].equals("get")) {
				
				if(args[1].equals(ItemHandler.tutRuby.getUnlocalizedName().substring(5))) {
					String itemName = ItemHandler.tutRuby.getUnlocalizedName().substring(5);
					ItemStack itemstack = new ItemStack(getItemByText(sender, Ref.MODID+":"+itemName));
					player.inventory.addItemStackToInventory(itemstack);
				}
				
				else if(args[1].equals(BlockHandler.tutDirt.getUnlocalizedName().substring(5))) {
					String blockName = BlockHandler.tutDirt.getUnlocalizedName().substring(5);
					ItemStack itemstack = new ItemStack(getItemByText(sender, Ref.MODID+":"+blockName));
					player.inventory.addItemStackToInventory(itemstack);
				}
				
				else if(args[1].equals(BlockHandler.tutGrass.getUnlocalizedName().substring(5))) {
					String blockName = BlockHandler.tutGrass.getUnlocalizedName().substring(5);
					ItemStack itemstack = new ItemStack(getItemByText(sender, Ref.MODID+":"+blockName));
					player.inventory.addItemStackToInventory(itemstack);
				}
				
			}
		}
		
	}

}
