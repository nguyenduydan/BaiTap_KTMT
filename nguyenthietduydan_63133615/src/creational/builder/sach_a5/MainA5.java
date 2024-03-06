package creational.builder.sach_a5;

public class MainA5 {
    public static void main(String[] args) {
        QuyenSach qs = new QuyenSach.Builder()
                .buildtuaDe("harry potter")
                .buildsoTrang(122)
                .buildtacGia("Phuc")
                .builddanhSachChuong("Coc quy")
                .builddanhSachChuong("Hello")
                .builddanhSachChuong("Win")
                .builddanhSachChuong("Ez")
                .build();
        System.out.println(qs.toString());
    }
}
