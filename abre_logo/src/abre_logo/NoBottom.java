package abre_logo;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class NoBottom {
	public static int initialX = (720-144) - 154, initialY = 250;
	
	public NoBottom() {
		
	}
	public void tick() {
		
	}
	public static void render(Graphics g) {
	g.setColor(Color.white);
	g.fillRect( initialX-2, initialY-2, 154, 64);
	g.setColor(Color.red);
	g.fillRect(initialX, initialY, 150, 60);
	g.setColor(Color.white);
	g.setFont(new Font("arial", Font.BOLD, 20));
	g.drawString("No, weirdo >:(", initialX+10, initialY+37);
	
	if(Janela.noPressed == "true") {
		g.setColor(new Color(0,0,0,20));
		g.fillRect(initialX-2, initialY-2, 154, 64);
		}
	}
}
