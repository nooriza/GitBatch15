package Class12;

public class StringDEmo10 {
    public static void main(String[] args) {
        //this can tell us the location/index a character
        String str="Java is not pain";
        System.out.println(str.indexOf("J"));
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i)+"has the index"+i);
        }
    }
}
