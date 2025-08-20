package br.edu.unipe.aps2.encapsulamentoEx.aplicacao;

import br.edu.unipe.aps2.encapsulamentoEx.operacoes.Banco;

public class Principal {
	
	
	public static void main (String [] ags) {
		
		Banco banco1 = new Banco();
		Banco banco2 = new Banco("João", "351651", 10);


		
		System.out.println(banco2.nome);
		System.out.println(banco2.cpf);
		System.out.println(banco2.getSaldo());
		
		banco2.setSaldo(5);
		System.out.println(banco2.getSaldo());

		
		
	}

}
