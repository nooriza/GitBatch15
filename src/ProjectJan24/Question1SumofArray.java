package ProjectJan24;

import java.util.Scanner;

public class Question1SumofArray {

    /*1)Using Scanner create an array of integer values. After the array is created,
    calculate the sum of all stored elements in that array.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int[] arr = {10, 20, 20, 30};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            sum = sum + arr[i];
        }
        System.out.println();
        System.out.println("Please calculate the sum of all stores elements in the array");
        System.out.println(sum);
    }
}
