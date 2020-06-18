package gui;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Screen extends JFrame implements ActionListener {

	private JFrame frame = new JFrame("EscambU");
	private JButton bLogin;
	private JButton bCreateAccount;
	private JButton bWithoutLogin;

	public Screen() {
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		initialScreen();
	}

	private void initialScreen() {
		frame.setSize(400, 500);
		resetScreen();

		JLabel systemLabel = new JLabel("EscambU");
		this.bLogin = new JButton("Fazer Login");
		this.bCreateAccount = new JButton("Cadastrar");
		this.bWithoutLogin = new JButton("Continuar");

		systemLabel.setBounds(80, 20, 500, 110);
		systemLabel.setFont(new Font("TimesRoman", Font.PLAIN, 50));
		bLogin.setBounds(130, 130, 100, 40);
		bCreateAccount.setBounds(130, 180, 100, 40);
		bWithoutLogin.setBounds(130, 230, 100, 40);
		
		bLogin.addActionListener(this);
		bCreateAccount.addActionListener(this);
		bWithoutLogin.addActionListener(this);

		frame.add(systemLabel);
		frame.add(bCreateAccount);
		frame.add(bWithoutLogin);
		frame.add(bLogin);
	}

	public void loginScreen() {
		frame.setSize(500, 120);
		frame.setTitle("EscambU - Login");
		resetScreen();

		JPanel panel = new JPanel(new GridLayout(2, 0));

		JLabel lEmail = new JLabel("Email:");
		JLabel lPassword = new JLabel("Senha:");

		JTextField tEmail = new JTextField(60);
		JTextField tPassword = new JTextField(30);

		panel.add(lEmail);
		panel.add(tEmail);
		panel.add(lPassword);
		panel.add(tPassword);
		panel.setBounds(10, 10, 470, 60);
		
		frame.add(panel);
	}

	public void createAccountScreen() {
		frame.setSize(600, 220);
		frame.setTitle("EscambU - Cadastro");
		resetScreen();

		JPanel panel = new JPanel(new GridLayout(5, 0));

		JLabel lName = new JLabel("Nome:");
		JLabel lEmail = new JLabel("Email:");
		JLabel lPassword = new JLabel("Senha:");
		JLabel lAge = new JLabel("Idade:");
		JLabel lAddress = new JLabel("Endereço:");

		JTextField tName= new JTextField(60);
		JTextField tEmail = new JTextField(30);
		JTextField tAddress = new JTextField();
		JTextField tAge = new JTextField();
		JTextField tPassword = new JTextField();
		
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

	private void resetScreen() {
		frame.getContentPane().removeAll();
		frame.repaint();
		frame.setLocationRelativeTo(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == bLogin) {
			loginScreen();
		} else if(e.getSource() == bCreateAccount) {
			createAccountScreen();
		} else if(e.getSource() == bWithoutLogin) {
			
		}
	}

}
