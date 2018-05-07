/*
 * Copyright 2017 (c) IvanSteklow
 * Licensed under the Apache License, Version 2.0
 */
package ru.ivansteklow.isdev.bases;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;

public class BlockBase extends Block {

	public BlockBase(Material materialIn, String registrationName, String modid) {
		super(materialIn);
		setUnlocalizedName(registrationName);
		this.setRegistryName(new ResourceLocation(modid, registrationName));
	}

}
