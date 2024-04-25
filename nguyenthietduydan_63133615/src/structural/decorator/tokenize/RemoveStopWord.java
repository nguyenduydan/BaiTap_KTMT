package structural.decorator.tokenize;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveStopWord extends TokenizeDecorator{
    List<String> stopWords;
    public RemoveStopWord(MyTokenize token) {
        super(token);
        String[] arr = {"và","mà","là","hoặc","thì"};
        stopWords = new ArrayList<>(Arrays.asList(arr));
    }

    @Override
    public List<String> tokenize() {
        List<String> list = token.tokenize();//Lay chuoi
        list.removeAll(stopWords);
        return list;
    }
}
