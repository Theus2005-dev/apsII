public class Main {
    public static void main(String[] args) {
       
        // instancias
        GerenteFiguras gerente = new GerenteFiguras();
        Losango losango1 =new Losango("Losango", 10, 20);
        Losango losango2 = new Losango("losango2", 12, 21);
        Triangulo triangulo = new Triangulo("triangulo1", 100, 10);
        Triangulo triangulo2 = new Triangulo("triangulo2", 10, 10);
       
        // add figuras
        gerente.addFigura(losango1);
        gerente.addFigura(losango2);
        gerente.addFigura(triangulo);
        gerente.addFigura(triangulo2);

        // imprimir, calcularMaiorArea e imprimir area por figura
        System.out.println(">>>>>>>>>");
        gerente.imprimirFiguras();
        System.out.println(">>>>>>>>>");
        gerente.getMaiorAreaDeFigura();
        System.out.println(">>>>>>>>>");
        gerente.areaTotalCadaFigura();

        
    }
}
