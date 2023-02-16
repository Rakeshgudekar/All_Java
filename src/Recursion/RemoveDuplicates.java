package Recursion;

public class RemoveDuplicates {
    public static void main(String[] args) {
      String str="iiaaamraakeesh";
      //a-z only ,,,,A-Z not included
      StringBuilder sb =new StringBuilder();
      boolean[] map=new boolean[26];
      removeDuplicates(str,0,sb,map);
    }
    static void removeDuplicates(String str, int index, StringBuilder newStr, boolean map[]){
        //base case
        if(index==str.length()){
            System.out.println(newStr);
            return;
        }

        //recursive part
        char currChar=str.charAt(index);
        if(map[currChar-'a']==true){
            //then it is duplicate
            removeDuplicates(str,index+1,newStr,map);
        }else{
            map[currChar-'a']=true;
            newStr.append(str.charAt(index));
            removeDuplicates(str,index+1,newStr,map);
        }


    }
}
