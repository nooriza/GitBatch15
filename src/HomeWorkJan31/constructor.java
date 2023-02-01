package HomeWorkJan31;

public class constructor {
   // Write a java class that will have a constructor: one with parameters and second without any parameters.
    // Create a separate Test class where you will execute both of the constructors 1 by 1.

    String Name;
    int Age;
    int ID;

    constructor(String Name1, int Age1, int ID1){
        Name=Name1;
        Age=Age1;
        ID=ID1;
    }
    constructor(){

    }
    void info(){
        System.out.println("Name "+ Name+ " Age " + Age+ " ID "+ID);
    }
    void info1(){
        System.out.println();
    }
}
