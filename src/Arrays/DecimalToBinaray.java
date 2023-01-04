package Arrays;

public class DecimalToBinaray {
    public static void main(String[] args){
    int ans=toBinary(9);
        System.out.println(ans);
    }

    static int toBinary(int decimal){
        int pow=0;
        int biNum=0;
        while(decimal>0){
            int rem=decimal%2;
            biNum=biNum+rem*(int)Math.pow(10,pow);
            pow++;
            decimal=decimal/2;

        }
        return biNum;
    }
}
