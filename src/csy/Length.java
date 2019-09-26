package csy;

import java.util.Scanner;

public class Length {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String message = input.next();
        String message2 = input.next();
        System.out.println("The length of message is" + message.length());
        System.out.println("第0个字符是"+ message.charAt(0));
        System.out.println("两个字符可以组合成"+message.concat(message2));
        System.out.println("所有字符转换成小写" + message.toLowerCase());
        System.out.println("所有字符转换成大写" +message.toUpperCase());
    }
}
