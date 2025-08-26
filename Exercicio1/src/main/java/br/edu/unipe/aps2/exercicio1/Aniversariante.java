package br.edu.unipe.aps2.exercicio1;

public class Aniversariante {
	
	private String nome;
	private int dia;
	private int mes;
	private DataAniversario dataAniversario;

	// constructors
	public Aniversariante(String nome, int dia, int mes){
		this.nome = nome;
		this.dia = dia;
		this.mes= mes;
	}
	public Aniversariante(String nome, DataAniversario  dataAniversario){
		this.nome = nome;
		this.dataAniversario = dataAniversario;
	}


	//gets e sets...
	public void setName(String name){
		this.nome = name;
	}
	public void setDia(int dia){
		this.dia = dia;
	}
	public void setMes(int mes){
		this.mes = mes;
	}
	public String getNome(){
		return this.nome;
	}
	public int getDia(){
		return this.dia;
	}
	public int getMes(){
		return this.mes;
	}
}
