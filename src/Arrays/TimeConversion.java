package Arrays;

public class TimeConversion {
    public static void main(String[] args) {
        String str="12:10:22AM";
        System.out.println(convertTime(str));
    }
    static String convertTime(String str){
        String result="";
        String[] s=str.split(":");
        String hours=s[0];
        String minutes=s[1];
        String seconds=s[2].substring(0,2);
        String caser=s[2].substring(2,4);
        if(caser.equals("AM")){
            if(hours.equals("12")){
               hours="00";
               result=hours+":"+minutes+":"+seconds;
            }else if(!hours.equals("12")){
                int hh=Integer.parseInt(hours);
                hh=12+hh;
                result=hh+":"+minutes+":"+seconds;
            }

        }
        return result;
    }
}
