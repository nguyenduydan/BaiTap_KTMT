package behavioral.observer.ca6_character;

public class MainCA6 {
    public static void main(String[] args) {
        PlayerData player1 = new PlayerData(20,2,10);
        DashBoard dashBoard = new DashBoard(player1);

        player1.setCountdown(3);
        player1.setGrade(12);
        player1.setThoiGian(5);
        player1.setCountdown(1);
    }
}
