package creational.singleton.vidu;

public class MySingleton {
    //1 khai báo biến singleton
    private static MySingleton instance;

    int count =0;
    //2. Phương thức khởi tạo private hoặc protected
    //protected nếu dùng kế thừa
    protected MySingleton(){}

    //3. Phương thức tĩnh dùng để trả về biến instance
    public static MySingleton getInstance(){
        if(instance == null){
            instance = new MySingleton();
        }
        return instance;
    }


    public void inCount(){
        System.out.println(++count);
    }
}
