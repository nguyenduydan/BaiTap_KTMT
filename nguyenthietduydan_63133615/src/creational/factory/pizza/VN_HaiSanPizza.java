package creational.factory.pizza;

public class VN_HaiSanPizza extends Pizza{
    @Override
    void preprare() {
        builder.append("Bot gao va 4 con tom");
    }

    @Override
    void bake() {
        builder.append("Nuong banhhhhhhhhhhhh");
    }

    @Override
    void cut() {
        builder.append("Cat banhhhhhhh");
    }

    @Override
    void box() {
        builder.append("Dong hop");
    }
}
