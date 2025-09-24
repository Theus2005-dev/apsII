public class Extrato {
    private Cliente cliente;

    public Extrato(Cliente cliente) {
        this.cliente = cliente;
    }

    public String gerar() {
        StringBuilder resultado = new StringBuilder("Registro de Alugueis de " + cliente.getNome() + "\n");

        for (Aluguel aluguel : cliente.getAlugueis().getTodos()) {
            double valor = aluguel.calcularValor();
            resultado.append("\t").append(aluguel.getFita().getTitulo())
                     .append("\t").append(valor).append("\n");
        }

        resultado.append("Valor total devido: ").append(cliente.getAlugueis().calcularValorTotal()).append("\n");
        resultado.append("Você ganhou ").append(cliente.getAlugueis().calcularPontosTotais())
                 .append(" pontos de alugador frequente");

        return resultado.toString();
    }
}
