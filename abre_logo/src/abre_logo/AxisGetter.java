package abre_logo;

public class AxisGetter {
	
	protected double x;
	protected double y;
	protected int width = 150;
	protected int height = 60;
	protected static boolean isPressed = true;
	
	public AxisGetter(int x, int y, int width, int height) {
		
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

	}
	
	public void tick() {
		
	}
}
