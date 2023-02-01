package Calss11;

public class ArraysExample {
    public static void main(String[] args) {
        int[][] matrix = {{10, 20, 30},
                {45, 55, 66},
                {30, 40, 20, 10, 25}
        };
        //write a loop to print all the elements from this 2D Array
        //matrix.length tells us how many 1d arrays are present in this 2D array
        for (int i = 0; i < matrix.length; i++) {
            //matricc[i].length the size of each 1D array
            for (int j = 0; j < matrix[i].length; j++) {
                // only print odd numbers
                if (matrix[i][j] % 2 != 0) {
                    System.out.println(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
