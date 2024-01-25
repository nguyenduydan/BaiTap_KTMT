package quanly_sinhvien;

public class SinhVienIT extends SinhVienPoly{
    private double diemJava;
    private double diemCss;
    private double diemHtml;

    public SinhVienIT (String hoTen, double diemJava, double diemCss, double diemHtml){
        super(hoTen,"IT");
        this.diemJava = diemJava;
        this.diemCss = diemCss;
        this.diemHtml = diemHtml;
    }
    @Override
    public double getDiem(){
        return (2*diemJava + diemHtml + diemCss)/4;
    }

    @Override
    public  void xuat(){
        System.out.println("Họ tên: " + getHoTen());
        System.out.println("Ngành học: " + getNganh());
        System.out.printf("Điểm trung bình: %.2f\n" ,getDiem());
        System.out.println("Học lực: " + getHocLuc());
    }
}
