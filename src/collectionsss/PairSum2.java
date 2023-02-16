package collectionsss;


import java.util.ArrayList;

//for rotteted sorted array
public class PairSum2 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        int target=11;
        System.out.println(findPair(list,target));
    }
    static boolean findPair(ArrayList<Integer>list,int target){
        int i=0;
        for ( i = 0; i <list.size(); i++) {
            if(list.get(i)>list.get(i+1)){
                break;
            }
        }
        int rp=i;
        int lp=i+1;

        while(lp!=rp){
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }else if((list.get(lp)+list.get(rp)<target)){
                lp=(lp+1)%list.size();   //(lp+1)%n
            }else{
                rp=(list.size()+rp-1)%list.size();
            }

        }
        return false;
    }
}
