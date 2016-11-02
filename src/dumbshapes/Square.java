package dumbshapes;

import java.awt.Color;

import util.StdDraw;

public class Square {

	protected int width;
	protected int height;
	protected int x, y;
	protected Color c;
	
	public Square(int x, int y, int w, Color c) {
		this.x = x;
		this.y = y;
		this.c = c;
		width = w;
		height = w;
	}
	
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
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
