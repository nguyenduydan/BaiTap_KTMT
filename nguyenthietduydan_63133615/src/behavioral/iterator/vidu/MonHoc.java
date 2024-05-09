package behavioral.iterator.vidu;

public class MonHoc {
    String ten;
    int soTC;

    public MonHoc(String ten, int soTC) {
        this.ten = ten;
        this.soTC = soTC;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Tên môn học: ").append(ten).append("\n")
                .append("Số tín chỉ: ").append(soTC).append("\n");
        return builder.toString();
    }
}
