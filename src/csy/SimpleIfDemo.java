package csy;
import java.util.Scanner;

public class SimpleIfDemo {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个整数：");
        int number = input.nextInt();
        if(number%5 == 0){
            System.out.println("HiFive");
        }
        else if(number%2 == 0){
            System.out.println("HiEven");
        }
        else{
            System.out.println("该数字既不是5的倍数也不是2的倍数！");
        }

    }
}
