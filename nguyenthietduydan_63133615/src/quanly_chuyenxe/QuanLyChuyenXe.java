package quanly_chuyenxe;

import java.util.ArrayList;
import java.util.List;

public class QuanLyChuyenXe{
    private List<ChuyenXe> dsChuyenXe = new ArrayList<>();

    public void them(ChuyenXe cx){

        dsChuyenXe.add(cx);
    }

    public void xuat(){
        int count=1;
        for(ChuyenXe cx: dsChuyenXe){
            System.out.println("STT: "+count);
            cx.getThongTin();
            count++;
        }
    }

    public double tinhDoanhThuNoiThanh(){
        double tong = 0;
        for(ChuyenXe cx: dsChuyenXe){
            if(cx instanceof ChuyenXeNoiThanh){
                tong += cx.getDoanhThu();
            }
        }
        return tong;
    }
    public double tinhDoanhThuNgoaiThanh(){
        double tong = 0;
        for(ChuyenXe cx: dsChuyenXe){
            if(cx instanceof ChuyenXeNgoaiThanh){
                tong += cx.getDoanhThu();
            }
        }
        return tong;
    }
    public double tongDoanhThu(){
        return tinhDoanhThuNgoaiThanh()+tinhDoanhThuNoiThanh();

    }
}
