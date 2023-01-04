package String;

public class LexicograficallyLargestString {
    public static void main(String[] args) {
   String[] str={"apple","banana","mango"};
        System.out.println(findMax(str));
    }
    static String findMax(String[] fruits){
        String maxString=fruits[0];
        for (int i = 1; i <fruits.length ; i++) {
            if(maxString.compareToIgnoreCase(fruits[i])<0){
                maxString=fruits[i];
            }
        }
        return maxString;
    }
}
