package Practice1;

import java.util.Scanner;

public class Beach1 {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Is it sunny outside?");
        Boolean isSunny = myScan.nextBoolean();
        if (isSunny) {
            System.out.println("It is a sunny day, I should go somewhere!");
            System.out.println("What is the temperature outside?");
            double a21 = myScan.nextDouble();
            if (a21 > 85) {
                System.out.println("I am going to the beach");
            }else{
                System.out.println("I am going the park");
                }
            }else{
            System.out.println("I stay home and practice Java");
    

        }
        }
    }


