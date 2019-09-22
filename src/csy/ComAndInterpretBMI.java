package csy;
import java.util.Scanner;

public class ComAndInterpretBMI {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);

        System.out.println("请输入单位为英镑的体重！");
        double weight = input.nextDouble();

        System.out.println("请输入单位为英寸的身高！");
        double height = input.nextDouble();

        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254;

        double weightInKilograms = weight * KILOGRAMS_PER_POUND;
        double heightInMeters= height * METERS_PER_INCH;
        double bmi = weightInKilograms / (heightInMeters*heightInMeters);

        System.out.println("BMI is" + bmi);
        if (bmi<18.5)
            System.out.println("Underweight");
        else if (bmi<25)
            System.out.println("Normal");
        else if (bmi<30)
            System.out.println("Overweight");
        else
            System.out.println("Obase");

    }
}
