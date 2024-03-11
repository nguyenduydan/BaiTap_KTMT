package structural.decorator.beverage;

public class Mocha extends CondimentDecorator{
    public Mocha(String description, Beverage beverage) {
        super(description, beverage);
    }

    @Override
    public float cost() {
        return 10 + beverage.cost();
    }
}
