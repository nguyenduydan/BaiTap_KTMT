package behavioral.observer.ca4_topic;

public class ThanhVienA implements TopicListener{
    Topic topic;

    public ThanhVienA(Topic topic) {
        this.topic = topic;
        this.topic.dangKy(this);
    }

    @Override
    public void listen(TinTuc t) {
        System.out.println(t.toString());
    }
}
