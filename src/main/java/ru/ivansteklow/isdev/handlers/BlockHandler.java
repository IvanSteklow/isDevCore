/*
 * Copyright 2017 (c) IvanSteklow
 * Licensed under the Apache License, Version 2.0
 */
package ru.ivansteklow.isdev.handlers;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

/**
 * This class helps you to register block in game and register render of block
 * in game
 * 
 * @author IvanSteklow
 */
public class BlockHandler {
	/**
	 * It's register render for block
	 * 
	 * @param block
	 *            It's a block for registering
	 * @param modid
	 *            It's MODID for registering in YOUR mod
	 */
	public static void regItemBlockRender(Block block, String modid) {
		Item item = Item.getItemFromBlock(block);
		ModelResourceLocation model = new ModelResourceLocation(block.getRegistryName(), "inventory");
		ModelLoader.setCustomModelResourceLocation(item, 0, model);
	}

	/**
	 * It's register render for block with metadata
	 * 
	 * @param block
	 *            It's a block for registering
	 * @param modid
	 *            It's MODID for registering in YOUR mod
	 * @param meta
	 *            It's metadata(damage) of block
	 * @param filename
	 *            It's resource location (file name)
	 */
	public static void regItemBlockRender(Block block, String modid, int meta, String filename) {
		Item item = Item.getItemFromBlock(block);
		ModelResourceLocation model = new ModelResourceLocation(new ResourceLocation(modid, filename), "inventory");
		ModelLoader.setCustomModelResourceLocation(item, meta, model);
	}

}
