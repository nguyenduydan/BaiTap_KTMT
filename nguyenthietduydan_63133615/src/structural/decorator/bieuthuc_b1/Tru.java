package structural.decorator.bieuthuc_b1;

public class Tru extends BieuThucDecorator{

    private float toanHang;

    public Tru(BieuThuc bieuThuc, float toanHang) {
        super(bieuThuc);
        this.toanHang = toanHang;
    }

    @Override
    public float giaTri() {
        return super.giaTri() - toanHang;
    }

    @Override
    public String bieuthuc() {
        return bieuThuc.giaTri() + " - " + toanHang;
    }
}
