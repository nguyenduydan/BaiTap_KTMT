package creational.builder.a1_hoadon;

import java.util.ArrayList;
import java.util.List;

public class HoaDon {
    private HoaDonHeader hoaDonHeader;
    private List<CT_HoaDon> ctHoaDonList;

    protected HoaDon(Builder b){
        this.hoaDonHeader = b.hoaDonHeader;
        this.ctHoaDonList =b.ctHoaDonList;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(hoaDonHeader.toString()).append("\n");
        builder.append("Chi tiet hoa don:\n");
        for (CT_HoaDon i: ctHoaDonList)
            builder.append(ctHoaDonList.toString());
        return builder.toString();
    }

    public static class Builder{
        private HoaDonHeader hoaDonHeader;
        private List<CT_HoaDon> ctHoaDonList = new ArrayList<>();

        public Builder setHoaDonHeader(String maHoaDon, String ngayBan, String tenKH){
            this.hoaDonHeader = new HoaDonHeader(maHoaDon,ngayBan,tenKH);
            return this;
        }

        public Builder buildHoaDonHeader(HoaDonHeader hoaDonHeader){
            this.hoaDonHeader = hoaDonHeader;
            return this;
        }
        public Builder addCTHD(String sanPham, int soLuong, int donGia, float chietKhau){
            ctHoaDonList.add(new CT_HoaDon(sanPham,soLuong,donGia,chietKhau));
            return this;
        }
        public HoaDon build(){return new HoaDon(this);}
    }
}
