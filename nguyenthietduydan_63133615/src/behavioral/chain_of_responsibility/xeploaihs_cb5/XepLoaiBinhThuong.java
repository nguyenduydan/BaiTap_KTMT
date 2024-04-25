package behavioral.chain_of_responsibility.xeploaihs_cb5;

public class XepLoaiBinhThuong extends XepLoaiHocSinh{
    XepLoaiHocSinh keTiep;

    public XepLoaiBinhThuong(String xepLoai, double max) {
        super(xepLoai, max);
    }

    @Override
    public XepLoaiHocSinh keTiep(XepLoaiHocSinh diemTB) {
        keTiep = diemTB;
        return keTiep;
    }

    @Override
    public String xepLoai(int diem) {
        StringBuilder builder = new StringBuilder();
        if(diem <= max)
            builder.append("Xếp loại: ").append(xepLoai);
        else
            builder.append(keTiep.xepLoai(diem));
        return builder.toString();
    }
}
