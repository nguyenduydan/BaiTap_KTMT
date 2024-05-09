package structural.decorator.computer;

public abstract class PCDecorator extends PC {
    PC pc;

    public PCDecorator(PC pc) {
        this.pc = pc;
    }

    @Override
    public String build() {
        return null;
    }

    @Override
    public int value() {
        return 0;
    }

    @Override
    public String getMainboard() {
        return pc.getMainboard();
    }

    @Override
    public String getCpu() {
        return pc.getCpu();
    }

    @Override
    public String getRam() {
        return pc.getRam();
    }

    @Override
    public String getStorage() {
        return pc.getStorage();
    }

    @Override
    public String getScreen() {
        return pc.getScreen();
    }

    @Override
    public int getV_Mainboard() {
        return pc.getV_Mainboard();
    }

    @Override
    public int getV_Cpu() {
        return pc.getV_Cpu();
    }

    @Override
    public int getV_Ram() {
        return pc.getV_Ram();
    }

    @Override
    public int getV_Storage() {
        return pc.getV_Storage();
    }

    @Override
    public int getV_Screen() {
        return pc.getV_Screen();
    }
}
