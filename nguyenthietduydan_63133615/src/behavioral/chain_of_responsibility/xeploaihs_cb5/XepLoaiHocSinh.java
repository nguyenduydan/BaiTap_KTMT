package behavioral.chain_of_responsibility.xeploaihs_cb5;

public abstract class XepLoaiHocSinh {
    String xepLoai;
    double max;
    public XepLoaiHocSinh(String xepLoai,double max) {
        this.xepLoai = xepLoai;
        this.max = max;
    }

    public abstract XepLoaiHocSinh keTiep(XepLoaiHocSinh diemTB);
    public abstract String xepLoai(int diem);
}
