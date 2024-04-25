package behavioral.chain_of_responsibility.tiendien_cb3;

public class Main_CB3 {
    public static void main(String[] args) {
        TienDienBacThang bac1 = new BacThongThuong("Bậc 1",0,50,1806);
        TienDienBacThang bac2 = new BacThongThuong("Bậc 2",50,100,1866);
        TienDienBacThang bac3 = new BacThongThuong("Bậc 3",100,200,2167);
        TienDienBacThang bac4 = new BacThongThuong("Bậc 4",200,300,2729);
        TienDienBacThang bac5 = new BacThongThuong("Bậc 5",300,400,3050);
        TienDienBacThang bac6 = new BacCaoNhat("Bậc 6",401,Integer.MAX_VALUE,3151);
        bac1.keTiep(bac2).keTiep(bac3).keTiep(bac4).keTiep(bac5).keTiep(bac6);
        System.out.println("Số tiền phải trả là: " + bac1.tinhTien(135) + " đồng");
    }
}
