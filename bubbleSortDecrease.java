public class bubbleSortDecrease {
    public static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length-1;i++) {
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int arr1:arr){
            System.out.print(arr1 +" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={1,3,5,2,4};
        bubbleSort(arr);
    }
}

/////////// ans /////////
/// output = 5 4 3 2 1