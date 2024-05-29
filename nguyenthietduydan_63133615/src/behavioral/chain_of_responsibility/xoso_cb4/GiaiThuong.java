package behavioral.chain_of_responsibility.xoso_cb4;

import java.util.List;

public abstract class GiaiThuong {
    public String tenGiai;
    List<String> daySoTrungThuong;

    public GiaiThuong(String tenGiai, List<String> daySoTrungThuong) {
        this.tenGiai = tenGiai;
        this.daySoTrungThuong = daySoTrungThuong;
    }

    public abstract void doVeSo(String veSo);
    public abstract GiaiThuong giaiKeTiep(GiaiThuong keTiep);

}
