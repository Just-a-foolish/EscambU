package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.RegisterScreen;

public class RegisterScreenController implements ActionListener {

	private RegisterScreen view;
	
	public void addView(RegisterScreen view) {
		this.view = view;
	}
	
	public void addModel() {
		// implementar model
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == view.getbRegister()) {
			System.out.println("Cadastrando");
		} else if(e.getSource() == view.getbBack()) {
			System.out.println("Voltando");
		}
	}
}
