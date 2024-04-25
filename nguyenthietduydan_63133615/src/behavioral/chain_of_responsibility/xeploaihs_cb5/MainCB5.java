package behavioral.chain_of_responsibility.xeploaihs_cb5;

public class MainCB5 {
    public static void main(String[] args) {
        XepLoaiHocSinh hs1 = new XepLoaiBinhThuong("Yếu",5);
        XepLoaiHocSinh hs2 = new XepLoaiBinhThuong("Trung bình",7);
        XepLoaiHocSinh hs3 = new XepLoaiBinhThuong("Khá",8);
        XepLoaiHocSinh hs4 = new XepLoaiBinhThuong("Giỏi",9);
        XepLoaiHocSinh hs5 = new XepLoaiCaoNhat("Xuất sắc",10);
        hs1.keTiep(hs2).keTiep(hs3).keTiep(hs4).keTiep(hs5);
        System.out.println(hs1.xepLoai(6));
    }
}
