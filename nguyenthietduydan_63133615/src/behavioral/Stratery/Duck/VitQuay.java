package behavioral.Stratery.Duck;

public class VitQuay extends Duck {

    @Override
    public void display() {
        System.out.println("Vịt quay mời bạn ăn nha!!!");
        performQuack();
        performFly();
        System.out.println("Chúc bạn ngon miệng!!");
    }
}
