/*
 * Copyright 2017 (c) IvanSteklow
 * Licensed under the Apache License, Version 2.0
 */
package ru.ivansteklow.isdev.bases;

import ru.ivansteklow.isdev.interfaces.IMetaBlockName;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

/**
 * This is ItemBlock base for mods It's using for registering ItemBlock
 * 
 * @author IvanSteklow
 */
public class ItemBlockBase extends ItemBlock {

	/**
	 * Registering ItemBlock in core
	 * 
	 * @param block
	 *            It's a block which turn into ItemBlock
	 * @throws IllegalArgumentException
	 *             Throws if current block is not instance of IMetaBlockName
	 */
	public ItemBlockBase(Block block) {
		super(block);
		if (!(block instanceof IMetaBlockName)) {
			throw new IllegalArgumentException(String.format("The given Block %s is not an instance of IMetaBlockName",
					block.getUnlocalizedName()));
		}
		this.setHasSubtypes(true);
		this.setMaxDamage(0);
	}

	/**
	 * Returns special unlocalized name of block
	 * 
	 * @return String Unlocalized name of itemblock
	 */
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		return super.getUnlocalizedName() + "." + ((IMetaBlockName) this.block).getSpecialName(stack);
	}

	/**
	 * Returns metadata (damage of item)
	 * 
	 * @return Returns metadata (damage)
	 */
	@Override
	public int getMetadata(int damage) {
		return damage;
	}

}
