package solved.shapes;

import java.awt.*;

public abstract class Shape {
	
	protected int x, y;
	protected Color c;
	
	public Shape(int x, int y, Color c) {
		this.x = x;
		this.y = y;
		this.c = c;
	}
	
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public abstract void drawFilled();
	
	public abstract void drawOutline();
	
}
