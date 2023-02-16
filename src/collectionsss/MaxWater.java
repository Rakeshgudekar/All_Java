package collectionsss;
import java.util.ArrayList;

public class MaxWater {
    public static void main(String[] args) {
        ArrayList<Integer> hight=new ArrayList<>();
        hight.add(1);
        hight.add(8);
        hight.add(6);
        hight.add(2);
        hight.add(5);
        hight.add(4);
        hight.add(8);
        hight.add(3);
        hight.add(7);
//        System.out.println(maxWater(hight));
        System.out.println(maxWaterUsing2Pointer(hight));

    }
    //Brutforce Approach
    static int maxWater(ArrayList<Integer>hight){
           int max=Integer.MIN_VALUE;
        for (int i = 0; i <hight.size(); i++) {
            for (int j =i+1; j <hight.size() ; j++) {
                int width=j-i;
                int high=Math.min(hight.get(i),hight.get(j));
                int currWater=high*width;
                max=Math.max(currWater,max);
            }

        }
        return max;
    }

    //2pointer approach
    static int maxWaterUsing2Pointer(ArrayList<Integer> hight){
        int max=0;
        //take 2 pointers lp=left pointer rp=rigt ponter
        int lp=0;
        int rp=hight.size()-1;

        while(lp<rp){
            //calculate area
            int width=rp-lp;
            int high=Math.min(hight.get(lp),hight.get(rp));
            int currWater=width*high;
            max=Math.max(max,currWater);

            //update pointer
            if(hight.get(lp)<hight.get(rp)){
                lp++;
            }else{
                rp--;
            }
        }
        return max;
    }

}
