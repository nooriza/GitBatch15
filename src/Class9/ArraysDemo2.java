package Class9;

public class ArraysDemo2 {
    public static void main(String[] args) {
        //10 20 30 45 50
        int [] number={10,20,30,45,50};
        int sum=0;
        System.out.println(number.length);
        for (int i= 0; i < number.length; i++) {
            System.out.println(number[i]);
            sum=sum+number[i];
        }
        System.out.println(sum);
    }
}
