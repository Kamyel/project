package com.kamykat;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Yesbottom {
	
	public static int x = 144, y = 250;
	public static int width = 150, height = 60;
	public static BufferedImage YEEPIE_SCENE = Yeepie.getSprite(0,0,720,480);
	
	public Yesbottom(int x, int y, int width,int height) {
		
	}
	public void tick() {
		
	}
	public static void render(Graphics g) {
	
    	g.setColor(Color.white);
    	g.fillRect(x-2, y-2, width+4, height+4);
	    g.setColor(Color.cyan);
	    g.fillRect(x, y, width, height);
	    g.setColor(Color.white);
	    g.setFont(new Font("arial", Font.BOLD, 20));
	    g.drawString("Yes <3", x + ((150/2) - 30), y + 35);
	    
	    if(Janela.yesPressed == "true") {
	    	g.setColor(new Color(0,0,0,20));
	    	g.fillRect(x-2,y-2,width+4,height+4);
	    }
	    if(Janela.labelState == "YEEPIE") {
				
	    	x = 285;
	    	y = 300;
	    	
	    	g.setColor(Color.white);
	    	g.fillRect(x-2, y-2, width+4, height+4);
		    g.setColor(Color.cyan);
		    g.fillRect(x, y, width, height);
		    g.setColor(Color.white);
		    g.setFont(new Font("arial", Font.BOLD, 20));
		    g.drawString("o-okey..?", x + ((150/2) - 45), y + 35);
	    }
	    if(Janela.labelState == "YEEPIE" && Janela.yesPressed == "true") {
	    	g.setColor(new Color(0,0,0,20));
	    	g.fillRect(x-2,y-2,width+4,height+4);
	    }
  }
}
