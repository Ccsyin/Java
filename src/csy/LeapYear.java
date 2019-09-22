package csy;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个年份：");
        int year =input.nextInt();

        boolean isLeapYear =
                (year%4 ==0 && year%100 != 0) || (year%400 == 0);
        System.out.println(year+" is a leap year? "+isLeapYear);

    }
}
