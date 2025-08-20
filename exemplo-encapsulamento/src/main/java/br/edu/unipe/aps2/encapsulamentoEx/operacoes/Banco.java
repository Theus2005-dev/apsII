package br.edu.unipe.aps2.encapsulamentoEx.operacoes;

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
		this.cpf = "0000000";
		this.saldo = 0.0;
	}
	
	public void setSaldo (double novoSaldo) {
		this.saldo = novoSaldo;
	}
	
	public double getSaldo() {
		return this.saldo;
	}

}
