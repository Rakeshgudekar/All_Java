package Arrays;

public class MaxSubArrayPrefixSum {
    public static void main(String[] args) {
        int[] arr={1,2,-1,3,-5};
       printSum(arr);
    }
    static void printSum(int[] arr){
        int max=Integer.MIN_VALUE;
        int currSum=0;
        int[] prefix=new int[arr.length];
             prefix[0]=arr[0];
        for (int i = 1; i <prefix.length ; i++) {
            prefix[i]=arr[i]+prefix[i-1];
        }
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i; j <arr.length ; j++) {
                 currSum=i==0? prefix[j]: prefix[j]-prefix[i-1];
                 if(currSum>max){
                     max=currSum;
                 }
            }
        }
        System.out.println(max);
    }
}
