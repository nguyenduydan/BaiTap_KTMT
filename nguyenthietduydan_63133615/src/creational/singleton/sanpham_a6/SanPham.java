package creational.singleton.sanpham_a6;

public class SanPham {
    String maSP, tenSP;
    int donGia, soLuong;

    public SanPham(String maSP, String tenSP, int donGia, int soLuong) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Ma san pham: ").append(maSP).append("\n");
        builder.append("Ten san pham: ").append(tenSP).append("\n");
        builder.append("So luong: ").append(soLuong).append("\n");
        builder.append("Don gia: ").append(donGia).append("\n");
        return builder.toString();
    }
    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
}
