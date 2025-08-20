package br.edu.unipe.aps2.principal;

import br.edu.unipe.aps2.operacoes.Banco;

public class Principal {
	
	
	public static void main (String [] args) {
		
		Banco banco1 = new Banco ("João", "000000-0", 10);
		Banco banco2 = new Banco ();
		
		
		System.out.println(banco1.getSaldo());	
		banco1.setSaldo(5);	
		System.out.println(banco1.getSaldo());	


	
		
	}

}
