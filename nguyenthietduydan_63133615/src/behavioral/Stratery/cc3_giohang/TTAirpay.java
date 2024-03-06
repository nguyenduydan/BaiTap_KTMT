package behavioral.Stratery.cc3_giohang;

public class TTAirpay implements IKhuyenMaiTheoHTTT{
    @Override
    public float HinhThucTT(float tongDonHang) {
        if(tongDonHang >= 1000000F) return tongDonHang*3/100;
        return 0;
    }
}
