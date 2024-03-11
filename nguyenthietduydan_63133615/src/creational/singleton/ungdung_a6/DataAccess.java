package creational.singleton.ungdung_a6;



import java.util.ArrayList;
import java.util.List;

public class DataAccess {
    private static DataAccess instance;
    List<SanPham> list = new ArrayList<>();
    protected DataAccess(){

    }
    public static DataAccess getInstance(){
        if(instance == null)
            instance = new DataAccess();
        return instance;
    }
    public void addSP(SanPham s){
        list.add(s);
    }
    public void deleteSP(String maSP){
        for (var s: list)
            if(s.getMaSP().equals(maSP)){
                list.remove(s);
                return;
            }
    }
    public void updateSP(SanPham s){
        for (int i = 0;i<list.size();i++)
            if(s.getMaSP().equals(list.get(i).getMaSP())){
                list.set(i,s);
                return;
            }
    }
    public void printSP(){
        for(SanPham i : list)
            System.out.println(i.toString());
    }
}
