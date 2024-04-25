package behavioral.observer.tigia;

import java.util.ArrayList;
import java.util.List;

public class TiGia {
    List<TiGiaObserver> observerList = new ArrayList<TiGiaObserver>();

    public void attach(TiGiaObserver observer){
        observerList.add(observer);
    }
    public void detach(TiGiaObserver observer){
        observerList.remove(observer);
    }

    public void update(float delta) {
        for (TiGiaObserver observer : observerList) {
            observer.update(delta);
        }
    }
}
