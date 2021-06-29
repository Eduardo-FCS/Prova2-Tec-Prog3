package br.edu.univas.main;

public class PaymentMethodNotAllowedException extends Exception {
	
	public PaymentMethodNotAllowedException(String message) {
		super(message);
	}
}
