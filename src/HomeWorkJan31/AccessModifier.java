package HomeWorkJan31;

public class AccessModifier {
    /*
3) Write a java class that have 4 constructors with 4 different access levels of constructors(private,public,default,protected) and
create 4 objects of this class:
1 - inside same class;
2 - from outside the class;
3 - from different classes inside different package and observe result.

Default access modifier=package only
Private access modifier = limited to the class only.
Protected Access Modifier = only accessible by the classes of the same package
Public access modifier= The members, methods and classes that are declared public can be accessed from anywhere
     */

    String collegeName;
    String collegeCity;
    int collegerate;
    int numberofstudent;

    private AccessModifier(String collegeName1, String collegeCity1, int collegerate1, int numberofstudent1) {
        collegeName = collegeName1;
        collegeCity = collegeCity1;
        collegerate = collegerate1;
        numberofstudent = numberofstudent1;
    }
     AccessModifier(String collegeCity1, int collegerate1, int numberofstudent1) {
        collegeCity = collegeCity1;
        collegerate = collegerate1;
        numberofstudent = numberofstudent1;
    }
    protected AccessModifier(String collegeCity1, int collegerate1, int numberofstudent1, String collegeName1) {
        collegeName = collegeName1;
        collegeCity = collegeCity1;
        collegerate = collegerate1;
        numberofstudent = numberofstudent1;
    }

    public AccessModifier(String collegeCity1, int numberofstudent1, String collegeName1) {
        collegeName = collegeName1;
        collegeCity = collegeCity1;
        numberofstudent = numberofstudent1;
    }
    public void printko(){
        System.out.println("Collage Name: " + collegeName+ "Collage City: "+ collegeCity+ "Collage Rate:" + collegerate+ "Number of Students: "+ numberofstudent);
}

    public static void main(String[] args) {
        AccessModifier b=new AccessModifier("Mazar", 12, 9,"Qalandar");
        b.printko();
    }
}