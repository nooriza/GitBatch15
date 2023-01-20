package HomeWorkjAN14;

import java.util.Scanner;

public class CreditCardScanner10times {
    public static void main(String[] args) {
        Scanner creditCard = new Scanner(System.in);
        for (int i = 0; i <= 10;) {
        System.out.println("Do you want to apply for our credit card");
        String respond = creditCard.next();
            if(respond.equalsIgnoreCase("Yes")){
                System.out.println("Thank you so much..");
                break;
            }
        }
    }
}