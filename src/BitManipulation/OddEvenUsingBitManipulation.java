package BitManipulation;

public class OddEvenUsingBitManipulation {
    public static void main(String[] args) {
       oddOrEven(6);
    }
    static void oddOrEven(int n){
        if((n&1)==1){
            System.out.println("odd");
        }else System.out.println("even");
    }
}
