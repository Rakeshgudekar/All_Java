package Recursion;

public class SumOfFirstNaturalNumbers {
    public static void main(String[] args) {
        System.out.println(sum(6));
    }
    static int sum(int n){
        int addition=n;
        if(n==0){
            return addition;
        }
        addition=addition+sum(n-1);
        return addition;
    }
}
