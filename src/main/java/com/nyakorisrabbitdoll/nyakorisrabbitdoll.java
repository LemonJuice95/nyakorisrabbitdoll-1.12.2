package com.nyakorisrabbitdoll;

import com.nyakorisrabbitdoll.proxy.CommonProxy;
import com.nyakorisrabbitdoll.util.Reference;
import com.nyakorisrabbitdoll.util.handlers.RegistryHandlers;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class nyakorisrabbitdoll {
    @Mod.Instance
    public static nyakorisrabbitdoll instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public static void PreInit(FMLPreInitializationEvent ev){
        RegistryHandlers.preInitRegistries();
    }

    @Mod.EventHandler
    public static void Init(FMLInitializationEvent ev){

    }

    @Mod.EventHandler
    public static void PostInit(FMLPostInitializationEvent ev){
        RegistryHandlers.postInitRegistries();
    }
}
