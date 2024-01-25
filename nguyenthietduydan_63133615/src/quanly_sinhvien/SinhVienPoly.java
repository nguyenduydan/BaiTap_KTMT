package quanly_sinhvien;

public abstract class SinhVienPoly {
    private String hoTen;
    private String nganh;
    public SinhVienPoly(String hoTen, String nganh){
        this.hoTen = hoTen;
        this.nganh = nganh;
    }

    public abstract double getDiem();

    public String getHocLuc(){
        if(getDiem() < 5){
            return "Yếu";
        }else if(getDiem() < 6.5){
            return "Trung bình";
        } else if (getDiem() < 7.5) {
            return "Khá";
        } else if (getDiem() < 9) {
            return "Giỏi";
        }else {
            return "Xuất sắc";
        }
    }

    public void xuat() {
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Ngành học: " + nganh);
        System.out.println("Điểm trung bình: " + getDiem());
        System.out.println("Học lực: " + getHocLuc());
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }
}
