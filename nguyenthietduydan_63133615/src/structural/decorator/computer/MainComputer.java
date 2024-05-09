package structural.decorator.computer;

public class MainComputer {
    public static void main(String[] args) {
        PC pc1 = new ConcretePC("B450M", "I5","DDR4", "SSD", "LG",500,12900,64,2,144);
        pc1 = new UpgradeCPU(pc1,"I9",15000);
        pc1 = new UpgradeRAM(pc1,"DDR5",45);

        System.out.println(pc1.build());
        System.out.println("Value: "+pc1.value());

    }
}
