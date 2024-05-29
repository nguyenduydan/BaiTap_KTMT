package behavioral.chain_of_responsibility.xoso_cb4;

import java.util.ArrayList;
import java.util.Arrays;

public class MainCB4 {
    public static void main(String[] args) {
        GiaiThuong giaiThuongDB = new GiaiThongThuong("Đặc biệt",new ArrayList(Arrays.asList("343423")));
        GiaiThuong giaiThuong1 = new GiaiThongThuong("g1",new ArrayList(Arrays.asList("343343","453545")));
        GiaiThuong giaiThuong2 = new GiaiThongThuong("g2",new ArrayList(Arrays.asList("321245","234544","342423")));
        GiaiThuong giaiThuong3 = new GiaiThongThuong("g3",new ArrayList(Arrays.asList("34565","43554","34523","87543")));
        GiaiThuong giaiThuong4 = new GiaiThapNhat("g4",new ArrayList(Arrays.asList("3244","5474","8347","9236","7264")));
        GiaiThuong kk = new GiaiKhuyenKhich("Giải khuyến khích",new ArrayList(Arrays.asList("343423")));

        giaiThuongDB.giaiKeTiep(kk).giaiKeTiep(giaiThuong1)
                .giaiKeTiep(giaiThuong2)
                .giaiKeTiep(giaiThuong3)
                .giaiKeTiep(giaiThuong4);

        giaiThuongDB.doVeSo("543423");
    }
}
