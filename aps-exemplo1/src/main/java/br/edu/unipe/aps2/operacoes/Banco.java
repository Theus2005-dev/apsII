package br.edu.unipe.aps2.operacoes;

public class Banco {
	
	public String nome;
	public String cpf;
	private double saldo;
	
	public Banco (String nome, String cpf, double saldo) {
		this.nome = nome;
		this.cpf = cpf;
		this.saldo = saldo;
	}
	
	public Banco () {
		this.nome = "sem nome";
		this.cpf = "sem cpf";
		this.saldo = 0;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(double novoSaldo) {
		this.saldo = novoSaldo;
	}
	

}
