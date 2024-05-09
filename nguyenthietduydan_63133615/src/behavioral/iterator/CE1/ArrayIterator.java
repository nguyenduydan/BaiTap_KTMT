package behavioral.iterator.CE1;

public class ArrayIterator implements Iterator63 {
    ArrayCollection collection;
    int index = -1;//chua truy cap

    protected ArrayIterator(ArrayCollection collection) {
        this.collection = collection;
    }

    @Override
    public Object first() {
        index=0;
        return collection.getItem(index);
    }

    @Override
    public Object next() {
//        if(!isDone())//chua duyet xong
        return collection.getItem(++index);
//        return null;
    }

    @Override
    public Object current() {
        if(index >= 0)
            return collection.getItem(index);
        return null;
    }

    @Override
    public boolean isDone() {
        return (index == collection.count() - 1);
    }
}
