package proxy;

import com.legonerd666.tut.Main;
import handlers.ArmorHandler;
import handlers.BlockHandler;
import handlers.ItemHandler;
import handlers.ToolHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;

public class ClientProxy extends CommonProxy{

    @Override
    public void preInit(FMLPreInitializationEvent event){
        super.preInit(event);
    }

    @Override
    public void Init(FMLInitializationEvent event){
        super.Init(event);
        ItemHandler.registerRenders();
        BlockHandler.registerRenders();
        ToolHandler.registerRenders();
        ArmorHandler.registerRenders();
    }

    @Override
    public void postInit(FMLPostInitializationEvent event){
        super.postInit(event);
    }

}

