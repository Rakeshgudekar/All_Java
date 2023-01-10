package Recursion;

public class LastOccurance {
    public static void main(String[] args) {
        int[] arr={2,3,4,6,8,5,7,3,4,6,5,6,8};
        int length=arr.length-1;
        System.out.println(lastOccurance(arr,length,19));
    }
    static int lastOccurance(int[] arr,int length,int target){
        if(length<0){
            return -1;
        }
        if(arr[length]==target){
            return length;
        }
        return lastOccurance(arr,length-1,target);
    }
}
