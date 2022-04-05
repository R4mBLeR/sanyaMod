package sanyamod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import sanyamod.proxy.CommonProxy;

@Mod(modid = sanyaMod.MODID /* имя мода */, version = sanyaMod.VERSION /* его версия */)
public class sanyaMod{
    public static final String MODID = "sanyamod";
    public static final String VERSION = "1.0";

    @SidedProxy(clientSide = "sanyamod.proxy.ClientProxy", serverSide = "sanyamod.proxy.CommonProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit(event);
    }
}