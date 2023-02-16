package Sorting;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr={5,3,6,8,4,2,9};
        quickSort(arr,0,arr.length-1);
        printArr(arr);
    }
    static void quickSort(int[] arr, int si,int ei){
        if(si>=ei){
            return;
        }
        int pIndex=partition(arr,si,ei);
        quickSort(arr,si,pIndex-1); // for left side of pivot
        quickSort(arr,pIndex+1,ei);// for right side of pivot
    }


    static int partition(int[] arr,int si,int ei){
        int pivot=arr[ei];
        int i=si-1;
        for (int j = si; j <ei; j++) {
            if(arr[j]<=pivot){
                //swap
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;

        return i;
    }
    static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

}
