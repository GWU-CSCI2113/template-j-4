package dumbshapes;

import java.awt.Color;

import util.StdDraw;

public class Circle {

	protected int radius;
	protected int x, y;
	protected Color c;
	
	public Circle(int x, int y, int r, Color c) {
		this.x = x;
		this.y = y;
		this.c = c;
		radius = r;
	
	}
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void drawFilled() {
		StdDraw.setPenColor(c);
		StdDraw.filledCircle(x, y, radius);
	}

	public void drawOutline() {
		StdDraw.setPenColor(c);
		StdDraw.circle(x, y, radius);
	}

}
