package Class24;

public class FinalDemo {
    public static void main(String[] args) {
        final int num;//we have created a constant variable
        num=20;//not possible cuz the variable is declared final
    }
    final void nonOverrideIT(){
        System.out.println("this method should never be overridden otherwise it might break the code base");
    }
}
/*class Nelson extends FInalKeyword{
    /*void nooneshouldOverrideit(){
    System.out.println("this method should never be overridden otherwise it might break the code base");
     */

