package structural.decorator.tokenize;

public class MainToken_B2 {
    public static void main(String[] args) {
        String s = "Xin chào, mọi người và, thế, giới";

        MyTokenize myTokenize = new TachTu(s);
        System.out.println(myTokenize.tokenize());

        myTokenize = new RemovePunctuation(myTokenize);
        System.out.println(myTokenize.tokenize());

        myTokenize = new RemoveStopWord(myTokenize);
        System.out.println(myTokenize.tokenize());


    }
}
