package BitManipulation;

public class FindBitAtGivenPosition {
    public static void main(String[] args) {
      print(5,2);
    }
    static void print(int n, int i){
        int bitmask=1<<i;
        if((n & bitmask)==0){
            System.out.println(i+"th bit is 0");
        }else System.out.println(i+"th bit is 1");
    }
}
