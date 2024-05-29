package behavioral.chain_of_responsibility.xoso_cb4;

import java.util.List;

public class GiaiThongThuong extends GiaiThuong{
    GiaiThuong giaiKeTiep;

    public GiaiThongThuong(String tenGiai, List<String> daySoTrungThuong) {
        super(tenGiai, daySoTrungThuong);
    }

    @Override
    public void doVeSo(String veSo) {
        for (var s: daySoTrungThuong){
            if(veSo.endsWith(s)){
                System.out.println("\n>> Bạn đã trúng giải: "+tenGiai+" <<");
                return;
            }
        }
        giaiKeTiep.doVeSo(veSo);
    }

    @Override
    public GiaiThuong giaiKeTiep(GiaiThuong keTiep) {
        this.giaiKeTiep = keTiep;
        return this.giaiKeTiep;
    }
}
