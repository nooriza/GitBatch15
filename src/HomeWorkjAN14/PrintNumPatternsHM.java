package HomeWorkjAN14;

public class PrintNumPatternsHM {
    public static void main(String[] args) {
       /*5) Print the following pattern:
        55,555 for {int i = 55,554; i<=5;i++)
            4444
            333
            22
            1
            for (int i = 0; i < ; i++)
             {
        */

        for (int i = 5; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}



