package HomeWorkJan31;

public class StudentAddressName {
    /*
5) Write a Student class that has instance variables name and address.
Create a constructor that will initialize those variables. Print name & address of given student using display Info method.

     */

    String name;
    String address;

    StudentAddressName(String name1, String address1){
        name=name1;
        address=address1;
    }
    void Info(){
        System.out.println("Name"+name+"Address"+address);
    }

    public static void main(String[] args) {
        StudentAddressName a=new StudentAddressName("Cute Teacher","Islamabad");
        a.Info();
    }
}
