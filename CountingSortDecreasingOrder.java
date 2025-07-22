public class CountingSortDecreasingOrder {
    public static void countSort(int []arr) {
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
        largest=Math.max(largest, arr[i]);
        }
        int count[] = new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int j=0;
        for(int i=count.length-1;i>=0;i--){
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
        for(int arr1: arr){
            System.out.print(arr1+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={1,3,1,2,4,5,1,5,3,6,7};
        countSort(arr);
    }
}
