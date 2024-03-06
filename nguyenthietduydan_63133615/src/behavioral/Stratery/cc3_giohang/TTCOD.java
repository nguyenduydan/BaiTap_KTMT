package behavioral.Stratery.cc3_giohang;

public class TTCOD implements IKhuyenMaiTheoHTTT{
    @Override
    public float HinhThucTT(float tongDonHang) {
        if(tongDonHang >= 2000000F) return tongDonHang*2/100;
        return 0;
    }
}
