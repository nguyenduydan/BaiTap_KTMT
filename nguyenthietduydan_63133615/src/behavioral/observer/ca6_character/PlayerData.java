package behavioral.observer.ca6_character;

public class PlayerData {
    int thoiGian, countdown, grade;
    PlayerDataListener listener;

    public PlayerData(int thoiGian, int countdown, int grade) {
        this.thoiGian = thoiGian;
        this.countdown = countdown;
        this.grade = grade;

    }
    public void addLister(PlayerDataListener listener){
        this.listener = listener;
    }

    public void setThoiGian(int thoiGian) {
        this.thoiGian = thoiGian;
        listener.listen(this);
    }

    public void setCountdown(int countdown) {
        this.countdown = countdown;
        listener.listen(this);
    }

    public void setGrade(int grade) {
        this.grade = grade;
        listener.listen(this);
    }
}
