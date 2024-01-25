package quanly_nhanvien;

public class Main {
    public static void main(String[] args) {
        NhanVien nhanVien1 = new NhanVien("duy dan", 21, "Nha Trang", 2000000, 250);
        NhanVien nhanVien2 = new NhanVien("thach thao", 18, "Nha Trang", 220000, 190);
        System.out.println("----------Bài Tập 1----------");
        System.out.printf("\nThông tin nhân viên 1: \n" + nhanVien1.getThongTin());
        System.out.printf("\nThông tin nhân viên 2: \n" + nhanVien2.getThongTin());
        System.out.println("\n-----------------------------");
        System.out.println("----------Bài Tập 2----------");
        NhanVien nhanVien = new NhanVien();
        NhanVien nhanVien3 = new NhanVien("tran phu", 21, "Nha Trang", 590000, 350);
        NhanVien nhanVien4 = new NhanVien("thanh hoa", 18, "Nha Trang", 620000, 560);
        QuanLyNhanVien ds = new QuanLyNhanVien();
        ds.them(nhanVien);
        ds.them(nhanVien1);
        ds.them(nhanVien2);
        ds.them(nhanVien3);
        ds.them(nhanVien4);
        ds.inDS();
    }
}
