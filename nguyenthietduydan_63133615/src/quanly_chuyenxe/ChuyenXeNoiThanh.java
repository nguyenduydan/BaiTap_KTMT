package quanly_chuyenxe;

public class ChuyenXeNoiThanh extends ChuyenXe {
    private int soTuyen;
    private int soKMDiDuoc;

    public ChuyenXeNoiThanh(String maSo, String hoTenTX, int soXe, double doanhThu, int soTuyen, int soKMDiDuoc) {
        super(maSo, hoTenTX, soXe, doanhThu);
        this.soTuyen = soTuyen;
        this.soKMDiDuoc = soKMDiDuoc;
    }
    @Override
    public void getThongTin(){
       super.getThongTin();
        System.out.println("Số tuyến: "+getSoTuyen());
        System.out.println("Số KM đi được: "+getSoKMDiDuoc());
    }

    public int getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(int soTuyen) {
        this.soTuyen = soTuyen;
    }

    public int getSoKMDiDuoc() {
        return soKMDiDuoc;
    }

    public void setSoKMDiDuoc(int soKMDiDuoc) {
        this.soKMDiDuoc = soKMDiDuoc;
    }
}
