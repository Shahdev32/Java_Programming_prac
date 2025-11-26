package Array;

public class ArrayCC {

    // public static void update(int marks[],int nonchageable){
    //      nonchageable = 10;

    //     for(int i=0;i<marks.length;i++){
    //         marks[i]=marks[i]+1;

    //     }
    // }




    // public static int linearSearch(int number[], int key){
    
    //      for(int i= 1;i<number.length;i++){
    //         if(number[i]==key){
    //             return i;
    //         }

    //      }
    //      return -1;
    // }


    // public static int getLargest(int numbers[]){
    //     int largest = Integer.MIN_VALUE; // -infinity
    //     int smallest = Integer.MAX_VALUE; // +infinity
    //     for(int i=0;i<numbers.length;i++){
    //         if(largest< numbers[i]){
    //             largest= numbers[i];

    //         }
    //         if(smallest>numbers[i]){
    //             smallest=numbers[i];
    //         }
    //     }
    //     System.out.println("smallest  value is :"+smallest);
    //     return largest;
    // }



    // public static int binarySearch(int numbers[], int key){
    //     int start= 0, end = numbers.length-1;
    //     while (start<=end) {
    //         int mid =   (start+end)/2;

    //         // comparsion
    //         if(numbers[mid]==key){
    //             return mid;
    //         }
    //         if(numbers[mid] < key){
    //             start = mid+1;

    //         }
    //         else{
    //             end = mid-1;

    //         }
            
    //     }
    //     return -1;

    // }



    // public  static void reverse(int numbers[]){
    //     int first =0, last = numbers.length-1;

    //     while (first<last) {
    //         // swap
    //         int temp = numbers[last];
    //         numbers[last]= numbers[first];
    //         numbers[first]= temp;
            
            
    //         first++;
    //         last--;
    //     }
    // }




//    public static void printPairs(int numbers[]){
//      int totalpairs = 0;

//     for(int i=0;i<numbers.length;i++){
//         int curr= numbers[i]; // 2,4,6,8,10
//         for(int j= i+1;j<numbers.length;j++){

//             System.out.print(" ("+curr+" ,"+numbers[j]+" )");
//             totalpairs++;
//         }
//         System.out.println();
//     }

//     System.out.print("toal pairs is : "+totalpairs);
//    }



// public static void printSubArray(int numbers[]){
//     int totalsubar = 0;

//     for(int i = 0; i < numbers.length; i++){     // i < length (NOT <=)
//         for(int j = i; j < numbers.length; j++){
//             for(int k = i; k <= j; k++){         // start = i, end = j
//                 System.out.print(numbers[k] + " ");
//             }
//             totalsubar++;
//             System.out.println();
//         }
//         System.out.println();
//     }

//     System.out.println("Total subarrays: " + totalsubar);
// }





// public static void maxSubArraySum(int numbers[]) {
//     int maxSum = Integer.MIN_VALUE;

//     for(int i = 0; i < numbers.length; i++) {
//         for(int j = i; j < numbers.length; j++) {
//             int currSum = 0;

//             // sum of subarray from i to j
//             for(int k = i; k <= j; k++) {
//                 currSum += numbers[k];
//             }

//             // update max sum
//             if(currSum > maxSum) {
//                 maxSum = currSum;
//             }
//         }
//     }

//     System.out.println("Maximum Subarray Sum: " + maxSum);
// }





// public static void maxSubArraySumPrefix(int numbers[]) {
//     int n = numbers.length;

//     // Step 1: Build prefix array
//     int prefix[] = new int[n];
//     prefix[0] = numbers[0];

//     for(int i = 1; i < n; i++) {
//         prefix[i] = prefix[i - 1] + numbers[i];
//     }

//     int maxSum = Integer.MIN_VALUE;

//     // Step 2: Calculate subarray sums using prefix sums
//     for(int i = 0; i < n; i++) {
//         for(int j = i; j < n; j++) {
//             int currSum;

//             // sum of subarray (i ... j)
//             if(i == 0) {
//                 currSum = prefix[j];
//             } else {
//                 currSum = prefix[j] - prefix[i - 1];
//             }

//             if(currSum > maxSum) {
//                 maxSum = currSum;
//             }
//         }
//     }

//     System.out.println("Maximum Subarray Sum (Prefix): " + maxSum);
// }




   
// public static void kadanes(int numbers[]) {
//     int maxSum = Integer.MIN_VALUE;
//     int currSum = 0;

//     for(int i = 0; i < numbers.length; i++) {
//         currSum += numbers[i];

//         // update max sum
//         if(currSum > maxSum) {
//             maxSum = currSum;
//         }

//         // reset if current sum becomes negative
//         if(currSum < 0) {
//             currSum = 0;
//         }
//     }

//     System.out.println("Maximum Subarray Sum (Kadane): " + maxSum);
// }
 


// public static int trapped_water(int height[]) {
//     int n = height.length;

//     // left max boundary
//     int leftMax[] = new int[n];
//     leftMax[0] = height[0];
//     for (int i = 1; i < n; i++) {
//         leftMax[i] = Math.max(height[i], leftMax[i - 1]);
//     }

//     // right max boundary
//     int rightMax[] = new int[n];
//     rightMax[n - 1] = height[n - 1];
//     for (int i = n - 2; i >= 0; i--) {
//         rightMax[i] = Math.max(height[i], rightMax[i + 1]);
//     }

//     // calculate trapped water
//     int trappedWater = 0;
//     for (int i = 0; i < n; i++) {
//         int waterLevel = Math.min(leftMax[i], rightMax[i]);
//         trappedWater += waterLevel - height[i];
//     }

//     return trappedWater;
// }


