package behavioral.Stratery.cc2_sapxep;

public class SoSanhTheoDiem implements ISoSanh<SinhVien>{
    @Override
    public int soSanh(SinhVien t1, SinhVien t2) {
        if(t1.getDiemTB() >t2.getDiemTB())
            return 1;
        else if(t1.getDiemTB() == t2.getDiemTB())
            return 0;
        else return -1;
    }
}
