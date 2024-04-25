package behavioral.chain_of_responsibility.tiendien_cb3;

public class BacThongThuong extends TienDienBacThang{
    TienDienBacThang keTiep;

    public BacThongThuong(String tenBac, int min, int max, int gia) {
        super(tenBac, min, max, gia);
    }

    @Override
    public TienDienBacThang keTiep(TienDienBacThang tien) {
        this.keTiep = tien;
        return this.keTiep;
    }

    @Override
    public int tinhTien(int soKW) {
        StringBuilder builder = new StringBuilder();
        if(soKW <= max){
            int tienDien = (soKW - min)*gia;
            builder.append(tenBac).append(": ").append(min).append("-->").append(max).append(": ").append(soKW - min).append(" x ").append(gia).append(" = ").append(tienDien);
            System.out.println(builder.toString());
            return tienDien;
        }else{
            int tienDien = (max - min)*gia;
            builder.append(tenBac).append(": ").append(min).append("-->").append(max).append(": ").append(max - min).append(" x ").append(gia).append(" = ").append(tienDien);
            System.out.println(builder.toString());
            return tienDien + keTiep.tinhTien(soKW);
        }
    }
}
