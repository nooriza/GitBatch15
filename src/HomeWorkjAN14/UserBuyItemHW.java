package HomeWorkjAN14;

import java.util.Scanner;

public class UserBuyItemHW {
    /*
    4) Write a program to ask a user to enter the item they want to buy and the
    price of that item. Every time user enters money accumulate the
    amount and tell the user how much is left to pay off. If users give more money,
    the program should return a change. Whenever a user is
    done with the payments program should say "Thank you for shopping!"
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double totalprice = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Please enter the item and price here");
            String itemname =scan.next();
            double itemPrice=scan.nextDouble();
            totalprice=totalprice+itemPrice;
            System.out.println("This is the total Price amount that you have to pay"+totalprice);
        }
        System.out.println("Pay for the item");
        double amountPaid=scan.nextDouble();

        if(amountPaid>totalprice){
            double change=amountPaid-totalprice;
            System.out.println("Hey here is your change"+change);
        }
        System.out.println("Thank you for shopping!");
    }
}
