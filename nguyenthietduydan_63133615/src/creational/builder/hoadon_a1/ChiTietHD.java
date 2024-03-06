package creational.builder.hoadon_a1;

import java.util.ArrayList;
import java.util.List;

public class ChiTietHD {
    String sanPham;
    int soLuong, donGia;
    float chietKhau;

    public ChiTietHD(String sanPham, int soLuong, int donGia, float chietKhau) {
        this.sanPham = sanPham;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.chietKhau = chietKhau;
    }
    @Override
    public String toString() {
        return "San Pham: " + sanPham + "\n" +
                "So Luong: " + soLuong +"\n" +
                "Don Gia: " + donGia +"\n" +
                "Chiet Khau: " + chietKhau +"\n";
    }
    public String getSanPham() {
        return sanPham;
    }

    public void setSanPham(String sanPham) {
        this.sanPham = sanPham;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public float getChietKhau() {
        return chietKhau;
    }

    public void setChietKhau(float chietKhau) {
        this.chietKhau = chietKhau;
    }
}
