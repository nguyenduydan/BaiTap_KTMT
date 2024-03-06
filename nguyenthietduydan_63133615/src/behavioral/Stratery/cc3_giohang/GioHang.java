package behavioral.Stratery.cc3_giohang;

import java.util.ArrayList;
import java.util.List;

public class GioHang {

    IKhuyenMaiTheoHTTT kmhttt;



    IKhuyenMaiGiamGia kmgg;
    List<MatHang> ds = new ArrayList<>();
    public void themMatHang(MatHang matHang) {
        boolean flag = false;
        for (MatHang mh : ds) {
            if (mh.getTenMatHang().equals(matHang.getTenMatHang())) {
                mh.soLuong += matHang.soLuong;
                flag = true;
                break;
            }
        }
        if (!flag)
            ds.add(matHang);
    }

    public void setKmgg(IKhuyenMaiGiamGia kmgg) {
        this.kmgg = kmgg;
    }
    public void setKmhttt(IKhuyenMaiTheoHTTT kmhttt) {
        this.kmhttt = kmhttt;
    }
    public float TongDonHang(){
        float tong = 0;
        for(MatHang mh : ds)
            tong += mh.getDonGia()*mh.getSoLuong();
        return tong;
    }
    public float giamGiaHTTT(IKhuyenMaiTheoHTTT kmhttt){
        return this.TongDonHang()- kmhttt.HinhThucTT(TongDonHang());
    }
    public float giamGiaHTKM(){
        return this.kmgg.GiamGiaTien(TongDonHang(),2);
    }
}
