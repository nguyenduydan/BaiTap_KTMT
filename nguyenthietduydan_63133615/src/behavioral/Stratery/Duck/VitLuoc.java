package behavioral.Stratery.Duck;

public class VitLuoc extends Duck{
    @Override
    public void display() {
        System.out.println("Tao là vịt luộc!!!");
        performQuack();
        System.out.println("Ăn ngon miệng");
    }
}
