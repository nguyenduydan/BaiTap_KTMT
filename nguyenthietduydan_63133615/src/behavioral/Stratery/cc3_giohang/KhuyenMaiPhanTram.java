package behavioral.Stratery.cc3_giohang;

public class KhuyenMaiPhanTram implements IKhuyenMaiGiamGia{
    @Override
    public float GiamGiaTien(float tongDonHang, float giaTriGiam) {
        return tongDonHang - (tongDonHang*giaTriGiam/100);
    }
}
