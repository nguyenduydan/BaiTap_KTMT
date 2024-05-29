package behavioral.chain_of_responsibility.xoso_cb4;

import java.util.List;

public class GiaiThapNhat extends GiaiThuong{

    public GiaiThapNhat(String tenGiai, List<String> daySoTrungThuong) {
        super(tenGiai, daySoTrungThuong);
    }

    @Override
    public void doVeSo(String veSo) {
        for (var s: daySoTrungThuong){
            if(veSo.endsWith(s)){
                System.out.println("Bạn đã trúng giải: "+tenGiai);
                return;
            }
        }
        System.out.println("Chúc bạn may mắn lần sau!");
    }

    @Override
    public GiaiThuong giaiKeTiep(GiaiThuong keTiep) {
        return null;
    }
}
