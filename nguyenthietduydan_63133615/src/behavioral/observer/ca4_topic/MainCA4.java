package behavioral.observer.ca4_topic;

public class MainCA4 {
    public static void main(String[] args) {
        Topic topic = new Topic();

        TinTuc tinTuc = new TinTuc(1,"Hello world");
        TinTuc tinTuc1 = new TinTuc(2,"Hello worldddddddddddddddsdsdsdsddd");
        TinTuc tinTuc3 = new TinTuc(2,"Hello worlddddddddsdsdsdsddd");

        //ThanhVienA tv1 = new ThanhVienA(topic);
        ThanhVienB tv2 = new ThanhVienB(topic);

        topic.themMoi(tinTuc);
        topic.themMoi(tinTuc1);
        topic.capNhat(tinTuc3);
    }
}
