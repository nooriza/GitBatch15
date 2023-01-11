package HomeWork;

import java.util.Scanner;

public class birthdayseason {
    public static void main(String[] args) {
        Scanner season =new Scanner(System.in);
        System.out.println("Enter the birth month");
        String bmonth=season.nextLine();
        if(bmonth.equals("March")&&bmonth.equals("April")&&bmonth.equals("May")){
            System.out.println("spring");
        }

    }
}
