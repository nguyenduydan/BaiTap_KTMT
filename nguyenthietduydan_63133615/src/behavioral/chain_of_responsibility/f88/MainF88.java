package behavioral.chain_of_responsibility.f88;

public class MainF88 {
    public static void main(String[] args) {
        NhanVienF88 nv = new NhanVien("Duy Đan","Nhân viên",2_000_000);
        NhanVienF88 truongphong = new NhanVien("Hoàng","Nhân viên",10_000_000);
        NhanVienF88 phogiamdoc = new NhanVien("Phát","Nhân viên",50_000_000);
        NhanVienF88 giamdoc = new NhanVien("Lâm","Nhân viên",100_000_000);
        NhanVienF88 bv = new NhanVien("Phúc","Bảo vệ",200_000);
        NhanVienF88 chuTich = new ChuTich("Thành","Chủ tịch",500_000_000);
        bv.capCapHon(nv).capCapHon(truongphong).capCapHon(phogiamdoc).capCapHon(giamdoc).capCapHon(chuTich);
        System.out.println(bv.xuLyKhoanVay(30_000_000));
    }
}
