package creational.singleton.ungdung_a6;

public class UI {
    public void add(String maSP, String tenSP, int soluong, int dongia){
        DataAccess.getInstance().addSP(new SanPham(maSP, tenSP, soluong, dongia));
    }
    public void display(){
        DataAccess.getInstance().printSP();
    }
}
