package HomeWork;

public class IfElseifHW2 {
    public static void main(String[] args) {
        double mortgagerate = 4.6;
        int houseprice = 200000;

        if (mortgagerate > 4.5) {
            System.out.println("You will not buy a house");
        } else {
            System.out.println("You are able to buy a house");
        }
        if(houseprice>200000){
            System.out.println("User will get a loan");
        }
        else{
            System.out.println("User will pay cash");
        }


    }
}
