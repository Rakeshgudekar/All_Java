package OOP;

public class AbstractionUsingInterface {
    public static void main(String[] args) {
        King k1=new King();
        k1.moves();
    }

}


interface chessMoves{
    void moves();
}
class King implements chessMoves {
    public void moves(){
        System.out.println("left1, right1,forward1,backward1,diagonal1");
    }
}

 class Queen implements chessMoves {
    public void moves(){
        System.out.println("left,right,front,back,cross");
    }
}
 class Pawns implements chessMoves {
    public void moves(){
        System.out.println("left1, right1,forward1,backwrd1");
    }
}