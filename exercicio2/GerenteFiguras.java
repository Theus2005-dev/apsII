import java.util.ArrayList;
import java.util.List;

public class GerenteFiguras {
  private List<FiguraGeometrica> figura;

  public GerenteFiguras(){
    figura = new ArrayList<FiguraGeometrica>();
  }
   
    public void addFigura(FiguraGeometrica figuraGeometrica){
        figura.add(figuraGeometrica);
    }
   
    public void imprimirFiguras(){
        for(FiguraGeometrica figura : figura){
            System.out.println("Figura: " + figura.getNome());
        }
    }
   
    public void getMaiorAreaDeFigura(){
        double maiorArea = 0;
        for(int i =0; i < figura.size(); i++){
            if (figura.get(i).calcularArea() > maiorArea){
                maiorArea = figura.get(i).calcularArea();
            }
        }
        System.out.println("Maior area: " + maiorArea); 
    }

    public void areaTotalCadaFigura(){
        for(FiguraGeometrica figura : figura){
            System.out.println("Figura: " + figura.getNome() + ", area: " + figura.calcularArea());
        }
    }
}
