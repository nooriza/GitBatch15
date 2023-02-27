package Class6;

public class SwitchcasePractice {
    public static void main(String[] args) {
        String country="italy";
        int day=1;
        switch (country){
            case "USA":
                System.out.println("Burgers");
                break;
            case "Italy":
                System.out.println("Pizza");
                break;
            case "Afghanistan":
                System.out.println("Kofta");
                break;
            default:
                System.out.println("wrong Country");
        }

        switch (day){
            case 1:
                System.out.println("Sundy");
                break;
            case 2:
                System.out.println("Monday");
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
        }
    }
}
