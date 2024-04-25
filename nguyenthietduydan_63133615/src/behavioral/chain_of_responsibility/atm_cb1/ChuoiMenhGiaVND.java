package behavioral.chain_of_responsibility.atm_cb1;

public class ChuoiMenhGiaVND extends ChuoiMenhGiaFactory{
    ATM_TheoMenhGia menhGia500 = new MenhGia(500);
    ATM_TheoMenhGia menhGia200 = new MenhGia(200);
    ATM_TheoMenhGia menhGia100 = new MenhGia(100);
    ATM_TheoMenhGia menhGia50 = new MenhGia(50);
    ATM_TheoMenhGia menhGia20 = new MenhGiaThapNhat(20);

    public ChuoiMenhGiaVND() {
        menhGia500.menhGiaTiepTheo(menhGia200).menhGiaTiepTheo(menhGia100).menhGiaTiepTheo(menhGia50).menhGiaTiepTheo(menhGia20);
    }

    @Override
    public ATM_TheoMenhGia getChuoiMenhGia(int menhGia) {
        switch (menhGia){
            case 500:
                return menhGia500;
            case 200:
                return menhGia200;
            case 100:
                return menhGia100;
            case 50:
                return menhGia50;
            case 20:
                return menhGia20;
            default:
                return null;
        }
    }
}
