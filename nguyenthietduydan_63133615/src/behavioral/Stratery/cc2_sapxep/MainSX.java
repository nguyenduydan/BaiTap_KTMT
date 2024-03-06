package behavioral.Stratery.cc2_sapxep;

public class MainSX {
    public static void main(String[] args) {
        QLSV qlsv = new QLSV();
        //qlsv.setComparator((o1, o2) -> )
        SinhVien sv1 = new SinhVien("Lu Vu Phuc" ,"2-2-2023",8.6F);
        SinhVien sv2 = new SinhVien("Amdsadsad" ,"3-12-2023",8.6F);
        SinhVien sv3 = new SinhVien("Hdsadsadas" ,"3-12-2023",8.6F);

        qlsv.themSinhVien(sv1);
        qlsv.themSinhVien(sv2);
        qlsv.themSinhVien(sv3);
        qlsv.setComparator(new SoSanhTheoDiem2()).sapXep3();
        qlsv.INDS();
    }
}
