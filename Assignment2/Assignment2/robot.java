import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class robot extends GraphicsProgram {
	
	private static final double HEAD_HEIGHT = 110;
	private static final double HEAD_WIDTH = 160;
	private static final double MOUTH_HEIGHT = 20;
	private static final double MOUTH_WIDTH = 60;
	private static final double EYE_RADIUS = 20;
	
	public void run() {
		face(getWidth() / 2, getHeight() / 2);
	}
	private void face(double fx, double fy) {
		head(fx, fy);
		eye(fx - HEAD_WIDTH / 4, fy - HEAD_HEIGHT / 4);
		eye(fx + HEAD_WIDTH / 4, fy - HEAD_HEIGHT / 4);
		mouth(fx, fy + HEAD_HEIGHT / 4);
	}
	private void head(double fx, double fy) {
		double x = fx - HEAD_WIDTH / 2;
		double y = fy - HEAD_HEIGHT / 2;
		GRect head = new GRect(x, y, HEAD_WIDTH, HEAD_HEIGHT);
		head.setFilled(true);
		head.setFillColor(Color.gray);
		add(head);
	}
	private void eye(double fx, double fy) {
		double x = fx - EYE_RADIUS;
		double y = fy - EYE_RADIUS;
		GOval eye = new GOval(x, y, EYE_RADIUS * 2, EYE_RADIUS * 2);
		eye.setFilled(true);
		eye.setFillColor(Color.yellow);
		add(eye);
	}
	private void mouth(double fx, double fy) {
		double x = fx - MOUTH_WIDTH / 2;
		double y = fy - MOUTH_HEIGHT / 2;
		GRect mouth = new GRect(x, y, MOUTH_WIDTH, MOUTH_HEIGHT);
		mouth.setFilled(true);
		mouth.setFillColor(Color.yellow);
		add(mouth);
	}
}
