package Class13;

public class SpiltmethodDemo {
    public static void main(String[] args) {
        String str="I like Java. I write a lot of code daily. I am from batch 15.";
        String[]strArr=str.split("[.?!]");
        System.out.println(strArr.length);
        System.out.println(strArr[0]);
        //Whenever we are working with arrays we use the length and whenver we are working with STrings
        //we use the length()
    }
}
