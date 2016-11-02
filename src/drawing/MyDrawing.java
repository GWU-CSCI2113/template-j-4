package drawing;

import util.StdDraw;

import java.awt.*;

/**
 * Created by timwood on 11/1/16.
 */
public class MyDrawing {

	public static void main(String args[]) {
		// Make a window for drawing with range 0...100 in X and Y axes
		// 0,0 is bottom left of window
		StdDraw.setScale(0, 100);

		// Draw a picture
		StdDraw.setPenColor(Color.YELLOW);
		StdDraw.filledCircle(50, 50, 20);

		StdDraw.setPenColor(Color.BLACK);
		StdDraw.filledCircle(42, 55, 4);
		StdDraw.filledCircle(58, 55, 4);

		StdDraw.filledEllipse(50, 45, 10, 4);

	}
}
