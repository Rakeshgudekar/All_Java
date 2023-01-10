package Recursion;

public class PowerOfNumberSecondEWay {
    public static void main(String[] args) {
        System.out.println(powerOf(2,4));
    }
    static int powerOf(int n, int power){
        if(power==0){
            return 1;
        }

        int halfPower=powerOf(n,power/2) * powerOf(n,power/2);
        if(power%2 != 0){
            halfPower=n * halfPower;
        }
        return halfPower;
    }
}
