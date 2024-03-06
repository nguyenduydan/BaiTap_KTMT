package behavioral.Stratery.cc3_giohang;

public class MatHang {


    String tenMatHang;
    int soLuong;
    float donGia;

    public MatHang(String tenMatHang, int soLuong, float donGia) {
        this.tenMatHang = tenMatHang;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        return "Ten mat hang:" + tenMatHang + "\n" +
                "So luong:" + soLuong + "\n" +
                "Don gia:" + donGia + "\n";
    }

    public String getTenMatHang() {
        return tenMatHang;
    }

    public void setTenMatHang(String tenMatHang) {
        this.tenMatHang = tenMatHang;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }
}
