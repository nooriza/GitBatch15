package HomeWork;

import java.util.Scanner;

public class Heightmeasure {
    public static void main(String[] args) {
        Scanner height=new Scanner(System.in);
        System.out.println("Please enter your height");
        int inch=height.nextInt();
        if(inch<60){
            System.out.println("short");
        } else if (inch>60||inch<72) {
            System.out.println("Medium");
        } else if (inch>72) {
            System.out.println("Tall");
        }
    }
}
