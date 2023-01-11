package HomeWork;

import java.util.Scanner;

public class WeekWeekenddays {
    public static void main(String[] args) {
        Scanner weekday = new Scanner(System.in);
        System.out.println("Please enter any number b/w 1-7");
        int daynum = weekday.nextInt();
        if (daynum <= 5) {
            System.out.println("It is a weekday");
        } else if (daynum == 6 || daynum == 7) {
            System.out.println("It is a weekend");
        } else {
            System.out.println("Invalid Day");

        }
    }
}
