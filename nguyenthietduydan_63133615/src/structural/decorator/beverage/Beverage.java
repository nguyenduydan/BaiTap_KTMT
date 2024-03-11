package structural.decorator.beverage;

public abstract class Beverage {
    String description;

    public Beverage(String description) {
        this.description = description;
    }

    public abstract float cost(); //Phương thức cost trả về giá tiền

    public String getDescription() {
        return description;
    }
}
