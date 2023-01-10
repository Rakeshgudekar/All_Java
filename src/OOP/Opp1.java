package OOP;

public class Opp1 {
    public static void main(String[] args) {
        Pen pen1=new Pen();
        pen1.setPenColor("Red");
        System.out.println(pen1.penColor);
        pen1.penTip=5;
        System.out.println(pen1.penTip);

        //Bank account
        BankAccount bk1=new BankAccount();
        bk1.setUserName("Rakesh");
        bk1.setPassWord("Rakesh123");

    }
}

class Pen{
    String penColor;
    int penTip;

    void setPenColor(String color){
        penColor=color;
    }
//    void setPenTip(int tip){
//        penTip=tip;
//    }
}

class BankAccount{
    public String userName;
    private String passWord;

    void setUserName(String theUserName){
        this.userName=theUserName;
    }
    String getUserName(){
            return this.userName;
    }

    void setPassWord(String newPassword){
        this.passWord=newPassword;
    }
    String getPassWord(){
        return this.passWord;
    }
}
