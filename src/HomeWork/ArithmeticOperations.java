package HomeWork;

public class ArithmeticOperations {
    public static void main(String[] args) {
  Double x=10.5;
  Double y=10.5;

  Double H=x+y;
  Double I=x-y;
  Double B=x*y;
  Double Z=x/y;
        String space = " ";

        System.out.println("The Addition of 2 numbers "+ x +" and "+ y + space +"is equal to " + H);
        System.out.println("The Subtraction of 2 numbers "+ x +" and "+ y  + space +"is equal to " + I);
        System.out.println("The Multiplication of 2 numbers "+ x +" and "+ y  + space + "is equal to " + B);
        System.out.println("The Division of 2 numbers "+ x +" and "+ y  + space + "is equal to " + Z);

        Float sqaure=3.9f;
        Float square2=3.9f*3.9f;
        System.out.println("The square of the 3.9 is 15.209999999999999");
        int num1 = 3;
        int num2 = 10;
        int num3 = 5;
        int num4 = 1;
        int b=(num1+num2/num3-num4);
        System.out.println("The result of arithmetic operations is equal to "+ b+"");

    }
}
