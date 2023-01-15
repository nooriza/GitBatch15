package Class8;

public class BreakKeywordDemo1 {
    public static void main(String[] args) {
        boolean summer=true;
        int temp=75;
        while(summer){
            if(temp<=100){
                System.out.println("I love summer becuase temp is"+temp);
            }else{
                summer = false;
                System.out.println("It very hot"+temp);
            }
            temp+=5;
        }
        }
}
