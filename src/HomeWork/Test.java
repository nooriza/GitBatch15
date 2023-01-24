package HomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String[] Days = new String[7];
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter day 1 of the week ");
        String Days2 = scan.next();
        for (int i = 0; i < Days2.length(); i++) {
                Days[i] = scan.next();

            }
            System.out.println(Arrays.toString(Days));

        }
    }

