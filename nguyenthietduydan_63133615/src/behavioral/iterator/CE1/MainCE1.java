package behavioral.iterator.CE1;

public class MainCE1 {
    public static void main(String[] args) {
        ArrayCollection arrayCollection = new ArrayCollection();
        Iterator63 iterator63 = arrayCollection.createIterator();
        while (!iterator63.isDone()){
            System.out.println(iterator63.next());
        }
    }
}
