package creational.singleton.sanpham_a6;

import java.util.ArrayList;
import java.util.List;

public class DataAccess {
    private static DataAccess instance;
    List<SanPham> list = new ArrayList<>();

    protected DataAccess(){}

    public static DataAccess getInstance(){
        if(instance == null)
            instance = new DataAccess();
        return instance;
    }

    public void addSP(SanPham sp){
        list.add(sp);
    }

    public void removeSP(String maSP){
        for (var v: list){
            if(v.getMaSP().equals(maSP)){
                list.remove(v);
                return;
            }
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
