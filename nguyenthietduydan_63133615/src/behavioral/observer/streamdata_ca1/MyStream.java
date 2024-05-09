package behavioral.observer.streamdata_ca1;

import java.util.ArrayList;
import java.util.List;

public class MyStream<T>{
    List<MyStreamListener> listeners = new ArrayList<MyStreamListener>();

    void addListener(MyStreamListener listener){
        listeners.add(listener);
    }
    void addEvent(T t){
        for(MyStreamListener l: listeners){
            l.listen(t);
        }
    }
}
