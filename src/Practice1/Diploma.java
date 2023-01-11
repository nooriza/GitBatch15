package Practice1;

public class Diploma {
    public static void main(String[] args) {
        boolean diploma=true;
        double gpa=3.6;
        if(diploma){
            System.out.println("Congtrats");
        }else{
            System.out.println("Please get a degree");
        }
        if(gpa>=3.5){
            System.out.println("You are eligible for scholarship");

        }else{
            System.out.println("You should study harder");
        }
    }
}
