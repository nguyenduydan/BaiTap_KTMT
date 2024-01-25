package quanly_sinhvien;

public class SinhVienBiz extends SinhVienPoly{
    private double diemMarketing;
    private double diemSales;

    public SinhVienBiz(String hoTen, double diemMarketing, double diemSales){
        super(hoTen,"Biz");
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }

    @Override
    public double getDiem(){
        return (2*diemMarketing + diemSales )/3;
    }

    @Override
    public  void xuat(){
        System.out.println("Họ tên: " + getHoTen());
        System.out.println("Ngành học: " + getNganh());
        System.out.printf("Điểm trung bình: %.2f\n" ,getDiem());
        System.out.println("Học lực: " + getHocLuc());
    }
}
