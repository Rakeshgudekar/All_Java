package allPractice;

import java.util.Arrays;

public class MergeSortPrac {
    public static void main(String[] args) {
        int [] arr={4,6,9,3,5,2,1,8,7};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
    static void mergeSort(int[] arr,int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        mergeSort(arr,si,mid);
        mergeSort(arr,si,mid);   // left side
        mergeSort(arr,mid+1,ei);  // right side
        mergeing(arr,si,mid,ei);
    }
    static void mergeing(int[] arr, int si,int mid,int ei){
        int[] temp=new int[ei-si+1];
        int i = si;
        int j=mid+1;
        int k=0;

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
                k++;
            }else{
                temp[k]=arr[j];
                k++;
                j++;
            }
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        //copy
        for (k=0,i=si; k <temp.length ; k++,i++) {
            arr[i]=temp[k];
        }

    }
}
