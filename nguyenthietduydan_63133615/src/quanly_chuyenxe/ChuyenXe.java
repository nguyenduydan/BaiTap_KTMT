package quanly_chuyenxe;

public abstract class ChuyenXe {
    private String maSo;
    private String hoTenTX;
    private int soXe;
    private  double doanhThu;

    public ChuyenXe(String maSo, String hoTenTX, int soXe, double doanhThu) {
        this.maSo = maSo;
        this.hoTenTX = hoTenTX;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }

    public void getThongTin(){
        System.out.println("Mã số: "+getMaSo());
        System.out.println("Họ và tên tài xế: "+getHoTenTX());
        System.out.println("Số xe: "+getSoXe());
        System.out.println("Doanh thu: "+getDoanhThu());
    };

    public String getMaSo() {
        return maSo;
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }

    public String getHoTenTX() {
        return hoTenTX;
    }

    public void setHoTenTX(String hoTenTX) {
        this.hoTenTX = hoTenTX;
    }

    public int getSoXe() {
        return soXe;
    }

    public void setSoXe(int soXe) {
        this.soXe = soXe;
    }

    public double getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(double doanhThu) {
        this.doanhThu = doanhThu;
    }
}
