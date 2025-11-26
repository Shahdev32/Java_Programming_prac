package Array;

import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;

public class Matrices {

    // public static void printSpiral(int matrix[][]) {
    //     int startRow = 0;
    //     int startCol = 0;
    //     int endRow = matrix.length - 1;
    //     int endCol = matrix[0].length - 1;
    
    //     while (startRow <= endRow && startCol <= endCol) {
    
    //         // top row
    //         for (int j = startCol; j <= endCol; j++) {
    //             System.out.print(matrix[startRow][j] + " ");
    //         }
    
    //         // right column
    //         for (int i = startRow + 1; i <= endRow; i++) {
    //             System.out.print(matrix[i][endCol] + " ");
    //         }
    
    //         // bottom row
    //         if (startRow < endRow) {
    //             for (int j = endCol - 1; j >= startCol; j--) {
    //                 System.out.print(matrix[endRow][j] + " ");
    //             }
    //         }
    
    //         // left column
    //         if (startCol < endCol) {
    //             for (int i = endRow - 1; i > startRow; i--) {
    //                 System.out.print(matrix[i][startCol] + " ");
    //             }
    //         }
    
    //         startRow++;
    //         startCol++;
    //         endRow--;
    //         endCol--;
    //     }
    
    //     System.out.println();
    
    // }



    // public static int diagonalSum(int[][] matrix) {
    //     int n = matrix.length;
    //     int sum = 0;
    
    //     for (int i = 0; i < n; i++) {
    //         sum += matrix[i][i]; // Primary diagonal
    //         sum += matrix[i][n - 1 - i]; // Secondary diagonal
    //     }
    
    //     // If n is odd, subtract the middle element (counted twice)
    //     if (n % 2 != 0) {
    //         sum -= matrix[n / 2][n / 2];
    //     }
    
    //     return sum;
    // }
    


    public static boolean stairSearch(int[][] matrix, int key) {
        int row = 0;
        int col = matrix[0].length - 1;
    
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("Key found at (" + row + ", " + col + ")");
                return true;
            } else if (key < matrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }
    
        System.out.println("Key not found");
        return false;
    }
    


    public static void main(String[] args) {
        // int matrix[][] = new int[3][3];
        // int n = matrix.length, m= matrix[0].length;
        // Scanner sc =  new Scanner(System.in);
        //     for(int i=0;i<n;i++){
        //         for(int j=0; j<m;j++){
        //             matrix[i][j]= sc.nextInt();
        //         }
        //     }
        
        // // output
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         System.out.print(matrix[i][j]+" ");
        //     }
        //     System.out.println();
        // }


        // int matrix[][] = {
        //     {1, 2, 3, 4},
        //     {5, 6, 7, 8},
        //     {9, 10, 11, 12},
        //     {13, 14, 15, 16}
        // };
        
        // printSpiral(matrix);
        


        // int[][] matrix = {
        //     {1, 2, 3},
        //     {4, 5, 6},
        //     {7, 8, 9}
        // };

        // int sum = diagonalSum(matrix);
        // System.out.println("Diagonal sum: " + sum);
    

        int  matrix[][] = {{10,20,30,40},
                            {15,25,35,45},
                            {27,29,37,48},
                            {32,33,39,50}};


        int key = 33;
        stairSearch(matrix,key);


    }
}




