package ProjectJan24;

public class Question3 {
    public static void main(String[] args) {
        //3) Create a 2D array of integer values. Print the sum of all numbers.

        int [] [] number={{10,20,30},
                         {40,50,60},
                         {70,80,90}
        };
        int sum=0;
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                sum+=number[i][j];
            }
            }
        System.out.println("The total number is" +sum);
    }
}
