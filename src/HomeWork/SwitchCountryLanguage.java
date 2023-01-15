package HomeWork;

import java.util.Scanner;

public class SwitchCountryLanguage {
    public static void main(String[] args) {
        Scanner obj1=new Scanner(System.in);
        System.out.println("Please enter the name of your Country");
        String country=obj1.nextLine();
        switch (country){
            case"Afghanistan":
                System.out.println("Farsi and Pashto");
                break;
            case "Pakistan":
                System.out.println("Urdu and Pashto");
                break;
            case "India":
                System.out.println("Hindi");
                break;
            default:{
                System.out.println("Wrong Country");
            }
        }
        }
    }
