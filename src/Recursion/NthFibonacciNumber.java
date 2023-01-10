package Recursion;

public class NthFibonacciNumber {
    public static void main(String[] args) {
        System.out.println(findFib(7));
    }
    static int findFib(int n){
        if(n==1){
            return n;
        }
        if(n==0){
            return n;
        }
        int fib=findFib(n-1)+findFib(n-2);
        return fib;


    }
}
