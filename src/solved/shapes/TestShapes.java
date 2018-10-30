package solved.shapes;

import util.StdDraw;

import java.awt.*;
import java.util.ArrayList;

public class TestShapes {


	public static void main(String args[]) {

		// Make the canvas stretch from 0 to 100 in each direction
		StdDraw.setScale(0, 100);

		// Create an AraryList to hold shapes
		ArrayList<Shape> shapes = new ArrayList<Shape>();

		// Add a Circle, Square, and Rectangle, each with a different color.
		shapes.add(new Circle(50, 50, 15, Color.RED));
		shapes.add(new Rectangle(25, 25, 50, 10, Color.green));
		shapes.add(new Square(50, 35, 10, Color.orange));

		// Draw the filled version of each shape using a for loop
		for(Shape s: shapes) {
			if (s instanceof Rectangle) {
				s.drawOutline();
			} else {
				s.drawFilled();
				if (s instanceof Circle) {
					System.out.println("This is a circle!");
				}
			}
		}
	}

}
