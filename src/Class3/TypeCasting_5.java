package Class3;

public class TypeCasting_5 {
    public static void main(String[] args) {
        long number=125;
        byte shorterNumber=(byte) number;
        Float f=10.5f;
        /*
        If we try to store the content from a smaller box to a larger box JAVA does not complain, because the content
        can easily fit inside the larger box, but we try the other way around we get an
        error, and we need to type cast it to store the contents.
         */
        Byte b=10;
        int number2=b;
        short c=(short) number2;
        System.out.println(b);
        float eggs=12.5f;
        int wholePart=(int)eggs;//type casting we are converting form float to an int
        System.out.println(wholePart);
        int a1=5000;
        byte num2=(byte)a1;
        System.out.println(num2);

    }
}
