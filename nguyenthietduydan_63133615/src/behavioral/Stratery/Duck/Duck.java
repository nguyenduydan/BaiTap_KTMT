package behavioral.Stratery.Duck;

public abstract class Duck {
    IFlyable flyable;
    IQuackable quackable;

    public abstract void display();

    void performQuack(){
        System.out.println(quackable.quack());
    }
    void performFly(){
        System.out.println(flyable.fly());
    }

    void swim (){
        System.out.println("Mình biết bơi nhá!!!");
    }
    public void setFlyable(IFlyable flyable) {
        this.flyable = flyable;
    }

    public void setQuackable(IQuackable quackable) {
        this.quackable = quackable;
    }
}
