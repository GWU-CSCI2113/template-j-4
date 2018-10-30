package solved.shapes;

import util.StdDraw;

import java.awt.*;

public class Circle extends Shape {

	protected int radius;

	public Circle(int x, int y, int r, Color c) {
		super(x, y, c);
		radius = r;

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
