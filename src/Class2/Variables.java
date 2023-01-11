package Class2;

import java.sql.SQLOutput;

public class Variables {
    public static void main(String[] args) {
        /*
        Below line is reserving a box in the computer memory.
        we are calling it box1 if we need the information that we are starting inside
        we can simply say the computer give us the contents of box1.
        int=what type of data we want to store
        =sing will take whatever we write after it and will store it inside the box1
        10= is what are storing inside the box
         */
        int box1 = 10;
        System.out.println(box1);//bring the contents of box1 and print them on the console
        /*to store whole numbers (numbers without decimals points) we have 4 different types of boxes
        for example numbers like 10 20 30000 1000000 330000
        1)byte 2)short 3) int 4)long
         */
        byte box2 = 127;
        byte box3 = -128;
        short box4 = 32767;
        int biggerBox = 2147483647; //most common type of box
        long maxBox = 2147483683647L;
        System.out.println(box2);
        System.out.println(box3);
        System.out.println(box4);
        System.out.println(biggerBox);
        System.out.println(maxBox);
        short MyBox = 10000;
        System.out.println(MyBox);


    }
}
