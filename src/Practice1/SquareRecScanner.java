package Practice1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SquareRecScanner {
    public static void main(String[] args) {
        Scanner new1 = new Scanner(System.in);
        System.out.println("Please enter the V of Length");
        int a1 = new1.nextInt();
        System.out.println("Please enter the V of Width");
        int b1 = new1.nextInt();
        if (a1 == b1) {
            System.out.println("Your Shape is square");
        }else{
            System.out.println("Your Shape is rectangle");
        }
    }
}

