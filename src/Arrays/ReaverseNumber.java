package Arrays;

import java.util.Arrays;

public class ReaverseNumber {
    public static void main(String[] args) {
        int [] arr={23,34,53,5,632,34,56};

        reverse(arr);
    }
    static void reverse(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<arr.length/2) {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
