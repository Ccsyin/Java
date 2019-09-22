package csy;
import java.util.Scanner;

public class TheWholeMoneyAgainstTheZero {
    public static  void main(String[] arg)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入总钱数，例如11.56");
        double amount = 0;
        try {
            amount = input.nextDouble();
        } catch (Exception e) {
            System.out.println("请输入数字！");
            return ;
        }
        int remainingAmount = (int)(amount*100);

        int numberOfOneDollars = remainingAmount/100;
        remainingAmount = remainingAmount%100;

        int numberOfQuarters = remainingAmount/25;
        remainingAmount = remainingAmount%25;

        int numberOfDimeS = remainingAmount/10;
        remainingAmount = remainingAmount%10;

        int numberOfNickels = remainingAmount/5;
        remainingAmount = remainingAmount%5;

        int numberOfPenny = remainingAmount;

        //展示结果
        System.out.println("你的总钱数"+amount+"可以换成：");
        System.out.print(" "+numberOfOneDollars+"个1美元");
        System.out.print(" "+numberOfQuarters+"个2角5分");
        System.out.print(" "+numberOfDimeS+"个1角");
        System.out.print(" "+numberOfNickels+"个5分");
        System.out.print(" "+numberOfPenny+"个1分");
    }
}
