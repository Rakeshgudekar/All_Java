package allPractice;

public class pat1 {
    public static void main(String[] args) {
        int n=5;
       pattern(n);
    }
    static void pattern(int n){
       for(int i=0;i<n;i++){
          for(int space=1;space<=n-i;space++){
              System.out.print("  ");
          }
          for(int j=0;j<=i;j++){
              System.out.print("*"+" ");
          }
           System.out.println();
       }
    }


}
