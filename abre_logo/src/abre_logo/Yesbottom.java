package abre_logo;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Yesbottom {
	
	protected double x;
	protected double y;
	protected int width = 150;
	protected int height = 60;
	public static boolean isPressed = true;
	
	public Yesbottom(int x, int y, int width, int height) {
		x = this.getX();
		y = this.getY();
		width = this.getWidth();
		height = this.getHeight();
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
	
	
	public void Yayy() {
		if(isPressed = true) {
			
		}
	}
	
	public void tick() {
		
	}
	
	public static void render(Graphics g) {
	
		if(isPressed = false) {
	    	g.setColor(Color.cyan);
	    	g.fillRect(150, 250, 150, 60);
	    	g.setColor(Color.white);
	    	g.drawRect(150, 250, 150, 60);
	    	g.drawRect(149, 249, 151, 61);
	    	g.setColor(new Color(135,206,250));
	    	g.drawRect(151, 251, 147, 57);
	    	g.setColor(new Color(255,173,187));
	    	g.drawRect(148, 248, 153, 63);

			
		    }else if(isPressed = true) {
		    	
				g.setColor(new Color(100,149,237));
				g.fillRect(150, 250, 150, 60);
				g.setColor(new Color(200, 200, 200));
				g.drawRect(150, 250, 150, 60);
				g.drawRect(149, 249, 151, 61);
				g.setColor(new Color(255,173,187));
				g.drawRect(148, 248, 153, 63);
				g.setColor(Color.black);
		    	g.setFont(font("arial"));
		    	g.drawString("Yes", 210, 285);
		}
  }
	private static Font font(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}
