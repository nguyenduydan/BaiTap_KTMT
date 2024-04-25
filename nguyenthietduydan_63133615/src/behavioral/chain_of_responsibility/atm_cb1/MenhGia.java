package behavioral.chain_of_responsibility.atm_cb1;

public class MenhGia extends ATM_TheoMenhGia{
    ATM_TheoMenhGia keTiep;

    public MenhGia(int menhGia) {
        super(menhGia);
    }

    @Override
    public ATM_TheoMenhGia menhGiaTiepTheo(ATM_TheoMenhGia m) {
        this.keTiep = m;
        return this.keTiep;
    }

    @Override
    public void rutTien(int soTien) {
        int soTo = soTien/menhGia; //số tờ
        int soDu = soTien%menhGia; //số dư
        if(soTo>0){
            System.out.println("\t" + soTo + " tờ mệnh giá " + menhGia);
        }if(soDu>0){
            keTiep.rutTien(soDu);
        }
    }
}
