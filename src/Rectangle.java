import java.awt.Color;

public class Rectangle extends SmartRectangularShape {
	public Rectangle() {
		super(new java.awt.geom.Rectangle2D.Double());
	}
	
	public Rectangle(int x, int y) {
		super(new java.awt.geom.Rectangle2D.Double(), x, y);
	}
	
	public Rectangle(Color color) {
		super(new java.awt.geom.Rectangle2D.Double(), color);
	}
}
