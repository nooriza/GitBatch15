package Practice1;

public class loanHM {
    public static void main(String[] args) {
        System.out.println("What amount of loan is needed?");
        int loan=200000;
        if(loan<=200000){
            System.out.println("We can lend you the amount");
        }
        else{
            System.out.println("Sorry we can lend you the amount requested");
        }
    }
}
