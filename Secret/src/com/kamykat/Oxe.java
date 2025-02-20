package com.kamykat;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Oxe {
	public static BufferedImage slknumcompensa;
	
	public Oxe(String path){
		try {
			slknumcompensa = ImageIO.read(getClass().getResource(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static BufferedImage getSprite(int x,int y,int width,int height){
			return slknumcompensa.getSubimage(x, y, width, height);
	}
}
