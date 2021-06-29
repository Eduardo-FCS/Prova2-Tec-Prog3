package br.edu.univas.main;

import java.util.Scanner;

public class CustomerController {
	
	BankSlip boleto = new BankSlip();
	CreditCard credito = new CreditCard();
	AccountDebit debito = new AccountDebit();
	Pix pix = new Pix();
	Scanner scanner = new Scanner(System.in);
	Viewer view = new Viewer();

	public Customer createCustomer() throws PaymentMethodNotAllowedException {

		String CPF = scanner.nextLine();
		long ID = readLong();
		String nome = scanner.nextLine();
		Customer custom = new Customer(ID, nome, CPF);
		
		view.menu();
		int x = readInt();
		
		if (x == 1) {
			custom.setPaymentMethod(credito);
		} else if(x == 2) {
			custom.setPaymentMethod(debito);
		} else if(x == 3) {
			custom.setPaymentMethod(pix);
		} else if(x == 4) {
			custom.setPaymentMethod(boleto);
		}
		if(x < 0 || x > 4) {
			throw new PaymentMethodNotAllowedException("Alternativa inválida");
		}
		return custom;

	}

	public long readLong() {
		long value = scanner.nextLong();
		scanner.nextLine();
		return value;
	}
	
	public int readInt() {
		int value = scanner.nextInt();
		scanner.nextLine();
		return value;
	}

}
