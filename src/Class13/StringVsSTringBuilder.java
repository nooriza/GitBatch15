package Class13;

public class StringVsSTringBuilder {
    public static void main(String[] args) {
        String str="";
        for (int i = 0; i < 1000; i++) {
            str=str+i;
            System.out.print(i);
        }
        System.out.println();
    }
}
