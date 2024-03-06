package creational.singleton.ungdung_a6;

public class MainA6 {
    public static void main(String[] args) {
        UI ui1 = new UI();
        ui1.add("SP01","PC",2,1000000);
        UI ui2 = new UI();
        ui2.add("SP02","Laptop",3,211000);
        ui1.display();
    }
}
