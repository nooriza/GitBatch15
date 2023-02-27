package Class24;

public class Animal {
    String speak;
    String eat;

    void speak(){
        System.out.println("Speaking");
    }
    void eat(){
        System.out.println("eating");
    }
}
class speak extends Animal{
    @Override
    void speak() {
        System.out.println("Cat is speaking");
    }

    @Override
    void eat() {
        System.out.println("Cat is eating meat");
    }
}

class eat extends Animal{
    @Override
    void speak() {
        System.out.println("Dog is speaking");
    }

    @Override
    void eat() {
        System.out.println("Dog is eating the cat");
    }
}

class harchee extends Animal{

    @Override
    void speak() {
        System.out.println("Horse is running and speaking");
    }

    @Override
    void eat() {
        System.out.println("Horse is eating the grass");
    }
}
