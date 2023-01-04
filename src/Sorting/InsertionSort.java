package Sorting;
import java.util.Arrays;
public class InsertionSort {
    public static void main(String[] args) {
          int arr[]={2,1,5,3,4};
//          insertion(arr);
        insertionTypetwo(arr);
    }
    static void insertion(int[] arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = i+1; j >0 ; j--) {
                if(arr[j]<arr[j-1]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
                else{
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    static void insertionTypetwo(int[] arr){
        for (int i = 2; i <=arr.length ; i++) {
            for (int j = arr.length-i; j<arr.length-1; j++) {
              if(arr[j]>arr[j+1]){
                  int temp=arr[j+1];
                  arr[j+1]=arr[j];
                  arr[j]=temp;
              }else {
                  break;
              }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
