package creational.factory.pizza.shape_a3;

public abstract class Shape {
    String brush, paper,frame;

    public Shape(String brush, String paper, String frame) {
        this.brush = brush;
        this.paper = paper;
        this.frame = frame;
    }
}
