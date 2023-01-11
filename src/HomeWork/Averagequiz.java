package HomeWork;

import java.util.Scanner;

public class Averagequiz {
    public static void main(String[] args) {
        Scanner examscore= new Scanner(System.in);
        System.out.println("Please enter your quiz first, mid second term and final score third");
        int quiz=examscore.nextInt();
        int midterm=examscore.nextInt();
        int Final=examscore.nextInt();
        int average=(quiz+midterm+Final)/3;
        if(average>=90){
            System.out.println("A");
        } else if (average>=70&&average<90) {
            System.out.println("B");
        } else if (average>=50&&average<70) {
            System.out.println("C");
        } else if (average<50) {
            System.out.println("F");

        }
    }
}
