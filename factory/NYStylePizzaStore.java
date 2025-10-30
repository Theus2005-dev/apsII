public class NYStylePizzaStore extends PizzaStore {
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (item.equals("queijo")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Pizza de queijo no estilo de NY");
        } else if (item.equals("vegetariana")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("Pizza vegetariana no estilo NY");
        } else if (item.equals("mariscos")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Pizza de mariscos no estilo de NY");
        } else if (item.equals("calabresa")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("Pizza de calabresa no estilo de NY");
        }
        return pizza;
    }
}
