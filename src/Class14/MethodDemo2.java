package Class14;

public class MethodDemo2 {
    void printHello(){
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }

    void printhellmanytimes(int times){
        for (int i = 0; i < times; i++) {
            System.out.println("Hello World");

        }
    }
    void printManyTimes(int times, String word){
        for (int i = 0; i < times; i++) {
            System.out.println(word);
        }

    }
}
