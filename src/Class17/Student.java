package Class17;

public class Student {
    /*
        Create a class call it Student define 4 instance fields like id Name age weight
        create 5 objects of this class do this task without constructors and with constructors
         */
    String name;
    int id;
    int age;
    int wight;
    Student(String name1, int id1, int age1, int wight1){
        name=name1;
        id=id1;
        age=age1;
        wight=wight1;
    }
    void clear(){
        System.out.println("name"+name+"id"+id+"age"+age+"Weight"+wight);
    }
}


