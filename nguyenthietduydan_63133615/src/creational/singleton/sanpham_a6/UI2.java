package creational.singleton.sanpham_a6;

public class UI2 {
    public void add(SanPham sp){
        DataAccess.getInstance().addSP(sp);
    }
    public void remove(String maSP){
        DataAccess.getInstance().removeSP(maSP);
    }
    public void display(){
        DataAccess.getInstance().printSP();
    }
}
