package br.edu.unipe.aps2.exercicio1;

public class DataAniversario {
	
	private int dia;
	private int mes;

	
	public void DataAniversario(int dia, int mes){
		this.dia = dia;
		this.mes = mes;
		}
		
	// gets e sets…
	
	
	public boolean equals(Object outraData){
		if (outraData instanceof DataAniversario){
			DataAniversario outraDataAniversario = (DataAniversario) outraData;
			return (outraDataAniversario.dia == this.dia && outraDataAniversario.mes == this.mes);
		}
		return false;
	}
	
	public String toString(){
		return this.dia+"/"+this.mes;
	}
	
}
