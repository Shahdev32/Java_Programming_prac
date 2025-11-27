package BitManipulation;

public class BitManipulation {
 
   
    // public static void oddorEven(int n){
    //     int bitMask =1;
    //     if((n & bitMask)==0){
    //         // even number
    //         System.out.println("even number");
    //     }
    //     else{
    //         System.out.println("Odd Number");
    //     }
         
    // }


     public static int getIthBit(int n , int i){

            int bitMask = 1<<i;
            if((n & bitMask) == 0){
                return 0;
            }
            else{
                return 1;
            }
     }



     public static int setIthBit(int n, int i){
        int bitMask= 1<<i;
        return n | bitMask;


     }

      public static int clearIthBit(int n , int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
      }


   public static int updateIthBit(int n , int i, int newBit){
    // if(newBit ==0){
    //     return clearIthBit(n,i );

    // }
    // else{
    //     return  setIthBit(n, i);

    // }

     n = clearIthBit(n, i);
    int bitMask = newBit<<i;
    return n| bitMask;
   }


     public static int clearlastithBit(int n, int i){
        int bitMask = (~0)<<i;
        return n& bitMask;
     }


    public static int clearRangeofBit(int n, int i, int j){
        int a  =((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitMask= a| b;
        return n & bitMask;

    }
    

    public static boolean isPowerofTwo(int n ){
        return (n&(n-1)) == 0;
    }


    public static int countSetBits(int n){
        int count =0;
         while (n>0) {
            if((n & 1) != 0){ // Check our lsb
                count++;
            }
            n= n>>1;     //rightshift 
         }
         return count;
    }


  public static int fastExponent(int a, int n){
    int ans=1;
    while (n>0) {
        if((n&1) != 0){ // Check LSB
            ans = ans*a;
        }
        a=a*a;
        n=n>>1;
        
    }
    return ans;

  }

    public static void main(String[] args) {
        // System.out.println((5&6));  /// use single & 
        // System.out.println((5|6)); // or |
        // System.out.println((5^6)); // xror
        // System.out.println((~5)); // two complement
        // System.out.println((~0));
        // System.out.println((5<<2));
        // System.out.println((6>>1));


        // oddorEven(4);
        // oddorEven(3);


        // System.out.println(getIthBit(10,2));
        // System.out.println(getIthBit(10,3));




        // System.out.println(setIthBit(10, 2));

       // System.out.println(clearIthBit(10, 1));

    //   System.out.println(updateIthBit(10, 2, 1));

     //   System.out.println(clearIthBit(15, 2));

     
 //   System.out.println(clearRangeofBit(10, 2, 4));


//   System.out.println(isPowerofTwo(8));
//   System.out.println(isPowerofTwo(15));

  
// System.out.println(countSetBits(15));

System.out.println(fastExponent(5, 3));


    }

}

