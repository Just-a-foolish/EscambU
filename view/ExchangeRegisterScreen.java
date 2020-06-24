package view;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class ExchangeRegisterScreen extends JFrame{

	private JPanel panel;
	
	private JLabel lName;
	private JLabel lDescription;
	private JTextField tName;
	private JTextArea tDescription;
	
	private JButton bRegister;
	private JButton bBack;
	
	protected ExchangeRegisterScreen(JFrame frame){
		frame.setSize(500, 330);
		frame.setTitle("Cadastrar EscambU");
		
		panel = new JPanel(new GridLayout(2, 0));
		lName = new JLabel("Nome:");
		lDescription = new JLabel("Descrição:");
		tName = new JTextField(60);
		tDescription = new JTextArea(200,25);
		bRegister = new JButton("Cadastrar");
		bBack = new JButton("Voltar");
		
		bRegister.setBounds(60, 240,100, 30);
		bBack.setBounds(170, 240, 110, 30);
		tDescription.setBounds(10,70,448,150);
		panel.add(lName);
		panel.add(tName);
		panel.add(lDescription);
		panel.setBounds(10, 10, 450, 60);
		frame.add(panel);
		frame.add(tDescription);
		frame.add(bRegister);
		frame.add(bBack);
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
