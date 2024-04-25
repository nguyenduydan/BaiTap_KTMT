package creational.builder.kt_tourdulich;

public class Main {
    public static void main(String[] args) {
        DS_DiaDiem diadiem = new DS_DiaDiem("Riot","Mỹ Tho","99 năm");
        DS_DiaDiem diadiem1 = new DS_DiaDiem("Riot1","Mỹ Tho","99 năm");
        DS_DiaDiem diadiem2 = new DS_DiaDiem("Riot2","Mỹ Tho","99 năm");
        DS_DiaDiem diadiem3 = new DS_DiaDiem("Riot3","Mỹ Tho","99 năm");

        Tour t = new Tour.Builder()
                .buildTenTour("Phúc đi cảnh")
                .buildThoiGian("99 năm")
                .buildGiaTour(9999)
                .buildDSDiaDiem(diadiem)
                .buildDSDiaDiem(diadiem1)
                .build();
        Tour t1 = new Tour.Builder()
                .buildTenTour("Dan đi cảnh")
                .buildThoiGian("99 năm")
                .buildGiaTour(9999)
                .buildDSDiaDiem(diadiem)
                .buildDSDiaDiem(diadiem2)
                .build();
        System.out.println(t.toString());

        QL_Tour tour = new QL_Tour("diadiem");
        QL_Tour tour2 = new QL_Tour("diadiem");
        tour.add(t);
        tour2.add(t1);
        tour.display();
    }
}
