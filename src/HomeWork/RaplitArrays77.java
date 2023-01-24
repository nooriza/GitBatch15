package HomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class RaplitArrays77 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int [] numbers=new int[5];
       int  numbers2=scan.nextInt();
         numbers2=scan.nextInt();
        numbers2=scan.nextInt();
         numbers2=scan.nextInt();
         numbers2=scan.nextInt();
         numbers2=scan.nextInt();
        for (int i = 5; i >numbers.length ; i++) {
            for (int j = i; j <numbers.length ; j--) {
                System.out.println(numbers[j]);
            }
            numbers[i]=numbers2;

        }

    }
}
