package Arrays;

public class BuySell {
    public static void main(String[] args) {
        int[] arr={7,1,5,3,6,4};
        maxProfit(arr);
    }
    static void maxProfit(int[] arr){
        int minBuy=arr[0];
        int totalProfit=0;
        int max=0;

        for (int i = 1; i <arr.length ; i++) {
            totalProfit=arr[i]-minBuy;
            if(totalProfit>max){
                max=totalProfit;
            }
            if(minBuy>arr[i]){
                minBuy=arr[i];
            }

        }
        System.out.println(max);
    }
}
