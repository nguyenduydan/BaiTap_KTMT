package creational.factory.pizza;

public class VN_PizzaStore  extends PizzaStore{
    @Override
    Pizza createPizza(PizzaType pizza) {
        switch(pizza){
            case BO: return new VN_HaiSanPizza();
        }
        return null;
    }
}
