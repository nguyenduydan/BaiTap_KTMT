package behavioral.template_method.caffein_beverage;

import java.sql.SQLOutput;

public abstract class CaffeineBeverage {
    protected abstract void brew();
    protected abstract void addCondiments();
    private void boilWater(){
        System.out.println("Dun soi nuoc o 100C ");
    }
    private void pourInCup(){
        System.out.println("Rotttttttttttttttt");
    }
    void prepareRacipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

}
