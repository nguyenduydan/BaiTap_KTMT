package behavioral.chain_of_responsibility.tiendien_cb3;

public class BacCaoNhat extends TienDienBacThang {
    public BacCaoNhat(String tenBac, int min, int max, int gia) {
        super(tenBac, min, max, gia);
    }

    @Override
    public TienDienBacThang keTiep(TienDienBacThang tien) {
        return null;
    }

    @Override
    public int tinhTien(int soKW) {
        StringBuilder builder = new StringBuilder();
        int tienDien = (soKW - min)*gia;
        builder.append(tenBac).append(": ").append(min).append("-->").append(max).append(": ").append(soKW - min).append(" x ").append(gia).append(" = ").append(tienDien).append("\n");
        System.out.println(builder.toString());
        return tienDien;
    }
}
