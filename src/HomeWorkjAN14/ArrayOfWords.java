package HomeWorkjAN14;

public class ArrayOfWords {
    public static void main(String[] args) {
        //7) Create an array of words: Java, Saturday, day, coding, is. Print the following sentence using elements of array: “Saturday is Java coding Day”.
        String [] Words={"Saturday " ,"is " ,  "Java ", "coding " , "Day "};
        System.out.println(Words.length);
        for (int i = 0; i < Words.length ; i++) {
            System.out.print(Words[i]);

        }
    }
}
