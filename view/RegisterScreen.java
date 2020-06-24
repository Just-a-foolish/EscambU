package view;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
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
	private JPasswordField tPassword;
	
	private JButton bRegister;
	private JButton bBack;

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
		tPassword = new JPasswordField();
		
		bRegister = new JButton("Cadastrar");
		bBack = new JButton("Voltar");
		bRegister.setBounds(70, 170,120, 30);
		bBack.setBounds(200, 170,120, 30);
		
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
		
		frame.add(bRegister);
		frame.add(bBack);
		frame.add(panel);
	}
	
	public void addController(ActionListener controller) {
		bRegister.addActionListener(controller);
		bBack.addActionListener(controller);
	}

	public JButton getbRegister() {
		return bRegister;
	}

	public JButton getbBack() {
		return bBack;
	}	
}
