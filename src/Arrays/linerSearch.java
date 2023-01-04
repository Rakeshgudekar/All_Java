package Arrays;

public class linerSearch {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 678, 65, 7, 8, 90, 43};
        int target = 5;
        int ans = search(arr, target);
        System.out.println(ans);
    }

    static int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
