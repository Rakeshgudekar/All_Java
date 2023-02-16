package collectionsss;
import java.util.ArrayList;
public class PairSum1 {
    //for sorted array only
    public static void main(String[] args) {
      ArrayList<Integer>list=new ArrayList<>();
      list.add(1);
      list.add(2);
      list.add(3);
      list.add(4);
      list.add(5);
      list.add(6);
      int target=12;
        System.out.println(findPair(list,target));
    }
    static boolean findPair(ArrayList<Integer> list,int target){
        int start=0;
        int end=list.size()-1;
        while(start!=end){
            if(list.get(start)+list.get(end)==target){
                return true;
            }else if(list.get(start)+list.get(end)<target){
                start++;
            }else {
                end--;
            }
        }
        return false;

    }
}
