package structural.decorator.bieuthuc_b1;

public abstract class BieuThuc {
    public abstract float giaTri();
    public abstract  String  bieuthuc();

    @Override
    public String toString() {
        return bieuthuc() + " = " + giaTri();
    }
}
