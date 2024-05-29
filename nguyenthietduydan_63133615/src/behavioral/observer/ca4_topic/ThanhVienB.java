package behavioral.observer.ca4_topic;

import java.util.ArrayList;
import java.util.List;

public class ThanhVienB implements TopicListener{
    Topic topic;
    List<TinTuc> tinTucs = new ArrayList<>();

    public ThanhVienB(Topic topic) {
        this.topic = topic;
        this.topic.dangKy(this);
    }

    @Override
    public void listen(TinTuc t) {
        for(int i=0;i<tinTucs.size();i++){
            if(tinTucs.get(i).getTinTucID() == t.getTinTucID()){
                tinTucs.set(i,t);
                System.out.println(t.toString());
                return;
            }
        }
        tinTucs.add(t);
        System.out.println(t.toString());
    }
}
