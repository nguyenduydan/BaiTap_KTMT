package behavioral.Stratery.cc3_giohang;

public class KhuyenMaiToiDa implements IKhuyenMaiGiamGia{
    @Override
    public float GiamGiaTien(float tongDonHang, float giaTriGiam) {
        return tongDonHang - giaTriGiam;
    }
}
