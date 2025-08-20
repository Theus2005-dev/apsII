package exercicio01;

import java.util.ArrayList;

public interface AgendaDeAniversarios {
	
	public ArrayList<String> obterAniversariantesDoDia(int dia, int mes);
	
	public void adicionarAniversariante(String nome, int dia, int mes);
	
	public void removerAniversariante(String nome);

}
