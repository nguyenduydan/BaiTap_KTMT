package creational.singleton.ungdung_a6;

public class UI_Upgrade {
    String tag;

    public UI_Upgrade(String tag) {
        this.tag = tag;
    }
    public void add(String maSP, String tenSP, int soluong, int dongia){
        DataAccessUpgrade.getInstance(tag).addSP(new SanPham(maSP, tenSP, soluong, dongia));
    }
    public void display(){
        DataAccessUpgrade.getInstance(tag).printSP();
    }
}
