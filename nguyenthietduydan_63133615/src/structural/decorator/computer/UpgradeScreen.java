package structural.decorator.computer;

public class UpgradeScreen extends PCDecorator{
    String newScreen;
    int newValueScreen;

    public UpgradeScreen(PC pc, String newScreen, int newValueScreen) {
        super(pc);
        this.newScreen = newScreen;
        pc.screen = newScreen;
        this.newValueScreen = newValueScreen;
    }

    @Override
    public String build() {
        StringBuilder builder = new StringBuilder();
        builder.append(pc.build());
        builder.append("Nâng cấp Screen mới: " + newScreen + "\n");
        return builder.toString();
    }

    @Override
    public int value() {
        return super.getV_Screen() + newValueScreen;
    }

    @Override
    public String getScreen() {
        return newScreen;
    }

    @Override
    public int getV_Screen() {
        return super.getV_Cpu()+newValueScreen;
    }

}
