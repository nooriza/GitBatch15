package HomeWork;

public class IfElseHW1 {
    public static void main(String[] args) {
        boolean diploma = true;
        if (diploma) {
            System.out.println("congratulations");
        } else if (diploma == false) {
            System.out.println("Please get a degree");
        }
        Float gpa = 3.2f;
        if (gpa >= 3.5) {
            System.out.println("You are eligible for scholarship");
        } else {
            System.out.println("You should have studied harder");
        }
    }
}