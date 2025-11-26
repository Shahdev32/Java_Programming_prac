package String;

import java.util.Scanner;

public class Strings {

//  public static void printLetter(String str){
//     for(int i=0;i<=str.length();i++){
//         System.out.print(str.charAt(i)+" ");
//     }
//     System.out.println();
//  }

   
//  public static boolean isPalandrome(String str){
//    for(int i =0;i<str.length()/2;i++){
//       int n = str.length();
//       if(str.charAt(i) == str.charAt(n-1-i))
//       {
//          // not a palandrome
//          return true;
//       }   
//    }
//    return false;
//}




// public static float getPath(String path) {
//    int x = 0, y = 0;

//    for (int i = 0; i < path.length(); i++) {
//        char dir = path.charAt(i);

//        if (dir == 'S') {
//            y--;
//        } else if (dir == 'N') {
//            y++;
//        } else if (dir == 'W') {
//            x--;
//        } else if (dir == 'E') {
//            x++;
//        }
//    }

//    // distance from origin
//    return (float) Math.sqrt(x * x + y * y);
// }

  


//   public static  String subString(String str, int si, int ei){
//    String  substr= "";
//    for(int i =  si; i<ei;i++){
//       substr+=str.charAt(i);

//    } 
//    return substr;
//   }


//  public static String toUpperCase(String str){
//    StringBuilder sb = new StringBuilder(" ");
//    char ch = Character.toUpperCase(str.charAt(0));
//    sb.append(ch);
//    for(int i=1; i<str.length();i++){
//       if(str.charAt(i) == ' ' && i<str.length()-1){
//          sb.append(str.charAt(i));
//          i++;
//          sb.append(Character.toUpperCase(str.charAt(i)));

//       }
//       else{
//          sb.append(str.charAt(i));

         
//       }
//    }

//    return sb.toString();

//  }




// public static String compressString(String str){
//    String newStr   = " ";
//    for(int i=0;i<str.length();i++){
//       Integer count =1 ;
//          while (i<str.length()-1 && str.charAt(i ) == str.charAt(i+1)) {
//             count++;
//             i++;
            
//          }
//          newStr+=str.charAt(i);
//          if(count>1){
//             newStr+= count.toString();
//          }
//    }
//    return newStr;
// }








    public static void main(String[] args) {
    //     char arr[] ={'a','b','c'};
    //     String str = "abcd";
    //     String str2 = new String("xyz@#");
    //     // java string are immutable
    //     // java string can not change the string in the previois . 

    //     Scanner sc = new Scanner(System.in);
    //   // String name =  sc.next();
    //   String name = sc.nextLine() ;
    //    System.out.println(name);


    //    String fullname = "Tonay Stark";
    //    System.out.println(fullname.length());

     //   concatationa
      //   String firstName = "Shahdev";
      //   String lastName = "Kuamr";
      //   String fullName = firstName+ " "+ lastName;
       // System.out.println(fullName+" ");
       // System.out.println(fullName.charAt(2));

       // printLetter(fullName);


      //  String str = "mam";
      //  System.out.println(isPalandrome(str));
  
      // String path  = "WNEENSENNN";
      // System.out.println(getPath(path));  
        
         // String s1 ="Tony";
         // String s2 = "Tony";
         // String s3 = new String("Tony");
         // if(s1 == s2){
         //    System.out.println("Strings are equal");
         // }
         // else{
         //    System.out.println("not equal");
         // }

         // if(s1 == s3){
         //    System.out.println("Strings are equal");
         // }
         // else{
         //    System.out.println("not equal");
         // }

         // if(s1.equals(s3)){
         //    System.out.println("Strings are equal");
         // }
         // else{
         //    System.out.println("not equal");
         // }


         //substring
         // String str = "Hello World";
      //   System.out.println( str.substring(0,5));
      // System.out.println(subString(str, 0, 5));




   //    String fruits[]= { "apple","mango","banana"};
   //    String largest = fruits[0];
   //    for(int i=0;i<fruits.length;i++){
   //       if(largest.compareTo(fruits[i])<0){
   //          largest = fruits[i];

   //       }
   //    }
   //    System.out.println(largest);

   //  }





   //  StringBuilder sb = new StringBuilder(" ");
   //  for(char  ch ='a'; ch <='z';ch++){
   //    sb.append(ch);

   //  }
   //  System.out.println(sb);
   //  System.out.println(sb.length());


     
   //  String str = "Hi, i am shahev";
   //  System.out.println(toUpperCase(str));


   //  String str = "aaabbcccdddee";
   //  System.out.println(compressString(str));

    
   



}

}
