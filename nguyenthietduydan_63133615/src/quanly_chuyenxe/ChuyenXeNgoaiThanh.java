package quanly_chuyenxe;

public class ChuyenXeNgoaiThanh extends ChuyenXe{
    private String noiDen;
    private int soNgayDiDuoc;

    public ChuyenXeNgoaiThanh(String maSo, String hoTenTX, int soXe, double doanhThu, String noiDen, int soNgayDiDuoc) {
        super(maSo, hoTenTX, soXe, doanhThu);
        this.noiDen = noiDen;
        this.soNgayDiDuoc = soNgayDiDuoc;
    }
    @Override
    public void getThongTin(){
        super.getThongTin();
        System.out.println("Nơi đến: "+getNoiDen());
        System.out.println("Số ngày đi được: "+getSoNgayDiDuoc());

    }
    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public int getSoNgayDiDuoc() {
        return soNgayDiDuoc;
    }

    public void setSoNgayDiDuoc(int soNgayDiDuoc) {
        this.soNgayDiDuoc = soNgayDiDuoc;
    }

}
