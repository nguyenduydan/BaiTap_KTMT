package structural.decorator.bieuthuc_b1;

public class MainB1 {
    public static void main(String[] args) {
        BieuThuc bt = new BieuThucDonGian(8);
        bt = new Cong(bt,6);
        bt = new Chia(bt,2);
        bt = new Nhan(bt,5);
        
        System.out.println(bt.toString());
    }
}



