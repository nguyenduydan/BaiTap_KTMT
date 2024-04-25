package structural.decorator.tokenize;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TachTu implements MyTokenize{
    String s;

    public TachTu(String s) {
        this.s = s;
    }

    @Override
    public List<String> tokenize() {
        String[] list = s.toLowerCase().split(" ");
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(list));
//        for(String s: list){
//            arrayList.add(s);
//        }
        return arrayList;
    }
}
