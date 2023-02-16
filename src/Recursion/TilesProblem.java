package Recursion;

public class TilesProblem {
    public static void main(String[] args) {
        System.out.println(countWays(3));
    }
    static int countWays(int n){
        // tile size 2xn
        if(n==0||n==1){
            return 1;
        }
        //for horizontal
        int horizontal=countWays(n-2);

        // for vertical
        int vertical=countWays(n-1);

        int total=horizontal + vertical;
        return total;
    }
}
