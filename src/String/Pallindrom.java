package String;
public class Pallindrom {
    public static void main(String[] args) {
      String str="rarar";
      boolean ans=isPallindrom(str);
        System.out.println(ans);
    }
    static boolean isPallindrom(String Str){
        Str=Str.toLowerCase();
        boolean isPal=true;
        for (int i = 0; i <Str.length()/2 ; i++) {
            if(Str.charAt(i)!=Str.charAt(Str.length()-1-i)){
                isPal=false;
                break;
            }
        }
        return isPal;
    }
}
