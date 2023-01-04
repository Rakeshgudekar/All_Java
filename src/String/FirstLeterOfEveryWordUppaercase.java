package String;

public class FirstLeterOfEveryWordUppaercase {
    public static void main(String[] args) {
      String str="i am rakesh gudekar";
      makeIt(str);
    }
    static void makeIt(String str){
        StringBuilder sb=new StringBuilder("");
        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for (int i = 1; i <str.length(); i++) {
          if(str.charAt(i)==' '&& i<str.length()-1){
               sb.append(str.charAt(i));
               i++;
               ch=Character.toUpperCase(str.charAt(i));
               sb.append(ch);
          } else{
              sb.append(str.charAt(i));
          }
        }
        System.out.println(sb);
    }
}
