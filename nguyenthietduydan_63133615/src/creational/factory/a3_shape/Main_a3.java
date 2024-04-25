package creational.factory.a3_shape;

public class Main_a3 {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.createShape(ShapeType.CIRCLE);
        circle.brush = "Bút vẽ hình tròn";
        circle.paper = "Giấy vẽ hình tròn";
        circle.frame = "Khung hinh tròn";
        System.out.println(circle.draw());
    }
}
