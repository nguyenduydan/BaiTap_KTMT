package behavioral.chain_of_responsibility.f88;

public class ChuTich extends NhanVienF88{
    NhanVienF88 capCaoHon;
    public ChuTich(String ten, String chucVu, int hanMucXuLy) {
        super(ten, chucVu, hanMucXuLy);
    }

    @Override
    public NhanVienF88 capCapHon(NhanVienF88 nv) {
        return null;
    }

    @Override
    public String xuLyKhoanVay(int tienVay) {
        if(tienVay <= hanMucXuLy){
            builder.append("Tên chức vụ:").append(chucVu).append("\n")
                    .append("Tên nhân viên: ").append(ten);
            return builder.toString();
        }else{
            return "Cút ra chỗ khác vay";
        }
    }
}
