package String;
//shortest distance when goes in equal distance which is one
public class ShortestDistance {
    public static void main(String[] args) {
        String str="WNEENESENNN";
        int ans=findPath(str);
        System.out.println(ans);
    }
    static int findPath(String str){
        int x=0;
        int y=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='W'){
                x--;
            }
            else if(str.charAt(i)=='E'){
                x++;
            }
            else if(str.charAt(i)=='N'){
                y++;
            }
            else y--;
        }
        int X2=x*x;
        int Y2=y*y;
        int shortestDistance=(int)Math.sqrt(X2+Y2);
        return shortestDistance;
    }
}
