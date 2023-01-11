package Practice1;

import java.util.Scanner;

public class PositievNegativeNumbers {
    public static void main(String[] args) {
        Scanner myscan = new Scanner(System.in);
        System.out.println("Please enter first number");
        int x = myscan.nextInt();
        System.out.println("Please enter second number");
        int y = myscan.nextInt();
        if (x*y>0){
            System.out.println("True");
        }else{
            System.out.println("False");

        }
    }
}
