package creational.factory.a3_shape;

public abstract class Shape {
    String brush, paper, frame;
    StringBuilder stringBuilder = new StringBuilder();
    public abstract String draw();
}
