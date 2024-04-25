package behavioral.chain_of_responsibility.tiendien_cb3;

public abstract class TienDienBacThang {
    String tenBac;
    int min, max, gia;

    public TienDienBacThang(String tenBac, int min, int max, int gia) {
        this.tenBac = tenBac;
        this.min = min;
        this.max = max;
        this.gia = gia;
    }

    public abstract TienDienBacThang keTiep(TienDienBacThang tien);
    public abstract int tinhTien(int soKW);
}
