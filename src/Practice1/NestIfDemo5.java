package Practice1;

public class NestIfDemo5 {
    public static void main(String[] args) {
        int money=600;
        boolean mood=true;

        if(money>500){
            System.out.println("I got paid today");
            if(mood){
                System.out.println("I am happy");
                }else{
                System.out.println("I am sad today");
            }
            }
        }
    }

