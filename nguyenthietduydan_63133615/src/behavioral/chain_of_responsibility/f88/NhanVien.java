package behavioral.chain_of_responsibility.f88;

public class NhanVien extends NhanVienF88{

    NhanVienF88 nv;
    public NhanVien(String ten, String chucVu, int hanMucXuLy) {
        super(ten, chucVu, hanMucXuLy);
    }

    @Override
    public NhanVienF88 capCapHon(NhanVienF88 capCapHon) {
        return nv = capCapHon;
    }

    @Override
    public String xuLyKhoanVay(int tienVay) {
        if(tienVay <= hanMucXuLy){
            builder
                    .append("Người sẽ xử lý khoản vay:").append("\n")
                    .append("Tên chức vụ:").append(chucVu).append("\n")
                    .append("Tên nhân viên: ").append(ten);
            return builder.toString();
        }else {
            return  nv.xuLyKhoanVay(tienVay);
        }
    }
}
