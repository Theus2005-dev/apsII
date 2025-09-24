public class Fita {
    private String titulo;
    private Preco preco;

    public Fita(String titulo, Preco preco) {
        this.titulo = titulo;
        this.preco = preco;
    }

    public double getValor(int diasAlugada) {
        return preco.calculaValor(diasAlugada);
    }

    public int getPontosDeAlugadorFrequente(int diasAlugada) {
        return preco.getPontosDeAlugadorFrequente(diasAlugada);
    }

    public String getTitulo() {
        return titulo;
    }
}
