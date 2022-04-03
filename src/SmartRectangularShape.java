import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.RectangularShape;

public class SmartRectangularShape {
    private RectangularShape _shape;
    private Color _fillColor, _borderColor;
    private double _rotation;
    private int _borderThickness;

    public SmartRectangularShape(RectangularShape shape) {
    	_shape = shape;
        _fillColor = Color.red;
        _borderColor = Color.red;
        _borderThickness = 0;
        setLocation(250, 225);
        setSize(100, 100);
    }
    
    public SmartRectangularShape(RectangularShape shape, int x, int y) {
    	_shape = shape;
        _fillColor = Color.red;
        _borderColor = Color.red;
        _borderThickness = 0;
    	setLocation(x,  y);
        setSize(100, 100);
    }
    
    public SmartRectangularShape(RectangularShape shape, Color color) {
    	_shape = shape;
        _fillColor = color;
        _borderColor = color;
        _borderThickness = 0;
        setLocation(250, 225);
        setSize(100, 100);
    }
    
    public int getXLocation() {
    	return (int)_shape.getX();
    }
    
    public int getYLocation() {
    	return (int)_shape.getY();
    }

    public void setLocation(int x, int y) {
    	_shape.setFrame(x, y, _shape.getWidth(), _shape.getHeight());
    }
    
    public int getWidth() {
    	return (int)_shape.getWidth();
    }
    
    public int getHeight() {
    	return (int)_shape.getHeight();
    }
    
    public void setWidth(int w) {
    	_shape.setFrame(_shape.getX(), _shape.getY(), w, _shape.getHeight());
    }
    
    public void setHeight(int h) {
    	_shape.setFrame(_shape.getX(), _shape.getY(), _shape.getWidth(), h);
    }

    public void setSize(int w, int h) {
    	_shape.setFrame(_shape.getX(), _shape.getY(), w, h);
    }

    public void setColor(Color c) {
        _fillColor = c;
        _borderColor = c;
    }
    
    public Color getFillColor() {
        return _fillColor;
    }

    public void setFillColor(Color c) {
        _fillColor = c;
    }

    public Color getBorderColor() {
        return _borderColor;
    }
    
    public void setBorderColor(Color c) {
        _borderColor = c;
    }
    
    public double getRotation() {
        return _rotation * 180 / Math.PI;
    }

    public void setRotation(double degrees) {
        _rotation = degrees * Math.PI / 180;
    }
    
    public int getBorderThickness() {
    	return _borderThickness;
    }
    
    public void setBorderThickness(int thickness) {
    	_borderThickness = thickness;
    }

    public void paint(Graphics2D brush) {
        brush.rotate(_rotation, _shape.getCenterX(), _shape.getCenterY());

        brush.setColor(_fillColor);
        brush.fill(_shape);
        
		java.awt.Stroke oldStroke = brush.getStroke();
        brush.setColor(_borderColor);
        brush.setStroke(new BasicStroke(_borderThickness));
        brush.draw(_shape);
		brush.setStroke(oldStroke);
		
        brush.rotate(-_rotation, _shape.getCenterX(), _shape.getCenterY());
    }
}