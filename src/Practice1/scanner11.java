package Practice1;

import java.util.Scanner;

public class scanner11 {
    public static void main(String[] args) {
            Scanner inp = new Scanner(System.in);
            System.out.print("In:");
            String name = inp.nextLine();
            //DO NOT CHANGE ABOVE CODE!  Write your code below
            if(name.equals("Chen")){
                System.out.println("Teacher");
            }else{
                System.out.println("Student");
            }
        }
    }


