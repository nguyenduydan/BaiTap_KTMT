package creational.singleton.vidu;

import creational.singleton.MySingleton;

public class MainMySingleton {
    public static void main(String[] args) {
        MySingleton s1 = MySingleton.getInstance();
        MySingleton s2 = MySingleton.getInstance();
        s1.inCount();//1
        s2.inCount();//2
        s2.inCount();//3
        s1.inCount();//4
    }
}
