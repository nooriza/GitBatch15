package Class8;

public class NestdLoops1 {
    public static void main(String[] args) {//outer for loop
        for (int i=0; i<5;i++){

            for(int j=0;j<5;j++){// inner for loop
                System.out.println("i="+i+"j="+j);
            }
        }
    }
}
