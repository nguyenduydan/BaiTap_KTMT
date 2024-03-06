package creational.singleton.ungdung_a6;

public class MainA6Upgrade {
    public static void main(String[] args) {
        UI_Upgrade ui1 = new UI_Upgrade("tag1");
        UI_Upgrade ui2 = new UI_Upgrade("tag1");
        UI_Upgrade ui3 = new UI_Upgrade("tag2");
        ui1.add("SP01","PC",2,1000000);
        ui2.add("SP00","Laptop",2,1000000);
        ui1.display();

    }
}
