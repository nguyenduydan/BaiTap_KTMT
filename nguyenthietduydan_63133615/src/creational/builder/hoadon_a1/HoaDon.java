package creational.builder.hoadon_a1;

import java.util.ArrayList;
import java.util.List;

public class HoaDon {
    private HoaDonHeader hoaDonHeader;
    private List<ChiTietHD> chiTietHDList;

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(hoaDonHeader.toString());
        builder.append("Chi tiet hoa don:\n");
        for (ChiTietHD i: chiTietHDList)
            builder.append(chiTietHDList.toString()).append(" ");
        return builder.toString();
    }

    public HoaDon(Builder b){
         hoaDonHeader = b.hoaDonHeader;
         chiTietHDList = b.chiTietHDList;
    }

    public static class Builder{
        private HoaDonHeader hoaDonHeader;
        private List<ChiTietHD> chiTietHDList  = new ArrayList<>();
        public Builder setHoaDonHeader(String maHoaDon, String ngayBan, String tenKH){
            this.hoaDonHeader = new HoaDonHeader(maHoaDon,ngayBan,tenKH);
            return this;
        }
        public Builder buildHoaDonHeader(HoaDonHeader hoaDonHeader){
            this.hoaDonHeader = hoaDonHeader;
            return this;
        }
        public Builder addCTHD(String sanPham, int soLuong, int donGia, float chietKhau){
            chiTietHDList.add(new ChiTietHD(sanPham,soLuong,donGia,chietKhau));
            return this;
        }
        public HoaDon build(){return new HoaDon(this);}
    }
}