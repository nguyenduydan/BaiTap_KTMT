package structural.decorator.tokenize;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemovePunctuation extends TokenizeDecorator{
    public RemovePunctuation(MyTokenize token) {
        super(token);
    }

    @Override
    public List<String> tokenize() {
        List<String> list = token.tokenize();//Lay chuoi
//        List<String> arr =  new ArrayList<>();
        list.replaceAll(s -> s.replaceAll("[\\p{Punct}]",""));
//        for (String s: list){
//           String t = s.replaceAll("[\\p{Punct}]","");
//            arr.add(t);
//        }
        return list;
    }
}
