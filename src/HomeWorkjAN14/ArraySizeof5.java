package HomeWorkjAN14;

public class ArraySizeof5 {
    public static void main(String[] args) {
       // 9) Create an array of size 5 on integers and calculate the sum of all elements in an array.
        int [] Numbers=new int[5];
        Numbers [0]=10;
        Numbers [1]=20;
        Numbers [2]=30;
        Numbers [3]=40;
        Numbers [4]=50;
        int sum=0;
        System.out.println(Numbers.length);
        for (int i = 0; i <Numbers.length ; i++) {
            System.out.println(Numbers[i]);
            sum=sum+Numbers[i];
            }
        System.out.println(sum);
        }
    }

