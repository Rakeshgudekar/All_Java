package Arrays;

public class SmallestInArray {
    public static void main(String[] args) {
        int[] arr={12,34,54,6,7,2,45,78,997,55,67,85,-33,45};
        int ans=findSmallest(arr);
            System.out.println(ans);

    }
    static int findSmallest(int[] arr){
        int smallest=Integer.MAX_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        return smallest;
    }
}
