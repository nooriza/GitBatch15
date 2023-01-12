package HomeWork;

import java.util.Scanner;

public class birthdayseason {
    public static void main(String[] args) {
        Scanner season =new Scanner(System.in);
        System.out.println("Enter the birth month");
        String bmonth=season.nextLine();
        if(bmonth.equalsIgnoreCase("March")||bmonth.equals("April")||bmonth.equals("May")){
            System.out.println("Spring");
        } else if (bmonth.equals("June")||bmonth.equals("July")||bmonth.equals("August")) {
            System.out.println("Summer");
        }else if (bmonth.equals("September")||bmonth.equals("October")||bmonth.equals("November")){
            System.out.println("Fall");
        }else if (bmonth.equals("December")||bmonth.equals("Jan")||bmonth.equals("Feb")){
            System.out.println("Winter");
        }
            System.out.println("you are born"+bmonth);
        }
    }

