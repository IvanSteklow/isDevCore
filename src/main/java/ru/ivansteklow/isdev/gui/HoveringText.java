package ru.ivansteklow.isdev.gui;

import java.util.List;

import net.minecraft.client.gui.inventory.GuiContainer;

public class HoveringText{

	private int actualMouseX, actualMouseY, x, y, width, height;
	private List<String> text;
	private GuiContainer gui;
	
	public HoveringText(GuiContainer gui, int actualMouseX, int actualMouseY, int x, int y, int width, int height, List<String> text) {
		this.actualMouseX = actualMouseX;
		this.actualMouseY = actualMouseY;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.text = text;
		this.gui = gui;
	}
	
	public void draw() {
		if (actualMouseX >= x && actualMouseX <= x+width && actualMouseY >= y && actualMouseY <= y+height) {
			gui.drawHoveringText(text, actualMouseX, actualMouseY);
		}
	}
	
}
