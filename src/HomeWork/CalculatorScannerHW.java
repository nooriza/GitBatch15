package HomeWork;

import java.util.Scanner;

public class CalculatorScannerHW {
    public static void main(String[] args) {
        /*double num1, num2;
        Scanner obj=new Scanner(System.in);
        System.out.println("Please enter two distinct numbers");
        num1=obj.nextDouble();
        num2=obj.nextDouble();
        System.out.println("Please enter an operator (+,-,* or /)");
        char operator=obj.next().charAt(0);
        switch (operator){
            case'+':
                System.out.println(num1+num2);
                break;
            case'-':
                System.out.println(num1-num2);
                break;
            case'*':
                System.out.println(num1*num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break;
        }*/
        boolean male = false;
        int age = 30;

        if( male ){
            if( age < 20 ){
                System.out.println("Boy");
            } else {
                System.out.println("Man");

            }
        }else {

            if( age < 20 ){
                System.out.println("Girl");
            }else  {
                System.out.println("Woman");
            }
        }
        }
        }

