package Recursion;

public class Print_N_to_1 {
    public static void main(String[] args) {
print(10);
    }
    static void print(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        else{
            System.out.println(n);
            print(n-1);
        }
    }
}
