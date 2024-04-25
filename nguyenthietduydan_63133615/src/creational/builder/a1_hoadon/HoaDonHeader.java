package creational.builder.a1_hoadon;

public class HoaDonHeader {
    String maHD, tenKH, ngayBan;

    public HoaDonHeader(String maHD, String tenKH, String ngayBan) {
        this.maHD = maHD;
        this.tenKH = tenKH;
        this.ngayBan = ngayBan;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Mã hóa đơn: ").append(maHD).append("\n")
                .append("Tên khách hàng: ").append(tenKH).append("\n")
                .append("Ngày bán: ").append(ngayBan);
        return builder.toString();

    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getNgayBan() {
        return ngayBan;
    }

    public void setNgayBan(String ngayBan) {
        this.ngayBan = ngayBan;
    }
}
