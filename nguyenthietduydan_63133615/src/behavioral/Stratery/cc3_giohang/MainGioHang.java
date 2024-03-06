package behavioral.Stratery.cc3_giohang;

import behavioral.Stratery.cc1_tinh.Chia;

public class MainGioHang {
    public static void main(String[] args) {
        GioHang gioHang = new GioHang();
        MatHang mh1 = new MatHang("Bep dien", 3,20000);
        MatHang mh2 = new MatHang("Lo nuong", 1,50000);
        gioHang.themMatHang(mh1);
        gioHang.themMatHang(mh1);
        gioHang.themMatHang(mh2);
        gioHang.themMatHang(mh2);

        System.out.println(gioHang.TongDonHang());
    }
}
