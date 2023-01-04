package Sorting;
import java.util.Arrays;
public class CountingSort {
    public static void main(String[] args) {
        int[] arr={1,4,1,3,2,3,4,7};
        sort(arr);
    }
    static void sort(int[] arr){
        //counting max length
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
        }

        // counting frequency of elements and store it.
        int[] count=new int[max+1];
        // max+1----> for including zero as "max" length is
        // 7 given by above for loop ,including
        // 0 should make it 8.hence max+1
        for (int i = 0; i <count.length ; i++) {
            count[arr[i]]++;
        }

        //sorting
        int j=0;
        for (int i = 0; i <count.length ; i++) {
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
