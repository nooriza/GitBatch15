package ProjectJan24;

public class Question11 {
    public static void main(String[] args) {
        //11)Write a program to print out duplicate elements from an Array of Strings?

        String[] name={"Zafar","Mustafa", "Asghar","Zafar","Ali","Wais"};
        for (int i = 0; i < name.length; i++) {
            for (int j = i+1; j <name.length ; j++) {
                if(name[i].equals(name[j])){
                    System.out.println("Duplicate:"+name[i]);
                }
            }
            
        }
    }
}
