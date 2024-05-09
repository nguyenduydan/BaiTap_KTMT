package behavioral.observer.streamdata_ca1;

import java.util.List;

public class MainCA1 {
    public static void main(String[] args) {
        MyStream<List<MonHoc>> stream = new MyStream<>();
        DataAccess dataAccess = new DataAccess(stream);
        MyClient client = new MyClient(stream);

        System.out.println("Lần 1: ");
        dataAccess.them(new MonHoc("1","Thể dục",3));
        System.out.println("Lần 2: ");
        dataAccess.them(new MonHoc("2","Code",3));
        dataAccess.xoa("2");
    }
}
