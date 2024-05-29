package behavioral.observer.ca4_topic;

public class TinTuc {

    int tinTucID;
    String thongTin;

    public TinTuc(int tinTucID, String thongTin) {
        this.tinTucID = tinTucID;
        this.thongTin = thongTin;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Tin tức: "+thongTin);
        return builder.toString();
    }

    public int getTinTucID() {
        return tinTucID;
    }

    public void setTinTucID(int tinTucID) {
        this.tinTucID = tinTucID;
    }

    public String getThongTin() {
        return thongTin;
    }

    public void setThongTin(String thongTin) {
        this.thongTin = thongTin;
    }
}
