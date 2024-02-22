package creational.builder.computer;
//1. lớp ần tạo đối tượng, việc tạo đối tượng gồm nhiều thành phần thông qua nhiều bước
public class computer {
    //2. Xác định các thành phần phức tạp cần khởi tạo thông qua các bước
    String CPU, RAM, STORAGE, SCREEN;
    //4. Viết hàm khới tạo
    private computer (Builder b){
        CPU = b.CPU;
        RAM = b.RAM;
        STORAGE = b.STORAGE;
        SCREEN = b.SCREEN;
    }

    public String toString() {
        return "Computer\n" +
                "CPU: " + CPU + "\n" +
                "RAM: " + RAM + "\n" +
                "STORAGE: " + STORAGE + "\n" +
                "SCREEN: " + SCREEN;
    }

    //3. Viết lớp Builder
    public static class Builder{
        private String CPU, RAM, STORAGE, SCREEN;
        //6. Các phương thức để xây dựng từng thành phần
        public Builder buildRAM(String ram){
            this.RAM = ram;
            return this;
        }
        public Builder buildCPU(String cpu){
            this.CPU = cpu;
            return this;
        }
        public Builder buildSTORAGE(String storage){
            this.STORAGE = storage;
            return this;
        }
        public Builder buildSCREEN(String screen){
            this.SCREEN = screen;
            return this;
        }

        //5. Phương thức build trả về đối tượng cần khởi tạo
        public  computer build(){
            return new computer(this);
        }
    }
}