    // public static int busyAndSellStock(int prices[]){
    //     int buyprices = Integer.MAX_VALUE;
    //     int maxProfit= 0;
    //     for(int i=0;i<prices.length;i++){
    //         if(buyprices<prices[i]){ // prifit

    //             int profit = prices[i]-buyprices;
    //             maxProfit= Math.max(maxProfit, profit);

    //         }else{
    //             buyprices= prices[i];

    //         }
    //     }
    //     return maxProfit;

    // }




    public static void main(String[] args) {

        // int marks[] = {98,99,45};
        // int nonchageable =5;
        // update(marks,nonchageable);
        // System.out.println( nonchageable);

        // // to print our marks
        // for(int i=0;i<marks.length;i++){
        //     System.out.print(marks[i]+" ");

        // }
        // System.out.println();
 


    // int number[] = {2,4,6,8,10,12,14,16};
    // int key = 10;
    // int index = linearSearch(number, key);
    // if(index == -1 ){
    //     System.out.println("not found ");

    // }
    // else{
    //     System.out.println("key is at index : "+index);
    // }


    // int number[] = {1,2,6,3,5};
    // System.out.println("largest value is : "+getLargest(number));
     
    

    // int numbers[] = {2,4,6,8,10,12,14,16};
    //  int key =10;
    // System.out.println("index for key is : "+binarySearch(numbers, key));


    // int numbers[] = {2,4,6,8,10};
    // reverse(numbers);
    // // print the array
    // for(int i=0;i<numbers.length;i++){
    //     System.out.print(numbers[i]+" ");
    // }

    // System.out.println();
    


    //  int numbers[] = {2,4,6,8,10};
    //  printPairs(numbers);
  

    //  int numbers[] = {2,4,6,8};
    //  printSubArray(numbers);



// int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
// maxSubArraySum(arr);


// int[] arr = {1, -2, 6, -1, 3};
// maxSubArraySumPrefix(arr);

  


// int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
// kadanes(arr);


//  int height[]= {4,2,0,6,3,2,5};
// System.out.println(trapped_water(height));


//   int prices[]= {7,1,5,3,6,4};
//   System.out.println(prices);




    }
        
    }

