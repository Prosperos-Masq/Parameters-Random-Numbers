import acm.graphics.*;
import acm.program.*;
import acm.util.*;

public class randomCircles extends GraphicsProgram {
	
	private static final int NumCircles = 10;
	private static final double MinRadius = 5;
	private static final double MaxRadius = 50;
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
	public void run() {
		for (int i = 0; i < NumCircles; i++) {
			double a = rgen.nextDouble(MinRadius, MaxRadius);
			double b = rgen.nextDouble(0, getWidth() - 3 * a);
			double c = rgen.nextDouble(0, getHeight() - 3 * a);
			GOval circle = new GOval(a, b, a * 3, a * 3);
			circle.setFilled(true);
			circle.setColor(rgen.nextColor());
			add(circle);
		}
	}
}
