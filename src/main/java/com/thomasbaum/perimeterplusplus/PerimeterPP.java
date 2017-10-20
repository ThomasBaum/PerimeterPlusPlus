package com.thomasbaum.perimeterplusplus;

import com.sun.deploy.util.SessionState;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod
(modid = PerimeterPP.MODID, version = PerimeterPP.VERSION, name = PerimeterPP.NAME)

@SideOnly(Side.CLIENT)



public class PerimeterPP {

    public static final String MODID = "perimeterplusplus";
    public static final String VERSION = "1.0";
    public static final String NAME = "Perimeter Plus Plus";

    @EventHandler
    public void preinit(FMLPreInitializationEvent event){
        System.out.println("Pre-init");
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println("Init");
    }

    @EventHandler
    public void postinit(FMLPostInitializationEvent event){
        System.out.println("Post-init");
    }
}
