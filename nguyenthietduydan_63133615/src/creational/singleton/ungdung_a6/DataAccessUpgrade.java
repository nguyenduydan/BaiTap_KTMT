package creational.singleton.ungdung_a6;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

public class DataAccessUpgrade {
    private static Dictionary<String,DataAccessUpgrade> instance = new Hashtable<>();
    List<SanPham> list = new ArrayList<>();
    protected DataAccessUpgrade(){}
    public static DataAccessUpgrade getInstance(String tag){
        if(instance.get(tag) == null){
            DataAccessUpgrade dataAccessUpgrade = new DataAccessUpgrade();
            instance.put(tag,dataAccessUpgrade);
        }
        return instance.get(tag);
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
        for(var i : list)
            System.out.println(i.toString());
    }
}
