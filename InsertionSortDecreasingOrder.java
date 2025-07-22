public class InsertionSortDecreasingOrder {
    public static void InsertionSort(int []arr){
        for(int i=0;i<arr.length;i++){
            int curr=arr[i];
            int prev = i-1;
            while (prev >= 0 && curr > arr[prev]) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
        for(int arr1: arr){
            System.out.print(arr1 +" ");
        }
    }
    public static void main(String[] args) {
        int arr[] ={6,2,1,3,4,5};
        InsertionSort(arr);
    }
}
 /////////////////// ANS ///////////////////////
 /// OUTPUT = 6 5 4 3 2 1