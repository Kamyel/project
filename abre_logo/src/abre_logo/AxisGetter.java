package abre_logo;

import java.util.Random;

public class AxisGetter {
	
	protected double x;
	protected double y;
	protected int width;
	protected int height;
	protected static boolean isPressed = true;
	
	public static Random rand = new Random();
	
	public AxisGetter(int x, int y, int width, int height) {
		
		x = this.getX();
		y = this.getY();
		width = this.getWidth();
		height = this.getHeight();
		
	}
	public void setX(int newX) {
		this.x = newX;
	}
	
	public void setY(int newY) {
		this.y = newY;
	}
	public int getX() {
		return (int)this.x;
	}
	public int getY() {
		return (int)this.y;
	}
	public int getWidth() {
		return this.width;
	}
	public int getHeight() {
		return this.height;
	}
}
