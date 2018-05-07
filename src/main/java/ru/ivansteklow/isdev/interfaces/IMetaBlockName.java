/*
 * Copyright 2017 (c) IvanSteklow
 * Licensed under the Apache License, Version 2.0
 */
package ru.ivansteklow.isdev.interfaces;

import net.minecraft.item.ItemStack;

public interface IMetaBlockName {

	String getSpecialName(ItemStack stack);

}
