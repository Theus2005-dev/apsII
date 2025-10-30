public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clam clam;

    abstract void preparar();

    void bake() {
        System.out.println("Assar por 25 min a 350 graus");
    }

    void cut() {
        System.out.println("Cortar em fatias diagonais");
    }

    void box() {
        System.out.println("empacotar nas caixas da pizzaria");
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    public String ToString() {
        // ....
    }
}
