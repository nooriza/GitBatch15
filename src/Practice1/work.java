package Practice1;

import java.util.Scanner;

public class work {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Please enter 3 distinct numbers");
        int a = myObj.nextInt();
        System.out.println("Please enter 3 distinct numbers");
        int b = myObj.nextInt();
        System.out.println("Please enter 3 distinct numbers");
        int c = myObj.nextInt();
        if (a > b && a > c) {
            System.out.println("The largest number is" + a);
        } else if (b > a && b > c) {
            System.out.println("The largest number is" + b);
        }

    }

}



