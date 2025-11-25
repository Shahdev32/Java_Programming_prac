package Function;

import java.nio.channels.MulticastChannel;
import java.util.Scanner;
import java.lang.Math;

public class JavaBasic {


    // public static int  calculateSum(int num1, int num2){   // formal paramerter 
    //      int x= num1+num2;
    //     return x;
    // }


    // public static void swap(int a, int b){
    //  int temp =a;
    //   a=b;
    //   b=temp;
    //   System.out.println("value of a is: "+a);
    //   System.out.println("value of b is :"+b);


    // public static int multipe(int a , int b){
    //     int product = a*b;
    //     return product;
    // }
 
    //  public static int fac(int n ){
    //     int f=1 ;
    //     for(int i =1;i<=n;i++)
    //         {
    //             f=f*i;
    //         }
    //         return f ;// fatctorol of n ;

    //  }


    // public static long bicoff(int n , int r){
    //     if (r > n) {
    //         throw new IllegalArgumentException("r cannot be greater than n");
    //     }
    
    //     long fact_n = factorial(n);
    //     long fac_r = factorial(r);
    //     long fact_mnr = factorial(n-r);
    
    //     return fact_n/(fac_r*fact_mnr);
    // }
    

    //  public static int sum(int a, int b){
    //     return a+b;

    //  }

    //  public static int sum(int a, int b, int c){
    //     return a+b+c;

    //  }


    //  public static int sum(int a, int b){
    //     return a+b;

    //  }

    //  public static float sum(float a, float b){
    //     return a+b;

    //  }

    // public static boolean isPrime(int n ){
    //     boolean isPrime= true;
    //     for(int i=2;i<=n-1;i++){
    //         if(n%i==0){   // completed dive
    //             isPrime=false;
    //             break;
    //         }
    //     }
    //     return isPrime;
    // }


    // public static boolean PrimeNRange(int n){
    //     for(int i=2;i<=n;i++){
    //         if(PrimeNRange(i)){
    //        System.out.print(i+" ");
    //         }   
    //     }
    //     return true;
    //     System.out.println(); 
    // }
        


    // binry to decimal
    //  public static void bioToDec(int biNum){
    //     int myNumber = biNum;
    //     int pow =0;
    //     int decNum = 0;
    //     while (biNum>0) {
    //         int lastDig = biNum%10;
    //         decNum=decNum+(lastDig* (int)Math.pow(2, pow));
    //         pow++;
    //         biNum= biNum/10;
    //     }
    //  System.out.println("decimal of "+ myNumber+"is : "+decNum);
    //  }



    // public  static void DecToBin(int n){
    //     int myNum = n;
    //     int pow =0;
    //     int biNum=0;
    //     while (n>0) {
    //         int rem= n%2;
    //         biNum= biNum+(rem* (int)Math.pow(10, pow));
    //         pow++;
    //         n= n/2;    
    //     }
    //     System.out.println("binary form of "+myNum+"="+biNum);
    // }
   

    // public static double average(double x, double y, double z) {
    //     return (x + y + z) / 3;
    //     }

    // public static boolean isEven(int number) {
    //     if(number % 2 == 0) {
    //     return true;
    //     }
    //     else {
    //     return false;
    //     }
    // }

    // public static boolean isPalindrome(int number) {
    //     int palindrome = number; // copied number into variable
    //     int reverse = 0;
    //     while (palindrome != 0) {
    //     int remainder = palindrome % 10;
    //     reverse = reverse * 10 + remainder;
    //     palindrome = palindrome / 10;
    //     }
    
    // if (number == reverse) {
    //     return true;
    //     }
    //     return false;
    // }



    // public static int sumDigits(int n) {
    //     int sumOfDigits = 0;
    //     while(n > 0) {
    //     int lastDigit = n % 10;
    //     sumOfDigits += lastDigit;
    //     n /= 10;
    //     }
    //     return sumOfDigits;
    //     }
    //     }



    // public static  void inverted_raoted_half_paramid(int n){
        
