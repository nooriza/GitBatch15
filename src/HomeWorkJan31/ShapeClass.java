package HomeWorkJan31;

public class ShapeClass {

    /*
    1. Shape class has a constructor that takes the radius and has a subclass as circle class.
    In circle class create a method to calculate the area of circle. Test your code
     */

    Double radius;
    ShapeClass(double radius) {
        this.radius = radius;
    }
}

class Circle extends ShapeClass {
    Double area;

    Circle(double radius) {
        super(radius);
        this.area = area;

        }
     void test(){
        System.out.println("the area is "+Math.PI*radius*radius);
    }

    public static void main(String[] args) {
        Circle circ=new Circle(2.8);
        circ.test();

    }
}


