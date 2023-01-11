package Class3;

public class IfElse_9 {
    public static void main(String[] args) {
        char c = 'M';
        if (c == 'M') {
            System.out.println("Male");
        }
        String name = "Nat";
        //With non-Primitive Datatype such as String we can't == symbol
        if (name.equals("Sam")) {
            System.out.println("Amazing Student");
        }
        if (!name.equals("Sam")) {
            System.out.println("Super Amazing Student");
        }
    }
}
