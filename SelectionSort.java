public class SelectionSort {
    public static void selectionSort(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            int minpos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minpos] > arr[j]) {
                    // monpos = j;
                     int temp = arr[minpos];
                     arr[minpos] = arr[j];
                     arr[j] = temp;
                }
            }
            //int temp = arr[minpos];
            //arr[minpos] = arr[i];
            //arr[i] = temp;
        }
        for(int arr1 : arr) {
            System.out.print(arr1+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={5,4,1,3,2};
        selectionSort(arr);
    }
}
