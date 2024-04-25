package behavioral.observer.atm_ca5;

public class ATM {
    TaiKhoanATM theATM;
    void nhanThe(TaiKhoanATM atm){
        theATM = atm;
    }
    void traThe(TaiKhoanATM atm){
        theATM = null;
    }
    public void rutTien(int soTien){
        if (theATM != null){
            if(theATM.kiemTraSoDu(soTien) == true)
                theATM.nhanThongBao(soTien,true);
            else
                theATM.nhanThongBao(soTien,false);
        }
        else
            System.out.println("Không có thẻ trong máy");
    }
}
