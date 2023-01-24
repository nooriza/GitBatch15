package ProjectJan24;

import java.util.Arrays;

public class Question10 {
    public static void main(String[] args) {
       //10) Write a java program to find the second-largest number in the array?
                int[] num = {7, 4, 9, 1, 6, 15, 8};
                //this will sort all numbers in the array from smallest to largest
                Arrays.sort(num);
                //this will print the second-largest number in the newly sorted array
                System.out.println(num[num.length-2]);
            }
        }

