import acm.graphics.*;
import acm.program.*;
import java.awt.event.*;

/* a) True
 * b) True
 * 
 * snitch: x = 4004, y = 1001
 * quaffle: x = 2003, y = 1, z = 1001
 * bludger: x = 1001, y = 2001, z = 2003
 */

public class randomLines extends GraphicsProgram {
	public void run() {
		addMouseListeners();
	}
	public void mouseClicked(MouseEvent a) {
		double x = a.getX();
		double y = a.getY();
		line = new GLine(x, y, x, y);
		add(line);
	}
	public void mouseMoved(MouseEvent a) {
		double x = a.getX();
		double y = a.getY();
		line.setEndPoint(x, y);
	}
	private GLine line;
}
