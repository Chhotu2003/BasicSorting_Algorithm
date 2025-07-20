public class InsertionSort {
    public static void insertedSort(int[] arr) {
        for(int i=0;i<arr.length;i++) {
            int curr = arr[i];
            int prev = i-1;
            // finding out the correct pos to insert
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            //insertion 
            arr[prev+1] = curr;
        }
        for(int arr1 : arr) {
           System.out.print(arr1 + " ");
        }
    }
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        insertedSort(arr);
    }
}
// output 1 2 3 4 5