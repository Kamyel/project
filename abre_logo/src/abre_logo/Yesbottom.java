package abre_logo;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Yesbottom {
	
	public static int yesButtomX = 150, yesButtomY = 250;
	
	public static void render(Graphics g) {
	
	    	g.setColor(Color.cyan);
	    	g.fillRect(yesButtomX, yesButtomY, 150, 60);
	    	g.setColor(Color.white);
	    	g.drawRect(yesButtomX, yesButtomY, 150, 60);
	    	g.drawRect(yesButtomX - 1, yesButtomY -1, 151, 61);
	    	g.setColor(new Color(135,206,250));
	    	g.drawRect(yesButtomX+1, yesButtomY+1, 147, 57);
	    	g.setColor(new Color(255,173,187));
	    	g.drawRect(yesButtomX-2, yesButtomY-2, 153, 63);
	    	g.setColor(Color.white);
	    	g.setFont(new Font("arial", Font.BOLD, 20));
	    	g.drawString("Sim rsrs",yesButtomX +30,yesButtomY+37);
  }
}
