package Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={8,9,13,15,17,18,30,46,57,69,89};
        int target=17;
        int ans=search(arr,target);
        System.out.println(ans);
    }
    static int search(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]<target){
                start=mid+1;
            }
            else end=mid-1;

        }
      return -1;
    }
}
