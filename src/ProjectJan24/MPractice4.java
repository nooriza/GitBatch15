package ProjectJan24;

public class MPractice4 {
    /*
    Create a method that take two number as parameeter and return the larger number time in 10 times

     */
    int largerNumber(int num1, int num2){
        if(num1>num2){
            return num1;
        }else{
            return num2;
        }

        }
    public static void main(String[]args){
        MPractice4 mp=new MPractice4();
        System.out.println(mp.largerNumber(12,13));
    }
}
