import java.util.*;
public class bubbleSort {

    public static void BubbleSort(int arr[]) {
        for(int turn =0;turn<arr.length-1;turn++) {
            for(int j=0;j<arr.length-1-turn;j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    for(int arr1: arr){
        System.out.print(arr1 +" ");
    }
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[] = {5,4,1,3,2};
        BubbleSort(arr);
    }
}