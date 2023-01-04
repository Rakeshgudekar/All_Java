package allPractice;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
      int[] arr={1,5,3,2,4};
        sort(arr);
    }
    static void sort(int[] arr){
        boolean isSorted=true;
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = 0; j <arr.length-1-i ; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    isSorted=false;
                }
            }
            if(isSorted){
                System.out.println("array is already sorted");
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
