package view;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

//TODO implementar botões para realizar registrar e para voltar
@SuppressWarnings("serial")
public class RegisterScreen extends JFrame {

	private JPanel panel;

	private JLabel lName;
	private JLabel lEmail;
	private JLabel lPassword;
	private JLabel lAge;
	private JLabel lAddress;

	private JTextField tName;
	private JTextField tEmail;
	private JTextField tAddress;
	private JTextField tAge;
	private JTextField tPassword;

	RegisterScreen(JFrame frame) {
		frame.setSize(600, 220);
		frame.setTitle("EscambU - Cadastro");

		panel = new JPanel(new GridLayout(5, 0));

		lName = new JLabel("Nome:");
		lEmail = new JLabel("Email:");
		lPassword = new JLabel("Senha:");
		lAge = new JLabel("Idade:");
		lAddress = new JLabel("Endereço:");

		tName = new JTextField(60);
		tEmail = new JTextField(30);
		tAddress = new JTextField();
		tAge = new JTextField();
		tPassword = new JTextField();

		panel.add(lName);
		panel.add(tName);
		panel.add(lEmail);
		panel.add(tEmail);
		panel.add(lPassword);
		panel.add(tPassword);
		panel.add(lAge);
		panel.add(tAge);
		panel.add(lAddress);
		panel.add(tAddress);
		panel.setBounds(10, 10, 500, 150);

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
