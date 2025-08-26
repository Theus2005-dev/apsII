package br.edu.unipe.aps2.exercicio1;

public class Main {
    public static void main(String [] args){
            System.out.println(">>>Bem vinda(o) a sua agenda de aniversarios<<<");
       
            MinhaAgendaDeAniversarios agenda = new MinhaAgendaDeAniversarios();
            agenda.adicionarAniversariante("Matheus", 28, 8);
            agenda.adicionarAniversariante("Luisa", 28, 8);
            agenda.adicionarAniversariante("Pedro", 28, 8);
            agenda.adicionarAniversariante("Thiago", 29, 9);
            agenda.adicionarAniversariante("Lucas", 30, 12);
           
            System.out.println("Lista de aniversariantes: " + agenda.returnNiver());

            System.out.println("Aniversariantes do dia: " + agenda.obterAniversariantesDoDia(28,8));

            // remover pedro...
            agenda.removerAniversariante("Lucas");

            System.out.println("Agenda de aniversarios: " + agenda.returnNiver());
  
        }       

}
