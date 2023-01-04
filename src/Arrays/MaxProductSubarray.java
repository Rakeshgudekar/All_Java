package Arrays;

public class MaxProductSubarray {
    public static void main(String[] args) {
        int[] arr={1,2,7,-1,5,7,6};
        printMaxSubarray(arr);
    }
    static void printMaxSubarray(int[] arr){
        int maxProduct=Integer.MIN_VALUE;

        for (int i = 0; i <arr.length-1; i++) {
            int currMax=arr[i];
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[j]>0){
                    currMax*=arr[j];

                }else{
                    break;
                }
            }
            maxProduct=Math.max(currMax,maxProduct);
        }
        System.out.println(maxProduct);
    }
}
