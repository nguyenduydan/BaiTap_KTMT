package behavioral.template_method.caffein_beverage;

public class Tea extends CaffeineBeverage{
    @Override
    protected void brew() {
        System.out.println("Cho nuoc vao tra");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Them chanh");
    }
}
