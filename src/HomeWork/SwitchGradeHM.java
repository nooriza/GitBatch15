package HomeWork;

import java.util.Scanner;

public class SwitchGradeHM {
    public static void main(String[] args) {
        Scanner obj =new Scanner(System.in);
        System.out.println("Please enter your Grade Here A, B, C or D");
        String grade=obj.next();
        switch (grade){
            case"A":
                System.out.println("Excellent");
                break;
            case "B":
                System.out.println("Good");
                break;
            case "C":
                System.out.println("Average");
                break;
            case"D":
                System.out.println("Bad");
                break;
            default:{
                System.out.println("Please enter the right Grade");
            }
        }
        System.out.println("According to your input, the system suggests that your grade is "+grade);
    }
}
