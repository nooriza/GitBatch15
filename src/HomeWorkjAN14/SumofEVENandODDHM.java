package HomeWorkjAN14;

import java.util.Scanner;

public class SumofEVENandODDHM {
    public static void main(String[] args) {
        int a, b, c, d;
        int sum=0;
        Scanner obj=new Scanner(System.in);
        System.out.println("Please enter the range of your  numbers");
        a=obj.nextInt();
        b=obj.nextInt();
        c=obj.nextInt();
        d= obj.nextInt();
        if(a%2==0||b%2==0||c%2==0||d%2==0){
            sum=a+b+c+d;
            System.out.println(sum+ "The sum of your odd numbers");
        } else if (a%2!=0||b%2!=0||c%2!=0||d%2!=0) {
            sum=a+b+c+d;
            System.out.println(sum  + "The sum of your even numbers");
        }

    }


    }
