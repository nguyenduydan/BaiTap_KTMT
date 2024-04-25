package creational.builder.a1_hoadon;

public class CT_HoaDon {
    String sanPham;
    int soLuong,donGia;
    float chietKhau;

    public CT_HoaDon(String sanPham, int soLuong, int donGia, float chietKhau) {
        this.sanPham = sanPham;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.chietKhau = chietKhau;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Sản phẩm: ").append(sanPham).append("\n")
                .append("Số lượng: ").append(soLuong).append("\n")
                .append("Đơn giá: ").append(donGia).append("\n")
                .append("Chiết khấu: ").append(chietKhau);
        return builder.toString();
    }

    public String getSanPham() {
        return sanPham;
    }

    public void setSanPham(String sanPham) {
        this.sanPham = sanPham;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public float getChietKhau() {
        return chietKhau;
    }

    public void setChietKhau(float chietKhau) {
        this.chietKhau = chietKhau;
    }
}
