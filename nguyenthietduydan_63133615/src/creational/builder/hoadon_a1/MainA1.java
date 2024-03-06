package creational.builder.hoadon_a1;

public class MainA1 {
    public static void main(String[] args) {
        HoaDon hd = new HoaDon.Builder()
                .setHoaDonHeader("HD01","1/2/2024","Phuc")
                .addCTHD("Caphe",3,20000,15000)
                .addCTHD("Coca",3,20000,15000)
                .addCTHD("New",3,20000,15000).build();
        System.out.println(hd.toString());

    }
}
