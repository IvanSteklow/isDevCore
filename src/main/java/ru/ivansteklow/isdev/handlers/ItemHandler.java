/*
 * Copyright 2017 (c) IvanSteklow
 * Licensed under the Apache License, Version 2.0
 */
package ru.ivansteklow.isdev.handlers;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

/**
 * This class helps you to register item in game and register render of item in
 * game
 * 
 * @author IvanSteklow
 *
 */
public class ItemHandler {
	
	/**
	 * It's register render for item
	 * 
	 * @param item
	 *            It's a item for registering
	 * @param modid
	 *            It's MODID for registering in YOUR mod
	 */
	public static void regItemRender(Item item, String modid) {
		ModelResourceLocation model = new ModelResourceLocation(item.getRegistryName(), "inventory");
		ModelLoader.setCustomModelResourceLocation(item, 0, model);
	}
	
	/**
	 * It's register render for item
	 * 
	 * @param item
	 *            It's a item for registering
	 * @param modid
	 *            It's MODID for registering in YOUR mod
	 * @param meta
	 *            It's metadata(damage) of block
	 * @param filename
	 *            It's resource location (file name)
	 */
	public static void regItemRender(Item item, String modid, int meta, String filename) {
		ModelResourceLocation model = new ModelResourceLocation(new ResourceLocation(modid, filename), "inventory");
		ModelLoader.setCustomModelResourceLocation(item, meta, model);
	}
}
