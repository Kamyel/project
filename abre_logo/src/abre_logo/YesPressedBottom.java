package abre_logo;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class YesPressedBottom {
	
	public static void render(Graphics g) {
	g.setColor(new Color(100,149,237));
	g.fillRect(Yesbottom.yesButtomX, Yesbottom.yesButtomY, 150, 60);
	g.setColor(new Color(200, 200, 200));
	g.drawRect(Yesbottom.yesButtomX, Yesbottom.yesButtomY, 150, 60);
	g.drawRect(Yesbottom.yesButtomX-1, Yesbottom.yesButtomY-1, 151, 61);
	g.setColor(new Color(255,173,187));
	g.drawRect(Yesbottom.yesButtomX-2, Yesbottom.yesButtomY-2, 153, 63);
	g.setColor(new Color(200, 200, 200));
	g.setFont(new Font("arial", Font.BOLD, 20));
	g.drawString("Sim rsrs",Yesbottom.yesButtomX+30, Yesbottom.yesButtomY+37);
	}
}
