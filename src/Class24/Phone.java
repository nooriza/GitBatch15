package Class24;

public abstract class Phone {

    /*
    Crate a phone cass let's create abstract methods like displayPictures
    Unlock phone
    SendText
    2 child classes Iphone samsung Google and provide specific implmentation let's write
    code to achieve runtime polymorphism
     */

    abstract void displayPictures();
    abstract void unlock();
    abstract void sendtext();
}
class iphone extends Phone{
    @Override
    void displayPictures() {
        System.out.println("Best");
    }
    @Override
    void unlock() {
        System.out.println("Locked");
    }

    @Override
    void sendtext() {
        System.out.println("Delivery shown");

    }
}
class samsung extends Phone{

    @Override
    void displayPictures() {
        System.out.println("Better");

    }

    @Override
    void unlock() {
        System.out.println("Locked and unlock");

    }

    @Override
    void sendtext() {
        System.out.println("read is written once read");

    }
}

class google extends Phone{
    @Override
    void displayPictures() {
        System.out.println("average");

    }
    @Override
    void unlock() {
        System.out.println("It is locked but can be unlocked");
    }
    @Override
    void sendtext() {
        System.out.println("YOu can see when it is delivered");
    }
}

class phonetester{
    public static void main(String[] args) {
        Phone [] phone={new iphone(),new samsung(),new google()};
        for (int i = 0; i < phone.length; i++) {
            Phone phone1=phone[i];
            phone1.displayPictures();
            phone1.sendtext();  
            phone1.unlock();
        }
    }
}