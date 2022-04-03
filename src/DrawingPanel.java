import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class DrawingPanel extends JPanel {
	private Rectangle washingMachine1, washingMachine2;
	
	public DrawingPanel() {
		super();
		
		this.setSize(500,400);
		this.setBackground(Color.WHITE);
		
		washingMachine1 = new Rectangle();
		washingMachine1.setLocation(10, 100);
		washingMachine1.setColor(Color.BLUE);
		washingMachine1.setSize(60, 60);
		
		washingMachine2 = new Rectangle();
		washingMachine2.setLocation(100, 100);
		washingMachine2.setColor(Color.BLUE);
		washingMachine2.setSize(60, 60);
	}
	
	 @Override
	    protected void paintComponent(Graphics g) {
	        super.paintComponent(g);
	        Graphics2D brush = (Graphics2D) g;
	        washingMachine1.paint(brush);
	        washingMachine2.paint(brush);
	    }
}
