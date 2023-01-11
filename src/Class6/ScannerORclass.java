package Class6;

import java.util.Scanner;

public class ScannerORclass {
    public static void main(String[] args) {
                Scanner or=new Scanner(System.in);
                System.out.println("Please enter the day");
                String day=or.nextLine();
                if(day.equalsIgnoreCase("Monday")||day.equalsIgnoreCase("Friday")){
                    System.out.println("No Class Today");
                } else if (day.equalsIgnoreCase("Saturday")|| day.equalsIgnoreCase("Sunday")) {

                    System.out.println("We have Java Class");
                }else if (day.equalsIgnoreCase("Tuesday") || day.equalsIgnoreCase("Wednesday")){
                    System.out.println("Manual Testing Class");
                } else if (day.equalsIgnoreCase("Thursday")) {
                    System.out.println("Review Class");
                }else System.out.println("Invalid Day Entered");
            }
        }

