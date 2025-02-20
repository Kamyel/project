package com.kamykat;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.util.Random;

import javax.swing.JFrame;

public class Janela extends Canvas implements Runnable, KeyListener, MouseListener, MouseMotionListener{
	
	public static JFrame frame;
	public static int WIDTH = 720, HEIGHT = 480;
	public Janela janela;
	private static Thread thread;
	public boolean isRunning = true;
	public static String yesPressed = "false";
	public static String noPressed = "false";
	public static String fxPlay = "false";
	public static String labelState = "NORMAL";
	public Yesbottom yesbottom;
	public NoBottom nobottom;
	public static Yeepie yeepie;
	public static Oxe oxe;
	public static Random randX = new Random();
	public static Random randY = new Random();
	
	public int mX, mY;
	
	private BufferedImage image;
	
	private static final long serialVersionUID = 1L;
	
	public Janela() {
		addKeyListener(this);
		addMouseListener(this);
		addMouseMotionListener(this);
		setPreferredSize(new Dimension(WIDTH,HEIGHT));
		initFrame();
		image = new BufferedImage(WIDTH,HEIGHT,BufferedImage.TYPE_INT_RGB);
		
		yeepie = new Yeepie("/yepie.png");
		oxe = new Oxe("/slknumcompensa.jpg");
	}
	public void initFrame() {
		frame = new JFrame("let's have a datting simulator irl");
		frame.add(this);
		frame.setResizable(false);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	public synchronized void start() {
		thread = new Thread(this);
		isRunning = true;
		thread.start();
	}
	public synchronized void stop() {
		isRunning = false;
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Janela janela = new Janela();
		janela.start();
		Sound.music.loop();
	}
	
	public void tick() {

	}
	
	public void render() {
		BufferStrategy bs = this.getBufferStrategy();
		if(bs == null){
			this.createBufferStrategy(3);
			return;
		}
		Graphics g = image.getGraphics();
		g.setColor(new Color(255,182,193));
		g.fillRect(0,0,WIDTH, HEIGHT);
		
		g.dispose();
		g = bs.getDrawGraphics();
		g.drawImage(image, 0, 0,WIDTH,HEIGHT,null);
		
		g.setColor(Color.white);
		g.setFont(new Font("Arial", Font.BOLD, 30));
		g.drawString("Wanna go on a date with me?", (WIDTH/5) +3, HEIGHT/4);
		
		Yesbottom.render(g);
		NoBottom.render(g);
		
		bs.show();
		
		if(noPressed == "true") {
			g.drawImage(NoBottom.OXE_COMUE, 500, 300, 200, 240, null);
			bs.show();
		}
		
		if(labelState == "YEEPIE") {
			Graphics2D g2 = (Graphics2D) g;
			g2.setColor(new Color(255,182,193));
			g2.fillRect(0,0,720,480);
			g2.drawImage(Yesbottom.YEEPIE_SCENE, 0, 0, 720, 480, null);
			Yesbottom.render(g2);
			bs.show();
		}
	}
	
	public void run() {
		
		long lastTime = System.nanoTime();
		double amountOfTicks = 60.0;
		double ns = 1000000000 / amountOfTicks;
		double delta = 0;
		int frames = 0;
		double timer = System.currentTimeMillis();
		requestFocus();
		while(isRunning){
			long now = System.nanoTime();
			delta+= (now - lastTime) / ns;
			lastTime = now;
			if(delta >= 1) {
				tick();
				render();
				frames++;
				delta--;
			}
			
			if(System.currentTimeMillis() - timer >= 1000){
				System.out.println("FPS: "+ frames);
				frames = 0;
				timer+=1000;
			}
			
		}
		
		stop();
	}
	
	public void mouseDragged(MouseEvent e) {
		
	}
	public void mouseMoved(MouseEvent e) {
		
	}
	public void mouseClicked(MouseEvent e) {
	}
	public void mousePressed(MouseEvent e) {
		if(e.getButton() == MouseEvent.BUTTON1) {
			
			mY = e.getY();
			mX = e.getX();
			
			if(mX >= NoBottom.x && mX < (NoBottom.x + NoBottom.width)) {
			   if(mY >= NoBottom.y && mY < (NoBottom.y + NoBottom.height)) {
				noPressed = "true";
			   }
			}else if(mX >= Yesbottom.x && mX < (Yesbottom.x + Yesbottom.width)) {
				   if(mY >= Yesbottom.y && mY < (Yesbottom.y + Yesbottom.height)) {
						yesPressed = "true";
						labelState = "YEEPIE";
						Sound.fx1.play();
				}
			}
			
			if(Janela.noPressed == "true") {
				NoBottom.x2 = randX.nextInt(1,720);
				NoBottom.y2 = randY.nextInt(1,480);
				
				//Position Changer
				if(NoBottom.x <= NoBottom.x2) {
					NoBottom.x = NoBottom.x2;
				}else if(NoBottom.x > NoBottom.x2) {
					NoBottom.x = NoBottom.x2;
				}
				if(NoBottom.y <= NoBottom.y2) {
					NoBottom.y = NoBottom.y2;
				}else if(NoBottom.y > NoBottom.y2) {
					NoBottom.y = NoBottom.y2;
				}
			}
		}
	}
	public void mouseReleased(MouseEvent e) {
		if(e.getButton() == MouseEvent.BUTTON1) {
			noPressed = "false";
			yesPressed = "false";
			
		}
	}
	public void mouseEntered(MouseEvent e) {
		
	}
	public void mouseExited(MouseEvent e) {
		
	}

	public void keyTyped(KeyEvent e) {
		
	}

	public void keyPressed(KeyEvent e) {
		
	}

	public void keyReleased(KeyEvent e) {
		
	}
	
}
