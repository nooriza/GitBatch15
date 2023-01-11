package HomeWork;

import java.util.Scanner;

public class TempScanner {
    public static void main(String[] args) {
        Scanner myscan = new Scanner (System.in);
        System.out.println("WHat city you live in?");
        String city=myscan.nextLine();

        System.out.println("What is the weather temperature?");

        double tempF=myscan.nextDouble();
        tempF =(tempF-32)/1.8;
        System.out.println("the weather temp in"+city+ "is  "+ tempF +  "celsius");

    }
}
