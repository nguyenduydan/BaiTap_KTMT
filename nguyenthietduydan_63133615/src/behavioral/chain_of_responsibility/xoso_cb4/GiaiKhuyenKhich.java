package behavioral.chain_of_responsibility.xoso_cb4;

import java.util.List;

public class GiaiKhuyenKhich extends GiaiThuong{
    GiaiThuong giaiThuongKeTiep;

    public GiaiKhuyenKhich(String tenGiai, List<String> daySoTrungThuong) {
        super(tenGiai, daySoTrungThuong);
    }

    @Override
    public void doVeSo(String veSo) {
        for(String giaiThuong: daySoTrungThuong){
            String sub = veSo.substring(veSo.length() - giaiThuong.length());
            int count = 0;
            for (int i = 0; i < sub.length(); i++) {
                if (sub.charAt(i) == giaiThuong.charAt(i))
                    count++;
            }
            if (count == giaiThuong.length()-1)
                System.out.println("\n>> Bạn đã trúng giải: "+tenGiai+" <<");
        }
        giaiThuongKeTiep.doVeSo(veSo);
    }

    @Override
    public GiaiThuong giaiKeTiep(GiaiThuong keTiep) {
        giaiThuongKeTiep = keTiep;
        return giaiThuongKeTiep;
    }
}
