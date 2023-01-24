package ProjectJan24;

public class Question4 {
    public static void main(String[] args) {
        /*
        4) Create a 2D array or integer type where you will store odd and even numbers. Develop a
        program which will identify/print the even numbers only.
         */
        int [][] number={{10,20,11},
                        {15, 22,25},
                         {18,24,60}
        };
        int evensum=0;
        int oddsum=0;
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                if(number[i][j]/2==0){
                    System.out.println(number[i]);
                    evensum += number[i][j];
                }else{
                    oddsum+=number[i][j];
                }
            }
        }
        System.out.println("Odd sum = " + oddsum);
        System.out.println("Even sum = " + evensum);
    }
}
