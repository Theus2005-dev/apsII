import java.util.*;

public class ListaAlugueis {
    private List<Aluguel> alugueis = new ArrayList<>();

    public void adiciona(Aluguel aluguel) {
        alugueis.add(aluguel);
    }

    public double calcularValorTotal() {
        double total = 0;
        for (Aluguel a : alugueis) {
            total += a.calcularValor();
        }
        return total;
    }

    public int calcularPontosTotais() {
        int pontos = 0;
        for (Aluguel a : alugueis) {
            pontos += a.calcularPontos();
        }
        return pontos;
    }

    public List<Aluguel> getTodos() {
        return Collections.unmodifiableList(alugueis);
    }
}
