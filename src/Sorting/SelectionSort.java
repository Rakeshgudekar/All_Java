package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
     int[] arr={4,3,5,2,1};
     selectionSort(arr);
    }
    static void selectionSort(int[] arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            int minpos=i;
            for (int j = i+1; j <arr.length; j++) {
                if(arr[minpos]>arr[j]){
                    minpos=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minpos];
            arr[minpos]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
