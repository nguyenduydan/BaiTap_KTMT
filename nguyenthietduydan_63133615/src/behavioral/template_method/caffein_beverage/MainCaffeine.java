package behavioral.template_method.caffein_beverage;

public class MainCaffeine {
    public static void main(String[] args) {
        CaffeineBeverage cafe = new Coffee();
        cafe.prepareRacipe();
        System.out.println("------------------------------------------------------");
        CaffeineBeverage tea = new Tea();
        tea.prepareRacipe();
    }

}
