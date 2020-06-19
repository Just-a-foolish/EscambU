package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
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
	private JLabel lSystemName;

	public Screen() {
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setLayout(null);
		
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		mainScreen();
	}

	private void initialScreen() {
		frame.setSize(400, 500);
		resetScreen();
		
		this.lSystemName = new JLabel("EscambU");
		this.bLogin = new JButton("Fazer Login");
		this.bCreateAccount = new JButton("Cadastrar");
		this.bWithoutLogin = new JButton("Continuar");

		lSystemName.setBounds(80, 20, 500, 110);
		lSystemName.setFont(new Font("TimesRoman", Font.PLAIN, 50));
		bLogin.setBounds(130, 130, 100, 40);
		bCreateAccount.setBounds(130, 180, 100, 40);
		bWithoutLogin.setBounds(130, 230, 100, 40);

		bLogin.addActionListener(this);
		bCreateAccount.addActionListener(this);
		bWithoutLogin.addActionListener(this);

		frame.add(lSystemName);
		frame.add(bCreateAccount);
		frame.add(bWithoutLogin);
		frame.add(bLogin);
	}

	public void loginScreen() {
		frame.setSize(500, 160);
		frame.setTitle("EscambU - Login");
		resetScreen();

		JPanel panel = new JPanel(new GridLayout(2, 0));
		JPanel buttons = new JPanel();

		JLabel lEmail = new JLabel("Email:");
		JLabel lPassword = new JLabel("Senha:");

		JTextField tEmail = new JTextField(60);
		JTextField tPassword = new JTextField(30);
		JButton bLogin = new JButton("Logar");
		JButton bBackLogin = new JButton("Voltar");

		panel.add(lEmail);
		panel.add(tEmail);
		panel.add(lPassword);
		panel.add(tPassword);
		panel.setBounds(10, 10, 470, 60);
		buttons.add(bLogin);
		buttons.add(bBackLogin);
		buttons.setBounds(50, 70, 200, 50);
		buttons.setLayout(new FlowLayout());
		frame.add(panel);
		frame.add(buttons);
	}

	public void createAccountScreen() {
		frame.setSize(600, 250);
		frame.setTitle("EscambU - Cadastro");
		resetScreen();

		JPanel panel = new JPanel(new GridLayout(5, 0));
		JPanel buttons = new JPanel(new FlowLayout());
		
		JLabel lName = new JLabel("Nome:");
		JLabel lEmail = new JLabel("Email:");
		JLabel lPassword = new JLabel("Senha:");
		JLabel lAge = new JLabel("Idade:");
		JLabel lAddress = new JLabel("Endereço:");

		JTextField tName = new JTextField(60);
		JTextField tEmail = new JTextField(30);
		JTextField tAddress = new JTextField();
		JTextField tAge = new JTextField();
		JTextField tPassword = new JTextField();
		
		JButton bCreateAccount = new JButton("Cadastrar");
		JButton bBackAccountCreation = new JButton("Voltar");
		
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
		
		buttons.add(bCreateAccount);
		buttons.add(bBackAccountCreation);
		buttons.setBounds(50, 170, 200, 50);
		buttons.setLayout(new FlowLayout());
		
		frame.add(panel);
		frame.add(buttons);
	}
	
	public void mainScreen() {
		frame.setSize(1280, 720);
		resetScreen();
		 
		JPanel panel = new JPanel(new BorderLayout());
		JButton bAddEscambu = new JButton("Adicionar EscambU");
		JButton bListEscambu = new JButton("Lista de EscambU");
		frame.add(bAddEscambu);
		frame.add(bListEscambu);
		frame.setLayout(new FlowLayout());
		
		frame.add(panel);
	}

	private void resetScreen() {
		frame.getContentPane().removeAll();
		frame.repaint();
		frame.setLocationRelativeTo(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == bLogin) {
			loginScreen();
		} else if (e.getSource() == bCreateAccount) {
			createAccountScreen();
		} else if (e.getSource() == bWithoutLogin) {
			
		}
	}

}
