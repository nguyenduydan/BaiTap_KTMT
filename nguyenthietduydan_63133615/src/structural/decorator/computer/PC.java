package structural.decorator.computer;

public abstract class PC {
    String mainboard, cpu, ram, storage, screen;
    int v_Mainboard, v_Cpu, v_Ram, v_Storage, v_Screen;

    abstract public String build();
    abstract public int value();

    public String getMainboard() {
        return mainboard;
    }

    public String getCpu() {
        return cpu;
    }

    public String getRam() {
        return ram;
    }

    public String getStorage() {
        return storage;
    }

    public String getScreen() {
        return screen;
    }

    public int getV_Mainboard() {
        return v_Mainboard;
    }

    public int getV_Cpu() {
        return v_Cpu;
    }

    public int getV_Ram() {
        return v_Ram;
    }

    public int getV_Storage() {
        return v_Storage;
    }

    public int getV_Screen() {
        return v_Screen;
    }
}
