package behavioral.iterator.CE1;

public class ArrayCollection implements Collection63{

    private int[] arr = {1,2,3,4,5,6};

    public int getItem(int i){
        return arr[i];
    }

    public int count(){
        return arr.length;
    }

    @Override
    public Iterator63 createIterator() {
        return new ArrayIterator(this);
    }
}
