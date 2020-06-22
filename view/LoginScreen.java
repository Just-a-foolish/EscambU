package view;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


// TODO implementar botões para realizar login e para voltar
@SuppressWarnings("serial")
public class LoginScreen extends JFrame{

	private JPanel panel;
	private JLabel lEmail;
	private JLabel lPassword;
	private JTextField tEmail;
	private JPasswordField tPassword;
	
	protected LoginScreen(JFrame frame){
		frame.setSize(500, 120);
		frame.setTitle("Login - EscambU");
		
		panel = new JPanel(new GridLayout(2, 0));
		lEmail = new JLabel("Email:");
		lPassword = new JLabel("Senha:");
		tEmail = new JTextField(60);
		tPassword = new JPasswordField(30);

		panel.add(lEmail);
		panel.add(tEmail);
		panel.add(lPassword);
		panel.add(tPassword);
		panel.setBounds(10, 10, 470, 60);
		
		frame.add(panel);
	}
	// TODO implementar controladores dos botões
	/*
	public void addController(ActionListener controller) {
		bLogin.addActionListener(controller);
		bRegister.addActionListener(controller);
		bWithoutLogin.addActionListener(controller);
	} */
}
