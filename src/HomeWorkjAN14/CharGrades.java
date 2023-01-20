package HomeWorkjAN14;

public class CharGrades {
    public static void main(String[] args) {
        //5) Create an array of chars and store grades into it: A,B,C,D,E,F. Then print a grade B (use 2 different ways of creating an array).
        char[] grades = {'A', 'B', 'C', 'D', 'E', 'F'};
        System.out.println(grades.length);
        for (int i = 0; i <grades.length; i++) {
            System.out.println(grades[1]);

        }
        char [] Grades=new char[6];
        Grades[0]='A';
        Grades[1]='B';
        Grades[2]='C';
        Grades[3]='D';
        Grades[4]='E';
        Grades[5]='F';
        System.out.println("**********************");
        System.out.println(Grades.length);
        for (int i = 0; i < Grades.length ; i++) {
            System.out.println(grades[1]);

        }

    }
}