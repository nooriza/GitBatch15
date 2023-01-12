package HomeWork;

import java.util.Scanner;

public class birthdayseasonSwitch {
    public static void main(String[] args) {
        Scanner season = new Scanner(System.in);
        System.out.println("Enter the birth month");
        String bmonth = season.nextLine();
        switch (bmonth){
            case "March":
            case "April":
            case "May":
                System.out.println("Spring");
                break;
            case "June":
            case "July":
            case "Aug":
                System.out.println("Summer");
                break;
            case "Sept":
            case "Oct":
            case "Nov":
                System.out.println("Fall");
                break;
            case "Dec":
            case "Jan":
            case "Feb":
                System.out.println("Winter");
                break;
            case "Month":
                System.out.println("you were born"+bmonth);
                break;

        }

    }
}
