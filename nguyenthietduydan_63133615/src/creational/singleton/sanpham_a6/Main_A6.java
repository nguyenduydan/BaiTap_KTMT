package creational.singleton.sanpham_a6;

public class Main_A6 {
    public static void main(String[] args) {
        SanPham sp1 = new SanPham("124","Pepsi",20,10000);
        SanPham sp2 = new SanPham("125","Coca",20,10000);
        SanPham sp3 = new SanPham("126","SiTing",20,10000);
        UI1 dt = new UI1();
        dt.add(sp1,"nuoc");
        dt.add(sp2,"nuoc");
        dt.add(sp3,"nuoc ngot");

        UI2 dt1 = new UI2();
        dt1.add(sp1);
        dt1.add(sp2);
        dt1.add(sp3);

        dt.display("nuoc ngot");
        dt1.display();
    }
}
