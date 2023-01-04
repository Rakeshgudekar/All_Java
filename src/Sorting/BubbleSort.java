package Sorting;
import java.util.Arrays;


public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={35,4,657,77,54,43,56,77,2,34,9};
        int[] ans=bubbleSort(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] bubbleSort(int[] arr){
        boolean isSorted=true;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr.length-i-1 ; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    isSorted=false;
                }
            }
            if(isSorted){
                break;
            }
        }
        return arr;
    }
}
