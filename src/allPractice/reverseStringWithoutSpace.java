package allPractice;
//reverse string without space
//eg.. str="i am rakesh";
//output="h se karami
public class reverseStringWithoutSpace {

    public static void main(String[] args) {
        String str="this is a string";
        System.out.println(reverseWithoutSpace(str.toString()));
    }
    static String reverseWithoutSpace(String str) {
        String newStr ="";
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==' '&& i<str.length()/2){
                newStr+=str.charAt(i);
            }

                newStr+=str.charAt(str.length()-i-1);

        }
        return newStr;
    }

}
