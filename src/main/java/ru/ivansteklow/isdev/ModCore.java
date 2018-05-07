/*
 * Copyright 2017 (c) IvanSteklow
 * Licensed under the Apache License, Version 2.0
 */
package ru.ivansteklow.isdev;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

/**
 * The main class of isDevCore In this class mod registering in Minecraft In
 * this class nothing happens
 * 
 * @author IvanSteklow
 * @version 1.0.1
 */
@Mod(modid = Refs.MOD_ID, name = Refs.NAME, version = Refs.VERSION, acceptedMinecraftVersions = Refs.ACCEPTED_MC_VERSIONS, dependencies = Refs.DEPENDENCIES)
public class ModCore {

	/**
	 * It's Pre initialization event of isDevCore
	 * 
	 * @param e
	 */
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent e) {

	}

	/**
	 * It's Initialization event of isDevCore
	 * 
	 * @param e
	 */
	@EventHandler
	public static void Init(FMLInitializationEvent e) {

	}

	/**
	 * It's Post initialization event of isDevCore
	 * 
	 * @param e
	 */
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent e) {

	}

	/**
	 * It's server starting event of isDevCore
	 * 
	 * @param e
	 */
	@EventHandler
	public static void ServerLoad(FMLServerStartingEvent e) {

	}
}
