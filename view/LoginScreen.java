package view;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class LoginScreen extends JFrame{

	private JPanel panel;
	private JLabel lEmail;
	private JLabel lPassword;
	private JTextField tEmail;
	private JPasswordField tPassword;
	private JButton bLogin;
	private JButton bBack;
	
	protected LoginScreen(JFrame frame){
		frame.setSize(500, 150);
		frame.setTitle("Login - EscambU");
		
		panel = new JPanel(new GridLayout(2, 0));
		lEmail = new JLabel("Email:");
		lPassword = new JLabel("Senha:");
		tEmail = new JTextField(60);
		tPassword = new JPasswordField(30);
		bLogin = new JButton("Logar");
		bBack = new JButton("Voltar");
		
		bLogin.setBounds(70, 70,70, 30);
		bBack.setBounds(150, 70, 70, 30);
		panel.add(lEmail);
		panel.add(tEmail);
		panel.add(lPassword);
		panel.add(tPassword);
		panel.setBounds(10, 10, 470, 60);
		
		frame.add(panel);
		frame.add(bLogin);
		frame.add(bBack);
	}

	public void addController(ActionListener controller) {
		bLogin.addActionListener(controller);
		bBack.addActionListener(controller);
	}
	
	public JButton getbLogin() {
		return bLogin;
	}

	public JButton getbBack() {
		return bBack;
	}
}
