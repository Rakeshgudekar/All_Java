package Arrays;

public class MaxSubArrayKadanesAlgo {
    public static void main(String[] args) {
        int[] arr={1,2,-1,3,-5};
        kadanes(arr);
    }
    static void kadanes(int[] arr){
        int sum=0;
        int max=Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            sum=sum+arr[i];
            if(sum<0){
                sum=0;
            }
            max=Integer.max(sum,max);
        }
        System.out.println(max);
    }
}
