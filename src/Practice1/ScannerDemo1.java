package Practice1;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name1 = input.nextLine();
        System.out.println("My name is " + name1);
        Scanner input1 = new Scanner(System.in);
        System.out.println("Please enter your last name");
        String name2 = input1.nextLine();
        System.out.println("My last name is " + name2);
    }
}
