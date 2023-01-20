package HomeWorkjAN14;

public class ArraysName {
    public static void main(String[] args) {
       // 6) Create an array of names and store all names of your group. Then print your name from that array. (use 2 different ways of creating an array).
        String [] Names={"Zuhra","Zafar","Zahra","Mehria"};
        System.out.println(Names.length);
        for (int i = 0; i <Names.length ; i++) {
            System.out.println(Names[0]);
        }
        String [] names=new String[4];
        names[0]="Zuhra";
        names[1]="Zahra";
        names[2]="Zafar";
        names[3]="Mehria";
        System.out.println("****************");
        System.out.println(names.length);
        for (int i = 0; i <names.length ; i++) {
            System.out.println(names[3]);

        }
    }
}
