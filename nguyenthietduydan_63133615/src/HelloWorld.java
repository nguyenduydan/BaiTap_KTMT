import java.util.Scanner;
import java.util.*;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello World");
        for(int i = 2;i<100;i++){
            System.out.print("Nhập password: ");
            int pwd;
            pwd = scanner.nextInt();
            if(pwd == 123){
                System.out.println("Success!");
                break;
            }else{
                System.out.println("Fail!");
            }
        }
    }
}