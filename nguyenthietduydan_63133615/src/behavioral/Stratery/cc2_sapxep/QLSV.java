package behavioral.Stratery.cc2_sapxep;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class QLSV{


    ISoSanh soSanh;

    public QLSV setComparator(Comparator comparator) {
        this.comparator = comparator;
        return this;
    }

    Comparator<SinhVien> comparator;
    List<SinhVien> ds =  new ArrayList<>();
    public void themSinhVien(SinhVien sinhVien){
        for(SinhVien sv :ds)
            if(sv.getHoTen().equals(sinhVien.getHoTen()))
                return;
        ds.add(sinhVien);
    }

    public void sapXep(){
        for(int i =0;i<ds.size()-1;i++){
            for (int j =0;j<ds.size()-1;j++){
                if(soSanh.soSanh(ds.get(i),ds.get(j)) > 0){
                    SinhVien s = ds.get(i);
                    ds.set(i,ds.get(j));
                    ds.set(j,s);
                }
            }
        }
    }
    public void sapXep2(){
        ds.sort((o1, o2) -> soSanh.soSanh(o1,o2));
    }
    public void sapXep3(){
        ds.sort(comparator);
    }
    public void INDS(){
        for(SinhVien sv : ds){
            System.out.println(sv.toString());
        }
    }

    public void setSoSanh(ISoSanh soSanh) {
        this.soSanh = soSanh;
    }
}
