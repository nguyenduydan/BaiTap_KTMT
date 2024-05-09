package behavioral.iterator.vidu;

import  java.util.Iterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainIterator {
    public static void duyetMonHoc (Iterator<MonHoc> iterator){
        //cach1
        while(iterator.hasNext()){
            MonHoc monHoc = iterator.next();
            System.out.println(monHoc.toString());
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        System.out.println("Cach 1");
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println(">>>>>>>>Cach 2<<<<<<<<");
        Iterator<Integer> iterator1 = list.iterator();
        iterator1.forEachRemaining(integer -> {
            System.out.println(integer);
        });

        List<MonHoc> mhs = new ArrayList<>(Arrays.asList(
                new MonHoc("Thể dục", 1),
                new MonHoc("Tiếng anh", 3),
                new MonHoc("Công nghệ phần mềm", 3),
                new MonHoc("Kiến trúc phần mềm", 3)
        ));
        duyetMonHoc(mhs.iterator()); // muốn duyệt phải có iterator
    }
}
