package HomeWork;

import java.util.Scanner;

public class LargestNUMNestedif {
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        int a, b, c;
        System.out.println("Please enter three number");
        a = obj1.nextInt();
        b = obj1.nextInt();
        c = obj1.nextInt();
        if (a > b) {
            if(a>c){
                System.out.println("The largest num is"+a);
            }
        }
        if(b>a){
            if(b>c){
                System.out.println("The largest num is"+b);
            }
        }
        if(c>a){
            if(c>b){
                System.out.println("The largest num is"+c);
            }
        }
    }
}