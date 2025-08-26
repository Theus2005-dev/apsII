package br.edu.unipe.aps2.exercicio1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MinhaAgendaDeAniversarios implements AgendaDeAniversarios{
        ArrayList <Aniversariante> listaAniversariantes = new ArrayList<>();

        public void adicionarAniversariante(String nome, int dia, int mes){
            Aniversariante a = new Aniversariante(nome, dia, mes);
            listaAniversariantes.add(a);
        }
        public ArrayList <String> obterAniversariantesDoDia(int dia, int mes){
                ArrayList <String> nomes = new ArrayList<>();
                for(Aniversariante a : listaAniversariantes){
                    if(a.getDia() == dia && a.getMes() == mes){
                        nomes.add(a.getNome());
                    }
                }
                return nomes;
        }
        public void removerAniversariante(String nomeAniversariante){
            listaAniversariantes.remove(nomeAniversariante);
        }

        public ArrayList <Aniversariante> returnNiver(){
            return listaAniversariantes;
        }
}