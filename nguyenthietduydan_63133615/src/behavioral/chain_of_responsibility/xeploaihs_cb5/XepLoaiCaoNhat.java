package behavioral.chain_of_responsibility.xeploaihs_cb5;

public class XepLoaiCaoNhat extends XepLoaiHocSinh{
    public XepLoaiCaoNhat(String xepLoai, double diem) {
        super(xepLoai,diem);
    }

    @Override
    public XepLoaiHocSinh keTiep(XepLoaiHocSinh diemTB) {
        return null;
    }

    @Override
    public String xepLoai(double diem) {
        StringBuilder builder = new StringBuilder();
        builder.append("Xếp loại: ").append(xepLoai);
        return builder.toString();
    }
}
