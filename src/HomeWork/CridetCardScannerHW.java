package HomeWork;

import java.util.Scanner;

public class CridetCardScannerHW {
    public static void main(String[] args) {
        Scanner creditCard=new Scanner(System.in);
        System.out.println("Do you have Credit Card");
        boolean creditCard1=creditCard.nextBoolean();

        if(creditCard1==true) {
            System.out.println("balance");
            int balance = creditCard.nextInt();
            if (balance > 1000) {
                System.out.println("pay off");
            } else {
                System.out.println("spend more");
            }
        }else{
            System.out.println("offer one");
        }

    }
}