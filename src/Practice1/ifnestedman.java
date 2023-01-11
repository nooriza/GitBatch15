package Practice1;

import java.util.Scanner;

public class ifnestedman {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String gender;
        int age;

        System.out.println("Please enter your gender: M or F");
        gender = myObj.nextLine();
        System.out.println("Please enter your age ");
        age = myObj.nextInt();

        if(age > 25 && gender.equals("F")){
            System.out.println("Woman");
        }else if (age < 25 && gender.equals("F")){
            System.out.println("Girl");
        }
        if(age > 25 && gender.equals("M")){
            System.out.println("Man");
        }else if (age < 25 && gender.equals("M")){
            System.out.println("Boy");
        }


    }

}



