package Recursion;

public class PowerOfNumber {
    public static void main(String[] args) {
        System.out.println(power(2,4));
    }
    static int power(int n,int power){

        if(power==0){
            return 1;
        }
        int ans=n*power(n,power-1);
        return ans;
    }
}
