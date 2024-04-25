package behavioral.observer.atm_ca5;

public class MainCA5 {
    public static void main(String[] args) {
        ATM atm = new ATM();
        TaiKhoan phat = new TaiKhoan("Phát",1000,atm);
        System.out.println("Lần 1");
        atm.rutTien(500);
        System.out.println("Lần 2");
        phat.duaTheVaoATM();
        atm.rutTien(5000);
        System.out.println("Lần 3");
        atm.rutTien(600);
    }
}
