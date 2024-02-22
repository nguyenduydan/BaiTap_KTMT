package creational.builder.computer;

public class mainBuilder {
    public static void main(String[] args) {
        computer computer = new computer.Builder()
                .buildCPU("Intel i9.12900k")
                .buildRAM("Ram: 128GB")
                .buildSTORAGE("5TB NVMe Asus")
                .buildSCREEN("Samsung 27in")
                .build();
        System.out.println(computer.toString());
    }
}
