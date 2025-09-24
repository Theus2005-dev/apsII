import locadora.preco.*;

public class Locadora {
    public static void main(String[] args) {
        // Criação de fitas com estratégias de preço
        Fita fita1 = new Fita("O Senhor dos Anéis", new PrecoNormal());
        Fita fita2 = new Fita("Vingadores: Ultimato", new PrecoLancamento());
        Fita fita3 = new Fita("Toy Story", new PrecoInfantil());

        // Criação de alugueis
        Aluguel aluguel1 = new Aluguel(fita1, 3);
        Aluguel aluguel2 = new Aluguel(fita2, 2);
        Aluguel aluguel3 = new Aluguel(fita3, 5);

        // Cliente e seus alugueis
        Cliente cliente = new Cliente("Matheus Arcangelli");
        cliente.adicionaAluguel(aluguel1);
        cliente.adicionaAluguel(aluguel2);
        cliente.adicionaAluguel(aluguel3);

        // Geração do extrato
        Extrato extrato = new Extrato(cliente);
        System.out.println(extrato.gerar());
    }
}
