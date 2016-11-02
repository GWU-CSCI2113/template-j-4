package dumbshapes;

import java.awt.Color;
import java.util.ArrayList;

import util.StdDraw;

public class TestShapes {


	public static void main(String args[]) {

		// Make the canvas stretch from 0 to 20 in each direction
		StdDraw.setScale(0, 20);

		// Create an AraryList with a Circle, Square, and Rectangle. Each with a different color.
		ArrayList list = new ArrayList();

		list.add(new Circle(10, 10, 5, Color.blue));
		list.add(new Rectangle(10, 5, 3, 6, Color.RED));
		list.add(new Square(4, 6, 5, Color.GREEN));

		// Draw the filled version of each shape

		((Circle) list.get(0)).drawFilled();
		((Rectangle) list.get(1)).drawFilled();
		((Square) list.get(2)).drawFilled();

		for(Object s: list) {
			// s.drawFilled();
		}



	}

}
