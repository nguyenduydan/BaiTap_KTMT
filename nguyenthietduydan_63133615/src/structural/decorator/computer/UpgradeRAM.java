package structural.decorator.computer;

public class UpgradeRAM extends PCDecorator{
    String newRam;
    int newValueRam;

    public UpgradeRAM(PC pc, String newRam, int newValueRam) {
        super(pc);
        this.newRam = newRam;
        pc.ram = newRam;
        this.newValueRam = newValueRam;
    }

    @Override
    public String build() {
        StringBuilder builder = new StringBuilder();
        builder.append(pc.build());
        builder.append("\nNâng cấp RAM thêm: " + newRam + "\n");
        return builder.toString();
    }

    @Override
    public int value() {
        return pc.value()+newValueRam;
    }

    @Override
    public String getRam() {
        return super.getRam() + " " + newRam;
    }

    @Override
    public int getV_Ram() {
        return super.getV_Ram() + newValueRam;
    }
}
