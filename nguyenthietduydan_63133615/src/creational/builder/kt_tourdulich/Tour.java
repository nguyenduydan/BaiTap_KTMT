package creational.builder.kt_tourdulich;

import java.util.ArrayList;
import java.util.List;

public class Tour {
    String tenTour, thoiGian;
    int giaTour;

    private List<DS_DiaDiem> dsDiaDiems;

    public Tour (Builder b){
        this.tenTour = b.tenTour;
        this.thoiGian = b.thoiGian;
        this.giaTour = b.giaTour;
        this.dsDiaDiems = b.dsDiaDiems;
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Thông tin tour").append("\n");
        builder.append("Tên tour: ").append(tenTour).append("\n")
                .append("Thời gian: ").append(thoiGian).append("\n")
                .append("Giá tour: ").append(giaTour);
       builder.append("\n").append("Danh sách địa điểm").append("\n");
       for(DS_DiaDiem dsDiaDiem: dsDiaDiems){
           builder.append(dsDiaDiem.toString());
       }
        return builder.toString();
    }

    protected static class Builder{
        private String tenTour, thoiGian;
        private int giaTour;
        private List<DS_DiaDiem> dsDiaDiems = new ArrayList<>();

        public Builder buildTenTour(String tenTour){
            this.tenTour =tenTour;
            return this;
        }
        public Builder buildThoiGian(String thoiGian){
            this.thoiGian =thoiGian;
            return this;
        }
        public Builder buildGiaTour(int giaTour){
            this.giaTour =giaTour;
            return this;
        }
        public Builder buildDSDiaDiem(DS_DiaDiem dsDiaDiem){
            this.dsDiaDiems.add(dsDiaDiem);
            return this;
        }

        public Tour build(){return new Tour(this);}
    }
}
