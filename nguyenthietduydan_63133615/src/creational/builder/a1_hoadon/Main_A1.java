package creational.builder.a1_hoadon;

public class Main_A1 {
    public static void main(String[] args) {
        HoaDon hd = new HoaDon.Builder()
                .setHoaDonHeader("HD01","1/2/2024","Dan")
                .addCTHD("New",3,20000,15000)
                .build();
        System.out.println(hd.toString());
    }
}
