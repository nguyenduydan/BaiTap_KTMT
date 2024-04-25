package structural.composite.qlmonhoc_B4;

public class MonHoc extends KeHoachHocTap{
    int soTC, hocPhi;

    public MonHoc(String ten, int soTC, int hocPhi) {
        super(ten);
        this.soTC = soTC;
        this.hocPhi = hocPhi;
    }

    @Override
    public void Add(KeHoachHocTap k) {

    }

    @Override
    public void Remove(KeHoachHocTap k) {

    }

    @Override
    public int getHocPhi() {
        return hocPhi*soTC;
    }

    @Override
    public int getTongTC() {
        return soTC;
    }

    @Override
    public String getThongTin() {
        StringBuilder builder = new StringBuilder();
        builder.append("\tTên môn học: ").append(ten).append("\n")
                .append("\tSố tín chỉ: ").append(getTongTC()).append("\n")
                .append("\tHọc phí: ").append(getHocPhi()).append("\n");
        return builder.toString();
    }
}
