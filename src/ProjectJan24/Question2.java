package ProjectJan24;

public class Question2 {

    /*
    2)Using Scanner create an array of countries. When an array is created,
    retrieve all values from it and while retrieving those values print
    capital for each country. (use 2 different loops).
     */
    public static void main(String[] args) {
        String [] country = new String[5];
        country [0]="Afghanistan";
        country [1]="Pakistan";
        country [2]="India";
        country [3]="Greece";
        country [4]="Zafaristan";
        System.out.println(country.length);
        for (int i = 0; i < country.length; i++) {
            System.out.println(country[i]);
        }
        String [] capital= new String[5];
        capital [0]="Kabul";
        capital [1]="Islamabad";
        capital [2]="Delhi";
        capital [3]="Athens";
        capital [4]="Heart";
        System.out.println(capital.length);
        for (int i = 0; i < capital.length; i++) {
            System.out.println(capital[i]);
        }
    }
}

