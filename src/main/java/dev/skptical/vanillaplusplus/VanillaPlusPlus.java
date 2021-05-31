package dev.skptical.vanillaplusplus;

import dev.skptical.vanillaplusplus.common.CommonProxy;
import dev.skptical.vanillaplusplus.core.Reference;
import dev.skptical.vanillaplusplus.core.handlers.RegistryHandler;
import dev.skptical.vanillaplusplus.core.tabs.VanillaPlusPlusTab;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

@Mod(modid = Reference.MOD_ID, version = Reference.VERSION, name = Reference.MOD_NAME)
public class VanillaPlusPlus {

    @Mod.Instance
    public static VanillaPlusPlus instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide =  Reference.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;

    public static final CreativeTabs VANILLA_PLUS_PLUS_TAB = new VanillaPlusPlusTab("Vanilla++");

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){

        RegistryHandler.preInitRegistries();

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){

        RegistryHandler.initRegistries();

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){

        RegistryHandler.postInitRegistries();

    }

    @Mod.EventHandler
    public void serverInit(FMLServerStartingEvent event){

        RegistryHandler.serverRegistries();

    }


}
