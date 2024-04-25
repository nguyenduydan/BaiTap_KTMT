package structural.composite.qlmonhoc_B4;

public abstract class KeHoachHocTap {
    String ten;

    public KeHoachHocTap(String ten) {
        this.ten = ten;
    }

    public abstract void Add(KeHoachHocTap k);
    public abstract void Remove(KeHoachHocTap k);
    public abstract int getHocPhi();
    public abstract int getTongTC();
    public abstract String getThongTin();

}
