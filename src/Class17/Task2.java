package Class17;

public class Task3 {

    /*
    2) Create a method that will take a String as a parameter and returns reversed String.
    Method should be available to all classes within your project and accessible by class name.
     */

    public String reverseStr(String input){
        return  new StringBuilder(input).reverse().toString();
    }
}