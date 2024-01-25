package quanly_nhanvien;

public class NhanVien {
    private String ten;
    private int tuoi;
    private String diaChi;
    private double tienLuong;
    private int tongGioLam;

    public NhanVien() {
        ten = "Nguyen Thiet Duy Dan";
        tuoi = 20;
        diaChi = "CC Binh Phu II, Nha Trang, KH";
        tienLuong = 200000;
        tongGioLam = 200;
    }

    public NhanVien(String ten, int tuoi, String diaChi, double tienLuong, int tongGioLam) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.tienLuong = tienLuong;
        this.tongGioLam = tongGioLam;
    }

    public String getThongTin() {
        return "Ten: " + ten +
                "\nTuoi: " + tuoi +
                "\nDia chi: " + diaChi +
                "\nTien luong: " + tienLuong +
                "\nTong so gio lam: " + tongGioLam;
    }

    public double tinhThuong() {
        if (tongGioLam >= 200) {
            return tienLuong * 20 / 100;
        } else if (tongGioLam >= 100) {
            return tienLuong * 10 / 100;
        } else {
            return 0;
        }
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setTienLuong(double tienLuong) {
        this.tienLuong = tienLuong;
    }

    public void setTongGioLam(int tongGioLam) {
        this.tongGioLam = tongGioLam;
    }

    public String getTen() {
        return ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public double getTienLuong() {
        return tienLuong;
    }

    public int getTongGioLam() {
        return tongGioLam;
    }
}
