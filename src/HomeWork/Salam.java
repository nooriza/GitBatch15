package HomeWork;

public class Salam {
    public static void main(String[] args) {
        String firstName="George";
        String lastName="Michael";
/*
java executes code from top to bottom but if we have multiple operations on the same lines it
executes them from left to right
 */
        System.out.println("*******"+firstName+" "+lastName+"******");
        System.out.println("-------"+firstName+" "+ lastName+"-------");
        System.out.println("First Name="+firstName);
        System.out.println("Last Name="+lastName);
        System.out.println("10"+"10");
        String space=" ";
        System.out.println(firstName+space+lastName);
        System.out.println(firstName+" "+lastName);

        System.out.println(firstName+10);
        System.out.println(firstName+10.5);
        System.out.println(firstName+true);
        String space1=" ";
        String firstname1="Zafar";
        String lastname1="Noori";
        Character grade2='A';
        String city="Fairfax";
        String state="Virginia";
        String Telephone="571.420.9998";
        System.out.println("My Name is"+ space1+ firstname1);
        System.out.println("My Last Name is" +space1 +lastname1);
        System.out.println(" My Grade is" +grade2);
        System.out.println("City"+ city);
        System.out.println("State"+ state);
        System.out.println("Telephone"+ Telephone);
        int a=10;
        int b=3;
        int reminder=a%b;
        System.out.println(reminder);

    }
}
