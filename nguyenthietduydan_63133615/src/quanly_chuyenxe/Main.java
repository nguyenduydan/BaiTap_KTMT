package quanly_chuyenxe;

public class Main {
    public static void main(String[] args) {
        QuanLyChuyenXe chuyenxe = new QuanLyChuyenXe();
        //Xe nội thành
        ChuyenXeNoiThanh chuyen1 = new ChuyenXeNoiThanh("CX1","Nguyen Van A",29,2000000,12,5000);
        ChuyenXeNoiThanh chuyen2 = new ChuyenXeNoiThanh("CX2","Nguyen Van B",30,4000000,13,6000);
        ChuyenXeNoiThanh chuyen3 = new ChuyenXeNoiThanh("CX3","Nguyen Van C",31,5000000,14,2000);
        chuyenxe.them(chuyen1);
        chuyenxe.them(chuyen2);
        chuyenxe.them(chuyen3);
        //Xe ngoaại thành
        ChuyenXeNgoaiThanh chuyen4 = new ChuyenXeNgoaiThanh("CX1","Nguyen Van D",32,232323,"Cam Lâm",30);
        ChuyenXeNgoaiThanh chuyen5 = new ChuyenXeNgoaiThanh("CX2","Nguyen Van E",33,232003,"Sân bay",60);
        ChuyenXeNgoaiThanh chuyen6 = new ChuyenXeNgoaiThanh("CX3","Nguyen Van F",34,532323,"Bến xe phía nam",20);
        chuyenxe.them(chuyen4);
        chuyenxe.them(chuyen5);
        chuyenxe.them(chuyen6);
        //Xuất danh sách
        chuyenxe.xuat();
        System.out.println();
        System.out.println("Tổng doanh thu xe nội thành: "+chuyenxe.tinhDoanhThuNoiThanh());
        System.out.println("Tổng doanh thu xe ngoại thành: "+chuyenxe.tinhDoanhThuNgoaiThanh());
        System.out.println("Tổng doanh thu cả 2 xe: "+chuyenxe.tongDoanhThu());
    }
}
