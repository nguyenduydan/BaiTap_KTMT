package structural.decorator.beverage;

public class MainBeverage {
    public static void main(String[] args) {
        Beverage b = new HouseBlend("Cafe trung nguyên số 2");
        b = new Milk("Sữa cô gái Hà Lan",b);
        b = new Mocha("Thêm mô cha",b);
        System.out.println(b.description);
        System.out.println(b.cost());
    }
}
