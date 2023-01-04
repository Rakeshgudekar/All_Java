package allPractice;
import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
       int[] arr={1,2,3,7,5,4,6};
        sort(arr);
    }
    static void sort(int[] arr){
        for (int i = 0; i <arr.length-1; i++) {
            int min=i;
            for (int j = i+1; j <arr.length; j++) {
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            //swap
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
