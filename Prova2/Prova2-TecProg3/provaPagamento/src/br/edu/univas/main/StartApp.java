package br.edu.univas.main;

import java.util.Scanner;

public class StartApp {
	
	public static void main(String[] args) {
		StartApp a = new StartApp();
		a.teste();
		
	}
	
	public void teste() {
		Scanner scanner = new Scanner(System.in);
		long id = scanner.nextLong();
		scanner.nextLine();
		String name = scanner.nextLine();
		String CPF = scanner.nextLine();
	}

}
