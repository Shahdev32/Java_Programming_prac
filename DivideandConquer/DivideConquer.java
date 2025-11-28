package DivideandConquer;

public class DivideConquer {

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int arr[], int si, int ei) {
        // base case
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;

        mergeSort(arr, si, mid);      // left part
        mergeSort(arr, mid + 1, ei); // right part

        merge(arr, si, mid, ei);     // MERGE STEP
    }

    public static void merge(int arr[], int si, int mid, int ei) {

        int temp[] = new int[ei - si + 1];
        int i = si;       // left start
        int j = mid + 1;  // right start
        int k = 0;        // temp index

        // Merge both halves
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // Copy remaining left half
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy remaining right half
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // Copy temp to original array
        for (k = 0; k < temp.length; k++) {
            arr[si + k] = temp[k];
        }
    }

    






  public static void quickSort(){
    
  }





    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        mergeSort(arr, 0, arr.length - 1);
        printArr(arr);
}

}