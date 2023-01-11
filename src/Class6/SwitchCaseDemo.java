package Class6;

public class SwitchCaseDemo {
    public static void main(String[] args) {
        String country = "USA";
        System.out.println(country.toLowerCase());
        switch (country.toLowerCase()) { //toLowerCase=covert text to lower case USA=>usa
            case "USA":
                System.out.println("Burgers");
                break;
            case "itlay":
                System.out.println("Pasta");
                break;
            case "Afghanistan":
                System.out.println("Kabab");
                break;
            default:
                System.out.println("Wrong country");

        }
    }
}
