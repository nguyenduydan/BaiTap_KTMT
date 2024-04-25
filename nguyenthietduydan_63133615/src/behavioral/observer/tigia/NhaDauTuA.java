package behavioral.observer.tigia;

public class NhaDauTuA implements TiGiaObserver{
    TiGia t;

    public NhaDauTuA(TiGia t) {
        this.t = t;
    }

    public void dangKy(){
        t.attach(this);
    }

    public void huyDangKi(){
        t.detach(this);
    }

    @Override
    public void update(float delta) {
        if(delta >= 0) {
            System.out.println("Nhà đầu tư A bán ra ");
        }else {
            System.out.println("Nhà đầu tư A mua vào");
        }
    }
}
