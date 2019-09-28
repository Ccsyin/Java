package csy;


public class Character {
    public static void main(String[] arg){
        System.out.println("isDigit('a') is" + java.lang.Character.isDigit('a'));
        System.out.println("isLetter('a') "+ java.lang.Character.isLetter('a'));
        System.out.println("isLetterOrDigit('a')" + java.lang.Character.isLetterOrDigit('a'));
        System.out.println("isLowerCash('a')" + java.lang.Character.isLowerCase('a'));
        System.out.println("isUpperCase('a')"+ java.lang.Character.isUpperCase('a'));
        System.out.println("toLowerCash('T')" + java.lang.Character.toLowerCase('T'));
        System.out.println("toUpperCash('t')" + java.lang.Character.toUpperCase('t'));
        System.out.println(Integer.toBinaryString(2));
        int a = 2;
        Byte b = Byte.valueOf("2");
        System.out.println(b.byteValue());

    }
}
