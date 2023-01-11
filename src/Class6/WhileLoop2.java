package Class6;

public class WhileLoop2 {
    public static void main(String[] args) {
        int number = 0;
        while (number < 6) {
            System.out.println(number);
            number++;
            System.out.println("***************");
            int number2 = 0;
            while (number2 < 10) {
                System.out.println(number2);
                number2 += 2;
            }
            System.out.println("____________________");
            //write a loop to printer from 1 to 100
            int number3 = 1;
            while (number3 < 101) {
                System.out.println(number3);
                number3++;
            }


            //write a loop to print odd numbers from 1 to 15
            int number4 = 1;
            while (number4 < 16) {
                System.out.println(number4);
                number4 += 2;
            }
        }
        System.out.println("________________________________");
        //write a loop to print these number
        int number5=5;
        while (number5<=50){
            System.out.println(number5);
            number5+=5;
        }
    }
}

