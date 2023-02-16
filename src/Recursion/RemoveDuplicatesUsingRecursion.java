package Recursion;

import java.util.HashSet;

public class RemoveDuplicatesUsingRecursion {
    public static void main(String[] args) {
        String str="iamrakeshiamrakesh123123---++-/";
        StringBuilder newStr=new StringBuilder();
        HashSet<Character> hashset=new HashSet<>();
        removeDuplicates(str,0,newStr,hashset);

    }
    static void removeDuplicates(String str, int index,StringBuilder newStr, HashSet<Character> mySet){
        //baseCase
        if(str.length()==index){
            return;
        }
        //recursive part
        if(mySet.contains(str.charAt(index))){
            //means it is duplicate
            removeDuplicates(str,index+1,newStr,mySet);
        }else{
            mySet.add(str.charAt(index));
            System.out.print(str.charAt(index));
            removeDuplicates(str,index+1,newStr,mySet);

        }
    }


}
