package behavioral.observer.ca2;

public class MainCA2 {
    public static void main(String[] args) {
        Activity activity = new Activity();
        MyButton btn1 = new MyButton(activity);
        btn1.click();
        btn1.click();
        btn1.click();

    }
}
