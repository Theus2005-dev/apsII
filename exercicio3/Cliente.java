public class Cliente {
    private String nome;
    private ListaAlugueis alugueis = new ListaAlugueis();

    public Cliente(String nome) {
        this.nome = nome;
    }

    public void adicionaAluguel(Aluguel aluguel) {
        alugueis.adiciona(aluguel);
    }

    public ListaAlugueis getAlugueis() {
        return alugueis;
    }

    public String getNome() {
        return nome;
    }
}
