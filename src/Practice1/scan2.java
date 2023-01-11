package Practice1;

import java.util.Scanner;

public class scan2 {
    public static void main(String[] args) {
        Scanner age= new Scanner(System.in);
        System.out.print("Please enter your age");
        int a18=age.nextInt();
        if(a18>=18){
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("you are not eligible to vote");
        }
    }
}

