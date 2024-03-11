package structural.decorator.bieuthuc_b1;

public abstract class BieuThucDecorator extends BieuThuc{

    BieuThuc bieuThuc;

    public BieuThucDecorator(BieuThuc bieuThuc) {
        this.bieuThuc = bieuThuc;
    }

    @Override
    public float giaTri() {
        return bieuThuc.giaTri();
    }

    @Override
    public String bieuthuc() {
        return bieuThuc.toString() + " " + super.toString();
    }
}
