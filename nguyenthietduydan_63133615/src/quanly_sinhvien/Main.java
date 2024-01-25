package quanly_sinhvien;

public class Main {
    public static void main(String[] args) {
        // Create instances of SinhVienPoly, SinhVienIT, and SinhVienBiz
        SinhVienPoly svPoly = new SinhVienPoly("Trâm Anh", "Poly") {
            @Override
            public double getDiem() {
                return 7;
            }
        };
        SinhVienIT svIT = new SinhVienIT("Duy Đan", 8.5, 7.5, 9.0);
        SinhVienBiz svBiz = new SinhVienBiz("Tiểu Mễ", 6.0, 8.0);

        // Display information for each student
        System.out.println("Thông tin sinh viên Poly:");
        svPoly.xuat();
        System.out.println();

        System.out.println("Thông tin sinh viên IT:");
        svIT.xuat();
        System.out.println();

        System.out.println("Thông tin sinh viên Biz:");
        svBiz.xuat();
    }
}
