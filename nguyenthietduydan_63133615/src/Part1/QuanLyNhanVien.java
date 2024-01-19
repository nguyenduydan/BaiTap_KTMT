package Part1;
import java.util.ArrayList;
import java.util.List;

public class QuanLyNhanVien implements IQuanLy {
    private List<NhanVien> danhSachNV;
    public QuanLyNhanVien(){
        danhSachNV = new ArrayList<>(); // tạo mảng để chứa các phẩn tử nhân viên
    }
    @Override
    public void them(NhanVien nhanVien){
        danhSachNV.add(nhanVien); // thêm nhân viên mới vào danh sách
    }
    @Override
    public void inDS(){
        int count =1;
        for (NhanVien nv : danhSachNV){ // lấy nhân viên trong danh sách nhân viên
            System.out.printf("Nhân viên thứ %d: ",count);
            System.out.println("\n" + nv.getThongTin()); // in ra ds nhân viên
            System.out.println("----------------------");
            count++;
        }
    }
}
