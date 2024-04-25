package behavioral.chain_of_responsibility.atm_cb1;

public abstract class ATM_TheoMenhGia {
    int menhGia;

    public ATM_TheoMenhGia(int menhGia) {
        this.menhGia = menhGia;
    }

    public abstract ATM_TheoMenhGia menhGiaTiepTheo(ATM_TheoMenhGia m);
    public abstract void rutTien(int soTien);
}
