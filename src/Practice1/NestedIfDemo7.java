package Practice1;

public class NestedIfDemo7 {
    public static void main(String[] args) {
        boolean studayhard = true;
        int salary = 100000;
        if (studayhard) {
            System.out.println("We get the jobs");
            if (salary > 120000) {
                System.out.println("Let's buy Telsa");
            } else {
                System.out.println("Let's buy Toyota");
            }
        } else {
            System.out.println("It might take little longer for us to get the jobs");

        }
    }
}

