package Arrays;

import java.util.Arrays;

public class ChocolateDistributionProblem {
    public static void main(String[] args) {
      int [] arr={ 12, 4,  7,  9,  2,  23, 25, 41, 30,
              40, 28, 42, 30, 44, 48, 43, 50};
      int m=7;
      int ans=minDiffrence(arr,m);
        System.out.println(ans);
    }
    static int minDiffrence(int[] arr, int m){
        //m is number of students or children
        if(m==0|| arr.length==0){
            return 0;
        }
        if(m>arr.length){
            return -1;
        }
       Arrays.sort(arr);
        int diff=0;
        int minDiff=Integer.MAX_VALUE;
        for (int i = 0; i+m-1 <arr.length ; i++) {
            diff=arr[i+m-1]-arr[i];
            if(diff<minDiff){
                minDiff=diff;
            }
        }
        return minDiff;
    }
}