    //     for(int i=1;i<=n;i++){
    //         //spaces
    //         for(int j=1;j<n-i;j++){
    //             System.out.print(" ");

    //         }
    //         // starrs
    //         for(int j=1;j<=i;j++){
    //             System.out.print("*");

    //         }
    //         System.out.println();
    //     }

    // }

    //  public static void inverted_half_parmid_with_numbers(int n ){
    //     for(int i=1;i<=n;i++){
    //         for(int j=1;j<=n-i+1;j++){
    //             System.out.print(j+" ");
    //         }
    //         System.out.println();
    //     }
    //  }

  
    //  public static void  floyed_traingle(int n ){
    //     int counter= 1;
    //     for(int i=1;i<=n;i++){
    //             // how many times will counter will be printed
    //             for(int j=1;j<=i;j++){
    //                 System.out.print(counter+" ");   
    //                 counter++;
    //         }
    //         System.out.println(    
    //         );
    //     }
    //  }



    // public static void zero_one_traingle(int n){
    //     for(int i=1;i<=n;i++){
    //         for(int j=1;j<=i;j++){
    //             if((i+j)%2 == 0){
    //                 System.out.print("1");
    //             }
    //             else{
    //                 System.out.print("0");
    //             }

    //         }
    //         System.out.println();
    //     }
    // }




    public static void butter_fly(int n){
        // the first half
        for(int i=1;i<=n;i++){
            // stars =i print then 
            for(int j=1;j<=i;j++){
            System.out.print("*");
            }
            // spaces = 2(n-i) then 
            for(int j=1;j<=2*(n-i);j++){
            System.out.print(" ");
            }

            // stars = i;
            for(int j=1;j<=i;j++){
            System.out.print("*");
            }
            System.out.println();

            
        }
        // second half
        for(int i=n;i>=1;i--){
             // stars =i print then 
             for(int j=1;j<=i;j++){
                System.out.print("*");
                }
                // spaces = 2(n-i) then 
                for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
                }
    
                // stars = i;
                for(int j=1;j<=i;j++){
                System.out.print("*");
                }    
                System.out.println();

        }
    }



    // public  static void solid_rombus(int n){
    //     for(int i=1;i<=n;i++){
    //         //spaces
    //         for(int j=1;j<=(n-i);j++){  
    //             System.out.print(" ");         
    //      }
    //      //stars
    //      for(int j=1;j<=n;j++){
    //         System.out.print("* ");
    //      }
    //      System.out.println();

    //     }
    // }


    // public static void hollow_rhombus(int n) {
    //     for (int i = 1; i <= n; i++) {
    
    //         // leading spaces
    //         for (int j = 1; j <= (n - i); j++) {
    //             System.out.print(" ");
    //         }
    
    //         // hollow rectangle part
    //         for (int j = 1; j <= n; j++) {
    //             if (i == 1 || i == n || j == 1 || j == n) {
    //                 System.out.print("*");
    //             } else {
    //                 System.out.print(" ");
    //             }
    //         }
    
    //         // move to next line
    //         System.out.println();
    //     }
    // }
    

    // public static void diamond(int n) {

    //     // First half
    //     for (int i = 1; i <= n; i++) {
    
    //         // spaces
    //         for (int j = 1; j <= n - i; j++) {
    //             System.out.print(" ");
    //         }
    
    //         // stars
    //         for (int j = 1; j <= (2 * i - 1); j++) {
    //             System.out.print("*");
    //         }
    
    //         System.out.println();
    //     }
    
    //     // Second half
    //     for (int i = n - 1; i >= 1; i--) {
    
    //         // spaces
    //         for (int j = 1; j <= n - i; j++) {
    //             System.out.print(" ");
    //         }
    
    //         // stars
    //         for (int j = 1; j <= (2 * i - 1); j++) {
    //             System.out.print("*");
    //         }
    
    //         System.out.println();
    //     }
    // }
    


    // public static void numberParamid(int n ){
    //     // outer loop
    //     for(int i =1;i<=n;i++){
    //         // spaces
    //         for(int j=1;j<=n-i;j++){
    //             System.out.print(" ");
    //         }
    //         // numbers
    //         for(int j=1;j<=i;j++){
    //             System.out.print(i+" ");

    //         }
    //         System.out.println();
    //     }
    // }




    // public static void palandromicpatternwithNumbers(int n) {
    //     // outer loop
    //     for (int i = 1; i <= n; i++) {
    
    //         // spaces
    //         for (int j = 1; j <= n - i; j++) {
    //             System.out.print(" ");
    //         }
    
    //         // descending numbers
    //         for (int j = i; j >= 1; j--) {
    //             System.out.print(j);
    //         }
    
    //         // ascending numbers
    //         for (int j = 2; j <= i; j++) {
    //             System.out.print(j);
    //         }
    
    //         System.out.println();
    //     }
    // }
     
    

    




    
    public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter the number a");
    //     int a =sc.nextInt();
    //     System.out.println("Enter the number b");
    //     int b= sc.nextInt();
    //   int y=  calculateSum(a,b); // arguments  or actual paramater 
    //     System.out.println("sum of a and b is :"+y);


     // swap excahge
    //  int a = 5;
    //  int b=10;
    //  swap(a, b);
    //  System.out.println("value of a is: "+a);
    //   System.out.println("value of b is :"+b);

    //     int a=5;
    //     int b=3;
    // int prod=  multipe(a, b);
    // System.out.println("prodcut of a and b is :"+prod);
    // prod= multipe(10, 4);
    // System.out.println("a*b is "+prod);
    
  
    //  System.out.println(fac(4));

    // System.out.println((bicoff(4,5 )));
  
    // System.out.println(sum(3, 4));
    // System.out.println(sum(4, 5,5 ));

    // System.out.println(sum(4,4));
    // System.out.println(sum(4f, 5f));
  

    //  System.out.println(isPrime(5));

        
    // System.out.print( PrimeNRange(100));   
    
        // bioToDec(101);

      //  DecToBin(15);


