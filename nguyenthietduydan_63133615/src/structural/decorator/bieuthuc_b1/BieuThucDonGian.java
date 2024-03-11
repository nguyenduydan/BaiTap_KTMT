package structural.decorator.bieuthuc_b1;

public class BieuThucDonGian extends BieuThuc {
    private float toanHang;

    public BieuThucDonGian(float toanHang) {
        this.toanHang = toanHang;
    }

    @Override
    public float giaTri() {
        return toanHang;
    }

    @Override
    public String bieuthuc() {
        return Float.toString(giaTri());
    }
}
