public class PrecoLancamento extends Preco {
    @Override
    public double calculaValor(int diasAlugada) {
        return diasAlugada * 3;
    }

    @Override
    public int getPontosDeAlugadorFrequente(int diasAlugada) {
        return (diasAlugada > 1) ? 2 : 1;
    }
}
