package String;

public class A2B3C2D {
    public static void main(String[] args) {
       String str="aaabbbbccdeee";
        System.out.println(printString(str));
    }
    static String printString(String str){

        String newStr="";
        for(int i=0;i<str.length();i++){
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            newStr+=str.charAt(i);
            if(count>1){
                newStr+=count;
            }

        }
        return newStr;
    }
}
