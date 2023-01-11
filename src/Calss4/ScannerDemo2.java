package Calss4;
import java.util.Scanner;

public class ScannerDemo2 {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.println("Please enter age");
       int age=input.nextInt();
        System.out.println("You are "+age+" years old");
    }
}
