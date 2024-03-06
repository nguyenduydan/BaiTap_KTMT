package creational.factory.pizza;

public abstract class PizzaStore {
    abstract Pizza createPizza(PizzaType pizza);
    public Pizza orderPizza(PizzaType pizza){
        Pizza p = createPizza(pizza);
        p.preprare();
        p.cut();
        p.box();
        return p;
    }
}
