package ProjectJan24;

public class Question6 {
    public static void main(String[] args) {
        /*
        6)Write a program to swap 2 numbers without a temporary variable?
         */

        //creating only 2 variables
        int x = 25;
        int y = 30;

        //printing original variables
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        //swapping the two variables
        x = x + y;
        y = x - y;
        x = x - y;

        //printing new variables
        System.out.println("new x = " + x);
        System.out.println("new y = " + y);
    }
}

