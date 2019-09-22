package csy;

import java.util.Scanner;

public class Lottery {
    public static void main(String[] arg){
        //产生一个随机数
        int lottery = (int) (Math.random()*100);
        System.out.println(lottery);
        //输入用户猜的数
        Scanner input =new Scanner(System.in);
        int guess = input.nextInt();
        //分解彩票号码位数
        int lotteryDigit1 = lottery/10;
        int lotteryDigit2 = lottery%10;
        //分解猜数位数
        int guessDigit1 = guess/10;
        int guessDigit2 = guess%10;
        //验证是否中奖
        if(guess==lottery)
            System.out.println("您的奖金为10000美元");
        else if (guessDigit1 == lotteryDigit2
                && guessDigit2 == lotteryDigit1)
            System.out.println("您的奖金为3000美元");
        else if (guessDigit1 == lotteryDigit1
                || guessDigit1 == lotteryDigit2
                || guessDigit2 == lotteryDigit1
                || guessDigit2 == lotteryDigit2)
            System.out.println("您的奖金为1000美元");
        else
            System.out.println("您没有中奖");
    }

}
