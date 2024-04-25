package behavioral.observer.atm_ca5;

public class TaiKhoan implements TaiKhoanATM{
    String tenTk;
    int soDu;
    ATM atm;

    public TaiKhoan(String tenTk, int soDu, ATM atm) {
        this.tenTk = tenTk;
        this.soDu = soDu;
        this.atm = atm;
    }

    public void duaTheVaoATM(){
        atm.nhanThe(this);
    }
    public void rutTheKhoiATM(){
        atm.traThe(this);
    }

    @Override
    public boolean kiemTraSoDu(int soTienRut) {
        if (soDu - 50 > soTienRut)
            return true;
        return false;
    }

    @Override
    public void nhanThongBao(int soTienRut, boolean thanhCong) {
        if (thanhCong == true) {
            System.out.println("Tài khoản: " + tenTk);
            System.out.println("Số dư ban đầu: " + soDu);
            System.out.println("Số tiền rút: " + soTienRut);
            soDu = soDu - soTienRut;
            System.out.println("Số dư còn lại: " + soDu);
        }
        else {
            System.out.println("Tài khoản: " + tenTk);
            System.out.println("Số dư ban đầu: " + soDu);
            System.out.println("Số tiền rút: " + soTienRut);
            System.out.println("Không đủ tiền đủ rút");
        }
    }

}
