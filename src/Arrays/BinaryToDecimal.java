package Arrays;

public class BinaryToDecimal {
    public static void main(String[] args) {
      int ans=ToDecimal(1001);
        System.out.println(ans);
    }
    static int ToDecimal(int Binum){
        int power=0;
        int Decimal=0;
        while (Binum>0){
            int unitNum=Binum%10;
            Decimal=Decimal+unitNum*(int)Math.pow(2,power);
            Binum=Binum/10;
            power++;
        }
        return Decimal;
    }
}
