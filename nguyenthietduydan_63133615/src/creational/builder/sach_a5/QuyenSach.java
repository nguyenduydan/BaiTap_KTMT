package creational.builder.sach_a5;

import java.util.ArrayList;
import java.util.List;

public class QuyenSach {
    String tuaDe, tacGia;
    int soTrang;
    List<String> dsChuong;
    public QuyenSach(Builder b){
        tuaDe = b.tuaDe;
        tacGia = b.tacGia;
        soTrang = b.soTrang;
        dsChuong = b.dsChuong;
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(tuaDe).append("\n").append(tacGia).append("\n").append(soTrang).append("\n");
        for(String i : dsChuong)
            builder.append(i).append("  ");
        return builder.toString();
    }
    protected static class Builder{
        private String tuaDe, tacGia;
        private int soTrang;
        List<String> dsChuong= new ArrayList<>();
        public Builder buildtuaDe(String tuaDe){
            this.tuaDe = tuaDe;
            return this;
        }
        public Builder buildtacGia(String tacGia){
            this.tacGia = tacGia;
            return this;
        }
        public Builder buildsoTrang(int soTrang){
            this.soTrang = soTrang;
            return this;
        }
        public Builder builddanhSachChuong(String dsChuong){
            this.dsChuong.add(dsChuong);
            return this;
        }
        public QuyenSach build(){return new QuyenSach(this);}
    }
}
