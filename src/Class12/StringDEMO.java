package Class12;

public class StringDEMO {
    public static void main(String[] args) {
        //creating ab object of String Class
        String strobj=new String("Java");
        //another way of creating on object of STring class Shorter Way
        //Mostly this is how we create the object of String Class
        String strobj2="Java";
        System.out.println(strobj2.length());
        String str="Banana";
        int len=str.length();
        System.out.println(len);
        String name ="Hamid Poy  ";
        if(name.length()>10){
            System.out.println("Name can't be more than 10 letters");
        }
    }
}
