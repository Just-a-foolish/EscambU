package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.InitialScreen;

public class InitialScreenController implements ActionListener {

	private InitialScreen view;
	// implementar model
	
	public void addView(InitialScreen view) {
		this.view = view;
	}
	
	public void addModel() {
		// implementar model
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == view.getbLogin()) {
			System.out.println("Indo para Login");
		} else if(e.getSource() == view.getbRegister()) {
			System.out.println("Indo para Cadastro");
		} else if(e.getSource() == view.getbWithoutLogin()) {
			System.out.println("Continuar sem cadastro");
		}
	}
	
}
