package abre_logo;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Yesbottom {
	
	public static int yesButtomX = 144, yesButtomY = 250;
	
	public Yesbottom(int x, int y, int width,int height) {
		
	}
	
	public void tick() {
		
	}
	public static void render(Graphics g) {
	
    	g.setColor(Color.white);
    	g.fillRect(yesButtomX-2, yesButtomY-2, 154, 64);
	    g.setColor(Color.cyan);
	    g.fillRect(yesButtomX, yesButtomY, 150, 60);
	    g.setColor(Color.white);
	    g.setFont(new Font("arial", Font.BOLD, 20));
	    g.drawString("Yes <3", yesButtomX + ((150/2) - 30), yesButtomY + 35);
	    
	    if(Janela.yesPressed == "true") {
	    	g.setColor(new Color(0,0,0,20));
	    	g.fillRect(yesButtomX-2,yesButtomY-2,154,64);
	    }
  }
}
