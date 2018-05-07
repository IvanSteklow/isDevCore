/*
 * Copyright 2017 (c) IvanSteklow
 * Licensed under the Apache License, Version 2.0
 */
package ru.ivansteklow.isdev.inventory;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

/**
 * This class uses when you register new capability It's uses for slot for
 * <b>enchanted</b> book
 * 
 * @author IvanSteklow
 *
 */
public class SlotItemEnchantedBook extends SlotItemHandler {

	/**
	 * Register slot
	 * 
	 * @param itemHandler
	 *            Item handler
	 * @param index
	 *            Index for slot
	 * @param xPosition
	 *            X position
	 * @param yPosition
	 *            Y position
	 */
	public SlotItemEnchantedBook(IItemHandler itemHandler, int index, int xPosition, int yPosition) {
		super(itemHandler, index, xPosition, yPosition);
	}

	@Override
	public boolean isItemValid(ItemStack stack) {
		if (stack.getItem() == Items.ENCHANTED_BOOK)
			return true;
		return false;
	}

	@Override
	public int getSlotStackLimit() {
		return 1;
	}

	@Override
	public boolean canTakeStack(EntityPlayer playerIn) {
		if (playerIn instanceof EntityPlayer)
			return true;
		return false;
	}
}
