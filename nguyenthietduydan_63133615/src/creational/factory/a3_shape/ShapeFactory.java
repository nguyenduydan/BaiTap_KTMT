package creational.factory.a3_shape;

public class ShapeFactory {

    public Shape createShape(ShapeType shapeType){
        switch (shapeType){
            case CIRCLE:
                return  new Circle();
            case TRIANGLE:
                //
            case RECTANGLE:
                //
        }
        return null;
    }
}
