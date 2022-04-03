import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class DrawingPanel extends JPanel {
	private Rectangle washingMachine1, washingMachine2, dryingMachine1, dryingMachine2;
	
	public DrawingPanel() {
		super();
		
		this.setSize(500,400);
		this.setBackground(Color.WHITE);
		
		washingMachine1 = new Machine();
		washingMachine1.setLocation(10, 100);
		washingMachine1.setColor(Color.BLUE);
		washingMachine1.setSize(60, 60);
		
		washingMachine2 = new Machine();
		washingMachine2.setLocation(100, 100);
		washingMachine2.setColor(Color.BLUE);
		washingMachine2.setSize(60, 60);
		
		dryingMachine1 = new Machine();
		dryingMachine1.setLocation(10, 200);
		dryingMachine1.setColor(Color.GREEN);
		dryingMachine1.setSize(60, 60);
		
		dryingMachine2 = new Machine();
		dryingMachine2.setLocation(100, 200);
		dryingMachine2.setColor(Color.GREEN);
		dryingMachine2.setSize(60, 60);
	}
	
	 @Override
	    protected void paintComponent(Graphics g) {
	        super.paintComponent(g);
	        Graphics2D brush = (Graphics2D) g;
	        washingMachine1.paint(brush);
	        washingMachine2.paint(brush);
	        dryingMachine1.paint(brush);
	        dryingMachine2.paint(brush);
	    }
}
