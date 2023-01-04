package BitManipulation;

public class SetBit {
    public static void main(String[] args) {
        setBit(5,1);
    }
    static void setBit(int n, int i){
        int bitMask=1<<i;
       n=n|bitMask;
        System.out.println(n);
    }
}
