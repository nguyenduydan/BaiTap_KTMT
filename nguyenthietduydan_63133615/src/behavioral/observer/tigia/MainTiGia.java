package behavioral.observer.tigia;

public class MainTiGia {
    public static void main(String[] args) {
        TiGia t = new TiGia();
        NhaDauTuA a = new NhaDauTuA(t);
        NhaDauTuB b = new NhaDauTuB(t);
        a.dangKy();
        b.dangKy();
        System.out.println("lần 1");
        t.update(1);
        System.out.println("lần 2");
        t.update(-1);
        System.out.println("lần 3");
        a.huyDangKi();
        t.update(2);
    }
}
