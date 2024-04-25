package creational.singleton.sanpham_a6;

public class UI1 {

    public void add(SanPham sp, String tag){
        DataAccessUpgrade.getInstance(tag).addSP(sp);
    }
    public void remove(String maSP){
        DataAccess.getInstance().removeSP(maSP);
    }
    public void display(String tag){
        DataAccessUpgrade.getInstance(tag).printSP();
    }
}
