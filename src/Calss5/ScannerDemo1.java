package Calss5;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
      /*
      If the score iin all the subjects are greater than 90 print brilliant student, otherwise print you need
      to work hard
       */

        double mathScore=92.5;
        double historyScore=91.5;
        double scienceScore=93.5;

        System.out.println(true&&true);
        System.out.println(true&&false);
        System.out.println(false&&false);
        /*
        if the score in all the subjects are greater than 90 print brilliant student
        otherwise print you need to work hard
         /

        double mathScore=92.5;
        double historyScore=91.5;
        double scienceScore=93.5;

  /      if(mathScore>90.0){
            if(historyScore>90){
                if(scienceScore>90){
                    System.out.println("You are a brilliant Student");
                }else{
                    System.out.println("You need work harder");
                }
            }else{
                System.out.println("You need work harder");
            }

        }else{
            System.out.println("You need work harder");
        }
*/

        if(mathScore>90&&historyScore>90&&scienceScore>90){
            System.out.println("You are a brilliant Student");
        }else{
            System.out.println("You need work harder");
        }
        boolean cond=false;
        boolean condition=!cond;
        System.out.println(condition);

        if(condition){
            System.out.println(" You got it");
        }else {
            System.out.println("Need more practice");
        }

    }

    }
