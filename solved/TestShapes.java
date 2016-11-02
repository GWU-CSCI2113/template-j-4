package shapes;

import java.awt.Color;
import java.util.ArrayList;

import util.StdDraw;

public class TestShapes {

	
	public static void main(String args[]) {
		
		StdDraw.setScale(0, 20);
		
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		shapes.add(new Circle(10, 10, 5, Color.RED));
		shapes.add(new Square(5, 1, 3, Color.BLUE));
		shapes.add(new Rectangle(2, 6, 3, 4, Color.GREEN));
		
		for(Shape s: shapes) {
			if(s instanceof Rectangle) {
				s.drawFilled();
			}
			else
				s.drawOutline();
			
		}
		
	}
	
}
