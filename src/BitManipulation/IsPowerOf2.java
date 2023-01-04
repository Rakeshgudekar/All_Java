package BitManipulation;

public class IsPowerOf2 {
    public static void main(String[] args) {
        System.out.println(isPowerOf_2(8));
    }
    public static boolean isPowerOf_2(int n){
        if((n&(n-1))==0){
            return true;
        }else
            return false;
    }
}
