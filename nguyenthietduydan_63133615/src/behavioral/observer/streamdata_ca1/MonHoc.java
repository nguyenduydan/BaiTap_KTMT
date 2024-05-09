package behavioral.observer.streamdata_ca1;

public class MonHoc {
    String id, ten;
    int soTC;

    public MonHoc(String id, String ten, int soTC) {
        this.id = id;
        this.ten = ten;
        this.soTC = soTC;
    }

    @Override
    public String toString() {
       StringBuilder builder = new StringBuilder();
       builder.append("ID: " + id + "\n")
               .append("Tên môn học: " + ten + "\n")
               .append("Số tín chỉ: " + soTC +"\n").append("------------------------------");
       return builder.toString();
    }
}
