package HomeWork;

import java.util.Scanner;

public class Largestof3NUM {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Please enter three numbers here");
        double num = number.nextDouble();
        double num2 = number.nextDouble();
        double num3 = number.nextDouble();
        if (num > num2 && num > num3) {
            System.out.println("largest Number is"+num);
        } else if (num2>num&&num2>num3) {
            System.out.println("Largest Number is"+num2);
        } else if (num3>num2&&num3>num) {
            System.out.println("Largest number is"+num3);
        }
    }
}
