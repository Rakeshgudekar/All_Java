package Sorting;
//recursion
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
  int [] arr={4,6,9,3,5,2,1,8,7};
      mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSort(int[] arr,int si,int ei){
        //base case
        if(si>=ei){
            return;
        }
        // working
        int mid=si+(ei-si)/2;

        //left array recursion
        mergeSort(arr,si,mid);

        // right array recursion
        mergeSort(arr,mid+1,ei);

        //merge the all small elements which are divided in the above process
        //call function for it.
        merge(arr,si,mid,ei);

    }
    static void merge(int[] arr, int si, int mid ,int ei){
        int[] temp=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;//initialize temp array
        while(i<=mid && j<=ei ){
            if(arr[i]<arr[j]){
               temp[k]=arr[i];
               k++;
               i++;

            }else{
                temp[k]=arr[j];
                j++;
                k++;
            }
        }
        //for remaining elements on left side
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        //for remaining elements on right side
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        // copy temp to original array
        for (k = 0,i=si; k < temp.length; k++,i++) {
            arr[i]=temp[k];
        }


    }
}
