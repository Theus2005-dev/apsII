public class Aluguel {
    private Fita fita;
    private int diasAlugada;

    public Aluguel(Fita fita, int diasAlugada) {
        this.fita = fita;
        this.diasAlugada = diasAlugada;
    }

    public double calcularValor() {
        return fita.getValor(diasAlugada);
    }

    public int calcularPontos() {
        return fita.getPontosDeAlugadorFrequente(diasAlugada);
    }

    public Fita getFita() {
        return fita;
    }
}
