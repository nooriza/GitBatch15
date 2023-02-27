package Class16;

public class Task3 {

    /*
    Create a method that will print whether given String is polindrome ot not
    return tyype=>void
    name=>ispalindrome
    parameters=>String inputStr
    {
    }
    Exmple dad=> dad true
    ABC=>CBA False
     */

    void isPalindrome(String str){
        StringBuilder st=new StringBuilder(str);
        st.reverse();
        String reversedStr=st.toString();
        if(str.equals(reversedStr)){
            System.out.println(str+"is palidrome");
        }else {
            System.out.println(str+"is not palidrome");
        }
    }

    public static void main(String[] args) {
        Task3 task3=new Task3();
        //String resul=Task3.isPalindrome("Kaya"); can't assign void method to
        //Task3.isPalindrome("Kaya");
    }
}
