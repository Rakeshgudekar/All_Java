package Arrays;

public class grettestInArray {
    public static void main(String[] args) {
        int [] arr={23,4,5,67,54,67,89,86,445,78,875,335};
        int ans=findgreatest(arr);
        System.out.println(ans);
    }
    static int findgreatest(int[] arr){
        int greatest=Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            if(greatest<arr[i]){
                greatest=arr[i];
            }
        }
        return greatest;

    }
}
