package creational.singleton.ungdung_a6;

public class SanPham {
    String maSP,tenSP;
    int soluong,dongia;

    public SanPham(String maSP, String tenSP, int soluong, int dongia) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.soluong = soluong;
        this.dongia = dongia;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Ma san pham:").append(maSP).append("\n");
        builder.append("Ten san pham:").append(tenSP).append("\n");
        builder.append("So luong:").append(soluong).append("\n");
        builder.append("Dongia:").append(dongia).append("\n");
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

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public int getDongia() {
        return dongia;
    }

    public void setDongia(int dongia) {
        this.dongia = dongia;
    }
}
