package hashSet;

import java.util.HashSet;

public class RemoveDuplicate {
    public static void main(String[] args) {
        removeDuplicate("iaammraakeeshh");
    }
    static void removeDuplicate(String str){

        HashSet<Character> myset=new HashSet<>();
        for (int i = 0; i <str.length() ; i++) {
            if(myset.contains(str.charAt(i))){
                continue;
            }else{
                myset.add(str.charAt(i));
                System.out.print(str.charAt(i));

            }
        }


    }
}
