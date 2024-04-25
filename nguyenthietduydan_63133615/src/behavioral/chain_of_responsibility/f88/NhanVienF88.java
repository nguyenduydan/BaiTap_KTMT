package behavioral.chain_of_responsibility.f88;

public abstract class NhanVienF88 {
    String ten;
    String chucVu;
    int hanMucXuLy;
    StringBuilder builder = new StringBuilder();

    public NhanVienF88(String ten, String chucVu, int hanMucXuLy) {
        this.ten = ten;
        this.chucVu = chucVu;
        this.hanMucXuLy = hanMucXuLy;
    }

    public abstract NhanVienF88 capCapHon(NhanVienF88 nv);
    public abstract String xuLyKhoanVay(int tienVay);

    @Override
    public String toString() {
        return builder.toString();
    }
}
