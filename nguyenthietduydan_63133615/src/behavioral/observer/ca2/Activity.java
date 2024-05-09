package behavioral.observer.ca2;

public class Activity implements ButtonListener{
    int count=0;

    @Override
    public void onClick() {
        count++;
        System.out.println("Bạn đã click lần thứ "+count);
    }
}
