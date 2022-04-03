import java.awt.BorderLayout;
import java.awt.Rectangle;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MachineApp extends JFrame {
	public MachineApp() {
		super("Laundry App!");
		this.setSize(500, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel mainPanel = new JPanel(new BorderLayout());
		
		mainPanel.add(new DrawingPanel(), BorderLayout.CENTER);
		this.add(mainPanel);
		this.setVisible(true);
		
		
	}

	public static void main(String[] args) {
		new MachineApp();
	}
	
}
