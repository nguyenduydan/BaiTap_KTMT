package behavioral.Stratery.cc1_tinh;

public class Context {
    private Tinh tinhToan;
    public Tinh getTinhToan() {
        return tinhToan;
    }
    public float tinh(float a, float b){
        return tinhToan.tinh(a,b);
    }
    public Context setTinhToan(Tinh tinhToan) {
        this.tinhToan = tinhToan;
        return this;
    }
}
