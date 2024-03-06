package behavioral.Stratery.cc1_tinh;

public class MainCC1 {
    public static void main(String[] args) {
        Context c = new Context();
        float kq = c.setTinhToan(new Cong()).tinh(6,2);
        float kq2 = c.setTinhToan(new Tru()).tinh(6,2);
        float kq3 = c.setTinhToan(new Nhan()).tinh(6,2);
        float kq4 = c.setTinhToan(new Chia()).tinh(6,2.2F);
        System.out.println(kq);
        System.out.println(kq2);
        System.out.println(kq3);
        System.out.println(kq4);
    }
}
