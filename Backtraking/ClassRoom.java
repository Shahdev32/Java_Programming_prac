package Backtraking;

import java.security.PublicKey;

public class ClassRoom {

    public static void changeArr(int  arr[], int i, int val){
        // base case
        if(i == arr.length){
            printArr(arr);
            return;
        }
        // recursion
        arr[i] =val;
        changeArr(arr, i+1, val+1);
        arr[i]= arr[i]-2;

    }


    public static void printArr(int arr[]){
        for(int  i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }



   public static void findSubSets(String str, String ans, int i ){
    // base casse
    if(i == str.length()){
        if(ans.length() == 0){
            System.out.println("null    ");
        }else{
            System.out.println(ans);
        return;
        }
        
    }
    // recursion step
    // if character yes
        findSubSets(str, ans+str.charAt(i), i+1);
        // no choice
        findSubSets(str, ans, i+1);


    // bracktraing is all about choices

   }



  public static void findPermutation(String str, String ans){
    //base case
    // O(N*N! ) time complexity of this code
    if(str.length() == 0){
        System.out.println(ans);
        return;
    }
    
    //Recursion . in choices
    for(int i =0;i<str.length();i++){
        char curr = str.charAt(i);
        //"abcde " = "ab"+"de"
     String    newstr = str.substring(0, i)+ str.substring(i+1);
        findPermutation(newstr, ans+curr);

    }
  }


 public static int gridWays(int i, int j , int n, int m){

    // base case
    if(i==n-1  && j == m-1) {
        // for last call
        return 1;

    } 
     else if(i ==n || j==n){ // boundary cross conditon
        return 0;
     }


     int w1 = gridWays(i+1, j, n, m);
     int w2 = gridWays(i, j+1, n, m);
     return w1+w2;
    

 }

 static final int N = 9;
 static boolean solve(int[][] board) {
    int[] empty = findEmpty(board);
    if (empty == null) return true; // solved

    int row = empty[0], col = empty[1];
    for (int num = 1; num <= 9; num++) {
        if (isSafe(board, row, col, num)) {
            board[row][col] = num;
            if (solve(board)) return true;
            board[row][col] = 0; // backtrack
        }
    }
    return false; // trigger backtracking
}

// Find an empty cell (represented by 0). Returns {row, col} or null if none.
static int[] findEmpty(int[][] board) {
    for (int r = 0; r < N; r++) {
        for (int c = 0; c < N; c++) {
            if (board[r][c] == 0) return new int[]{r, c};
        }
    }
    return null;
}

// Check row, column and 3x3 box validity
static boolean isSafe(int[][] board, int row, int col, int num) {
    // row & column check
    for (int i = 0; i < N; i++) {
        if (board[row][i] == num) return false;
        if (board[i][col] == num) return false;
    }
    // box check
    int boxRow = (row / 3) * 3;
    int boxCol = (col / 3) * 3;
    for (int r = boxRow; r < boxRow + 3; r++) {
        for (int c = boxCol; c < boxCol + 3; c++) {
            if (board[r][c] == num) return false;
        }
    }
    return true;
}

static void printBoard(int[][] board) {
    for (int r = 0; r < N; r++) {
        if (r % 3 == 0 && r != 0) System.out.println("---------------------");
        for (int c = 0; c < N; c++) {
            if (c % 3 == 0 && c != 0) System.out.print("| ");
            System.out.print(board[r][c] == 0 ? ". " : board[r][c] + " ");
        }
        System.out.println();
    }
}









    public static void main(String[] args) {
        // int arr[] = new int [5];
        // changeArr(arr, 0, 1);
        // printArr(arr);





        // String str = "abc";
        // findSubSets(str, "", 0);


        // String str = "abc";

        // findPermutation(str, "");


        // int n=3, m=3;
        // System.out.println(gridWays(0,0, n, m));

        int[][] board = {
            {5,3,0, 0,7,0, 0,0,0},
            {6,0,0, 1,9,5, 0,0,0},
            {0,9,8, 0,0,0, 0,6,0},

            {8,0,0, 0,6,0, 0,0,3},
            {4,0,0, 8,0,3, 0,0,1},
            {7,0,0, 0,2,0, 0,0,6},

            {0,6,0, 0,0,0, 2,8,0},
            {0,0,0, 4,1,9, 0,0,5},
            {0,0,0, 0,8,0, 0,7,9}
        };

        System.out.println("Input puzzle:");
        printBoard(board);

        if (solve(board)) {
            System.out.println("\nSolved puzzle:");
            printBoard(board);
        } else {
            System.out.println("No solution exists.");
        }
    }


    }

