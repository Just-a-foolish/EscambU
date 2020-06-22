package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class ScreenCoordinator extends JFrame implements ActionListener{
	
	JFrame frame = new JFrame();
	InitialScreen initialScreen;
	
	ScreenCoordinator(){
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		new InitialScreen(frame);
	}
	
	@SuppressWarnings("unused")
	private void resetScreen() {
		frame.getContentPane().removeAll();
		frame.repaint();
		frame.setLocationRelativeTo(null);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
	}

}
