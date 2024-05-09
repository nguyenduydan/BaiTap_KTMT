package behavioral.observer.streamdata_ca1;
import java.util.List;

public class MyClient implements MyStreamListener<List<MonHoc>>{
    MyStream stream;

    public MyClient(MyStream stream) {
        this.stream = stream;
        this.stream.addListener(this);
    }

    @Override
    public void listen(List<MonHoc> monHocs) {
        for(MonHoc monHoc: monHocs){
            System.out.println(monHoc.toString());
        }
    }
}
