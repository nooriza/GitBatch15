package HomeWorkJan31;

public class CreditCard {
    /*
    Create a class CreditCard and define variable balance and interest. Create an instance method that will calculate interest based on the given balance.
Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
Call the method by creating an object of each of the three classes
     */


    double balance=5000;
    double interest=23.5;

    void calculate (){
        System.out.println(balance/100*interest);

    }
}
class Visa extends CreditCard{

}

class ax extends  CreditCard{
    void calculate (){
        System.out.println(balance/100*interest);
    }
}

class test{
    public static void main(String[] args) {
        CreditCard tester = new CreditCard();
        tester.calculate();
        Visa tester1=new Visa();
        tester1.calculate();
        ax tester3=new ax();
        tester3.calculate();
    }
}