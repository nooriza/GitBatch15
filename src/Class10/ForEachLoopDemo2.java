package Class10;

public class ForEachLoopDemo2 {
    public static void main(String[] args) {
        //arr[1]=0; this is how we update a single element in a array
        //print only the odd numbers from this array with th help of normal for loop
        int[] arr = {10, 13, 20, 25, 45, 50};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            if (arr[i] % 2 != 0) {
            }
        }
        //Replace all the odd numbers in the array with zero the help of normal loop
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2!=0){
                arr[i]=0;
                System.out.println(arr[i]);
            }
        }
        System.out.println("After replacing all odd number with zeros");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }
}
