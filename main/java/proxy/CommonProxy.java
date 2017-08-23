package proxy;

import com.legonerd666.tut.Ref;

import command.CommandTutorial;
import events.BiggerTntExplosions;
import events.ExplodingAnvils;
import events.ExplodingMinecarts;
import handlers.ArmorHandler;
import handlers.BlockHandler;
import handlers.CraftingHandler;
import handlers.FuelHandler;
import handlers.ItemHandler;
import handlers.ToolHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.event.FMLServerStoppingEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import world.WorldGenOre;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent event){

        ItemHandler.init();
        ItemHandler.register();
        
        BlockHandler.init();
        BlockHandler.register();
        
        ToolHandler.init();
        ToolHandler.register();
        
        ArmorHandler.init();
        ArmorHandler.register();
        
    }
    public void Init(FMLInitializationEvent event){
    	
    	CraftingHandler.register();
    	
    	GameRegistry.registerWorldGenerator(new WorldGenOre(), 0);
    	GameRegistry.registerFuelHandler(new FuelHandler());
    	
    	MinecraftForge.EVENT_BUS.register(new ExplodingMinecarts());
    	MinecraftForge.EVENT_BUS.register(new ExplodingAnvils());
    	MinecraftForge.EVENT_BUS.register(new BiggerTntExplosions());
    	
    }
    
    public void postInit(FMLPostInitializationEvent event){
    	
    }
    public void serverStarting(FMLServerStartingEvent event){
    	
    	event.registerServerCommand(new CommandTutorial());
    	
    }
    public void serverStopping(FMLServerStoppingEvent event){
    	
    }
}
