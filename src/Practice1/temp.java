package Practice1;

import java.util.Scanner;

public class temp {
    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);
        System.out.println("What is your City Name");
        String city = temp.nextLine();

        System.out.println("What is your City Temp");
        double tempF = temp.nextDouble();
        tempF = (tempF - 32) / 1.8;
        System.out.println("The weather in" + city + " is" + tempF + "celsius");
    }
}
