package Arrays;
import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] arr={2,4,5,6,3,7};
        newArray(arr);
    }
    static void newArray(int[] arr){
        int[] numbers=new int[arr.length];
        int sum=arr[0];
        for (int i = 1; i <arr.length ; i++) {
            sum=sum*arr[i];
        }
        numbers[0]=sum;
        for (int i = 1; i <arr.length ; i++) {
            numbers[i]=arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(numbers));

    }
}
