package structural.decorator.computer;

public class ConcretePC extends PC{

    public ConcretePC(String mainboard, String cpu, String ram, String storage, String screen, int v_Mainboard, int v_Cpu, int v_Ram, int v_Storage, int v_Screen) {
        this.mainboard = mainboard;
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.screen = screen;
        this.v_Mainboard = v_Mainboard;
        this.v_Cpu = v_Cpu;
        this.v_Ram = v_Ram;
        this.v_Storage = v_Storage;
        this.v_Screen = v_Screen;
    }

    @Override
    public String build() {
        StringBuilder builder = new StringBuilder();
        builder.append("Main: " + mainboard + "\n")
                .append("CPU: "+ cpu + "\n")
                .append("Ram: "+ ram + "\n")
                .append("Screen: "+ screen + "\n")
                .append("Storage: "+ storage + "\n");
         return builder.toString();
    }

    @Override
    public int value() {
        return v_Mainboard+v_Cpu+v_Ram+v_Screen+v_Storage;
    }
}
