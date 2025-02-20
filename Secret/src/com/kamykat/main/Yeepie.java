package com.kamykat.main;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Yeepie {
	public static BufferedImage yeepie;
	
	public Yeepie(String path){
		try {
			yeepie = ImageIO.read(getClass().getResource(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static BufferedImage getSprite(int x,int y,int width,int height){
			return yeepie.getSubimage(x, y, width, height);
	}
}
