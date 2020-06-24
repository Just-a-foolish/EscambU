package view;

import javax.swing.JFrame;

import controller.InitialScreenController;

@SuppressWarnings("serial")
public class ScreenCoordinator extends JFrame{
	
	private JFrame frame = new JFrame();
	ScreenCoordinator(){
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		new ExchangeRegisterScreen(frame);
		/* initialScreen = new InitialScreen(frame);
		InitialScreenController initController = new InitialScreenController();
		initController.addView(initialScreen);
		initialScreen.addController(initController); */
	}
	
	@SuppressWarnings("unused")
	public void resetScreen() {
		frame.getContentPane().removeAll();
		frame.repaint();
		frame.setLocationRelativeTo(null);
	}
}
