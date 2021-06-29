package br.edu.univas.main;

public class Customer {
	
	private long id;
	private String name;
	private String cpf;
	private PaymentMethod paymentMethod;
	
	public Customer(long ID, String nome, String CPF) {
		this.id = ID;
		this.name = nome;
		this.cpf = CPF;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public PaymentMethod getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(PaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	

}
