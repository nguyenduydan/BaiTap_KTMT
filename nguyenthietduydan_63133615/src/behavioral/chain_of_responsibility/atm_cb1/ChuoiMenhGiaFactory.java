package behavioral.chain_of_responsibility.atm_cb1;

public abstract class ChuoiMenhGiaFactory {
    public abstract ATM_TheoMenhGia getChuoiMenhGia (int menhGia);
    public void rutTien(int soTien, int menhGiaCaoNhat){
        ATM_TheoMenhGia chuoiMenhGia = getChuoiMenhGia(menhGiaCaoNhat);
        if(chuoiMenhGia != null){
            chuoiMenhGia.rutTien(soTien);
        }
    }
}
