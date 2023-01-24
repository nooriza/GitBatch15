package Class12;

public class StringDemo5 {
    public static void main(String[] args) {
        String str="Java";
        String str2="Java";
        boolean areEqual=str.equals(str2);
        System.out.println(areEqual);

        System.out.println("+++++++++++");

        String str3="Java";
        String str4="JAVA";
        boolean areEqual1=str.equals(str4);
        System.out.println(areEqual1);

        System.out.println("+++++++++++++++++++++");

        String str5="Java";
        String str6="JAVA";
        boolean areEqual3=str.equalsIgnoreCase(str6);
        System.out.println(areEqual3);

    }
}
