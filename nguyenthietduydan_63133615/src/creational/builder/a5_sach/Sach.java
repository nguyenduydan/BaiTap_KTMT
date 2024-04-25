package creational.builder.a5_sach;

import java.util.ArrayList;
import java.util.List;

public class Sach {
     String tuaDe,tacGia;
     int soTrang;
     List<String> dsCacChuong;

    public Sach(Builder b){
        this.tuaDe = b.tuaDe;
        this.tacGia = b.tacGia;
        this.soTrang = b.soTrang;
        this.dsCacChuong = b.dsCacChuong;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Tựa đề: ").append(tuaDe).append("\n")
                .append("Tên tác giả: ").append(tacGia).append("\n")
                .append("Số trang: ").append(soTrang).append("\n")
                .append("Danh sách chương: ").append("\n");
        int soChuong = 1;
        for(String i : dsCacChuong) {
            builder.append("Chương ").append(soChuong++).append(": ")
                    .append(i).append("\n");
        }
        return builder.toString();
    }

    protected static class Builder{
        private String tuaDe, tacGia;
        private int soTrang;

        private List<String> dsCacChuong = new ArrayList<>();

        public Builder buildTuDe(String tuaDe) {
            this.tuaDe = tuaDe;
            return this;
        }
        public Builder buildTacGia(String tacGia) {
            this.tacGia = tacGia;
            return this;
        }
        public Builder buildSoTrang(int soTrang) {
            this.soTrang = soTrang;
            return this;
        }
        public Builder buildDSChuong(String dsCacChuong) {
            this.dsCacChuong.add(dsCacChuong);
            return this;
        }
        public Sach build(){return new Sach(this);}
    }
}
