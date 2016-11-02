package shapes;

import java.awt.Color;

import util.StdDraw;

public class Rectangle extends Shape {

	protected int width;
	protected int height;
	public Rectangle(int x, int y, int w, int h, Color c) {
		super(x, y, c);
		width = w;
		height = h;
	}

	public void drawFilled() {
		StdDraw.setPenColor(c);
		StdDraw.filledRectangle(x, y, width/2, height/2);
	}

	public void drawOutline() {
		StdDraw.setPenColor(c);
		StdDraw.rectangle(x, y, width/2, height/2);
	}

}
