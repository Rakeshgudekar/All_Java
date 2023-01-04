package Arrays;

public class MaximumSubAarray {
    public static void main(String[] args) {
        int[] arr={1,2,-1,3,-5};
        int ans=findMaxSum(arr);
        System.out.println(ans);
    }
    static int findMaxSum(int[] arr){
        int max=Integer.MIN_VALUE;
        int currSum;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i; j <arr.length ; j++) {
                     currSum=0;
                for (int k = i; k <=j ; k++) {
                    currSum+=arr[k];
                }
                if (currSum>max){
                    max=currSum;
                }
            }
        }
        return max;
    }
}
