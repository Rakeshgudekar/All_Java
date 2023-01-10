package Recursion;

public class FactorialOfNumber {
    public static void main(String[] args) {
        System.out.println(findFact(4));
    }

    static int findFact (int n){
        int factorial=n;
        if(factorial==1){
            factorial=1;
            return factorial;
        }
        factorial=factorial*findFact(n-1);
        return factorial;
    }
}
