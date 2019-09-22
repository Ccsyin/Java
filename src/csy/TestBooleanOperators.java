package csy;

import java.util.Scanner;

public class TestBooleanOperators {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);

        System.out.println("请输入一个整数：");
        int number = input.nextInt();

        if(number%2 == 0 && number%3 ==0)
            System.out.println("该数能被2和3整除");
        if(number%2 == 0 || number%3 ==0)
            System.out.println("该数能2或者3整除");
        if(number%2 == 0 ^ number%3 ==0)
            System.out.println("该数只能被2或者3整除");
        System.out.println(1&2);
        System.out.println(2&3);
    }
}
