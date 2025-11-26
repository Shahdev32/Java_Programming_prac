package Sorting;

public class BasicSorting {
    public static void bubbleSort(int arr[]){
        for(int turn=0;turn<arr.length-1;turn++){
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]> arr[j+1]){
                    // swap
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                }
            }

        }

    }
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }

    
    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int currminpos= i;
            for(int j=i+1;j<arr.length;j++){
                    if(arr[currminpos]> arr[j]){
                        currminpos=j;

                    }
            }
            // swap
            int temp = arr[currminpos];
            arr[currminpos]= arr[i];
            arr[i]=temp;
        }
    }



    public static void insertionSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int curr =arr[i];
            int prev=i-1;
            while (prev>=0 && arr[prev]> curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            // insetion 
            arr[prev+1]=curr;

        }
    }


    public static void countingSort(int arr[]){
        int largest= Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest = Math.max(largest,arr[i]);
        }
        int count[] = new int[largest+1];
        for(int i=0; i<arr.length;i++){
            count[arr[i]]++;

        }
        // sorting
        int j=0;
        for(int i=0;i<count.length;i++){
            while (count[i]>0) {
                arr[j]=i;
                j++;
                count[i]--;

                
            }
        }
    }

    public static void main(String[] args) {
        // int arr[] = {5,4,1,3,2};
        // bubbleSort(arr);
        // printarr(arr);


        // int arr[] = {5,4,1,3,2};
        // selectionSort(arr);
        // printarr(arr);

        
        //  int arr[] = {5,4,1,3,2};
        // insertionSort(arr);
        // printarr(arr);

         int arr[] = {1,4,1,3,2,4,3,7};
        countingSort(arr);
        printarr(arr);


    }   
}
