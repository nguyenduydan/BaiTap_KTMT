package structural.composite.qlmonhoc_B4;

import java.util.ArrayList;

public class KeHoachChung extends KeHoachHocTap{
    ArrayList<KeHoachHocTap> khht = new ArrayList<>();

    public KeHoachChung(String ten) {
        super(ten);
    }

    @Override
    public void Add(KeHoachHocTap k) {
        khht.add(k);
    }

    @Override
    public void Remove(KeHoachHocTap k) {
        khht.remove(k);
    }

    @Override
    public int getHocPhi() {
        int hocPhi =0;
        for(var i: khht){
            hocPhi += i.getHocPhi();
        }
        return hocPhi;
    }

    @Override
    public int getTongTC() {
        int stc = 0;
        for (var i: khht){
            stc += i.getTongTC();
        }
        return stc;
    }

    @Override
    public String getThongTin() {
        StringBuilder builder = new StringBuilder();
        builder.append("Tên kì: ").append(ten).append("\n")
                .append("Tổng tín chỉ: ").append(getTongTC()).append("\n")
                .append("Tổng học phí: ").append(getHocPhi()).append("\n");
        builder.append("\t\t--Các môn bao gồm: --\n");
        for(var i: khht){
            builder.append(i.getThongTin()).append("\n");
        }
        return builder.toString();
    }
}
