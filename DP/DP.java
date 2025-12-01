package DP;

public class DP {
    // public static int  fibTabulation(int n ){
    //     // dynamic programming
    //      int dp[] = new int[n+1];
    //      dp[0]= 0;
    //      dp[1]=1;
    //      for(int i=2;i<=n;i++){
    //         dp[i]= dp[i-1]+dp[i-2];

    //      }
    //      return dp[n]; // answer


    // }



     public static int countWay(int n ){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        return countWay(n-1)+countWay(n-2);
     } 

    public static void main(String[] args) {

    //     int n =5;
    //     int f[] = new int[n+1];
    // System.out.println(fibTabulation(n));   



    int n =5;
    System.out.println(countWay(n));
        



}
}
