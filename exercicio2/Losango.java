public class Losango implements FiguraGeometrica {
    private String nome; 
    private double diagonal1;
     private double diagonal2;

     public Losango(String nome, double diagonal1, double diagonal2){
        this.nome = nome;
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
     }
     public double calcularArea(){
        return (this.diagonal1 * this.diagonal2)/2;
     }
     public String getNome(){
        return this.nome;
     }

}
