import java.util.Scanner;

public class JavaBasic {
    public static void main(String args[]){
   
    //    int a = 25;
    //    long b= a;
    //    System.out.println(b);
    
    //      long b = 25;
    //    int  a= b;
    //    System.out.println(a);


    //  float a = 25.9999f;
    //  int b = (int)a;
    //  System.out.println(b);

    //  char  ch = 'c';
    //  int number = ch;
    //  System.out.println(number);

//   Scanner sc = new Scanner(System.in);
//   System.out.println("Enter three numbers");
//   int a = sc.nextInt();
//   int b = sc.nextInt();
//   int c = sc.nextInt();
//   int sum = a+b+c;
//   int y= 3;
//   int x = sum/y;
//   System.out.println("average of three numbers is :"+x);


// Scanner sc= new Scanner(System.in);
// System.out.println("Enter the number of side ");
// int side = sc.nextInt();
// int area = side*side;
// System.out.println(area);

// Scanner sc = new Scanner(System.in);
// float pensil = sc.nextFloat();
// float pen = sc.nextFloat();
// float eraser = sc.nextFloat();
// float total = pensil+ pen + eraser;
// float x = total+(18/100);
// System.out.println("total cost of items are: "+x);

// byte b= 4;
// char c = 'a';
// short s = 512;
// int i = 1000;
// float f = 3.14f;
// double d = 99.9954;
//  double result = (f*b)+ (i%c)-(d*s);
//  System.out.println(result);

// int $ = 24;

// Arithemtic opertaor
//    int A = 20;
//    int B = 10;
//    System.out.println("add = "+(A+B));
//    System.out.println("sub   = "+(A-B));
//    System.out.println("multiply  = "+(A*B));
//    System.out.println("Divide= "+(A/B));
//    System.out.println("Module   = "+(A%B));


//Unary operator
// preincreament
// int a = 10;
// int b = ++a;
// System.out.println(a);
// System.out.println(b);


// post increment 
// int a = 10;
// int b = a++;
// System.out.println(a);
// System.out.println(b);

// preand post decrement 

// int a = 5;
// int b = --a;
// System.out.println(a);
// System.out.println(b);

// int a = 5;
// int b = a--;
// System.out.println(a);
// System.out.println(b);



// relational operator
// int a = 10;
// int b = 5;
// System.out.println((a==b));
// System.out.println((a!=b));
// System.out.println((a>b));
// System.out.println((a<b));
// System.out.println((a>=b));
// System.out.println((a<=b));



// logical operator
// System.out.println((3>2) && (5>0));
// System.out.println((2>3) && (5>0));
// System.out.println((3>2) && (0>5));
// System.out.println((0>5) && (0>5));

// System.out.println((3<2 )|| (5<0) );
// System.out.println((3>0) || (5<0));

// System.out.println(!(0>5));

// asigment operator
//  int a = 10;
//  int a = a+10;
        // int a= a-10;
        // int a= a*10;
        // int a= a?10;

//  a+=10;
        // a-=10;
        // a/=10;
        // a%=10;


//  System.out.println(a );
   
 
        
    //  int age = 16;
    //  if (age >= 18) {
    //     System.out.println("adult: Drive, vote");
        
    //  }

    //  if(age > 13  && age < 18){
    //     System.out.println("teenage");
    //  }

    //  else
    //  {
    //     System.out.println("not adult");
    //  }


    // example 1

    // int A =1;
    // int B =2;
    // if(A>=B){
    //     System.out.println("A is largest to B");
    // }
    // else
    // {
    //     System.out.println("B is largest than A ");
    // }


// Example 2
    //    int number= 8;
  
    //  if( number%2 == 0){
    //     System.out.println("Even");

    //  }
    //  else{
    //     System.out.println("Odd");
    //  }

    // Example 3 


    //   int age = 16;
    //  if (age >= 18) {
    //     System.out.println("adult: Drive, vote");
        
    //  }

    //   else if  (age > 13  && age < 18){
    //     System.out.println("teenage");
    //  }

    //  else
    //  {
    //     System.out.println("not adult");
    //  }



    // Example 4
    //  Scanner sc = new Scanner(System.in) ;
    //  int income = sc.nextInt();
    //  int tax;

    //   if(income < 500000){
    //     tax = 0;
    //   }  
    //   else if (income >= 500000 && income <100000 ){
    //     tax = (int) (income * 0.2);

    // }
    // else
    // {
    //     tax =  (int )(income*0.3);

    // }

    // System.out.println("U tax is :"+tax);
 
  // Example 5
   

//    int A= 6,B=3, C= 1;
//    if((A>=B) && (A>=C)){
//     System.out.println("largest is A");
//    }
//    else if(B>=C){
//     System.out.println("largest is B");
//    }
//    else{
//     System.out.println("largest is C");
//    }


// Example 6
  
//  int number =3;
//   String type  = ((number%2 == 0)) ? "Even" : "Odd";
//   System.out.println(type);

// Example 7

// int age= ((5>=3)) ? 5 : 3;
// System.out.println(age);

// Example 8

//  int marks = 22;

//   String repostcast = marks >= 33 ? "Pass": "Fail";
// System.out.println(repostcast);

//     }

// Example 9 

//  int number =3 ;
//  switch (number) {
//     case 1:
//         System.out.println("Somasa");
//         break;
//     case 2:
//         System.out.println("Bruger");
//      break;
//         case 3:
//             System.out.println("Mango Shake");
//     break;

//     default:
//         System.out.println("Nothing");
//         break;
//  } 
 
 // Example 10
   
//  Scanner sc = new Scanner(System.in);
//  System.out.println("Enter a ");
//  int  a = sc.nextInt();
//  System.out.println(" Enter b");
//  int b = sc.nextInt();
//  System.out.println("Enter operator ");
//  char operator  = sc.next().charAt(0);
 
  

//  switch (operator) {
//     case '+':
//         System.out.println(a+b);
//         break;
//         case '-':
//             System.out.println(a-b);
//             break;
//             case '*':
//                 System.out.println(a*b);
//                 break;
//                 case '/':
//                     System.out.println(a/b);
//                     break;
//                     case '%':
//                         System.out.println(a%b);
//                         break;
 
//     default:
//         break;
//  }


// Exampel 11

//  int number = -5;
//  if(number >=0){
//     System.out.println("Postive number");

//  }
//  else
//  {
//     System.out.println("Negative number");
//  }

// Example 12
// double temp = 103.5;
// if (temp >=100){
//     System.out.println("U have fever");
// }
// else{
//     System.out.println("U dont have fever");
// }

// Example 13

// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the day number :");
// int number = sc.nextInt();

// switch (number) {
//     case 1:
//         System.out.println("Monday");
//         break;
//         case 2:
//         System.out.println("Tuesday");
//         break;
//         case 3:
//         System.out.println("Wednesday");
//         break;
//         case 4:
//         System.out.println("Thrusday");
//         break;
//         case 5:
//         System.out.println("Friday");
//         break;
//         case 6:
//         System.out.println("Saturday");
//         break;
//         case 7:
//         System.out.println("Sunday");
//         break;

//     default:
//         System.out.println("Noday");
//         break;
// }

// Example 14
 
//  int a = 63, b = 36;
//  boolean x = (a < b ) ? true : false;
//  System.out.println(x);
//  int y= (a > b ) ? a : b;
//  System.out.println(y);

// Exampel 15

// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the year");
// int year  = sc.nextInt();

// if(year % 400 == 0) {
//     System.out.println("Leap Year");
// }
// else if(year % 100 == 0) {
//     System.out.println("Not a Leap Year");
// }
// else if(year % 4 == 0) {
//     System.out.println("Leap Year");
// }
// else {
//     System.out.println("Not a Leap Year");
// }
  
// System.out.println("Hello World");
// System.out.println("Hello WOrld");

  
// int counter =0;
// while(counter < 10){
//     System.out.println("Hello World");
//     counter++;

// }
// System.out.println( "print HW 100X");
    
// }

//  int number = 1;
//  while (number<=10) {
//     System.out.print(number);
//     number++;   
//  }

// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the number");
// int range = sc.nextInt();
// int counter=1;
// while (counter<=range) {
//     System.out.print(counter+" ");
//     counter++;   
// }


//  Scanner sc = new Scanner(System.in);
// System.out.println("Enter the number");
// int n = sc.nextInt();
// int i=1;
// int sum =0;
// while(i<=n){
//     sum+=i;
//     i++;
// }
// System.out.println(sum);

// int i =1;
// for(int i=1;i<=10;i++)
//    {
//      System.out.println("Mr: Gotam Kumar"+ " ");
//    }


    // for(int line =1;line<=4;line++){
    //     System.out.println("****");
    // }
     
    // int line=1;
    // while(line<=4){
    //     System.out.println("****");
    //     line++;
    // }

    // int number  = 10899;

    //  while (number>0){
    //     int lastDig = number%10;
    //     System.out.print(lastDig+" ");
    //     number = number/10;

    //  }
    //  System.out.println();

 
    // int n = 10899;
    // int rev =0;

    // while(n>0){
    //     int lastDig = n%10;
    //     rev= (rev*10)+lastDig;
    //     n=n/10;
    // }
    // System.out.println(rev);


    // int counter =1;
    // do{
    //     System.out.println("Hello World");
    //     counter++;
    // }
    // while(counter<=10);

//   for(int i=0;i<=5;i++){
//     if(i==3)
//         break;
//     System.out.println(i);
//   }
//   System.out.println("I am out the loop ");

    // Scanner sc = new Scanner(System.in);
    
    // do{
    //     System.out.println("Enter the number:");
    //     int number = sc.nextInt();
    //     if(number%10 == 0){
    //         break;
    //     }
    // }while(true);


//  for(int i=0;i<=5;i++){
//     if(i==3){
//         continue;
//     }
        
//     System.out.println(i);
//   }
//   System.out.println("I am skip the loop ");


//  Scanner sc = new Scanner(System.in);
//  do{
//     System.out.println("Enter your number");
//     int n = sc.nextInt();

//      if (n%10  == 0){
//         continue;
//      }
//         System.out.println("number was : "+n);
//  }while(true);


//  Scanner sc = new Scanner(System.in);
//  System.out.println("Enter the number:");
//  int n = sc.nextInt();
//  if(n==2 ){
//     System.out.println("n is prime");
//  }

//  else{
//     boolean isPrime = true;
//     for(int i =2;i<=Math.sqrt(n);i++){
//         if(n%2==0){  // n is multipe of i (i is not  euqual to 1 or 0)
//             isPrime=false;
//         }
//         if(isPrime== true){
//             System.out.println("n is prime");
//         }
//         else{
//             System.out.println("n is not prime");
//         }
//     }
//  }




//  for(int i=0; i<5; i++) {
//     System.out.println("Hello");
//     i+=2;
//     }


//  Scanner sc = new Scanner(System.in);
//   int number;
//   int choice;
//   int evensum=0;
//   int oddsum =0;

//   do{
//     System.out.println("Enter the number:");
//     number= sc.nextInt();
//     if(number%2 ==0){
//         evensum+=number;

//     }else{
//         oddsum+=number;

//     }
//     System.out.println("do you want to continue ? Press 1 for yes or 0 for no ");
//     choice= sc.nextInt();

//   }while(choice==1);

//   System.out.println("sum of even numbers : "+evensum);
//   System.out.println("sum of odd numbers  : "+oddsum);



// Scanner sc = new Scanner(System.in);
//  int num; // To hold number
//  int fact = 1; // To hold factorial
//  System.out.print("Enter any positive integer: ");
//  num = sc.nextInt();
//  for(int i=1; i<=num; i++) {
//  fact *= i;
//  }
//  System.out.println("Factorial: "+ fact);


    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter number:");
    // int n = sc.nextInt();
    // for(int i=1; i<=10; i++) {
    // System.out.println(n + " * " + i + " = " + n*i);
    // }
    

    
    // for(int i = 0; i <= 5; i++ ) {
    //     System.out.println("i = " + i );
    //     }
    //     System.out.println("i after the loop = " + i ); // scope is defined outside of the loop so gives errors  complation error


    // for(int line= 1;line<=4;line++){
    //     // for one line 
    //     for(int star=1;star<=line;star++){
    //         System.out.print("*");
    //     }  
    //     System.out.println();

    // }


    // for(int line=1;line<=4;line++){
    //     int n =4;
    //     for(int star=1;star<=n-line+1;star++){

    //         System.out.print("*");
    //     }
    //     System.out.println();
            
    //     }


    // int n =4;
    // char ch ='A';
    // //outer loop
    // for(int line =1;line<=n;line++){
    //     //inner loop
    //     for(int chars=1;chars<=line;chars++){
    //         System.out.print(ch);
    //         ch++;

    //     }
    //     System.out.println();
    // }


    // int rows = 4;
    // int cols = 5;

    // for (int i = 0; i < rows; i++) {
    //     for (int j = 0; j < cols; j++) {
    //         // Logic: First row OR Last row OR First col OR Last col
    //         if (i == 0 || i == rows - 1 || j == 0 || j == cols - 1) {
    //             System.out.print("* ");
    //         } else {
    //             System.out.print("  "); // Double space to match alignment
    //         }
    //     }
    //     System.out.println(); // New line
    // }



    int rows = 4;

        for (int i = 1; i <= rows; i++) {
            
            // Loop for Spaces: (Total Rows - Current Row)
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  "); 
            }
            
            // Loop for Stars: (Equal to Current Row)
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            
            System.out.println();
        }

       
    

    
}
}

// boilerplate code 




