package behavioral.observer.ca2;

public class MyButton {
    ButtonListener activity;

    public MyButton(ButtonListener activity) {
        this.activity = activity;
    }

    void click(){
        activity.onClick();
    }

}
