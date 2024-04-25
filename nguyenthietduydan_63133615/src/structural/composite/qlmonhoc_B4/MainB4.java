package structural.composite.qlmonhoc_B4;

public class MainB4 {
    public static void main(String[] args) {
        KeHoachHocTap mon0 = new MonHoc("Lập trình di động",3,450000);
        KeHoachHocTap mon1 = new MonHoc("Kiến Trúc Phần Mềm",3,450000); KeHoachHocTap mon2 = new MonHoc("Toán rời rạc",3,450000);
        KeHoachHocTap mon3 = new MonHoc("Lập trình web",4,450000);

        KeHoachHocTap hk1 = new KeHoachChung("Kì 1");
        KeHoachHocTap hk2 = new KeHoachChung("Kì 2");
        hk1.Add(mon0);
        hk1.Add(mon1);
        hk2.Add(mon2);
        hk2.Add(mon3);
        System.out.println(hk1.getThongTin());
        System.out.println(hk2.getThongTin());
    }
}
