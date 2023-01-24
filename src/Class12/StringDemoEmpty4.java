package Class12;

public class StringDemoEmpty4 {
    public static void main(String[] args) {
        String str="";
        System.out.println(str.isEmpty());//It checks if a String is empty or not... This becomes like a boolean... it is true

        String str1="ZafarNoori";
        System.out.println(str1.isEmpty());//This is false

        //isBlank method does not count spaces in side the String
        System.out.println(str.isBlank());
    }
}
