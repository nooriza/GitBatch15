package HomeWorkjAN14;

public class PrintODDHM {
    public static void main(String[] args) {
        //print odd numbers between 20 and 50 (2 ways)
        for (int i = 20; i <= 50; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        System.out.println("*******************************************");
        for (int j = 50; j > 20; j--) {
            if (j % 2 != 0) {
                System.out.println(j);
            }
        }
    }
}
