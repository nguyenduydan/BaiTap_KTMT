package behavioral.template_method.caffein_beverage;

public class Coffee extends CaffeineBeverage{
    @Override
    protected void brew() {
        System.out.println("Cho nuoc vao cafe va khoay deu ");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Cho them mot it sua ngoi siuuuuuuuuuuuuuuu");
    }
}
