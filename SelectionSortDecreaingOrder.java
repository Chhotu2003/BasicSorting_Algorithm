public class SelectionSortDecreaingOrder {
    public static void selectionSort(int arr[]) {
      for(int i=0;i<arr.length-1;i++){
        int minpos=i;
        for(int j=i+1;j<arr.length;j++){
            if(arr[minpos] < arr[j]){
                int temp = arr[minpos];
                arr[minpos]=arr[j];
                arr[j]=temp;
            }
        }
      }
      for(int arr1: arr){
        System.out.print(arr1+ " ");
      }
    }
    public static void main(String[] args) {
        int arr[] ={2,3,1,5,6,4};
        selectionSort(arr);
    }
}

//////////// ans ////////////////
/// output = 6 5 4 3 2 1
