package behavioral.observer.ca6_character;

public class DashBoard implements PlayerDataListener{
    PlayerData playerData;

    public DashBoard(PlayerData playerData) {
        this.playerData = playerData;
        this.playerData.addLister(this);
    }

    @Override
    public void listen(PlayerData player) {
        System.out.println("Thời gian: " + player.thoiGian);
        System.out.println("Số lượt chơi: " + player.countdown);
        System.out.println("Điểm: " + player.grade);
        System.out.println("----------------------");
    }
}