//  Scanner sc = new Scanner(System.in);
//  System.out.print("Input the first number: ");
//  double x = sc.nextDouble();
//  System.out.print("Input the second number: ");
//  double y = sc.nextDouble();
//  System.out.print("Input the third number: ");
//  double z = sc.nextDouble();
//  System.out.print("The average value is " + average(x, y, z)+"\n" );

 

//  Scanner sc = new Scanner(System.in);
//  int num;
//  System.out.print("Enter an integer: ");
//  num = sc.nextInt();
//  if(isEven(num)) {
//  System.out.println("Number is even");
//  } else {
//  System.out.println("Number is odd");
//     }



// System.out.println("Please Enter a number : ");
// Scanner sc = new Scanner(System.in);
// int palindrome = sc.nextInt();
// if(isPalindrome(palindrome)) {
// System.out.println("Number : " + palindrome + " is a palindrome");
// } else {
// System.out.println("Number : " + palindrome + " is not a palindrome");
// }


// System.out.println(Math.min(4, 5));    // Minimum of two numbers
// System.out.println(Math.max(5, 6));    // Maximum of two numbers
// System.out.println(Math.sqrt(6));      // Square root takes only 1 number
// System.out.println(Math.pow(2, 3));    // Power function is correct

// // Average (since Math.avg does not exist)
// System.out.println((2 + 3) / 2.0);      // Manual average calculation

// // Absolute value (Math.abs takes only one number)
// System.out.println(Math.abs(1));        // or Math.abs(2)



// Scanner sc = new Scanner(System.in);
// System.out.print("Input an integer: ");
// int digits = sc.nextInt();
// System.out.println("The sum is " + sumDigits(digits));


//inverted_raoted_half_paramid(4);
// inverted_half_parmid_with_numbers(5);

//floyed_traingle(5);

//zero_one_traingle(5);
// butter_fly(5);
//solid_rombus(10);
//hollow_rhombus(5);
//diamond(5);
//numberParamid(5);
palandromicpatternwithNumbers(5);






}

}

