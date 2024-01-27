package behavioral.Stratery.Duck;

public class MainDuck {
    public static void main(String[] args) {
        Duck duck = new VitQuay();
        duck.setFlyable(new BayTrenLoThan());
        duck.setQuackable(new VitQuayKeu());
        Duck duck2 = new VitLuoc();
        duck2.setQuackable(new VitQuayKeu());
        duck.display();
        System.out.println();
        duck2.display();
    }
}
