package Class12;

public class StringDemo7 {
    public static void main(String[] args) {

        //checks the start letter of a string variable
        String str="I love JAVA";
        boolean startwith=str.startsWith("I");
        System.out.println(startwith);


        // checks the ending letter of a string variable
        String str1="I love JAVA";
        boolean edntwith=str.endsWith("A");
        System.out.println(edntwith);
        //method changing is when multiple methods are called on the same line
        //only those methods can be changed which returns strings
        System.out.println(str.toLowerCase().startsWith("I"));
        //This checks if a variable contains anything you are looking for
        System.out.println(str.contains("java"));
    }
}
