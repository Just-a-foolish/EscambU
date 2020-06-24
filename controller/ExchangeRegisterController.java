package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.ExchangeRegisterScreen;

public class ExchangeRegisterController implements ActionListener {

	private ExchangeRegisterScreen view;
	// implementar model
	
	public void addView(ExchangeRegisterScreen view) {
		this.view = view;
	}
	
	public void addModel() {
		// implementar model
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == view.getbRegister()) {
			System.out.println("Cadastrando escambo");
		} else if(e.getSource() == view.getbBack()) {
			System.out.println("Voltando");
		}
	}
}
