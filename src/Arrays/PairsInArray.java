package Arrays;

public class PairsInArray {
    public static void main(String[] args) {
        int[] arr={2,45,23,13,21,42};
        pairs(arr);
    }
    static void pairs(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
               System.out.print("["+arr[i]+","+arr[j]+"]");
            }
            System.out.println();
        }
    }
}
