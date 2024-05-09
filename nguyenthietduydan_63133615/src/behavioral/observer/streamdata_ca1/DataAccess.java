package behavioral.observer.streamdata_ca1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class DataAccess {
    List<MonHoc> list = new ArrayList<>();
    MyStream<List<MonHoc>> stream;

    public DataAccess(MyStream<List<MonHoc>> stream) {
        this.stream = stream;
    }

    public void them (MonHoc m){
        list.add(m);
        stream.addEvent(list);
    }

    public void xoa(String id){
        MonHoc m = null;
        for(MonHoc mh: list)
            if(mh.id.equals(id)){
                m = mh;
                break;
            }
        if(m!=null){
            list.remove(m);
            stream.addEvent(list);
        }
    }
}
