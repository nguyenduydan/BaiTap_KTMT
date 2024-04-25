package behavioral.chain_of_responsibility.atm_cb1;

public class MenhGiaThapNhat extends ATM_TheoMenhGia{
    public MenhGiaThapNhat(int menhgia) {
        super(menhgia);
    }

    @Override
    public ATM_TheoMenhGia menhGiaTiepTheo(ATM_TheoMenhGia m) {
        return null;
    }

    @Override
    public void rutTien(int sotien) {
        int soTo = sotien/menhGia;
        System.out.println("\t" + soTo + " tờ mệnh giá " + menhGia);
    }
}
