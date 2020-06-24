package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.LoginScreen;

public class LoginScreenController implements ActionListener {

	private LoginScreen view;

	public void addView(LoginScreen view) {
		this.view = view;
	}

	public void addModel() {
		// Implementar model
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == view.getbLogin()) {
			System.out.println("Logando");
		} else if (e.getSource() == view.getbBack()) {
			System.out.println("Voltando");
		}
	}
}
