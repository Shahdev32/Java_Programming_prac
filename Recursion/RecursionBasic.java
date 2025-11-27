package Recursion;

public class RecursionBasic {

    public static void printDec(int n ){

        // base case
        if(n==1){
            System.out.println(1);
            return;
        }
        // define function
        System.out.print(n+" ");
        // inner function
        printDec(n-1);

    }


    public static void printInc(int n ){
        // base case
        if(n==1){
            System.out.print(1);
            return;
        }
        printDec(n-1);
        System.out.print(n+" ");

    }


    public static int factorial(int n ){
        if(n==0){  // base case
            return 1;
        }
        int fn1= factorial(n-1);
        int fn = n*factorial(n-1);
        return fn;

    }


    public static int calculateSum(int n ){
        if(n==1){   // base case
            return 1;
        }
        int sm1= calculateSum(n-1);
        int sm2 = n+calculateSum(n-1);
        return sm2;
    }

    public static int fib(int n){
        //basecase
        if(n ==0 || n ==1){
            return n;
        }
        int fnm1 = fib(n-1);
        int fnm2 = fib(n-2);
        int fn = fnm1+fnm2;
        return fn;

    }

    public static boolean isSorted(int arr[],int i){
        //base case
        if(i == arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1])
        {
            return false;
        }
        return isSorted(arr, i+1);
    }



    public static int firstOccurance(int arr[], int key, int i ){
        // base case
        if(arr[i] == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
         return firstOccurance(arr, key, i+1);


    }

    public static int lastOccurance(int arr[], int key, int i ){
        if (i == arr.length) {
            return -1;
        }
    
        int isfound = lastOccurance(arr, key, i + 1);
    
        if (isfound == -1 && arr[i] == key) {
            return i;
        }
    
        return isfound;
    }


      public static int power(int x, int n){
        // base case
            if(n == 0 )
            {
                return 1;
            }
        int xm1 = power(x, n-1);
        int xn = x*(xm1);
        return xn;
        // return x*poweer(x,n-1)


      }


    public static int optimizedPower(int a, int n){
        if(n == 0){
            return 1; 
        }
        int halfpower = optimizedPower(a, n/2);
        int halfpowersqr =halfpower*halfpower;
        // if  n is odd
        if(n%2  != 0){
            halfpowersqr = a*halfpowersqr;
        }
        return halfpowersqr;
    }



    public static int tilingProblem(int n ){ //2XN (floor size)
        // base cases
        if(n ==0 || n == 1){
            return 1;
        }
        //kam
        //vertical choice
        int fnm1 = tilingProblem(n-1);


        // horizontal choices
        int fnm2 =  tilingProblem(n-2);

        int totoalway = fnm1+fnm2;
        return totoalway;
    }



    public static void removeDuplicate(String str, int idx, StringBuilder newStr, boolean map[]) {
        // base case
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
    
        // work
        char currChar = str.charAt(idx);
    
        if (map[currChar - 'a'] == true) {
            // duplicate → skip this character
            removeDuplicate(str, idx + 1, newStr, map);
        } else {
            // mark & add to new string
            map[currChar - 'a'] = true;
            removeDuplicate(str, idx + 1, newStr.append(currChar), map);
        }
    }




    public static int friendsPairing(int n){
        //base case
        if(n ==1 || n==2){
            return n;
        }
        // choice
        //single
        int fnm1 = friendsPairing(n-1);

        //paris
         int fnm2 = friendsPairing(n-2);
         int pairsWays = (n-1)*fnm2;


         // totalways
         int totalway = fnm1+pairsWays;
         return totalway;


    }
    

    
    public static void main(String[] args) {
        // int n  =10;
        // printDec(n);


        // int n =10;
        // printInc(n);

    //     int n=5;
    //  System.out.println(factorial(n));

//     int n=5;
//    System.out.println(calculateSum(n));


//         int n =25;
//    System.out.println(fib(n));

        // int arr[] = {1,2,3,4,5};
        // System.out.println(isSorted(arr, 0));



    // int arr[] = {8,3,6,3,2,5};
    // System.out.println(firstOccurance(arr, 5, 0));

    // int arr[] = {5,5,5,5};
    // System.out.println(lastOccurance(arr, 5, 0));


     //   System.out.println(power(2, 3));

    // System.out.println(optimizedPower(2, 3));


   // System.out.println(tilingProblem(2));

//     String str = "shahdev";
//    removeDuplicate(str ,0, new StringBuilder(" "), new boolean[26]);


System.out.println(friendsPairing(3)) ;// answer should be 4


    }
}
