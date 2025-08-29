public class Triangulo implements FiguraGeometrica {
    private String nome;
    private double base;
    private double altura;

    public Triangulo(String nome, double altura, double base){
        this.nome = nome;
        this.altura = altura;
        this.base = base;
    }

    public double calcularArea(){
            return (this.base * this.altura)/2;
    }

    public String getNome(){
        return this.nome;
    }

}
