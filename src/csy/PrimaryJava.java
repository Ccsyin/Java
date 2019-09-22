package csy;

import java.util.Calendar;
import java.util.Scanner;

public class PrimaryJava {
    public static void main(String[] args) {
        double radius;
        double area;
        //圆的面积(print和println的区别)
        Scanner scan = new Scanner(System.in);
//        System.out.print("请输入半径：");
//        radius = scan.nextDouble();
//        area = radius * radius * Math.PI;
//        System.out.println("该圆的面积为："+area);
        //2.9
//        double miles=100;
//        final double KILOMETERS_PER_MILE = 1.609;
//        double kilometers;
//        kilometers = miles * KILOMETERS_PER_MILE;
//        System.out.println(kilometers);
        //显示当前时间
//        long totalMilliseconds = System.currentTimeMillis();
//        long totalSeconds = totalMilliseconds / 1000;
//        long currentSecond = totalSeconds % 60;
//        long totalMinutes = totalSeconds / 60;
//        long currentMinute = totalMinutes % 60;
//        long totalHours = totalMinutes / 60;
//        long currentHour = totalHours % 24;
//        System.out.println("当前时间为：" + currentHour + ":" + currentMinute + ":" + currentSecond);
        //显示当前时间
//        Calendar calendar = Calendar.getInstance();
//        int hour = calendar.get(Calendar.HOUR_OF_DAY);
//        int minute = calendar.get(Calendar.MINUTE);
//        int second = calendar.get(Calendar.SECOND);
//        System.out.println("当前时间为："+hour+":"+minute+":"+second);
        //前后置自增减（i++：先计算后加，++i：先加厚计算）
        int a = 10;
        int newNum1 = 10*a++;
        System.out.println("a is "+a+",newNum1 is "+newNum1);
        int b = 10;
        int newNum2 = 10*(++b);
        System.out.println("b is "+ b+",newNum2 is "+newNum2);
        //小数位数精确到后两位
        System.out.println("请输入营业额：");
        double purchaseAmount = scan.nextDouble();
        double tax = purchaseAmount *0.06;
        System.out.println("营业税值为:"+(int)(tax*100)/100.0);
        //计算月利率额度，总支付额度
        




    }
}
