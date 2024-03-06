package creational.factory.pizza;

public abstract class Pizza {
    StringBuilder builder = new StringBuilder();
    abstract void preprare();
    abstract void bake();
    abstract void cut();
    abstract void box();

    @Override
    public String toString() {
        return builder.toString();
    }
}
