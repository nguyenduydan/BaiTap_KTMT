package structural.decorator.bieuthuc_b1;

public class Chia extends BieuThucDecorator{
    private int toanHang;

    public Chia(BieuThuc bieuThuc, int toanHang) {
        super(bieuThuc);
        this.toanHang = toanHang;
    }

    @Override
    public float giaTri() {
        return super.giaTri() / toanHang;
    }

    @Override
    public String bieuthuc() {
        return bieuThuc.giaTri() + " / " + toanHang;
    }
}
