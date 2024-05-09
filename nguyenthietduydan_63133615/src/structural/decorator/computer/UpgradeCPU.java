package structural.decorator.computer;

public class UpgradeCPU extends PCDecorator{
    String newCpu;
    int newValueCpu;

    public UpgradeCPU(PC pc, String newCpu, int newValueCpu) {
        super(pc);
        this.newCpu = newCpu;
        this.newValueCpu = newValueCpu;
        pc.cpu = newCpu;
    }

    @Override
    public String build() {
        StringBuilder builder = new StringBuilder();
        builder.append(pc.build());
        builder.append("Nâng cấp CPU mới: " + newCpu + "\n");
        return builder.toString();
    }

    @Override
    public int value() {
        return pc.value() - super.getV_Cpu() + newValueCpu;
    }

    @Override
    public String getCpu() {
        return super.getCpu() + " " + newCpu;
    }

    @Override
    public int getV_Cpu() {
        return super.getV_Cpu()+newValueCpu;
    }
}
