package view;

import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class InitialScreen extends JFrame {

	private JLabel lSystemName;
	public JButton bLogin;
	private JButton bRegister;
	private JButton bWithoutLogin;

	protected InitialScreen(JFrame frame) {
		frame.setSize(400, 500);
		lSystemName = new JLabel("EscambU");

		bLogin = new JButton("Fazer Login");
		bRegister = new JButton("Cadastrar");
		bWithoutLogin = new JButton("Continuar");
		lSystemName.setBounds(80, 20, 500, 110);
		lSystemName.setFont(new Font("TimesRoman", Font.PLAIN, 50));
		bLogin.setBounds(130, 130, 100, 40);
		bRegister.setBounds(130, 180, 100, 40);
		bWithoutLogin.setBounds(130, 230, 100, 40);

		frame.add(lSystemName);
		frame.add(bRegister);
		frame.add(bWithoutLogin);
		frame.add(bLogin);
	}

	public void addController(ActionListener controller) {
		bLogin.addActionListener(controller);
		bRegister.addActionListener(controller);
		bWithoutLogin.addActionListener(controller);
	}

	public JButton getbLogin() {
		return bLogin;
	}

	public JButton getbRegister() {
		return bRegister;
	}

	public JButton getbWithoutLogin() {
		return bWithoutLogin;
	}	
}
