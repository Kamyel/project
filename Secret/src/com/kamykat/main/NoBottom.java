package com.kamykat.main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class NoBottom {
	public static int x = (720-144) - 154, y = 250;
	public static int x2, y2 ;
	public static int width = 150 , height = 60;
	public static BufferedImage OXE_COMUE = Oxe.getSprite(0,0,720,852);

	public static void render(Graphics g) {
	g.setColor(Color.white);
	g.fillRect(x-2, y-2, width + 4, height + 4);
	g.setColor(Color.red);
	g.fillRect(x, y, width, height);
	g.setColor(Color.white);
	g.setFont(new Font("arial", Font.BOLD, 20));
	g.drawString("No, weirdo >:(", x+10, y+37);
	
	if(Janela.noPressed == "true") {
		g.setColor(new Color(0,0,0,20));
		g.fillRect(x-2, y-2, width + 4, height + 4);
		}
	}
}
