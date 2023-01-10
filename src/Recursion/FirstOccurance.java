package Recursion;

public class FirstOccurance {
    public static void main(String[] args) {
        int[] arr={1,3,5,6,7,4,5,7};
        System.out.println(findOccurence(arr,0,5));
    }
    static int findOccurence(int[] arr,int i,int target){
        if(i>arr.length-1){
            return -1;
        }
        if(target==arr[i]){
            return i;
        }
        return findOccurence(arr,i+1,target);
    }
}
