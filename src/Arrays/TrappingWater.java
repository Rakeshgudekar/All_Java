package Arrays;

public class TrappingWater {
    public static void main(String[] args) {
       int[] arr={4,2,0,6,3,2,5};
       trappedWater(arr);
    }
    static void trappedWater(int[] arr){
       int[] maxLeft=new int[arr.length];
       int[] maxRight=new int[arr.length];



       //for leftmax
        int maxL=0;
        for (int i = 0; i <arr.length ; i++) {
            if(maxL<arr[i]){
                maxL=arr[i];
                maxLeft[i]=maxL;
            }else maxLeft[i]=maxL;
        }

        // for maxright

        int maxR=0;
        for (int i = arr.length-1; i>=0 ; i--) {
            if(maxR<arr[i]){
                maxR=arr[i];
                maxRight[i]=maxR;
            }else maxRight[i]=maxR;
        }



        int totalTrappedWater=0;
        for (int i = 0; i <arr.length ; i++) {
            int waterLevel=Math.min(maxLeft[i],maxRight[i] );
            if(waterLevel<=0){
                break;
            }else{
                totalTrappedWater+=(waterLevel-arr[i])*1;

            }
        }

        System.out.println(totalTrappedWater);

    }

}


////alternative to calculate maxleft and maxright


//        maxLeft[0]=arr[0];
//        for (int i = 1; i <maxLeft.length ; i++) {
//        maxLeft[i]=Math.max(arr[i],maxLeft[i-1]);
//        }


//        maxRight[maxRight.length-1]=arr[arr.length-1];
//        for (int i =maxRight.length-2; i>=0 ; i--) {
//        maxRight[i]=Math.max(arr[i],maxRight[i+1]);
//        }