package creational.builder.kt_tourdulich;

public class DS_DiaDiem {
    String tenDiaDiem, diaChi, thoiGianThamQuan;

    public DS_DiaDiem(String tenDiaDiem, String diaChi, String thoiGianThamQuan) {
        this.tenDiaDiem = tenDiaDiem;
        this.diaChi = diaChi;
        this.thoiGianThamQuan = thoiGianThamQuan;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("\n").append(tenDiaDiem).append("\n")
                .append(diaChi).append("\n")
                .append(thoiGianThamQuan);
        return builder.toString();
    }

    public String getTenDiaDiem() {
        return tenDiaDiem;
    }

    public void setTenDiaDiem(String tenDiaDiem) {
        this.tenDiaDiem = tenDiaDiem;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getThoiGianThamQuan() {
        return thoiGianThamQuan;
    }

    public void setThoiGianThamQuan(String thoiGianThamQuan) {
        this.thoiGianThamQuan = thoiGianThamQuan;
    }
}
