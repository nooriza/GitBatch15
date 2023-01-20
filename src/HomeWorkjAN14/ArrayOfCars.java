package HomeWorkjAN14;

public class ArrayOfCars {
    public static void main(String[] args) {
       // 8) Create an array that can store names of cars and store 6 elements into it. Print all values from the array.
        String [] cars={"BMW","Toyota","Ford","Audi","Kia","Dadi"};
        System.out.println(cars.length);
        for (int i = 0; i < cars.length ; i++) {
            System.out.println(cars[i]);

        }
    }
}
