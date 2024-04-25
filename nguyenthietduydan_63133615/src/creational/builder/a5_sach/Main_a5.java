package creational.builder.a5_sach;

public class Main_a5 {
    public static void main(String[] args) {
        Sach sach = new Sach.Builder()
                .buildTuDe("Lap Trinh Android Studio")
                .buildSoTrang(200)
                .buildDSChuong("Chuong1")
                .buildDSChuong("Chuong2")
                .buildDSChuong("Chuong3")
                .buildTacGia("NguyenThietDuyDan")
                .build();
        System.out.println(sach.toString());
    }
}
