package abre_logo;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class NoBottom {
	
	public static void render(Graphics g) {
	g.setColor(Color.red);
	g.fillRect(NoMechanics.initialX + 1, NoMechanics.initialY, 150, 60);
	g.setColor(Color.white);
	g.drawRect(NoMechanics.initialX + 1, NoMechanics.initialY, 150, 60);
	g.drawRect(NoMechanics.initialX + 1, NoMechanics.initialY - 1, 151, 61);
	g.setColor(new Color(255,173,187));
	g.drawRect(NoMechanics.initialX, NoMechanics.initialY-2, 153, 63);
	g.setColor(Color.white);
	g.setFont(new Font("arial", Font.BOLD, 20));
	g.drawString("Não >:(", NoMechanics.initialX+41, NoMechanics.initialY+37);
	}
}
